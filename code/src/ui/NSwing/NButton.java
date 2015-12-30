package ui.NSwing;

import java.awt.Font;

import javax.swing.JButton;

public class NButton extends JButton{

	public NButton(){
		
	}
	public NButton(String name){
		this.setFont(new Font("Î¢ÈíÑÅºÚ",Font.BOLD,16));
		if(name.equals("ok")){
			this.setText("ok");
		}
		if(name.equals("push")){
			this.setText("push");
		}
		if(name.equals("add")){
			this.setText("add");
		}
		if(name.equals("check")){
			this.setText("check");
		}
	}
}
