package ui.informationui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserManagePanel extends JPanel {
	StartFrame belongsTO;
	JButton okButton;
	JButton sign; 
	JTextField getTransID;
	JLabel LOGO;
	JLabel wrongMess;
	JLabel bussinessMess;
	
	public UserManagePanel(StartFrame belongsTO){
		this.belongsTO=belongsTO;
		this.setBounds(200,60,1000,615);
	}
	
}
