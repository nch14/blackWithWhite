package ui.shipmentui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

import bill.ArrivementBill_Center;
import bl.shipment.Impl.TransportAndReceiveController;
import bl.shipment.Service.TransportAndReceiveBLService;

public class transportandreceiveui extends JDesktopPane{
	
	private JTextPane textPane;
	private JTextPane textPane_6;
	private JTextPane textPane_7;
	private JTextPane textPane_8;
	private JTextPane textPane_9;
	private JTextPane textPane_10;
	private JTextPane textPane_11;
	private JTextPane textPane_12;
	private JTextPane textPane_26;
	private JTextField textField_22;
	private JTextPane textPane_30;
	private JTextPane textPane_31;
	private JTextPane textPane_32;
	private JTextPane textPane_33;
	private JTextPane textPane_34;
	private JTextPane textPane_35;
	private JTextPane textPane_36;
	private JTextPane textPane_37;
	private JTextPane textPane_38;
	private JTextPane textPane_39;
	private JTextPane textPane_40;
	private JTable table_5;
	private JTable table_4;
	private JTextField textField_34;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JCheckBox chckbxNewCheckBox;
	private JComboBox comboBox;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextPane textPane_1;
	private JTextPane textPane_4;
	private JTextPane textPane_5;
	private JTextPane textPane_14;
	private JTextPane textPane_16;
	private JTextPane textPane_27;
	
	public transportandreceiveui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

	//中转中心到达单的界面

	this.setBackground(Color.WHITE);

	
	table_5 = new JTable();
	table_5.setBounds(446, 366, 1, 1);
	this.add(table_5);
	
	JScrollPane scrollPane_3 = new JScrollPane();
	scrollPane_3.setBounds(150, 210, 700, 320);
	this.add(scrollPane_3);
	
	final JLabel textPane_14 = new JLabel();
	textPane_14.setText("\u4E2D\u8F6C\u4E2D\u5FC3\u4E1A\u52A1\u5458");
	textPane_14.setBounds(280, 0, 700, 21);
	this.add(textPane_14);
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
	textPane_14.setText(df.format(new Date()));
	
	table_4 = new JTable();
	table_4.setModel(new DefaultTableModel(
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
			 "订单号", "到达状态"
		}
	));
	scrollPane_3.setViewportView(table_4);
	
	JLabel textPane_41 = new JLabel();
	textPane_41.setText("日期（年/月/日）");
	textPane_41.setBounds(150, 49, 103, 21);
	this.add(textPane_41);
	
	textField_34 = new JTextField();
	textField_34.setBounds(263, 49, 40, 21);
	this.add(textField_34);
	textField_34.setColumns(10);
	
	JLabel textPane_45 = new JLabel();
	textPane_45.setText("出发地");
	textPane_45.setBounds(150, 79, 45, 21);
	this.add(textPane_45);
	
	textField_37 = new JTextField();
	textField_37.setBounds(208, 79, 199, 21);
	this.add(textField_37);
	textField_37.setColumns(10);
	
	JLabel textPane_46 = new JLabel();
	textPane_46.setText("装车单号");
	textPane_46.setBounds(446, 49, 55, 21);
	this.add(textPane_46);
	
	textField_38 = new JTextField();
	textField_38.setBounds(511, 49, 145, 21);
	this.add(textField_38);
	textField_38.setColumns(10);
	
	JLabel textPane_47 = new JLabel();
	textPane_47.setText("中转中心编号");
	textPane_47.setBounds(446, 79, 78, 21);
	this.add(textPane_47);
	
	textField_39 = new JTextField();
	textField_39.setBounds(534, 79, 122, 21);
	this.add(textField_39);
	textField_39.setColumns(10);
	
	JLabel textPane_48 = new JLabel();
	textPane_48.setText("货物异常到达状态登记");
	textPane_48.setBounds(150, 110, 136, 21);
	this.add(textPane_48);
	
	JLabel textPane_49 = new JLabel();
	textPane_49.setText("订单号");
	textPane_49.setBounds(166, 148, 45, 21);
	this.add(textPane_49);
	
	textField_40 = new JTextField();
	textField_40.setBounds(229, 148, 154, 21);
	this.add(textField_40);
	textField_40.setColumns(10);
	
	JLabel textPane_50 = new JLabel();
	textPane_50.setText("到达状态");
	textPane_50.setBounds(446, 148, 55, 21);
	this.add(textPane_50);
	//添加中转中心到达单的事件监听
	JButton button_7 = new JButton("添加");
	button_7.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			for(int i=0;i<table_4.getRowCount();i++){
				if(table_4.getValueAt(i, 0)==null&&table_4.getValueAt(i, 1)==null){
					table_4.setValueAt(textField_40.getText(), i, 0);
					table_4.setValueAt(comboBox.getSelectedItem(), i, 1);
					break;
				}
			}
		}
	});
	button_7.setBounds(750, 170, 93, 23);
	this.add(button_7);
	
	//撤消中转中心到达单table中一行的事件监听
	JButton button_8 = new JButton("撤消");
	button_8.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			for(int i=table_4.getRowCount()-1;i>=0;i--){
				if(table_4.getValueAt(i, 0)!=null||table_4.getValueAt(i, 1)!=null){
					table_4.setValueAt(null, i, 0);
					table_4.setValueAt(null, i, 1);
					break;
				}
			}
		}
	});
	button_8.setBounds(200, 540, 93, 23);
	this.add(button_8);
	
	JButton button_9 = new JButton("提交");
	button_9.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ArrivementBill_Center arrivement=null;
			for(int i=0;i<table_4.getRowCount();i++){
				arrivement.ID=table_4.getValueAt(i, 0).toString();
			}
			TransportAndReceiveBLService transport=new TransportAndReceiveController();
			boolean istrue=transport.submitBills(arrivement);
			if(istrue=true){
				for(int i=0;i<table_4.getRowCount();i++){
					table_4.setValueAt(null, i, 0);
					table_4.setValueAt(null, i, 1);
				}
			}else{
				textPane_14.setText("提交失败！");
			}
		}
	});
	button_9.setBounds(750, 540, 93, 23);
	this.add(button_9);
	
	comboBox = new JComboBox();
	comboBox.setModel(new DefaultComboBoxModel(new String[] {"丢失", "破损"}));
	comboBox.setBounds(511, 148, 78, 21);
	this.add(comboBox);
	
	textField_1 = new JTextField();
	textField_1.setBounds(313, 49, 30, 21);
	this.add(textField_1);
	textField_1.setColumns(10);
	
	textField_2 = new JTextField();
	textField_2.setBounds(353, 49, 30, 21);
	this.add(textField_2);
	textField_2.setColumns(10);
	
	}

}
