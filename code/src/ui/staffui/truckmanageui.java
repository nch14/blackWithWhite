package ui.staffui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import bill.TruckPO;
import bl.staff.Impl.TruckManageController;
import bl.staff.service.TruckManageBLService;

public class truckmanageui extends JDesktopPane{
	
	private JTextField textField_truckID;
	private JTable table_findTruck;
	private JTextField textField_carID;
	private JTextField textField_IDNumber;
	private JTextField textField_valid_year;
	private JTextField textField_valid_month;
	private JTextField textField_valid_day;
	private JTable table_addCar;
	//private JTextField textField_47;
	private JTable table_deleteCar;
	//private JTextField textField_48;
	private JTable table_changeCar;
	
	public truckmanageui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//车辆信息管理的界面
				
				this.setBackground(Color.WHITE);

				
				final JLabel textPane_39 = new JLabel();
				textPane_39.setText("营业厅业务员：");
				textPane_39.setBounds(280, 0, 700, 21);
				this.add(textPane_39);
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
				textPane_39.setText(df.format(new Date()));
				
				JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
				tabbedPane_2.setBounds(55, 40, 856, 504);
				this.add(tabbedPane_2);
				
				JDesktopPane desktopPane_10 = new JDesktopPane();
				desktopPane_10.setBackground(Color.WHITE);
				tabbedPane_2.addTab("查找车辆信息", null, desktopPane_10, null);
				
				JLabel textPane_28 = new JLabel();
				textPane_28.setText("车辆代号");
				textPane_28.setBounds(100, 90, 54, 21);
				desktopPane_10.add(textPane_28);
				
				textField_truckID = new JTextField();
				textField_truckID.setBounds(170, 90, 130, 21);
				desktopPane_10.add(textField_truckID);
				textField_truckID.setColumns(10);
				
