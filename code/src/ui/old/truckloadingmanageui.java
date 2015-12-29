package ui.old;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
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

import ui.staffui.drivermanageui;
import ui.staffui.truckmanageui;

import javax.swing.UIManager;

import bill.BusShipmentBill_Shop;
import bill.TransportBill;
import bl.shipment.Impl.TruckLoadingManageController;
import bl.shipment.Service.TruckLoadingManageBLService;

public class truckloadingmanageui {

	private JFrame frame_truckloading;
	private JTextField textField_year;
	private JTextField textField_truck_number;
	private JTextField textField_businessHall;
	private JTextField textField_destination;
	private JTextField textField_supercargo;
	private JTextField textField_supervisor;
	private JTextField textField_order_number;
	private JTable table_loading_list;
	private JTextField textField_car_number;
	private JTextField textField_month;
	private JTextField textField_day;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					truckloadingmanageui window = new truckloadingmanageui();
					window.frame_truckloading.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public truckloadingmanageui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame_truckloading = new JFrame();
		frame_truckloading.setResizable(false);
		//frame.setIconImage(new ImageIcon("/星球3.png").getImage());
		frame_truckloading.setBounds(200, 80, 1000, 650);
		frame_truckloading.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//车辆装车管理界面
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame_truckloading.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JDesktopPane desktopPane_4 =new JDesktopPane();
		desktopPane_4.setBackground(Color.WHITE);
		tabbedPane.addTab("车辆装车管理", null, desktopPane_4, null);
		
		final JLabel textPane_34 = new JLabel();
		textPane_34.setBackground(Color.WHITE);
		textPane_34.setText("营业厅业务员：");
		textPane_34.setBounds(280, 0, 700, 21);
		desktopPane_4.add(textPane_34);
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		textPane_34.setText(df.format(new Date()));
		
		JLabel textPane_19 = new JLabel();
		textPane_19.setBackground(Color.WHITE);
		textPane_19.setText("装车日期（年/月/日）");
		textPane_19.setBounds(150, 30, 126, 21);
		desktopPane_4.add(textPane_19);
		
		textField_year = new JTextField();
		textField_year.setBounds(285, 30, 40, 21);
		desktopPane_4.add(textField_year);
		textField_year.setColumns(10);
		
		JLabel textPane_20 = new JLabel();
		textPane_20.setBackground(Color.WHITE);
		textPane_20.setText("汽运编号");
		textPane_20.setBounds(150, 60, 54, 21);
		desktopPane_4.add(textPane_20);
		
		JLabel textPane_21 = new JLabel();
		textPane_21.setBackground(Color.WHITE);
		textPane_21.setText("营业厅编号");
		textPane_21.setBounds(150, 93, 75, 21);
		desktopPane_4.add(textPane_21);
		
		textField_truck_number = new JTextField();
		textField_truck_number.setBounds(285, 60, 120, 21);
		desktopPane_4.add(textField_truck_number);
		textField_truck_number.setColumns(10);
		
		textField_businessHall = new JTextField();
		textField_businessHall.setBounds(285, 93, 120, 21);
		desktopPane_4.add(textField_businessHall);
		textField_businessHall.setColumns(10);
		
		JLabel textPane_22 = new JLabel();
		textPane_22.setBackground(Color.WHITE);
		textPane_22.setText("到达地");
		textPane_22.setBounds(500, 30, 42, 21);
		desktopPane_4.add(textPane_22);
		
		JLabel textPane_23 = new JLabel();
		textPane_23.setBackground(Color.WHITE);
		textPane_23.setText("押运员");
		textPane_23.setBounds(499, 62, 42, 21);
		desktopPane_4.add(textPane_23);
		
		JLabel textPane_24 = new JLabel();
		textPane_24.setBackground(Color.WHITE);
		textPane_24.setText("监装员");
		textPane_24.setBounds(499, 93, 42, 21);
		desktopPane_4.add(textPane_24);
		
		textField_destination = new JTextField();
		textField_destination.setBounds(551, 31, 155, 21);
		desktopPane_4.add(textField_destination);
		textField_destination.setColumns(10);
		
		textField_supercargo = new JTextField();
		textField_supercargo.setBounds(551, 62, 155, 21);
		desktopPane_4.add(textField_supercargo);
		textField_supercargo.setColumns(10);
		
		textField_supervisor = new JTextField();
		textField_supervisor.setBounds(551, 93, 155, 21);
		desktopPane_4.add(textField_supervisor);
		textField_supervisor.setColumns(10);
		
		JLabel textPane_25 = new JLabel();
		textPane_25.setBackground(Color.WHITE);
		textPane_25.setText("订单号");
		textPane_25.setBounds(500, 151, 42, 21);
		desktopPane_4.add(textPane_25);
		
		textField_order_number = new JTextField();
		textField_order_number.setBounds(551, 151, 155, 21);
		desktopPane_4.add(textField_order_number);
		textField_order_number.setColumns(10);
		
