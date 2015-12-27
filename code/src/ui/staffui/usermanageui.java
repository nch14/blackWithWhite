package ui.staffui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import bl.staff.Impl.UserManageController;
import bl.staff.service.UserManageBLService;
import vo.StaffVO;

public class usermanageui {

	private JFrame frame;
	private JTextField textField;
	private JTextField textFieldofstaffID;
	private JTable tableofusermanage;
    UserManageBLService  usermanage = new UserManageController();
    StaffVO staff;
    ArrayList<StaffVO> staff1;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					usermanageui window = new usermanageui();
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
	public usermanageui() {
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
		
		textFieldofstaffID = new JTextField();
		textFieldofstaffID.setBounds(313, 121, 238, 21);
		desktopPane.add(textFieldofstaffID);
		textFieldofstaffID.setColumns(10);
		
		/*
		 * 用户管理查询
		 */
		JButton buttonofquery = new JButton("查询");
		buttonofquery.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(textFieldofstaffID.getText()==null){
					
				}
			}
		});
		buttonofquery.setBounds(595, 120, 93, 23);
		desktopPane.add(buttonofquery);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(161, 229, 658, 288);
		desktopPane.add(scrollPane);
		
		tableofusermanage = new JTable();
		tableofusermanage.setModel(new DefaultTableModel(
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
				"用户ID", "姓名", "年龄", "权限", "密码"
			}
		));
		scrollPane.setViewportView(tableofusermanage);
		
		/*
		 * 改用户
		 */
		JButton buttonofsubmit = new JButton("提交");
		buttonofsubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0; i<tableofusermanage.getRowCount();i++){
				boolean istrue=usermanage.changeStaffInfo(tableofusermanage.getValueAt(i, 3).toString(), tableofusermanage.getValueAt(i, 4).toString(), 
						tableofusermanage.getValueAt(i, 2).toString(), tableofusermanage.getValueAt(i, 1).toString());
				if(istrue){
					for(int i1=0;i1<tableofusermanage.getRowCount();i1++){
						tableofusermanage.setValueAt(null, i1, 0);
						tableofusermanage.setValueAt(null, i1, 1);
						tableofusermanage.setValueAt(null, i1, 2);
						tableofusermanage.setValueAt(null, i1, 3);
						tableofusermanage.setValueAt(null, i1, 4);
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
		buttonofsubmit.setBounds(831, 549, 93, 23);
		desktopPane.add(buttonofsubmit);
		
		JLabel labelofstaffID = new JLabel("输入用户ID或姓名关键词");
		labelofstaffID.setBounds(136, 124, 153, 15);
		desktopPane.add(labelofstaffID);
		
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
