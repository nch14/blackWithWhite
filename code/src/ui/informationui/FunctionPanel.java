package ui.informationui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class FunctionPanel extends JPanel {
	StartFrame belongsTO;
	JButton[] buttons;
	JPanel[] panels;
	
	public FunctionPanel(StartFrame belongsTO,JButton[] buttons,JPanel[] panels){
		this.belongsTO=belongsTO;
		this.buttons=buttons;
		this.panels=panels;
		this.setBounds(0, 60, 200, 615);
		
		int numbers=buttons.length;
		int x=50;
		int y=50;
		int width=100;
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
		repaint();
	}
	
	class JumpListener implements ActionListener{
		JPanel panel;
		public JumpListener(JPanel panel){
			this.panel=panel; 
		}		
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			belongsTO.changePanel(panel);
		}
		
	}
}
