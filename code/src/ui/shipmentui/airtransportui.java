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

import bill.TransportBill_Plane;
import bl.shipment.Impl.AirTransportController;
import bl.shipment.Service.AirTransportBLService;

public class airtransportui {

	private JFrame frame;
	private JTable table;
	private JTabbedPane tabbedPane;
	private JDesktopPane desktopPane;
	private JTable table_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JButton button;
	private JTextField textField_35;
	private JTextField textField_36;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					airtransportui window = new airtransportui();
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
	public airtransportui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(200, 80, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		table = new JTable();
		frame.getContentPane().add(table, BorderLayout.WEST);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		
		
		//飞机装运管理的界面
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		tabbedPane.addTab("飞机装运", null, desktopPane, null);
		
		JLabel textPane_1 = new JLabel();
		textPane_1.setText("\u4E2D\u8F6C\u4E2D\u5FC3\u4E1A\u52A1\u5458");
		textPane_1.setBounds(280, 0, 700, 21);
		desktopPane.add(textPane_1);
		
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		textPane_1.setText(df.format(new Date()));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(150, 210, 700, 320);
		desktopPane.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
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
		table_1.getColumnModel().getColumn(0).setPreferredWidth(25);
		scrollPane.setViewportView(table_1);
		
		JLabel textPane_2 = new JLabel();
		textPane_2.setText("出发地");
		textPane_2.setBounds(150, 80, 50, 21);
		desktopPane.add(textPane_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(200, 80, 200, 21);
		desktopPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel textPane_3 = new JLabel();
		textPane_3.setText("监装员");
		textPane_3.setBounds(150, 110, 50, 21);
		desktopPane.add(textPane_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(200, 110, 200, 21);
		desktopPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel textPane = new JLabel();
		textPane.setText("日期(年/月/日）");
		textPane.setBounds(150, 49, 102, 21);
		desktopPane.add(textPane);
		
		textField = new JTextField();
		textField.setBounds(260, 49, 40, 21);
		desktopPane.add(textField);
		textField.setColumns(10);
		
		JLabel textPane_6 = new JLabel();
		textPane_6.setText("中转中心中转单编号");
		textPane_6.setBounds(150, 142, 126, 26);
		desktopPane.add(textPane_6);
		
		textField_6 = new JTextField();
		textField_6.setBounds(276, 142, 212, 21);
		desktopPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel textPane_7 = new JLabel();
		textPane_7.setText("航班号");
		textPane_7.setBounds(504, 49, 45, 21);
		desktopPane.add(textPane_7);
		
		textField_7 = new JTextField();
		textField_7.setBounds(559, 49, 196, 21);
		desktopPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel textPane_8 = new JLabel();
		textPane_8.setText("到达地");
		textPane_8.setBounds(504, 80, 50, 21);
		desktopPane.add(textPane_8);
		
		textField_8 = new JTextField();
		textField_8.setBounds(559, 80, 196, 21);
		desktopPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel textPane_9 = new JLabel();
		textPane_9.setText("货柜号");
		textPane_9.setBounds(504, 110, 50, 21);
		desktopPane.add(textPane_9);
		
		textField_9 = new JTextField();
		textField_9.setBounds(559, 110, 196, 21);
		desktopPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel textPane_10 = new JLabel();
		textPane_10.setText("\u672C\u8D27\u67DC\u8D27\u7269\u767B\u8BB0");
		textPane_10.setBounds(150, 180, 100, 26);
		desktopPane.add(textPane_10);
		
		JLabel textPane_11 = new JLabel();
		textPane_11.setText("订单号");
		textPane_11.setBounds(290, 180, 50, 21);
		desktopPane.add(textPane_11);
		
		textField_10 = new JTextField();
		textField_10.setBounds(350, 179, 140, 21);
		desktopPane.add(textField_10);
		textField_10.setColumns(10);
		//添加飞机装运单号事件监听
		button = new JButton("添加");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table_1.getRowCount();i++){
					if(table_1.getValueAt(i, 0)==null&&table_1.getValueAt(i, 1)==null){
						table_1.setValueAt(textField_10.getText(), i, 0);
						table_1.setValueAt(textField_6.getText(), i, 1);
						break;
					}
				}
			}
		});
		button.setBounds(750, 170, 93, 23);
		desktopPane.add(button);
		
		//撤消飞机装运单一行的事件监听
		JButton button_1 = new JButton("撤消");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_1.getRowCount()-1;i>=0;i--){
					if(table_1.getValueAt(i, 0)!=null||table_1.getValueAt(i, 1)!=null){
						table_1.setValueAt(null, i, 0);
						table_1.setValueAt(null, i, 1);
						break;
					}
				}
			}
		});
		button_1.setBounds(200, 540, 93, 23);
		desktopPane.add(button_1);
		
		//提交飞机装运单的事件监听
		JButton button_2 = new JButton("提交");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TransportBill_Plane plane = null;
				for(int i=0;i<table_1.getRowCount();i++){
				     plane.transBillID=table_1.getValueAt(i, 0).toString();
				}
				AirTransportBLService airTransport=new AirTransportController();
				double airBill=airTransport.submitBills(plane);
				if(airBill==0){
					textPane_1.setText("提交失败！");
				}else{
					for(int i=0;i<table_1.getRowCount();i++){
						table_1.setValueAt(null, i, 0);
						table_1.setValueAt(null, i, 1);
					}
				}
			}
		});
		
		button_2.setBounds(750, 540, 93, 23);
		desktopPane.add(button_2);
		
		textField_35 = new JTextField();
		textField_35.setBounds(312, 49, 30, 21);
		desktopPane.add(textField_35);
		textField_35.setColumns(10);
		
		textField_36 = new JTextField();
		textField_36.setBounds(352, 49, 30, 21);
		desktopPane.add(textField_36);
		textField_36.setColumns(10);
		
		traintransportui t = new traintransportui();
		tabbedPane.addTab("火车装运", null, t, null);
		
		trucktransportmanageui t1 = new trucktransportmanageui();
		tabbedPane.addTab("汽车装运", null, t1, null);
		
		transportandreceiveui t2 = new transportandreceiveui();
		tabbedPane.addTab("中转中心到达单", null, t2, null);
	}

}
