package ui.moneyui;

import java.awt.Color;
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

import bill.Account;
import bl.money.Impl.AccountManageController;

public class accountmanageui extends JDesktopPane{
	
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTable table_3;
	private JTextField textField_21;
	private JTable table_4;
	private JTextField textField_22;
	private JTable table_5;
	private JTextField textField_23;
	private JTable table_6;
	
	public accountmanageui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBackground(Color.WHITE);
		
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(91, 80, 753, 465);
		this.add(tabbedPane_2);
		
		//增加账户的界面
		JDesktopPane desktopPane_6 = new JDesktopPane();
		desktopPane_6.setBackground(Color.WHITE);
		tabbedPane_2.addTab("增加账户", null, desktopPane_6, null);
		
		JLabel textPane_21 = new JLabel();
		textPane_21.setText("账号");
		textPane_21.setBounds(80, 21, 32, 21);
		desktopPane_6.add(textPane_21);
		
		textField_18 = new JTextField();
		textField_18.setBounds(122, 21, 100, 21);
		desktopPane_6.add(textField_18);
		textField_18.setColumns(10);
		
		JLabel textPane_22 = new JLabel();
		textPane_22.setText("名称");
		textPane_22.setBounds(264, 21, 32, 21);
		desktopPane_6.add(textPane_22);
		
		textField_19 = new JTextField();
		textField_19.setBounds(306, 21, 66, 21);
		desktopPane_6.add(textField_19);
		textField_19.setColumns(10);
		
		JLabel textPane_23 = new JLabel();
		textPane_23.setText("金额");
		textPane_23.setBounds(416, 21, 32, 21);
		desktopPane_6.add(textPane_23);
		
