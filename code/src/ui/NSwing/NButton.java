package ui.NSwing;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class NButton extends JButton{

	public NButton(){
		
	}
	public NButton(String name){
		this.setFont(new Font("Î¢ÈíÑÅºÚ",Font.BOLD,16));
		this.setBorder(null);
		this.setFocusPainted(false);
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
		if(name.equals("ok")){
			this.setIcon(new ImageIcon("pic/ok40blue.png"));
		}
		if(name.equals("push")){
			//this.setText("push");
		}
		if(name.equals("add")){
			this.setIcon(new ImageIcon("pic/Add.png"));
		}
		if(name.equals("check")){
			//this.setText("check");
		}
		
	}
}
