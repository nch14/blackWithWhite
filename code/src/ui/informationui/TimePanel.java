package ui.informationui;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import tools.DepartmentHelper;
import tools.TimeHelper;
import ui.NSwing.NLabel;
import ui.informationui.InformationPanel.ExitListener;
import ui.informationui.InformationPanel.ShutListener;

public class TimePanel extends JPanel implements Runnable {
	StartFrame belongsTO;
	JLabel message;
	JLabel staff;
	JButton mini;
	JButton shut;
	public static boolean state=true;
	public static boolean change=false;
	public static String text="";
	public TimePanel(StartFrame belongsTO){
		this.belongsTO=belongsTO;
		this.setLayout(null);
		this.setBounds(0,0,1200,60);
	/*	this.setBackground(Color.BLACK)*/;
		this.setFont((new Font("楷体",Font.BOLD, 32)));
		message=new JLabel();
		message.setForeground(Color.WHITE);
		message.setBounds(220, 8,200, 40);
		shut=new JButton();
		shut.setIcon(new ImageIcon("pic/关闭按钮3D.png"));
		shut.setBounds(35,10, 20, 20);
		shut.addActionListener(new ExitListener());
		//shut.addFocusListener(new ShutListener());
		shut.setBorder(null);
		shut.setFocusPainted(false);
		shut.setBorderPainted(false);
		shut.setContentAreaFilled(false);
		
		staff=new JLabel();
		staff.setForeground(Color.WHITE);
		staff.setText("您好！"+DepartmentHelper.thisStaff.name+"  (您的身份:"+DepartmentHelper.thisStaff.pos+")");
		staff.setBounds(700, 8,350, 40);
		
		mini=new JButton();
		mini.setIcon(new ImageIcon("pic/关闭按钮3D.png"));
		mini.setBounds(10,10, 20, 20);
		mini.addActionListener(new MiniListener());
		mini.setBorder(null);
		mini.setFocusPainted(false);
		mini.setBorderPainted(false);
		mini.setContentAreaFilled(false);
		
		this.add(staff);
		this.add(mini);
		this.add(shut);
		this.add(message);
		Thread time=new Thread(this);
		time.start();
	}
	
	protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image image;
        Image icon;
        try {
            image = ImageIO.read(new File("pic/纯色背景3.png"));
            g.drawImage(image, 0, 0, this);
            icon = ImageIO.read(new File("pic/logoT.png"));
            g.drawImage(icon, 1110, 0, this);
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
       
    }
	class MiniListener implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			belongsTO.mini();
		}
		
	}
	
	class ExitListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
		
	}
	public static void makeWords(String a){
		change=true;
		text=a;
	}
	public void run() {
		while(state){
			if(change){
				this.remove(staff);
				repaint();
				message.setForeground(Color.YELLOW);
				message.setText("                  "/*18个空格*/+text);
				this.repaint();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				change=false;
				this.add(staff);
				repaint();
				text="";
			}else{
				message.setForeground(Color.WHITE);
				String toShow="当前时间：";
				toShow+=TimeHelper.getShowTime();
				message.setText(toShow);
				this.repaint();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
