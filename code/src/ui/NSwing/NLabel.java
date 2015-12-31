package ui.NSwing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class NLabel extends JLabel {

	public NLabel(){
		this.setFont(new Font("Î¢ÈíÑÅºÚ",Font.BOLD,16));
	}
	public NLabel(String name){
		this.setFont(new Font("Î¢ÈíÑÅºÚ",Font.BOLD,16));
		this.setText(name);
	}
	
	public NLabel(String name,String type){
		if(type.equals("tips")){
			this.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,12));
			this.setForeground(Color.yellow);
			this.setText(name);
		}
	}
}
