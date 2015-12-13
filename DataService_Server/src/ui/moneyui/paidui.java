package ui.moneyui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class paidui extends JDesktopPane{
	
	private JTextField textField_20;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTable table_2;
	private JTextField textField_50;
	private JTextField textField_51;
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
		
		textField_20 = new JTextField();
		textField_20.setBounds(286, 45, 40, 21);
		this.add(textField_20);
		textField_20.setColumns(10);
		
		JLabel textPane_16 = new JLabel();
		textPane_16.setText("收款快递员");
		textPane_16.setBounds(512, 45, 66, 21);
		this.add(textPane_16);
		
		textField_23 = new JTextField();
		textField_23.setBounds(588, 45, 90, 21);
		this.add(textField_23);
		textField_23.setColumns(10);
		
		JLabel textPane_17 = new JLabel();
		textPane_17.setText("收款金额");
		textPane_17.setBounds(179, 76, 54, 21);
		this.add(textPane_17);
		
		textField_24 = new JTextField();
		textField_24.setBounds(286, 76, 123, 21);
		this.add(textField_24);
		textField_24.setColumns(10);
		
		JLabel textPane_18 = new JLabel();
		textPane_18.setText("订单编号");
		textPane_18.setBounds(443, 131, 54, 21);
		this.add(textPane_18);
		
		textField_25 = new JTextField();
		textField_25.setBounds(512, 131, 166, 21);
		this.add(textField_25);
		textField_25.setColumns(10);
		//添加收款单的事件监听
		JButton button_10 = new JButton("添加");
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table_2.getRowCount();i++){
					if(table_2.getValueAt(i, 0)==null&&table_2.getValueAt(i, 1)==null&&table_2.getValueAt(i, 3)==null){
				        table_2.setValueAt(textField_20.getText()+textField_50.getText()+textField_51.getText(), i, 0);
				        table_2.setValueAt(textField_23.getText(), i, 1);
				        table_2.setValueAt(textField_24.getText(), i, 2);
				        table_2.setValueAt(textField_25.getText(), i, 3);
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
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
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
		scrollPane_2.setViewportView(table_2);
		//撤消收款单table中一行的事件监听
		JButton button_11 = new JButton("撤消");
		button_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_2.getRowCount()-1;i>=0;i--){
					if(table_2.getValueAt(i, 0)!=null||table_2.getValueAt(i, 1)!=null||table_2.getValueAt(i, 2)!=null||table_2.getValueAt(i, 3)!=null){
						table_2.setValueAt(null, i, 0);
						table_2.setValueAt(null, i, 1);
						table_2.setValueAt(null, i, 2);
						table_2.setValueAt(null, i, 3);
						break;
					}
				}
			}
		});
		button_11.setBounds(200, 524, 93, 23);
		this.add(button_11);
		
		JButton button_12 = new JButton("提交");
		button_12.setBounds(739, 524, 93, 23);
		this.add(button_12);
		
		textField_50 = new JTextField();
		textField_50.setBounds(336, 45, 30, 21);
		this.add(textField_50);
		textField_50.setColumns(10);
		
		textField_51 = new JTextField();
		textField_51.setBounds(376, 45, 30, 21);
		this.add(textField_51);
		textField_51.setColumns(10);
		
		JLabel textPane_37 = new JLabel();
		textPane_37.setText("营业厅业务员：");
		textPane_37.setBounds(280, 0, 700, 21);
		this.add(textPane_37);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		textPane_37.setText(df.format(new Date()));
	}

}
