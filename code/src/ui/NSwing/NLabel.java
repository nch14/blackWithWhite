package ui.NSwing;

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
}
