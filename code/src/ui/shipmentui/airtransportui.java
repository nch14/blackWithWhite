package ui.shipmentui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

import bill.TransportBill;
import bill.TransportBill_Plane;
import bl.shipment.Impl.AirTransportController;
import bl.shipment.Service.AirTransportBLService;

public class airtransportui {

	private JFrame frame_shipment;
	private JTable table_Transport;
	private JTabbedPane tabbedPane_Transport;
	private JDesktopPane desktopPane_airTransport;
	private JTable table_airTransport;
	private JTextField textField_departure;
	private JTextField textField_supervisor;
	private JTextField textField_year;
	private JTextField textField_transfer_order;
	private JTextField textField_planeNumber;
	private JTextField textField_destination;
	private JTextField textField_containerNumber;
	private JTextField textField_orderNumber;
	private JButton button;
	private JTextField textField_month;
	private JTextField textField_day;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					airtransportui window = new airtransportui();
					window.frame_shipment.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public airtransportui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame_shipment = new JFrame();
		frame_shipment.setResizable(false);
		frame_shipment.setBounds(200, 80, 1000, 650);
		frame_shipment.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		table_Transport = new JTable();
		frame_shipment.getContentPane().add(table_Transport, BorderLayout.WEST);
		
		tabbedPane_Transport = new JTabbedPane(JTabbedPane.TOP);
		frame_shipment.getContentPane().add(tabbedPane_Transport, BorderLayout.CENTER);
		
		
		
		//飞机装运管理的界面
		desktopPane_airTransport = new JDesktopPane();
		desktopPane_airTransport.setBackground(Color.WHITE);
		tabbedPane_Transport.addTab("飞机装运", null, desktopPane_airTransport, null);
		
		final JLabel textPane_1 = new JLabel();
		textPane_1.setText("\u4E2D\u8F6C\u4E2D\u5FC3\u4E1A\u52A1\u5458");
		textPane_1.setBounds(280, 0, 700, 21);
		desktopPane_airTransport.add(textPane_1);
		
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		textPane_1.setText(df.format(new Date()));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(150, 210, 700, 320);
		desktopPane_airTransport.add(scrollPane);
		
