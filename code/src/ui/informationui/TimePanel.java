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
import ui.informationui.InformationPanel.ExitListener;
import ui.informationui.InformationPanel.ShutListener;

public class TimePanel extends JPanel implements Runnable {
	StartFrame belongsTO;
	JLabel message;
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
		message.setBounds(150, 8,1600, 40);
		shut=new JButton();
		shut.setIcon(new ImageIcon("pic/关闭按钮3A.png"));
		shut.setBounds(1140,10, 54, 40);
		shut.addActionListener(new ExitListener());
		//shut.addFocusListener(new ShutListener());
		shut.setBorder(null);
		shut.setFocusPainted(false);
		shut.setBorderPainted(false);
		shut.setContentAreaFilled(false);
		
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
            g.drawImage(icon, 50, 0, this);
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
       
    }
	class ExitListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
		
	}
	public void run() {
		while(state){
			if(change){
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
				text="";
			}else{
				message.setForeground(Color.WHITE);
				String toShow="                    ";
				toShow+="当前时间：";
				toShow+=TimeHelper.getShowTime();
				toShow+="                                                                                       ";
/*				this.setFont((new Font("楷体",Font.PLAIN, 32)));
				toShow+="您好！"+DepartmentHelper.thisStaff.name+"（您的身份："+
				DepartmentHelper.thisStaff.pos+"）";*/
				this.setFont((new Font("楷体",Font.PLAIN, 32)));
				toShow+="您好！"+"小龙女"+"（您的身份："+"小笼包"+"）";
				this.setFont((new Font("楷体",Font.BOLD, 32)));
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
