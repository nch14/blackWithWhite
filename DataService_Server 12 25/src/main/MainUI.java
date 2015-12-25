package main;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

public class MainUI extends JFrame{
	public MainUI() {
		this.setSize(400, 300);
		setResizable(false);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Start Server");
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ServiceHelper.initialService();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				lblNewLabel.setText("Start Success");
			}
		});
		btnNewButton.setBounds(145, 115, 113, 46);
		panel.add(btnNewButton);
		
		lblNewLabel.setBounds(127, 202, 152, 33);
		panel.add(lblNewLabel);
	}
	
	public void run(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
