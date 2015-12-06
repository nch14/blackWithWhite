package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import bl.staff.Impl.LoginController;
import bl.staff.service.LoginService;
import vo.StaffVO;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.*;
import java.awt.Color;


public class sign {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sign window = new sign();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public sign() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u7269\u6D41\u4FE1\u606F\u7BA1\u7406\u7CFB\u7EDF");
		frame.setResizable(false);
		frame.setBounds(100, 100, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u8D26\u53F7");
		label.setBounds(349, 351, 54, 15);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(458, 348, 167, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801");
		label_1.setBounds(349, 395, 54, 15);
		frame.getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(458, 392, 167, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		ImageIcon img = new ImageIcon( "C:\\Users\\lenovo\\Pictures\\Camera Roll\\674424_184308084693_2.jpg");
		
		
		JLabel lblNewLabel = new JLabel(img);
		lblNewLabel.setBounds(121, 41, 765, 286); 
		frame.getContentPane().add(lblNewLabel);
		
		
		JButton button = new JButton("\u767B\u5F55");
		button.setBounds(469, 454, 93, 23);
		frame.getContentPane().add(button);
		
		JLabel label_2 = new JLabel("");
		label_2.setForeground(Color.RED);
		label_2.setBounds(458, 520, 167, 15);
		frame.getContentPane().add(label_2);
		
		button.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			LoginService login = new LoginController();
			StaffVO staff=login.validUser(textField.getText(),textField_1.getText());
			//if(staff==null){
			//	 label_2.setText("µÇÂ¼Ê§°Ü");
			//}
			//else{
				frame.dispose();
				 commodity man=new commodity();
				 man.main();
			//}
			

			 }
		});
	}
}