		table_airTransport = new JTable();
		table_airTransport.setModel(new DefaultTableModel(
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
		table_airTransport.getColumnModel().getColumn(0).setPreferredWidth(25);
		scrollPane.setViewportView(table_airTransport);
		
		JLabel textPane_2 = new JLabel();
		textPane_2.setText("出发地");
		textPane_2.setBounds(150, 80, 50, 21);
		desktopPane_airTransport.add(textPane_2);
		
		textField_departure = new JTextField();
		textField_departure.setBounds(200, 80, 200, 21);
		desktopPane_airTransport.add(textField_departure);
		textField_departure.setColumns(10);
		
		JLabel textPane_3 = new JLabel();
		textPane_3.setText("监装员");
		textPane_3.setBounds(150, 110, 50, 21);
		desktopPane_airTransport.add(textPane_3);
		
		textField_supervisor = new JTextField();
		textField_supervisor.setBounds(200, 110, 200, 21);
		desktopPane_airTransport.add(textField_supervisor);
		textField_supervisor.setColumns(10);
		
		JLabel textPane = new JLabel();
		textPane.setText("日期(年/月/日）");
		textPane.setBounds(150, 49, 102, 21);
		desktopPane_airTransport.add(textPane);
		
		textField_year = new JTextField();
		textField_year.setBounds(260, 49, 40, 21);
		desktopPane_airTransport.add(textField_year);
		textField_year.setColumns(10);
		
		JLabel textPane_6 = new JLabel();
		textPane_6.setText("中转中心中转单编号");
		textPane_6.setBounds(150, 142, 126, 26);
		desktopPane_airTransport.add(textPane_6);
		
		textField_transfer_order = new JTextField();
		textField_transfer_order.setBounds(276, 142, 212, 21);
		desktopPane_airTransport.add(textField_transfer_order);
		textField_transfer_order.setColumns(10);
		
		JLabel textPane_7 = new JLabel();
		textPane_7.setText("航班号");
		textPane_7.setBounds(504, 49, 45, 21);
		desktopPane_airTransport.add(textPane_7);
		
		textField_planeNumber = new JTextField();
		textField_planeNumber.setBounds(559, 49, 196, 21);
		desktopPane_airTransport.add(textField_planeNumber);
		textField_planeNumber.setColumns(10);
		
		JLabel textPane_8 = new JLabel();
		textPane_8.setText("到达地");
		textPane_8.setBounds(504, 80, 50, 21);
		desktopPane_airTransport.add(textPane_8);
		
		textField_destination = new JTextField();
		textField_destination.setBounds(559, 80, 196, 21);
		desktopPane_airTransport.add(textField_destination);
		textField_destination.setColumns(10);
		
		JLabel textPane_9 = new JLabel();
		textPane_9.setText("货柜号");
		textPane_9.setBounds(504, 110, 50, 21);
		desktopPane_airTransport.add(textPane_9);
		
		textField_containerNumber = new JTextField();
		textField_containerNumber.setBounds(559, 110, 196, 21);
		desktopPane_airTransport.add(textField_containerNumber);
		textField_containerNumber.setColumns(10);
		
		JLabel textPane_10 = new JLabel();
		textPane_10.setText("\u672C\u8D27\u67DC\u8D27\u7269\u767B\u8BB0");
		textPane_10.setBounds(150, 180, 100, 26);
		desktopPane_airTransport.add(textPane_10);
		
		JLabel textPane_11 = new JLabel();
		textPane_11.setText("订单号");
		textPane_11.setBounds(290, 180, 50, 21);
		desktopPane_airTransport.add(textPane_11);
		
		textField_orderNumber = new JTextField();
		textField_orderNumber.setBounds(350, 179, 140, 21);
		desktopPane_airTransport.add(textField_orderNumber);
		textField_orderNumber.setColumns(10);
		//添加飞机装运单号事件监听
		button = new JButton("添加");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table_airTransport.getRowCount();i++){
					if(table_airTransport.getValueAt(i, 0)==null&&table_airTransport.getValueAt(i, 1)==null){
						table_airTransport.setValueAt(textField_orderNumber.getText(), i, 0);
						table_airTransport.setValueAt(textField_transfer_order.getText(), i, 1);
						break;
					}
				}
			}
		});
		button.setBounds(750, 170, 93, 23);
		desktopPane_airTransport.add(button);
		
		//撤消飞机装运单一行的事件监听
		JButton button_1 = new JButton("撤消");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_airTransport.getRowCount()-1;i>=0;i--){
					if(table_airTransport.getValueAt(i, 0)!=null||table_airTransport.getValueAt(i, 1)!=null){
						table_airTransport.setValueAt(null, i, 0);
						table_airTransport.setValueAt(null, i, 1);
						break;
					}
				}
			}
		});
		button_1.setBounds(200, 540, 93, 23);
		desktopPane_airTransport.add(button_1);
		
		//提交飞机装运单的事件监听
		JButton button_2 = new JButton("提交");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TransportBill_Plane plane = new TransportBill_Plane();
				AirTransportBLService airTransport=new AirTransportController();
				for(int i=0;i<table_airTransport.getRowCount();i++){
					if(table_airTransport.getValueAt(i, 0)!=null){
				        plane.transBillID=table_airTransport.getValueAt(i, 0).toString();
					}
				}
				double airBill=airTransport.submitBills(plane);
				if(airBill==0){
					textPane_1.setText("提交失败！");
				}else{
					for(int i=0;i<table_airTransport.getRowCount();i++){
						table_airTransport.setValueAt(null, i, 0);
						table_airTransport.setValueAt(null, i, 1);
					}
					textPane_1.setText("提交成功！");
				}
			}
		});
		
		button_2.setBounds(750, 540, 93, 23);
		desktopPane_airTransport.add(button_2);
		
		textField_month = new JTextField();
		textField_month.setBounds(312, 49, 30, 21);
		desktopPane_airTransport.add(textField_month);
		textField_month.setColumns(10);
		
		textField_day = new JTextField();
		textField_day.setBounds(352, 49, 30, 21);
		desktopPane_airTransport.add(textField_day);
		textField_day.setColumns(10);
		
		traintransportui t = new traintransportui();
		tabbedPane_Transport.addTab("火车装运", null, t, null);
		
		trucktransportmanageui t1 = new trucktransportmanageui();
		tabbedPane_Transport.addTab("汽车装运", null, t1, null);
		
		transportandreceiveui t2 = new transportandreceiveui();
		tabbedPane_Transport.addTab("中转中心到达单", null, t2, null);
	}

}
