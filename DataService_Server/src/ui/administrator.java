package ui;

import java.awt.EventQueue;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import bl.staff.Impl.UserManageController;
import bl.staff.service.UserManageBLService;
import vo.StaffVO;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class administrator {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
    UserManageBLService  usermanage = new UserManageController();
    StaffVO staff;
    ArrayList<StaffVO> staff1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					administrator window = new administrator();
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
	public administrator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		
		frame = new JFrame();
		frame.setTitle("\u7269\u6D41\u4FE1\u606F\u7BA1\u7406\u7CFB\u7EDF");
		frame.setResizable(false);
		frame.setBounds(100, 100, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		tabbedPane.addTab("用户管理", null, desktopPane, null);
		
		JLabel label = new JLabel();
		
		label.setBounds(282, 0, 436, 21);
		desktopPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setBounds(279, 121, 238, 21);
		desktopPane.add(textField_1);
		textField_1.setColumns(10);
		
		/*
		 * 用户管理查询
		 */
		JButton button = new JButton("\u67E5\u8BE2");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(textField_1.getText().length()<5){
				staff=usermanage.getStaff(textField_1.getText());
                   if(staff==null){
                	    label.setForeground(Color.RED);
					    label.setText("输入错误");
					    try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} 
				   }else{
					 table.setValueAt(staff.ID, 0, 0);
					 table.setValueAt(staff.name, 0, 1);
					 table.setValueAt(staff.age, 0, 2);
					 table.setValueAt(staff.authority, 0, 3);
					 table.setValueAt(staff.passwords, 0, 4);
				   }
				}else{
					staff1=usermanage.getAllStaff(textField_1.getText());
					if(staff1==null){
					for(int i=0;i<staff1.size();i++){
						table.setValueAt(staff1.get(i).ID, 0, 0);
						 table.setValueAt(staff1.get(i).name, 0, 1);
						 table.setValueAt(staff1.get(i).age, 0, 2);
						 table.setValueAt(staff1.get(i).authority, 0, 3);
						 table.setValueAt(staff1.get(i).passwords, 0, 4);
					    }
					}else{
						label.setForeground(Color.RED);
					    label.setText("输入错误");
					    try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} 
					}
				}
				
			}
		});
		button.setBounds(595, 120, 93, 23);
		desktopPane.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(161, 229, 658, 288);
		desktopPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"\u7528\u6237ID", "\u59D3\u540D", "\u5E74\u9F84", "\u6743\u9650", "\u5BC6\u7801"
			}
		));
		scrollPane.setViewportView(table);
		
		/*
		 * 改用户
		 */
		JButton button_1 = new JButton("\u63D0\u4EA4");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0; i<table.getRowCount();i++){
				boolean istrue=usermanage.changeStaffInfo(table.getValueAt(i, 3).toString(), table.getValueAt(i, 4).toString(), 
						table.getValueAt(i, 2).toString(), table.getValueAt(i, 1).toString());
				if(istrue){
					for(int i1=0;i1<table.getRowCount();i1++){
						table.setValueAt(null, i1, 0);
						table.setValueAt(null, i1, 1);
						table.setValueAt(null, i1, 2);
						table.setValueAt(null, i1, 3);
						table.setValueAt(null, i1, 4);
					}
				}else{
					label.setForeground(Color.RED);
				    label.setText("提交失败");
				    try {
						Thread.sleep(5000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
				}
				}
			}
		});
		button_1.setBounds(831, 549, 93, 23);
		desktopPane.add(button_1);
		
		JLabel lblid = new JLabel("\u8F93\u5165\u7528\u6237ID\u6216\u59D3\u540D\u5173\u952E\u8BCD");
		lblid.setBounds(136, 124, 133, 15);
		desktopPane.add(lblid);
		new Thread() {        
			public void run() {            
				try {                
					while (true) {  
						label.setForeground(Color.BLACK);
						label.setText(df.format(new Date()));//显示当前时间                    
						Thread.sleep(1000);//暂停一秒                
						}            
					} catch (Exception e) {            
						
					}        
				}    
			}.start();
					}
				
			
		
	}

