package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import bl.information.Impl.InformationController;
import bl.information.Service.InformationBLService;
import vo.PackageVO;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Color;

public class informationui {

	private JFrame frame;
	private JTextField textField;
	private JTable table;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					informationui window = new informationui();
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
	public informationui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("\u7269\u6D41\u4FE1\u606F\u7BA1\u7406\u7CFB\u7EDF");
		frame.setBounds(100, 100, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(316, 222, 219, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		/*
		 * 查询货物信息
		 */
		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.setBounds(613, 221, 93, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				InformationBLService information = new InformationController();
				PackageVO pac = information.inquireTransMesg(textField.getText());
				if(pac==null){
					label.setText("输入错误");
				}else{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(316, 304, 388, 170);
				frame.getContentPane().add(scrollPane);
				
				table = new JTable();
				table.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
					},
					new String[] {
						"\u65F6\u95F4", "\u5730\u70B9"
					}
				));
				scrollPane.setViewportView(table);
				for(int i=0;i<pac.state.size();i++){
					table.setValueAt(pac.state.get(i).time, i, 0);
					table.setValueAt(pac.state.get(i).location, i, 1);
				}
				
				
				
				}	
			}
		});
		
		/*
		 * 跳转到登录界面
		 */
		JButton button = new JButton("\u516C\u53F8\u5458\u5DE5\u767B\u5F55\u5165\u53E3");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				 frame.dispose();
				 sign man=new sign();
				 man.main();
			}
		});
		button.setBounds(759, 532, 155, 23);
		frame.getContentPane().add(button);
		
		label = new JLabel("");
		label.setForeground(Color.RED);
		label.setBounds(466, 558, 93, 15);
		frame.getContentPane().add(label);
		
		
	}
}
