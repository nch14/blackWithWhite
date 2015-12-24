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
	
	//private JTable table_arrival_order;
	private JTable table_arrival_order;
	private JTextField textField_year;
	private JTextField textField_departure;
	private JTextField textField_loading_list;
	private JTextField textField_intermediate_center;
	private JTextField textField_orderNumber;
	private JComboBox comboBox_state;
	private JTextField textField_month;
	private JTextField textField_day;
	public transportandreceiveui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

	//中转中心到达单的界面

	this.setBackground(Color.WHITE);

	
	/*table_arrival_order = new JTable();
	table_arrival_order.setBounds(446, 366, 1, 1);
	this.add(table_arrival_order);*/
	
	JScrollPane scrollPane_3 = new JScrollPane();
	scrollPane_3.setBounds(150, 210, 700, 320);
	this.add(scrollPane_3);
	
	final JLabel textPane_14 = new JLabel();
	//textPane_14.setText("\u4E2D\u8F6C\u4E2D\u5FC3\u4E1A\u52A1\u5458");
	textPane_14.setBounds(280, 0, 700, 21);
	this.add(textPane_14);
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
	textPane_14.setText(df.format(new Date()));
	
	table_arrival_order = new JTable();
	table_arrival_order.setModel(new DefaultTableModel(
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
	scrollPane_3.setViewportView(table_arrival_order);
	
	JLabel textPane_41 = new JLabel();
	textPane_41.setText("日期（年/月/日）");
	textPane_41.setBounds(150, 49, 103, 21);
	this.add(textPane_41);
	
	textField_year = new JTextField();
	textField_year.setBounds(263, 49, 40, 21);
	this.add(textField_year);
	textField_year.setColumns(10);
	
	JLabel textPane_45 = new JLabel();
	textPane_45.setText("出发地");
	textPane_45.setBounds(150, 79, 45, 21);
	this.add(textPane_45);
	
	textField_departure = new JTextField();
	textField_departure.setBounds(208, 79, 199, 21);
	this.add(textField_departure);
	textField_departure.setColumns(10);
	
	JLabel textPane_46 = new JLabel();
	textPane_46.setText("装车单号");
	textPane_46.setBounds(446, 49, 55, 21);
	this.add(textPane_46);
	
	textField_loading_list = new JTextField();
	textField_loading_list.setBounds(511, 49, 145, 21);
	this.add(textField_loading_list);
	textField_loading_list.setColumns(10);
	
	JLabel textPane_47 = new JLabel();
	textPane_47.setText("中转中心编号");
	textPane_47.setBounds(446, 79, 78, 21);
	this.add(textPane_47);
	
	textField_intermediate_center = new JTextField();
	textField_intermediate_center.setBounds(534, 79, 122, 21);
	this.add(textField_intermediate_center);
	textField_intermediate_center.setColumns(10);
	
	JLabel textPane_48 = new JLabel();
	textPane_48.setText("货物异常到达状态登记");
	textPane_48.setBounds(150, 110, 136, 21);
	this.add(textPane_48);
	
	JLabel textPane_49 = new JLabel();
	textPane_49.setText("订单号");
	textPane_49.setBounds(166, 148, 45, 21);
	this.add(textPane_49);
	
	textField_orderNumber = new JTextField();
	textField_orderNumber.setBounds(229, 148, 154, 21);
	this.add(textField_orderNumber);
	textField_orderNumber.setColumns(10);
	
	JLabel textPane_50 = new JLabel();
	textPane_50.setText("到达状态");
	textPane_50.setBounds(446, 148, 55, 21);
	this.add(textPane_50);
	//添加中转中心到达单的事件监听
	JButton button_7 = new JButton("添加");
	button_7.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			for(int i=0;i<table_arrival_order.getRowCount();i++){
				if(table_arrival_order.getValueAt(i, 0)==null&&table_arrival_order.getValueAt(i, 1)==null){
					table_arrival_order.setValueAt(textField_orderNumber.getText(), i, 0);
					table_arrival_order.setValueAt(comboBox_state.getSelectedItem(), i, 1);
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
			for(int i=table_arrival_order.getRowCount()-1;i>=0;i--){
				if(table_arrival_order.getValueAt(i, 0)!=null||table_arrival_order.getValueAt(i, 1)!=null){
					table_arrival_order.setValueAt(null, i, 0);
					table_arrival_order.setValueAt(null, i, 1);
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
			ArrivementBill_Center arrivement = new ArrivementBill_Center();
			TransportAndReceiveBLService transport=new TransportAndReceiveController();
			for(int i=0;i<table_arrival_order.getRowCount();i++){
				if(table_arrival_order.getValueAt(i, 0)!= null){
				    arrivement.ID=table_arrival_order.getValueAt(i, 0).toString();
				}
			}
			
			boolean istrue=transport.submitBills(arrivement);
			if(istrue=true){
				for(int i=0;i<table_arrival_order.getRowCount();i++){
					table_arrival_order.setValueAt(null, i, 0);
					table_arrival_order.setValueAt(null, i, 1);
				}
				textPane_14.setText("提交成功！");
			}else{
				textPane_14.setText("提交失败！");
			}
		}
	});
	button_9.setBounds(750, 540, 93, 23);
	this.add(button_9);
	
	comboBox_state = new JComboBox();
	comboBox_state.setModel(new DefaultComboBoxModel(new String[] {"丢失", "破损", "无异常"}));
	comboBox_state.setBounds(511, 148, 78, 21);
	this.add(comboBox_state);
	
	textField_month = new JTextField();
	textField_month.setBounds(313, 49, 30, 21);
	this.add(textField_month);
	textField_month.setColumns(10);
	
	textField_day = new JTextField();
	textField_day.setBounds(353, 49, 30, 21);
	this.add(textField_day);
	textField_day.setColumns(10);
	
	}

}