		textField_20 = new JTextField();
		textField_20.setBounds(458, 21, 66, 21);
		desktopPane_6.add(textField_20);
		textField_20.setColumns(10);
		//添加账户信息的事件监听
		JButton button_6 = new JButton("添加");
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table_3.getRowCount();i++){
				    if(table_3.getValueAt(i, 0)==null&&table_3.getValueAt(i, 1)==null&&table_3.getValueAt(i, 2)==null){
				        table_3.setValueAt(textField_18.getText(), i, 0);
				        table_3.setValueAt(textField_19.getText(), i, 1);
				        table_3.setValueAt(textField_20.getText(), i, 2);
				        break;
				    }
				}
			}
		});
		button_6.setBounds(547, 52, 93, 23);
		desktopPane_6.add(button_6);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(80, 100, 560, 275);
		desktopPane_6.add(scrollPane_3);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				 "账号", "名称", "金额"
			}
		));
		scrollPane_3.setViewportView(table_3);
		//撤消账户信息table中一行的事件监听
		JButton button_7 = new JButton("撤消");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i = table_3.getRowCount()-1;i>=0;i--){
					if(table_3.getValueAt(i, 0)!=null||table_3.getValueAt(i, 1)!=null||table_3.getValueAt(i, 2)!=null){
						table_3.setValueAt(null, i, 0);
						table_3.setValueAt(null, i, 1);
						table_3.setValueAt(null, i, 2);
						break;
					}
				}
			}
		});
		button_7.setBounds(122, 392, 93, 23);
		desktopPane_6.add(button_7);
		
		JButton button_8 = new JButton("提交");
		button_8.setBounds(547, 392, 93, 23);
		desktopPane_6.add(button_8);
		
		//修改账户信息的界面
		final JDesktopPane desktopPane_7 = new JDesktopPane();
		desktopPane_7.setBackground(Color.WHITE);
		tabbedPane_2.addTab("修改账户信息", null, desktopPane_7, null);
		
		textField_21 = new JTextField();
		textField_21.setText("输入账号或名称关键词搜索");
		textField_21.setBounds(140, 40, 300, 21);
		desktopPane_7.add(textField_21);
		textField_21.setColumns(10);
		
		//查询账户信息的事件监听
		JButton button_9 = new JButton("查询");
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Account> account;
				AccountManageController amc=new AccountManageController();
				account = amc.getAccount(textField_21.getText());
				if(account==null){
					desktopPane_7.setToolTipText("未查找到任何账户信息！");
				}else{
					for(int i=0;i<account.size();i++){
					    table_4.setValueAt(account.get(i), i/table_4.getColumnCount(), i%table_4.getColumnCount());
					}
				}
			}
		});
		button_9.setBounds(496, 40, 93, 23);
		desktopPane_7.add(button_9);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(80, 100, 560, 275);
		desktopPane_7.add(scrollPane_4);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
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
				 "账号", "名称", "金额", "操作"
			}
		));
		scrollPane_4.setViewportView(table_4);
		//撤消修改账号信息的事件监听
		JButton button_10 = new JButton("撤消");
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_4.getRowCount()-1;i>=0;i--){
					if(table_4.getValueAt(i, 0)!=null||table_4.getValueAt(i, 1)!=null||table_4.getValueAt(i, 2)!=null||table_4.getValueAt(i, 3)!=null){
						table_4.setValueAt(null, i, 0);
						table_4.setValueAt(null, i, 1);
						table_4.setValueAt(null, i, 2);
						table_4.setValueAt(null, i, 3);
						break;
					}
				}
			}
		});
		button_10.setBounds(147, 396, 93, 23);
		desktopPane_7.add(button_10);
		
		JButton button_11 = new JButton("提交");
		button_11.setBounds(496, 396, 93, 23);
		desktopPane_7.add(button_11);
		
		JDesktopPane desktopPane_8 = new JDesktopPane();
		desktopPane_8.setBackground(Color.WHITE);
		tabbedPane_2.addTab("删除账户", null, desktopPane_8, null);
		
		textField_22 = new JTextField();
		textField_22.setText("输入账号或名称关键词搜索");
		textField_22.setBounds(140, 40, 300, 21);
		desktopPane_8.add(textField_22);
		textField_22.setColumns(10);
		
		//删除账户信息的事件监听
		JButton button_12 = new JButton("查询");
		button_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Account> account;
				AccountManageController amc=new AccountManageController();
				account = amc.getAccount(textField_21.getText());
				if(account==null){
					desktopPane_7.setToolTipText("未查找到任何账户信息！");
				}else{
					for(int i=0;i<account.size();i++){
					    table_4.setValueAt(account.get(i), i/table_4.getColumnCount(), i%table_4.getColumnCount());
					}
				}
			}
		});
		button_12.setBounds(496, 40, 93, 23);
		desktopPane_8.add(button_12);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(80, 100, 560, 275);
		desktopPane_8.add(scrollPane_5);
		
		table_5 = new JTable();
		table_5.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				 "账号", "名称", "金额"
			}
		));
		scrollPane_5.setViewportView(table_5);
		//删除账户信息的事件监听
		JButton button_13 = new JButton("删除");
		button_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_5.getRowCount()-1;i>=0;i--){
					if(table_5.getValueAt(i, 0)!=null||table_5.getValueAt(i, 1)!=null||table_5.getValueAt(i, 2)!=null){
						table_5.setValueAt(null, i, 0);
						table_5.setValueAt(null, i, 1);
						table_5.setValueAt(null, i, 2);
						break;
					}
				}
			}
		});
		button_13.setBounds(136, 393, 93, 23);
		desktopPane_8.add(button_13);
		
		JButton button_14 = new JButton("提交");
		button_14.setBounds(496, 393, 93, 23);
		desktopPane_8.add(button_14);
		
		JDesktopPane desktopPane_9 = new JDesktopPane();
		desktopPane_9.setBackground(Color.WHITE);
		tabbedPane_2.addTab("查找账户", null, desktopPane_9, null);
		
		textField_23 = new JTextField();
		textField_23.setText("输入账号或名称关键词搜索");
		textField_23.setBounds(140, 40, 300, 21);
		desktopPane_9.add(textField_23);
		textField_23.setColumns(10);
		
		//查询账户信息的事件监听
		JButton button_15 = new JButton("查询");
		button_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Account> account;
				AccountManageController amc=new AccountManageController();
				account = amc.getAccount(textField_21.getText());
				if(account==null){
					desktopPane_7.setToolTipText("未查找到任何账户信息！");
				}else{
					for(int i=0;i<account.size();i++){
					    table_4.setValueAt(account.get(i), i/table_4.getColumnCount(), i%table_4.getColumnCount());
					}
				}
			}
		});
		button_15.setBounds(496, 40, 93, 23);
		desktopPane_9.add(button_15);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(80, 100, 560, 275);
		desktopPane_9.add(scrollPane_6);
		
		table_6 = new JTable();
		table_6.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"账号", "名称", "金额"
			}
		));
		scrollPane_6.setViewportView(table_6);
		
		JButton button_16 = new JButton("确认");
		button_16.setBounds(496, 388, 93, 23);
		desktopPane_9.add(button_16);
		
		JLabel textPane_2 = new JLabel();
		textPane_2.setText("\u8D22\u52A1\u4EBA\u5458\uFF1A");
		textPane_2.setBounds(280, 0, 700, 21);
		this.add(textPane_2);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		textPane_2.setText(df.format(new Date()));
	}

}