				//查找车辆信息的事件监听
				JButton button_20 = new JButton("查找");
				button_20.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						TruckPO truck;
						TruckManageController tmc=new TruckManageController();
						truck=tmc.getTruck(textField_truckID.getText());
						if(truck==null){
							textPane_39.setText("未查找到任何车辆信息！");
						}else{
							table_findTruck.setValueAt(truck.vehicleCode, 0, 0);
							table_findTruck.setValueAt(truck.licensePlate, 0, 1);
							table_findTruck.setValueAt(truck.serviceTime, 0, 2);
						}
					}
				});
				button_20.setBounds(485, 90, 93, 23);
				desktopPane_10.add(button_20);
				
				JScrollPane scrollPane_8 = new JScrollPane();
				scrollPane_8.setBounds(80, 210, 700, 45);
				desktopPane_10.add(scrollPane_8);
				
				table_findTruck = new JTable();
				table_findTruck.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null},
					},
					new String[] {
						"车辆代号", "车牌号", "服役时间"
					}
				));
				scrollPane_8.setViewportView(table_findTruck);
				
				JDesktopPane desktopPane_11 = new JDesktopPane();
				desktopPane_11.setBackground(Color.WHITE);
				tabbedPane_2.addTab("增加车辆信息", null, desktopPane_11, null);
				
				JLabel textPane_29 = new JLabel();
				textPane_29.setText("车辆代号");
				textPane_29.setBounds(63, 20, 54, 21);
				desktopPane_11.add(textPane_29);
				
				textField_carID = new JTextField();
				textField_carID.setBounds(127, 20, 66, 21);
				desktopPane_11.add(textField_carID);
				textField_carID.setColumns(10);
				
				JLabel textPane_30 = new JLabel();
				textPane_30.setText("车牌号");
				textPane_30.setBounds(255, 20, 42, 21);
				desktopPane_11.add(textPane_30);
				
				textField_IDNumber = new JTextField();
				textField_IDNumber.setBounds(307, 20, 126, 21);
				desktopPane_11.add(textField_IDNumber);
				textField_IDNumber.setColumns(10);
				
				JLabel textPane_31 = new JLabel();
				textPane_31.setText("服役时间");
				textPane_31.setBounds(493, 20, 54, 21);
				desktopPane_11.add(textPane_31);
				
				textField_valid_year = new JTextField();
				textField_valid_year.setBounds(557, 20, 42, 21);
				desktopPane_11.add(textField_valid_year);
				textField_valid_year.setColumns(10);
				
				textField_valid_month = new JTextField();
				textField_valid_month.setBounds(609, 20, 32, 21);
				desktopPane_11.add(textField_valid_month);
				textField_valid_month.setColumns(10);
				
				textField_valid_day = new JTextField();
				textField_valid_day.setBounds(651, 20, 32, 21);
				desktopPane_11.add(textField_valid_day);
				textField_valid_day.setColumns(10);
				//添加车辆信息的事件监听
				JButton button_21 = new JButton("添加");
				button_21.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						for(int i=0;i<table_addCar.getRowCount();i++){
							if(table_addCar.getValueAt(i, 0)==null&&table_addCar.getValueAt(i, 1)==null&&table_addCar.getValueAt(i, 2)==null){
								table_addCar.setValueAt(textField_carID.getText(), i, 0);
								table_addCar.setValueAt(textField_IDNumber.getText(), i, 1);
								table_addCar.setValueAt(textField_valid_year.getText()+textField_valid_month.getText()+textField_valid_day.getText(), i, 2);
								break;
							}
						}
					}
				});
				button_21.setBounds(590, 69, 93, 23);
				desktopPane_11.add(button_21);
				
				JScrollPane scrollPane_9 = new JScrollPane();
				scrollPane_9.setBounds(63, 122, 657, 279);
				desktopPane_11.add(scrollPane_9);
				
				table_addCar = new JTable();
				table_addCar.setModel(new DefaultTableModel(
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
						"车辆代号", "车牌号", "服役时间"
					}
				));
				scrollPane_9.setViewportView(table_addCar);
				
				JButton button_22 = new JButton("提交");
				button_22.addMouseListener(new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						TruckPO[] truck = null;
						boolean isBoy=true;
						for(int i=0;i<table_addCar.getRowCount();i++){
							TruckPO truckPo=new TruckPO(table_addCar.getValueAt(i, 0).toString(), table_addCar.getValueAt(i, 1).toString(),
									table_addCar.getValueAt(i, 2).toString());
							truck[i]=truckPo;
						}
						TruckManageBLService truckManage=new TruckManageController();
						boolean istrue=truckManage.addNewTruck(truck);
						if(istrue=true){
							for(int i=0;i<table_addCar.getRowCount();i++){
								table_addCar.setValueAt(null, i, 0);
								table_addCar.setValueAt(null, i, 1);
								table_addCar.setValueAt(null, i, 2);
							}
						}else{
							textPane_39.setText("提交失败！");
						}
					}
				});
				button_22.setBounds(590, 430, 93, 23);
				desktopPane_11.add(button_22);
				//撤消车辆信息table中一行的事件监听
				JButton button_28 = new JButton("撤消");
				button_28.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						for(int i=table_addCar.getRowCount()-1;i>=0;i--){
							if(table_addCar.getValueAt(i, 0)!=null||table_addCar.getValueAt(i, 1)!=null||table_addCar.getValueAt(i, 2)!=null){
								table_addCar.setValueAt(null, i, 0);
								table_addCar.setValueAt(null, i, 1);
								table_addCar.setValueAt(null, i, 2);
								break;
							}
						}
					}
				});
				button_28.setBounds(63, 430, 93, 23);
				desktopPane_11.add(button_28);
				
				JDesktopPane desktopPane_12 = new JDesktopPane();
				desktopPane_12.setBackground(Color.WHITE);
				tabbedPane_2.addTab("删除车辆信息", null, desktopPane_12, null);
				
				JLabel textPane_32 = new JLabel();
				textPane_32.setText("车辆代号");
				textPane_32.setBounds(100, 90, 54, 21);
				desktopPane_12.add(textPane_32);
				
				textField_carID = new JTextField();
				textField_carID.setBounds(170, 90, 130, 21);
				desktopPane_12.add(textField_carID);
				textField_carID.setColumns(10);
				
				JButton button_23 = new JButton("查找");
				button_23.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						TruckPO truck;
						TruckManageController tmc=new TruckManageController();
						truck=tmc.getTruck(textField_truckID.getText());
						if(truck==null){
							textPane_39.setText("未查找到任何车辆信息！");
						}else{
							table_findTruck.setValueAt(truck.vehicleCode, 0, 0);
							table_findTruck.setValueAt(truck.licensePlate, 0, 1);
							table_findTruck.setValueAt(truck.serviceTime, 0, 2);
						}
					}
				});
				button_23.setBounds(485, 90, 93, 23);
				desktopPane_12.add(button_23);
				
				JScrollPane scrollPane_10 = new JScrollPane();
				scrollPane_10.setBounds(80, 210, 700, 45);
				desktopPane_12.add(scrollPane_10);
				
				table_deleteCar = new JTable();
				table_deleteCar.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null},
					},
					new String[] {
							"车辆代号", "车牌号", "服役时间"
					}
				));
				scrollPane_10.setViewportView(table_deleteCar);
				
				//删除车辆信息的事件监听
				JButton button_24 = new JButton("删除车辆信息");
				button_24.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						String[] id=(String[]) table_deleteCar.getValueAt(0, 0);
						TruckManageController tmc=new TruckManageController();
						boolean istrue=tmc.deleteTruck(id);
						if(istrue==true){
							table_deleteCar.setValueAt(null, 0, 0);
							table_deleteCar.setValueAt(null, 0, 1);
							table_deleteCar.setValueAt(null, 0, 2);
						}else{
							textPane_39.setText("删除车辆信息失败！");
						}
					}
				});
				button_24.setBounds(580, 330, 121, 23);
				desktopPane_12.add(button_24);
				
				JDesktopPane desktopPane_13 = new JDesktopPane();
				desktopPane_13.setBackground(Color.WHITE);
				tabbedPane_2.addTab("修改车辆信息", null, desktopPane_13, null);
				
				JLabel textPane_33 = new JLabel();
				textPane_33.setText("车辆代号");
				textPane_33.setBounds(100, 90, 54, 21);
				desktopPane_13.add(textPane_33);
				
				textField_carID = new JTextField();
				textField_carID.setBounds(170, 90, 130, 21);
				desktopPane_13.add(textField_carID);
				textField_carID.setColumns(10);
				
				JButton button_25 = new JButton("查找");
				button_25.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						TruckPO truck;
						TruckManageController tmc=new TruckManageController();
						truck=tmc.getTruck(textField_truckID.getText());
						if(truck==null){
							textPane_39.setText("未查找到任何车辆信息！");
						}else{
							table_findTruck.setValueAt(truck.vehicleCode, 0, 0);
							table_findTruck.setValueAt(truck.licensePlate, 0, 1);
							table_findTruck.setValueAt(truck.serviceTime, 0, 2);
						}
					}
				});
				button_25.setBounds(485, 90, 93, 23);
				desktopPane_13.add(button_25);
				
				JScrollPane scrollPane_11 = new JScrollPane();
				scrollPane_11.setBounds(80, 210, 700, 45);
				desktopPane_13.add(scrollPane_11);
				
				table_changeCar = new JTable();
				table_changeCar.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null},
					},
					new String[] {
							"车辆代号", "车牌号", "服役时间"
					}
				));
				scrollPane_11.setViewportView(table_changeCar);
				
				//修改车辆信息的事件监听
				JButton button_26 = new JButton("修改车辆信息");
				button_26.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						String[] id=(String[]) table_deleteCar.getValueAt(0, 0);
						String[] licensePlate=(String[]) table_deleteCar.getValueAt(0, 1);
						String[] inTime=(String[]) table_deleteCar.getValueAt(0, 2);
						TruckManageController tmc=new TruckManageController();
						boolean istrue=tmc.ChangeTruckInfo(id, licensePlate, inTime);
						if(istrue=true){
							table_deleteCar.setValueAt(e, 0, 0);
							table_deleteCar.setValueAt(e, 0, 1);
							table_deleteCar.setValueAt(e, 0, 2);
						}else{
							textPane_39.setText("修改司机信息失败！");
						}
					}
				});
				button_26.setBounds(580, 330, 121, 23);
				desktopPane_13.add(button_26);
	}

}
