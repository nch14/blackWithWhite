package ui.NSwing;

import java.awt.Font;

import javax.swing.JTextField;

public class NTextField extends JTextField {

	public NTextField(){
		this.setFont(new Font("Î¢ÈíÑÅºÚ",Font.BOLD,16));
		this.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
	}
	public NTextField(int fontSize){
		this.setFont(new Font("Î¢ÈíÑÅºÚ",Font.BOLD,fontSize));
		this.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
	}
/*	public NTextField(){
		
	}*/
}
