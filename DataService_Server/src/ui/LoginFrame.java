package ui;

import java.awt.BorderLayout;

import javax.swing.*;


public class LoginFrame extends JFrame{
	JPanel panel;
	JButton logButton;
	JPasswordField text;
	
	public LoginFrame(){
		this.setSize(400, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Please Log In");
		this.setLocationRelativeTo(null);

		text=new JPasswordField(20);
		logButton=new JButton("Log In");
		panel=new JPanel();
		JPanel centrePanel=new JPanel();
		JPanel headPanel =new JPanel();
		JPanel fillPanel=new JPanel();
		headPanel.add(logButton);
		
		panel.setLayout(new BorderLayout());
		text.setEchoChar('*');
		centrePanel.add(text);
		
		panel.add(fillPanel,BorderLayout.NORTH);
		panel.add(headPanel, BorderLayout.SOUTH);
		panel.add(centrePanel, BorderLayout.CENTER);
		
		this.add(panel);
		
		this.setVisible(true);
	}

}
