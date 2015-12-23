package ui.moneyui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import bill.Account;
import bl.money.Impl.AccountManageController;
import bl.money.Service.AccountManageBLService;

public class paidui extends JDesktopPane{
	
	private JTextField textField_year;
	private JTextField textField_courier;
	private JTextField textField_money;
	private JTextField textField_order_number;
	private JTable table_receiveVoucher;
	private JTextField textField_month;
	private JTextField textField_day;
	public paidui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.setBackground(Color.WHITE);
		
		JLabel textPane_15 = new JLabel();
		textPane_15.setText("收款日期（年/月/日）");
		textPane_15.setBounds(150, 45, 126, 21);
		this.add(textPane_15);
		
		textField_year = new JTextField();
		textField_year.setBounds(286, 45, 40, 21);
		this.add(textField_year);
		textField_year.setColumns(10);
		
		JLabel textPane_16 = new JLabel();
		textPane_16.setText("收款快递员");
		textPane_16.setBounds(512, 45, 66, 21);
		this.add(textPane_16);
		
		textField_courier = new JTextField();
		textField_courier.setBounds(588, 45, 90, 21);
		this.add(textField_courier);
		textField_courier.setColumns(10);
		
		JLabel textPane_17 = new JLabel();
		textPane_17.setText("收款金额");
		textPane_17.setBounds(179, 76, 54, 21);
		this.add(textPane_17);
		
		textField_money = new JTextField();
		textField_money.setBounds(286, 76, 123, 21);
		this.add(textField_money);
		textField_money.setColumns(10);
		
		JLabel textPane_18 = new JLabel();
		textPane_18.setText("订单编号");
		textPane_18.setBounds(443, 131, 54, 21);
		this.add(textPane_18);
		
		textField_order_number = new JTextField();
		textField_order_number.setBounds(512, 131, 166, 21);
		this.add(textField_order_number);
		textField_order_number.setColumns(10);
		//添加收款单的事件监听
		JButton button_10 = new JButton("添加");
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table_receiveVoucher.getRowCount();i++){
					if(table_receiveVoucher.getValueAt(i, 0)==null&&table_receiveVoucher.getValueAt(i, 1)==null&&table_receiveVoucher.getValueAt(i, 3)==null){
				        table_receiveVoucher.setValueAt(textField_year.getText()+textField_month.getText()+textField_day.getText(), i, 0);
				        table_receiveVoucher.setValueAt(textField_courier.getText(), i, 1);
				        table_receiveVoucher.setValueAt(textField_money.getText(), i, 2);
				        table_receiveVoucher.setValueAt(textField_order_number.getText(), i, 3);
				        break;
					}
				}
			}
		});
		button_10.setBounds(739, 131, 93, 23);
		this.add(button_10);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(150, 190, 700, 325);
		this.add(scrollPane_2);
		
		table_receiveVoucher = new JTable();
		table_receiveVoucher.setModel(new DefaultTableModel(
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
			    "收款日期", "收款快递员", "收款金额", "订单编号"
			}
		));
		scrollPane_2.setViewportView(table_receiveVoucher);
		//撤消收款单table中一行的事件监听
		JButton button_11 = new JButton("撤消");
		button_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_receiveVoucher.getRowCount()-1;i>=0;i--){
					if(table_receiveVoucher.getValueAt(i, 0)!=null||table_receiveVoucher.getValueAt(i, 1)!=null||table_receiveVoucher.getValueAt(i, 2)!=null||table_receiveVoucher.getValueAt(i, 3)!=null){
						table_receiveVoucher.setValueAt(null, i, 0);
						table_receiveVoucher.setValueAt(null, i, 1);
						table_receiveVoucher.setValueAt(null, i, 2);
						table_receiveVoucher.setValueAt(null, i, 3);
						break;
					}
				}
			}
		});
		button_11.setBounds(200, 524, 93, 23);
		this.add(button_11);
		
		JButton button_12 = new JButton("提交");
		button_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		button_12.setBounds(739, 524, 93, 23);
		this.add(button_12);
		
		textField_month = new JTextField();
		textField_month.setBounds(336, 45, 30, 21);
		this.add(textField_month);
		textField_month.setColumns(10);
		
		textField_day = new JTextField();
		textField_day.setBounds(376, 45, 30, 21);
		this.add(textField_day);
		textField_day.setColumns(10);
		
		JLabel textPane_37 = new JLabel();
		textPane_37.setText("营业厅业务员：");
		textPane_37.setBounds(280, 0, 700, 21);
		this.add(textPane_37);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		textPane_37.setText(df.format(new Date()));
	}

}
