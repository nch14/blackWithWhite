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
	
	private JTextField textField_41;
	private JTable table_8;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTable table_9;
	private JTextField textField_47;
	private JTable table_10;
	private JTextField textField_48;
	private JTable table_11;
	
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
				
				textField_41 = new JTextField();
				textField_41.setBounds(170, 90, 130, 21);
				desktopPane_10.add(textField_41);
				textField_41.setColumns(10);
				
				//查找车辆信息的事件监听
				JButton button_20 = new JButton("查找");
				button_20.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						TruckPO truck;
						TruckManageController tmc=new TruckManageController();
						truck=tmc.getTruck(textField_41.getText());
						if(truck==null){
							textPane_39.setText("未查找到任何车辆信息！");
						}else{
							table_8.setValueAt(truck.vehicleCode, 0, 0);
							table_8.setValueAt(truck.licensePlate, 0, 1);
							table_8.setValueAt(truck.serviceTime, 0, 2);
						}
					}
				});
				button_20.setBounds(485, 90, 93, 23);
				desktopPane_10.add(button_20);
				
				JScrollPane scrollPane_8 = new JScrollPane();
				scrollPane_8.setBounds(80, 210, 700, 45);
				desktopPane_10.add(scrollPane_8);
				
				table_8 = new JTable();
				table_8.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null},
					},
					new String[] {
						"车辆代号", "车牌号", "服役时间"
					}
				));
				scrollPane_8.setViewportView(table_8);
				
				JDesktopPane desktopPane_11 = new JDesktopPane();
				desktopPane_11.setBackground(Color.WHITE);
				tabbedPane_2.addTab("增加车辆信息", null, desktopPane_11, null);
				
				JLabel textPane_29 = new JLabel();
				textPane_29.setText("车辆代号");
				textPane_29.setBounds(63, 20, 54, 21);
				desktopPane_11.add(textPane_29);
				
				textField_42 = new JTextField();
				textField_42.setBounds(127, 20, 66, 21);
				desktopPane_11.add(textField_42);
				textField_42.setColumns(10);
				
				JLabel textPane_30 = new JLabel();
				textPane_30.setText("车牌号");
				textPane_30.setBounds(255, 20, 42, 21);
				desktopPane_11.add(textPane_30);
				
				textField_43 = new JTextField();
				textField_43.setBounds(307, 20, 126, 21);
				desktopPane_11.add(textField_43);
				textField_43.setColumns(10);
				
				JLabel textPane_31 = new JLabel();
				textPane_31.setText("服役时间");
				textPane_31.setBounds(493, 20, 54, 21);
				desktopPane_11.add(textPane_31);
				
				textField_44 = new JTextField();
				textField_44.setBounds(557, 20, 42, 21);
				desktopPane_11.add(textField_44);
				textField_44.setColumns(10);
				
				textField_45 = new JTextField();
				textField_45.setBounds(609, 20, 32, 21);
				desktopPane_11.add(textField_45);
				textField_45.setColumns(10);
				
				textField_46 = new JTextField();
				textField_46.setBounds(651, 20, 32, 21);
				desktopPane_11.add(textField_46);
				textField_46.setColumns(10);
				//添加车辆信息的事件监听
				JButton button_21 = new JButton("添加");
				button_21.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						for(int i=0;i<table_9.getRowCount();i++){
							if(table_9.getValueAt(i, 0)==null&&table_9.getValueAt(i, 1)==null&&table_9.getValueAt(i, 2)==null){
								table_9.setValueAt(textField_42.getText(), i, 0);
								table_9.setValueAt(textField_43.getText(), i, 1);
								table_9.setValueAt(textField_44.getText()+textField_45.getText()+textField_46.getText(), i, 2);
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
				
				table_9 = new JTable();
				table_9.setModel(new DefaultTableModel(
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
				scrollPane_9.setViewportView(table_9);
				
				JButton button_22 = new JButton("提交");
				button_22.addMouseListener(new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						TruckPO[] truck = null;
						boolean isBoy=true;
						for(int i=0;i<table_9.getRowCount();i++){
							TruckPO truckPo=new TruckPO(table_9.getValueAt(i, 0).toString(), table_9.getValueAt(i, 1).toString(),
									table_9.getValueAt(i, 2).toString());
							truck[i]=truckPo;
						}
						TruckManageBLService truckManage=new TruckManageController();
						boolean istrue=truckManage.addNewTruck(truck);
						if(istrue=true){
							for(int i=0;i<table_9.getRowCount();i++){
								table_9.setValueAt(null, i, 0);
								table_9.setValueAt(null, i, 1);
								table_9.setValueAt(null, i, 2);
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
						for(int i=table_9.getRowCount()-1;i>=0;i--){
							if(table_9.getValueAt(i, 0)!=null||table_9.getValueAt(i, 1)!=null||table_9.getValueAt(i, 2)!=null){
								table_9.setValueAt(null, i, 0);
								table_9.setValueAt(null, i, 1);
								table_9.setValueAt(null, i, 2);
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
				
				textField_47 = new JTextField();
				textField_47.setBounds(170, 90, 130, 21);
				desktopPane_12.add(textField_47);
				textField_47.setColumns(10);
				
				JButton button_23 = new JButton("查找");
				button_23.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						TruckPO truck;
						TruckManageController tmc=new TruckManageController();
						truck=tmc.getTruck(textField_41.getText());
						if(truck==null){
							textPane_39.setText("未查找到任何车辆信息！");
						}else{
							table_8.setValueAt(truck.vehicleCode, 0, 0);
							table_8.setValueAt(truck.licensePlate, 0, 1);
							table_8.setValueAt(truck.serviceTime, 0, 2);
						}
					}
				});
				button_23.setBounds(485, 90, 93, 23);
				desktopPane_12.add(button_23);
				
				JScrollPane scrollPane_10 = new JScrollPane();
				scrollPane_10.setBounds(80, 210, 700, 45);
				desktopPane_12.add(scrollPane_10);
				
				table_10 = new JTable();
				table_10.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null},
					},
					new String[] {
							"车辆代号", "车牌号", "服役时间"
					}
				));
				scrollPane_10.setViewportView(table_10);
				
				//删除车辆信息的事件监听
				JButton button_24 = new JButton("删除车辆信息");
				button_24.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						String[] id=(String[]) table_10.getValueAt(0, 0);
						TruckManageController tmc=new TruckManageController();
						boolean istrue=tmc.deleteTruck(id);
						if(istrue==true){
							table_10.setValueAt(null, 0, 0);
							table_10.setValueAt(null, 0, 1);
							table_10.setValueAt(null, 0, 2);
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
				
				textField_48 = new JTextField();
				textField_48.setBounds(170, 90, 130, 21);
				desktopPane_13.add(textField_48);
				textField_48.setColumns(10);
				
				JButton button_25 = new JButton("查找");
				button_25.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						TruckPO truck;
						TruckManageController tmc=new TruckManageController();
						truck=tmc.getTruck(textField_41.getText());
						if(truck==null){
							textPane_39.setText("未查找到任何车辆信息！");
						}else{
							table_8.setValueAt(truck.vehicleCode, 0, 0);
							table_8.setValueAt(truck.licensePlate, 0, 1);
							table_8.setValueAt(truck.serviceTime, 0, 2);
						}
					}
				});
				button_25.setBounds(485, 90, 93, 23);
				desktopPane_13.add(button_25);
				
				JScrollPane scrollPane_11 = new JScrollPane();
				scrollPane_11.setBounds(80, 210, 700, 45);
				desktopPane_13.add(scrollPane_11);
				
				table_11 = new JTable();
				table_11.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null},
					},
					new String[] {
							"车辆代号", "车牌号", "服役时间"
					}
				));
				scrollPane_11.setViewportView(table_11);
				
				//修改车辆信息的事件监听
				JButton button_26 = new JButton("修改车辆信息");
				button_26.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						String[] id=(String[]) table_10.getValueAt(0, 0);
						String[] licensePlate=(String[]) table_10.getValueAt(0, 1);
						String[] inTime=(String[]) table_10.getValueAt(0, 2);
						TruckManageController tmc=new TruckManageController();
						boolean istrue=tmc.ChangeTruckInfo(id, licensePlate, inTime);
						if(istrue=true){
							table_10.setValueAt(e, 0, 0);
							table_10.setValueAt(e, 0, 1);
							table_10.setValueAt(e, 0, 2);
						}else{
							textPane_39.setText("修改司机信息失败！");
						}
					}
				});
				button_26.setBounds(580, 330, 121, 23);
				desktopPane_13.add(button_26);
	}

}