		final JButton button_13 = new JButton("添加");
		button_13.setBackground(UIManager.getColor("Button.background"));
		//添加装车单的事件监听
		button_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table_loading_list.getRowCount();i++){
					if(table_loading_list.getValueAt(i, 0)==null&&table_loading_list.getValueAt(i, 1)==null&&table_loading_list.getValueAt(i, 2)==null&&table_loading_list.getValueAt(i, 3)==null
							&&table_loading_list.getValueAt(i, 4)==null&&table_loading_list.getValueAt(i, 5)==null&&table_loading_list.getValueAt(i, 6)==null&&table_loading_list.getValueAt(i, 7)==null){
				        table_loading_list.setValueAt(textField_order_number.getText(),i,0);
				        table_loading_list.setValueAt(textField_year.getText()+textField_month.getText()+textField_day.getText(), i, 1);
				        table_loading_list.setValueAt(textField_destination.getText(), i, 2);
				        table_loading_list.setValueAt(textField_truck_number.getText(), i, 3);
		                table_loading_list.setValueAt(textField_car_number.getText(), i, 4);
				        table_loading_list.setValueAt(textField_supercargo.getText(), i, 5);
				        table_loading_list.setValueAt(textField_businessHall.getText(), i, 6);
				        table_loading_list.setValueAt(textField_supervisor.getText(), i, 7);
				        break;
					}
				}
			}
			
		});
		
		button_13.setBounds(728, 150, 93, 23);
		desktopPane_4.add(button_13);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(150, 190, 700, 325);
		desktopPane_4.add(scrollPane_3);
		
		table_loading_list = new JTable();
		table_loading_list.setForeground(Color.BLACK);
		table_loading_list.setBackground(new Color(255, 255, 255));
		table_loading_list.setFont(new Font("SimSun", Font.PLAIN, 12));
		
		table_loading_list.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"订单号", "装车日期", "到达地", "车辆代号", "汽运编号", "押运员", "营业厅编号", "监装员"
			}
		));
		scrollPane_3.setViewportView(table_loading_list);
		//撤消装车单table中一行的事件监听
		JButton button_14 = new JButton("撤消");
		button_14.setBackground(UIManager.getColor("Button.background"));
		button_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_loading_list.getRowCount()-1;i>=0;i--){
					if(table_loading_list.getValueAt(i, 0)!=null||table_loading_list.getValueAt(i, 1)!=null||table_loading_list.getValueAt(i, 2)!=null||table_loading_list.getValueAt(i, 3)!=null||
							table_loading_list.getValueAt(i, 4)!=null||table_loading_list.getValueAt(i, 5)!=null||table_loading_list.getValueAt(i, 6)!=null||table_loading_list.getValueAt(i, 7)!=null){
						table_loading_list.setValueAt(null, i, 0);
						table_loading_list.setValueAt(null, i, 1);
						table_loading_list.setValueAt(null, i, 2);
						table_loading_list.setValueAt(null, i, 3);
						table_loading_list.setValueAt(null, i, 4);
						table_loading_list.setValueAt(null, i, 5);
						table_loading_list.setValueAt(null, i, 6);
						table_loading_list.setValueAt(null, i, 7);
						break;
					}
				}
			}
		});
		
		button_14.setBounds(200, 536, 93, 23);
		desktopPane_4.add(button_14);
		
		//提交一个table的事件监听
		JButton button_16 = new JButton("提交");
		button_16.setBackground(UIManager.getColor("Button.background"));
		button_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BusShipmentBill_Shop busShip=null;
				for(int i=0;i<table_loading_list.getRowCount();i++){
					busShip.busshipID=table_loading_list.getValueAt(i, 0).toString();
				}
				TruckLoadingManageBLService truckLoading=new TruckLoadingManageController();
				double loadingBill=truckLoading.submitBills(busShip);
				if(loadingBill==0){
					textPane_34.setText("提交失败！");
				}else{
					for(int i=0;i<table_loading_list.getRowCount();i++){
						table_loading_list.setValueAt(null, i, 0);
						table_loading_list.setValueAt(null, i, 1);
						table_loading_list.setValueAt(null, i, 2);
						table_loading_list.setValueAt(null, i, 3);
						table_loading_list.setValueAt(null, i, 4);
						table_loading_list.setValueAt(null, i, 5);
						table_loading_list.setValueAt(null, i, 6);
						table_loading_list.setValueAt(null, i, 7);
					}
				}
			}
		});
		button_16.setBounds(757, 536, 93, 23);
		desktopPane_4.add(button_16);
		
		JLabel textPane_42 = new JLabel();
		textPane_42.setBackground(Color.WHITE);
		textPane_42.setText("车辆代号");
		textPane_42.setBounds(150, 124, 54, 21);
		desktopPane_4.add(textPane_42);
		
		textField_car_number = new JTextField();
		textField_car_number.setBounds(285, 128, 120, 21);
		desktopPane_4.add(textField_car_number);
		textField_car_number.setColumns(10);
		
		textField_month = new JTextField();
		textField_month.setBounds(335, 30, 30, 21);
		desktopPane_4.add(textField_month);
		textField_month.setColumns(10);
		
		textField_day = new JTextField();
		textField_day.setBounds(375, 30, 30, 21);
		desktopPane_4.add(textField_day);
		textField_day.setColumns(10);
		
		receiveui t = new receiveui();
		tabbedPane.addTab("营业厅到达单", null, t, null);
		
		distributionui t1 = new distributionui();
		tabbedPane.addTab("派件单", null, t1, null);
		
		paidui t2 = new paidui();
		tabbedPane.addTab("收款单填写", null, t2, null);
		
		drivermanageui t3 = new drivermanageui();
		tabbedPane.addTab("司机信息管理", null, t3, null);
		
		truckmanageui t4 = new truckmanageui();
		tabbedPane.addTab("车辆信息管理", null, t4, null);
		
	}

}
