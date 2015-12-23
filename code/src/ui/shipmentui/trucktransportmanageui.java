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
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import bill.TransportBill_Truck;
import bl.shipment.Impl.TruckTransportManageController;
import bl.shipment.Service.TruckTransportManageBLService;

public class trucktransportmanageui extends JDesktopPane{
	
	
	private JTable table_carTransport;
	private JTextField textField_departure;
	private JTextField textField_voucher;
	private JTextField textField_transfer_order;
	private JTextField textField_carnumber;
	private JTextField textField_destination;
	private JTextField textField_supercargo;
	private JTextField textField_orderNumber;
	private JButton button_6;
	private JComboBox comboBox_property;
	private JTextField textField_month;
	private JTextField textField_day;
	private JTextField textField_year;
	
	
	
	public trucktransportmanageui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//汽车装运管理的界面
				this.setBackground(Color.WHITE);

				
				JScrollPane scrollPane_2 = new JScrollPane();
				scrollPane_2.setBounds(150, 210, 700, 320);
				this.add(scrollPane_2);
				
				final JLabel textPane_5 = new JLabel();
				textPane_5.setText("\u4E2D\u8F6C\u4E2D\u5FC3\u4E1A\u52A1\u5458");
				textPane_5.setBounds(280, 0, 700, 21);
				this.add(textPane_5);
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
				textPane_5.setText(df.format(new Date()));
				
				table_carTransport = new JTable();
				table_carTransport.setModel(new DefaultTableModel(
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
						"订单号", "中转中心中转单编号"
					}
				));
				scrollPane_2.setViewportView(table_carTransport);
				
				JLabel textPane_26 = new JLabel();
				textPane_26.setText("日期（年/月/日）");
				textPane_26.setBounds(150, 49, 102, 21);
				this.add(textPane_26);
				
				textField_year = new JTextField();
				textField_year.setBounds(262, 49, 40, 21);
				this.add(textField_year);
				textField_year.setColumns(10);
				
				JLabel textPane_30 = new JLabel();
				textPane_30.setText("出发地");
				textPane_30.setBounds(150, 80, 45, 21);
				this.add(textPane_30);
				
				JLabel textPane_31 = new JLabel();
				textPane_31.setText("监装员");
				textPane_31.setBounds(150, 110, 45, 21);
				this.add(textPane_31);
				
				JLabel textPane_32 = new JLabel();
				textPane_32.setText("中转中心中转单编号");
				textPane_32.setBounds(145, 142, 125, 21);
				this.add(textPane_32);
				
				textField_departure = new JTextField();
				textField_departure.setBounds(205, 80, 200, 21);
				this.add(textField_departure);
				textField_departure.setColumns(10);
				
				textField_voucher = new JTextField();
				textField_voucher.setBounds(205, 110, 200, 21);
				this.add(textField_voucher);
				textField_voucher.setColumns(10);
				
				textField_transfer_order = new JTextField();
				textField_transfer_order.setBounds(280, 142, 212, 21);
				this.add(textField_transfer_order);
				textField_transfer_order.setColumns(10);
				
				JLabel textPane_33 = new JLabel();
				textPane_33.setText("车次号");
				textPane_33.setBounds(504, 49, 45, 21);
				this.add(textPane_33);
				
				JLabel textPane_34 = new JLabel();
				textPane_34.setText("到达地");
				textPane_34.setBounds(504, 80, 45, 21);
				this.add(textPane_34);
				
				JLabel textPane_35 = new JLabel();
				textPane_35.setText("押运员");
				textPane_35.setBounds(504, 110, 45, 21);
				this.add(textPane_35);
				
				textField_carnumber = new JTextField();
				textField_carnumber.setBounds(559, 49, 196, 21);
				this.add(textField_carnumber);
				textField_carnumber.setColumns(10);
				
				textField_destination = new JTextField();
				textField_destination.setBounds(559, 80, 196, 21);
				this.add(textField_destination);
				textField_destination.setColumns(10);
				
				textField_supercargo = new JTextField();
				textField_supercargo.setBounds(559, 110, 196, 21);
				this.add(textField_supercargo);
				textField_supercargo.setColumns(10);
				
				JLabel textPane_36 = new JLabel();
				textPane_36.setText("本车货物登记");
				textPane_36.setBounds(150, 179, 82, 21);
				this.add(textPane_36);
				
				JLabel textPane_37 = new JLabel();
				textPane_37.setBounds(172, 184, 6, 21);
				this.add(textPane_37);
				
				JLabel textPane_38 = new JLabel();
				textPane_38.setText("订单号");
				textPane_38.setBounds(290, 180, 45, 21);
				this.add(textPane_38);
				
				textField_orderNumber = new JTextField();
				textField_orderNumber.setBounds(345, 179, 147, 21);
				this.add(textField_orderNumber);
				textField_orderNumber.setColumns(10);
				//添加汽车装运单的事件监听
				button_6 = new JButton("添加");
				button_6.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						for(int i=0;i<table_carTransport.getRowCount();i++){
							if(table_carTransport.getValueAt(i, 0)==null&&table_carTransport.getValueAt(i, 1)==null){
								table_carTransport.setValueAt(textField_orderNumber.getText(), i, 0);
								table_carTransport.setValueAt(textField_transfer_order.getText(), i, 1);
								break;
							}
						}
					}
				});
				button_6.setBounds(750, 170, 93, 23);
				this.add(button_6);
				
				JLabel textPane_40 = new JLabel();
				textPane_40.setText("单据属性");
				textPane_40.setBounds(504, 179, 54, 21);
				this.add(textPane_40);
				
				comboBox_property = new JComboBox();
				comboBox_property.setModel(new DefaultComboBoxModel(new String[] {"中转单", "装车单"}));
				comboBox_property.setBounds(569, 179, 65, 21);
				this.add(comboBox_property);
				
				//撤消汽车装运单中一行的事件监听
				JButton button_10 = new JButton("撤消");
				button_10.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						for(int i=table_carTransport.getRowCount()-1;i>=0;i--){
							if(table_carTransport.getValueAt(i, 0)!=null||table_carTransport.getValueAt(i, 1)!=null){
								table_carTransport.setValueAt(null, i, 0);
								table_carTransport.setValueAt(null, i, 1);
								break;
							}
						}
					}
				});
				button_10.setBounds(200, 540, 93, 23);
				this.add(button_10);
				
				JButton button_11 = new JButton("提交");
				button_11.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						TransportBill_Truck truck = null;
						for(int i=0;i<table_carTransport.getRowCount();i++){
							truck.transBillID=table_carTransport.getValueAt(i, 0).toString();
						}
						TruckTransportManageBLService truckTransport=new TruckTransportManageController();
						double truckBill=truckTransport.submitBills(truck);
						if(truckBill==0){
							textPane_5.setText("提交失败！");
						}else{
							for(int i=0;i<table_carTransport.getRowCount();i++){
								table_carTransport.setValueAt(null, i, 0);
								table_carTransport.setValueAt(null, i, 1);
							}
						}
					}
				});
				button_11.setBounds(750, 540, 93, 23);
				this.add(button_11);
				
				textField_month = new JTextField();
				textField_month.setBounds(312, 49, 30, 21);
				this.add(textField_month);
				textField_month.setColumns(10);
				
				textField_day = new JTextField();
				textField_day.setBounds(352, 49, 30, 21);
				this.add(textField_day);
				textField_day.setColumns(10);
				
	}

}
