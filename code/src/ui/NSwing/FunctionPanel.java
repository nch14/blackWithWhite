package ui.NSwing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import main.StartFrame;


public class FunctionPanel extends JPanel {
	StartFrame belongsTO;
	JButton[] buttons;
	JPanel[] panels;
	JButton back;
	
	public FunctionPanel(StartFrame belongsTO,JButton[] buttons,JPanel[] panels){
		this.belongsTO=belongsTO;
		this.buttons=buttons;
		this.panels=panels;
		this.setLayout(null);
		this.setBounds(0, 60, 200, 615);
		
		back=new JButton();
		back.setIcon(new ImageIcon("pic/ÏÂ¼ýÍ·32.png"));
		back.setBounds(20, 550,32, 32);
		back.setBorder(null);
		back.setFocusPainted(false);
		back.setBorderPainted(false);
		back.setContentAreaFilled(false);
		back.addActionListener(new BackListener());
		this.add(back);
		
		int numbers=buttons.length;
		int x=20;
		int y=100;
		int width=150;
		int height=50;
		for(int i=0;i<numbers;i++){
			buttons[i].setBorderPainted(false);
			buttons[i].setBackground(Color.black);
			buttons[i].setOpaque(false);
			
			buttons[i].setBounds(x, y, width, height);
			ActionListener listener=new JumpListener(panels[i]);
			buttons[i].addActionListener(listener);
			y+=50;
			this.add(buttons[i]);
		}
		System.out.println("23333333");
		repaint();
	}

	protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image image;
        Image icon;
        try {
            image = ImageIO.read(new File("pic/line.png"));
            g.drawImage(image, 180, 60, this);
           /* icon = ImageIO.read(new File("pic/logoT.png"));
            g.drawImage(icon, 50, 0, this);*/
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
       
    }
	class JumpListener implements ActionListener{
		JPanel panel;
		public JumpListener(JPanel panel){
			this.panel=panel; 
		}		
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			belongsTO.changePanelInner(panel);
		}
		
	}
	class BackListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			belongsTO.backLastPanel();
			belongsTO.removeTimePanel();
			belongsTO.removeToolBar();
		}
		
		
	}
}
