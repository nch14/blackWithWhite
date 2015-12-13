package ui.staffui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import bill.DriverPO;
import bl.staff.Impl.DriverManageCotroller;
import bl.staff.service.DriverManageBLService;

public class drivermanageui extends JDesktopPane{
	
	private JTextField textField;
	private JTable table_4;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTable table_5;
	private JTextField textField_39;
	private JTable table_6;
	private JTextField textField_40;
	private JTable table_7;
	
	public drivermanageui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBackground(Color.WHITE);

		
		final JLabel textPane_38 = new JLabel();
		textPane_38.setText("营业厅业务员：");
		textPane_38.setBounds(280, 0, 700, 21);
		this.add(textPane_38);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		textPane_38.setText(df.format(new Date()));
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(55, 40, 856, 509);
		this.add(tabbedPane_1);
		
		JDesktopPane desktopPane_6 = new JDesktopPane();
		desktopPane_6.setBackground(Color.WHITE);
		tabbedPane_1.addTab("查找司机信息", null, desktopPane_6, null);
		
		JLabel textPane = new JLabel();
		textPane.setText("司机编号");
		textPane.setBounds(100, 96, 54, 21);
		desktopPane_6.add(textPane);
		
		textField = new JTextField();
		textField.setBounds(176, 96, 130, 21);
		desktopPane_6.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(80, 210, 700, 45);
		desktopPane_6.add(scrollPane_4);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
					"司机编号", "姓名", "性别", "身份证号", "出生日期", "行驶证期限", "手机"
			}
		));
		scrollPane_4.setViewportView(table_4);
		
		//查找司机信息的事件监听
		JButton button = new JButton("查找");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DriverPO dp;
				DriverManageCotroller dmc=new DriverManageCotroller();
				dp=dmc.getDriver(textField.getText());
				if(dp==null){
					textPane_38.setText("未查找到任何司机信息！");
					
				}else{
					table_4.setValueAt(dp.ID, 0, 0);
					table_4.setValueAt(dp.name, 0, 1);
					table_4.setValueAt(dp.isBoy, 0, 2);
					table_4.setValueAt(dp.IDNumber, 0, 3);
					table_4.setValueAt(dp.birthday, 0, 4);
					table_4.setValueAt(dp.validData, 0, 5);
					table_4.setValueAt(dp.tel, 0, 6);
				}
			}
		});
		button.setBounds(485, 95, 93, 23);
		desktopPane_6.add(button);
		
		JDesktopPane desktopPane_7 = new JDesktopPane();
		desktopPane_7.setBackground(Color.WHITE);
		tabbedPane_1.addTab("增加新的司机信息", null, desktopPane_7, null);
		
		JLabel textPane_1 = new JLabel();
		textPane_1.setText("司机编号");
		textPane_1.setBounds(63, 10, 54, 21);
		desktopPane_7.add(textPane_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(127, 10, 66, 21);
		desktopPane_7.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel textPane_2 = new JLabel();
		textPane_2.setText("姓名");
		textPane_2.setBounds(258, 10, 30, 21);
		desktopPane_7.add(textPane_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(297, 10, 66, 21);
		desktopPane_7.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel textPane_3 = new JLabel();
		textPane_3.setText("身份证号");
		textPane_3.setBounds(426, 10, 54, 21);
		desktopPane_7.add(textPane_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(490, 10, 164, 21);
		desktopPane_7.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel textPane_4 = new JLabel();
		textPane_4.setText("出生日期");
		textPane_4.setBounds(426, 41, 54, 21);
		desktopPane_7.add(textPane_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(490, 41, 45, 21);
		desktopPane_7.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(545, 41, 30, 21);
		desktopPane_7.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(585, 41, 30, 21);
		desktopPane_7.add(textField_6);
		textField_6.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setBounds(127, 41, 66, 21);
		desktopPane_7.add(textField_28);
		textField_28.setColumns(10);
		
		JLabel textPane_5 = new JLabel();
		textPane_5.setText("手机号码");
		textPane_5.setBounds(63, 41, 54, 21);
		desktopPane_7.add(textPane_5);
		
		JLabel textPane_6 = new JLabel();
		textPane_6.setText("性别");
		textPane_6.setBounds(258, 41, 30, 21);
		desktopPane_7.add(textPane_6);
		
		textField_29 = new JTextField();
		textField_29.setBounds(297, 41, 66, 21);
		desktopPane_7.add(textField_29);
		textField_29.setColumns(10);
		
		JLabel textPane_7 = new JLabel();
		textPane_7.setText("行驶证期限");
		textPane_7.setBounds(63, 72, 66, 21);
		desktopPane_7.add(textPane_7);
		
		textField_36 = new JTextField();
		textField_36.setBounds(137, 72, 45, 21);
		desktopPane_7.add(textField_36);
		textField_36.setColumns(10);
		
		textField_37 = new JTextField();
		textField_37.setBounds(192, 72, 30, 21);
		desktopPane_7.add(textField_37);
		textField_37.setColumns(10);
		
		textField_38 = new JTextField();
		textField_38.setBounds(232, 72, 30, 21);
		desktopPane_7.add(textField_38);
		textField_38.setColumns(10);
		//添加司机信息的事件监听
		JButton button_1 = new JButton("添加");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table_5.getRowCount();i++){
					if(table_5.getValueAt(i, 0)==null&&table_5.getValueAt(i, 1)==null&&table_5.getValueAt(i, 2)==null&&table_5.getValueAt(i, 3)==null&&
							table_5.getValueAt(i, 4)==null&&table_5.getValueAt(i, 5)==null&&table_5.getValueAt(i, 6)==null){
						table_5.setValueAt(textField_1.getText(), i, 0);
						table_5.setValueAt(textField_2.getText(), i, 1);
						table_5.setValueAt(textField_29.getText(), i, 2);
						table_5.setValueAt(textField_3.getText(), i, 3);
						table_5.setValueAt(textField_4.getText()+textField_5.getText()+textField_6.getText(), i, 4);
						table_5.setValueAt(textField_36.getText()+textField_37.getText()+textField_38.getText(), i, 5);
						table_5.setValueAt(textField_28.getText(), i, 6);
						break;
					}
				}
			}
		});
		button_1.setBounds(63, 103, 93, 23);
		desktopPane_7.add(button_1);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(63, 150, 700, 256);
		desktopPane_7.add(scrollPane_5);
		
		table_5 = new JTable();
		table_5.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
					"司机编号", "姓名", "性别", "身份证号", "出生日期", "行驶证期限", "手机"
			}
		));
		scrollPane_5.setViewportView(table_5);
		
		JButton button_2 = new JButton("提交");
		button_2.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				DriverPO[] driver = null;
				boolean isBoy=true;
				for(int i=0;i<table_5.getRowCount();i++){
					DriverPO driverPo=new DriverPO(table_5.getValueAt(i, 0).toString(), table_5.getValueAt(i, 1).toString(),table_5.getValueAt(i, 2).toString(),
							 table_5.getValueAt(i, 3).toString(), table_5.getValueAt(i, 4).equals(isBoy), table_5.getValueAt(i, 5).toString(), (String) table_5.getValueAt(i, 6));
					driver[i]=driverPo;
				}
				DriverManageBLService driverManage=new DriverManageCotroller();
				boolean istrue=driverManage.addNewDiver(driver);
				if(istrue=true){
					for(int i=0;i<table_5.getRowCount();i++){
						table_5.setValueAt(null, i, 0);
						table_5.setValueAt(null, i, 1);
						table_5.setValueAt(null, i, 2);
						table_5.setValueAt(null, i, 3);
						table_5.setValueAt(null, i, 4);
						table_5.setValueAt(null, i, 5);
						table_5.setValueAt(null, i, 6);
					}
				}else{
					textPane_38.setText("提交失败！");
				}
			}
		});
		button_2.setBounds(670, 435, 93, 23);
		desktopPane_7.add(button_2);
		
		//撤消司机信息table中一行的事件监听
		JButton button_27 = new JButton("撤消");
		button_27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_5.getRowCount()-1;i>=0;i--){
					if(table_5.getValueAt(i, 0)!=null||table_5.getValueAt(i, 1)!=null||table_5.getValueAt(i, 2)!=null||table_5.getValueAt(i, 3)!=null||
							table_5.getValueAt(i, 4)!=null||table_5.getValueAt(i, 5)!=null||table_5.getValueAt(i, 6)!=null){
						table_5.setValueAt(null, i, 0);
						table_5.setValueAt(null, i, 1);
						table_5.setValueAt(null, i, 2);
						table_5.setValueAt(null, i, 3);
						table_5.setValueAt(null, i, 4);
						table_5.setValueAt(null, i, 5);
						table_5.setValueAt(null, i, 6);
						break;
					}
				}
			}
		});
		button_27.setBounds(63, 435, 93, 23);
		desktopPane_7.add(button_27);
		
		JDesktopPane desktopPane_8 = new JDesktopPane();
		desktopPane_8.setBackground(Color.WHITE);
		tabbedPane_1.addTab("删除已有司机信息", null, desktopPane_8, null);
		
		JLabel textPane_26 = new JLabel();
		textPane_26.setText("司机编号");
		textPane_26.setBounds(100, 96, 54, 21);
		desktopPane_8.add(textPane_26);
		
		textField_39 = new JTextField();
		textField_39.setBounds(176, 96, 130, 21);
		desktopPane_8.add(textField_39);
		textField_39.setColumns(10);
		
		//查找司机信息的事件监听
		JButton button_3 = new JButton("查找");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DriverPO dp;
				DriverManageCotroller dmc=new DriverManageCotroller();
				dp=dmc.getDriver(textField.getText());
				if(dp==null){
					textPane_38.setText("未查找到任何司机信息！");
				}else{
					table_4.setValueAt(dp.ID, 0, 0);
					table_4.setValueAt(dp.name, 0, 1);
					table_4.setValueAt(dp.isBoy, 0, 2);
					table_4.setValueAt(dp.IDNumber, 0, 3);
					table_4.setValueAt(dp.birthday, 0, 4);
					table_4.setValueAt(dp.validData, 0, 5);
					table_4.setValueAt(dp.tel, 0, 6);
				}
			}
		});
		button_3.setBounds(485, 95, 93, 23);
		desktopPane_8.add(button_3);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(80, 210, 700, 45);
		desktopPane_8.add(scrollPane_6);
		
		table_6 = new JTable();
		table_6.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
					"司机编号", "姓名", "性别", "身份证号", "出生日期", "行驶证期限", "手机"
			}
		));
		scrollPane_6.setViewportView(table_6);
		
		//删除司机信息的事件监听
		JButton button_17 = new JButton("删除司机信息");
		button_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DriverManageCotroller dmc=new DriverManageCotroller();
				String[] driverID = null;
				for(int i=0;i<table_4.getRowCount();i++){
					driverID=(String[]) table_4.getValueAt(i, 0);
				}
				Boolean istrue=dmc.deleteDriver(driverID);
				if(istrue==true){
					for(int j=0;j<table_4.getRowCount();j++){
						table_4.setValueAt(null, j, 0);
						table_4.setValueAt(null, j, 1);
						table_4.setValueAt(null, j, 2);
						table_4.setValueAt(null, j, 3);
						table_4.setValueAt(null, j, 4);
						table_4.setValueAt(null, j, 5);
						table_4.setValueAt(null, j, 6);
					}
				}else{
					textPane_38.setText("删除失败！");
				}
			}
		});
		button_17.setBounds(580, 330, 121, 23);
		desktopPane_8.add(button_17);
		
		JDesktopPane desktopPane_9 = new JDesktopPane();
		desktopPane_9.setBackground(Color.WHITE);
		tabbedPane_1.addTab("修改司机信息", null, desktopPane_9, null);
		
		JLabel textPane_27 = new JLabel();
		textPane_27.setText("司机编号");
		textPane_27.setBounds(100, 96, 54, 21);
		desktopPane_9.add(textPane_27);
		
		textField_40 = new JTextField();
		textField_40.setBounds(176, 96, 130, 21);
		desktopPane_9.add(textField_40);
		textField_40.setColumns(10);
		
		//查找司机信息的事件监听
		JButton button_18 = new JButton("查找");
		button_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DriverPO dp;
				DriverManageCotroller dmc=new DriverManageCotroller();
				dp=dmc.getDriver(textField.getText());
				if(dp==null){
					textPane_38.setText("未查找到任何司机信息！");
				}else{
					table_4.setValueAt(dp.ID, 0, 0);
					table_4.setValueAt(dp.name, 0, 1);
					table_4.setValueAt(dp.isBoy, 0, 2);
					table_4.setValueAt(dp.IDNumber, 0, 3);
					table_4.setValueAt(dp.birthday, 0, 4);
					table_4.setValueAt(dp.validData, 0, 5);
					table_4.setValueAt(dp.tel, 0, 6);
				}
			}
		});
		button_18.setBounds(485, 95, 93, 23);
		desktopPane_9.add(button_18);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(80, 210, 700, 45);
		desktopPane_9.add(scrollPane_7);
		
		table_7 = new JTable();
		table_7.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
					"司机编号", "姓名", "性别", "身份证号", "出生日期", "行驶证期限", "手机"
			}
		));
		scrollPane_7.setViewportView(table_7);
		
		//修改司机信息的事件监听
		JButton button_19 = new JButton("修改司机信息");
		button_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] name={(String) table_7.getValueAt(0, 1)};
				String[] ID={(String) table_7.getValueAt(0, 0)};
				String[] IDCardNumber={(String) table_7.getValueAt(0, 3)};
				String[] birthday={(String) table_7.getValueAt(0, 4)};
				boolean[] isBoy={(Boolean) table_7.getValueAt(0, 2)};
				String[] TelNumber={(String) table_7.getValueAt(0, 6)};
				String[] ValiDate={(String) table_7.getValueAt(0, 5)};
				DriverManageCotroller dmc=new DriverManageCotroller();
				boolean istrue=dmc.ChangeDriverInfo(name, ID, IDCardNumber, birthday, isBoy, TelNumber, ValiDate);
				if(istrue==true){
					table_7.setValueAt(e, 0, 0);
					table_7.setValueAt(e, 0, 1);
					table_7.setValueAt(e, 0, 2);
					table_7.setValueAt(e, 0, 3);
					table_7.setValueAt(e, 0, 4);
					table_7.setValueAt(e, 0, 5);
					table_7.setValueAt(e, 0, 6);
				}else{
					textPane_38.setText("修改司机信息失败！");
				}
			}
		});
		button_19.setBounds(580, 330, 121, 23);
		desktopPane_9.add(button_19);
	}

}
