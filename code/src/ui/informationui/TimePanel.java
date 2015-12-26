package ui.informationui;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;

import tools.DepartmentHelper;
import tools.TimeHelper;

public class TimePanel extends JPanel implements Runnable {
	JLabel message;
	public static boolean state=true;
	public static boolean change=false;
	public static String text="";
	public TimePanel(){
		
		this.setLayout(null);
		this.setBounds(0,0,1200,60);
		//this.setBackground(Color.BLACK);
		this.setFont((new Font("楷体",Font.BOLD, 32)));
		message=new JLabel();
		message.setForeground(Color.WHITE);
		message.setBounds(0, 8,1600, 40);
		this.add(message);
		Thread time=new Thread(this);
		time.start();
	}
	
	protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image image;
        try {
            image = ImageIO.read(new File("pic/纯色背景3.png"));
            g.drawImage(image, 0, 0, this);
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
       
    }
	
	public void run() {
		while(state){
			if(change){
				message.setForeground(Color.YELLOW);
				message.setText("                  "/*18个空格*/+text);
				this.repaint();
				try {
					Thread.sleep(8000);
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
				this.setFont((new Font("楷体",Font.PLAIN, 32)));
				toShow+="您好！"+DepartmentHelper.thisStaff.name+"（您的身份："+
				DepartmentHelper.thisStaff.pos+"）";
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
