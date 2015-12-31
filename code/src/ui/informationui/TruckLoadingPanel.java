package ui.informationui;

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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import bill.BusShipmentBill_Shop;
import bl.shipment.Impl.TruckLoadingManageController;
import bl.shipment.Service.TruckLoadingManageBLService;
import ui.NSwing.NLabel;
import ui.NSwing.NTextField;
import ui.old.distributionui;
import ui.old.paidui;
import ui.old.receiveui;
import ui.old.truckloadingmanageui;
import ui.staffui.drivermanageui;
import ui.staffui.truckmanageui;

public class TruckLoadingPanel extends JPanel {
	private JFrame frame_truckloading;
	private JTextField textField_date;
	private JTextField textField_truck_number;
	private JTextField textField_businessHall;
	private JTextField textField_destination;
	private JTextField textField_supercargo;
	private JTextField textField_supervisor;
	private JTextField textField_order_number;
	private JTextField textField_car_number;



	public TruckLoadingPanel() {
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);

		JLabel textPane_19 = new NLabel();
		textPane_19.setBackground(Color.WHITE);
		textPane_19.setText("装车日期");
		textPane_19.setBounds(120, 50, 200, 30);
		this.add(textPane_19);
		
		textField_date = new NTextField();
		textField_date.setBounds(240, 50, 130, 30);
		this.add(textField_date);
		textField_date.setColumns(10);
		
		JLabel textPane_20 = new NLabel();
		textPane_20.setBackground(Color.WHITE);
		textPane_20.setText("汽运编号");
		textPane_20.setBounds(120, 110, 200, 30);
		this.add(textPane_20);
		
		JLabel textPane_21 = new NLabel();
		textPane_21.setBackground(Color.WHITE);
		textPane_21.setText("营业厅编号");
		textPane_21.setBounds(120, 170, 200, 30);
		this.add(textPane_21);
		
		textField_truck_number = new NTextField();
		textField_truck_number.setBounds(240, 110, 130, 30);
		this.add(textField_truck_number);
		textField_truck_number.setColumns(10);
		
		textField_businessHall = new NTextField();
		textField_businessHall.setBounds(240, 170, 130, 30);
		this.add(textField_businessHall);
		textField_businessHall.setColumns(10);
		
		JLabel textPane_22 = new NLabel();
		textPane_22.setBackground(Color.WHITE);
		textPane_22.setText("到达地");
		textPane_22.setBounds(500, 50, 100, 30);
		this.add(textPane_22);
		
		JLabel textPane_23 = new NLabel();
		textPane_23.setBackground(Color.WHITE);
		textPane_23.setText("押运员");
		textPane_23.setBounds(500, 110, 100, 30);
		this.add(textPane_23);
		
		JLabel textPane_24 = new NLabel();
		textPane_24.setBackground(Color.WHITE);
		textPane_24.setText("监装员");
		textPane_24.setBounds(500, 170, 100, 30);
		this.add(textPane_24);
		
		textField_destination = new NTextField();
		textField_destination.setBounds(600, 50, 160, 30);
		this.add(textField_destination);
		textField_destination.setColumns(10);
		
		textField_supercargo = new NTextField();
		textField_supercargo.setBounds(600, 110, 160, 30);
		this.add(textField_supercargo);
		textField_supercargo.setColumns(10);
		
		textField_supervisor = new NTextField();
		textField_supervisor.setBounds(600, 170, 160, 30);
		this.add(textField_supervisor);
		textField_supervisor.setColumns(10);
		
		JLabel textPane_25 = new NLabel();
		textPane_25.setBackground(Color.WHITE);
		textPane_25.setText("订单号");
		textPane_25.setBounds(500, 230, 100, 30);
		this.add(textPane_25);
		
		textField_order_number = new NTextField();
		textField_order_number.setBounds(600, 230, 160, 30);
		this.add(textField_order_number);
		textField_order_number.setColumns(10);
		
	
		
		JLabel textPane_42 = new NLabel();
		textPane_42.setBackground(Color.WHITE);
		textPane_42.setText("车辆代号");
		textPane_42.setBounds(120, 230, 200, 30);
		this.add(textPane_42);
		
		textField_car_number = new NTextField();
		textField_car_number.setBounds(240, 230, 130, 30);
		this.add(textField_car_number);
		textField_car_number.setColumns(10);
		
		
		

		
	}

}
