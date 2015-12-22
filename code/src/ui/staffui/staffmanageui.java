package ui.staffui;

import java.awt.Color;
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
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import bl.staff.Impl.StaffManageController;
import bl.staff.service.StaffManageBLService;
import vo.StaffVO;

public class staffmanageui extends JDesktopPane{
	
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table_1;
	private JTextField textField_5;
	private JTable table_2;
	private JTextField textField_6;
	private JTable table_3;
	private JTextField textField_7;
	private JTable table_4;
	
	public staffmanageui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBackground(Color.WHITE);
		table_1 = new JTable();
		
		JLabel label_19 = new JLabel();
		label_19.setBounds(282, 0, 436, 21);
		this.add(label_19);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(46, 36, 881, 536);
		this.add(tabbedPane_2);
		
		JDesktopPane desktopPane_13 = new JDesktopPane();
		desktopPane_13.setBackground(Color.WHITE);
		tabbedPane_2.addTab("雇佣新员工", null, desktopPane_13, null);
		
		JLabel label = new JLabel("\u59D3\u540D");
		label.setBounds(60, 26, 54, 15);
		desktopPane_13.add(label);
		
		textField_3 = new JTextField();
		textField_3.setBounds(101, 23, 66, 21);
		desktopPane_13.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_1 = new JLabel("\u5E74\u9F84");
		label_1.setBounds(177, 26, 54, 15);
		desktopPane_13.add(label_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(216, 23, 60, 21);
		desktopPane_13.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_2 = new JLabel("\u804C\u4F4D");
		label_2.setBounds(368, 26, 54, 15);
		desktopPane_13.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u5FEB\u9012\u5458", "\u8425\u4E1A\u5385\u4E1A\u52A1\u5458", "\u4E2D\u8F6C\u4E2D\u5FC3\u4E1A\u52A1\u5458", "\u4E2D\u8F6C\u4E2D\u5FC3\u4ED3\u5E93\u7BA1\u7406\u4EBA\u5458", "\u8D22\u52A1\u4EBA\u5458", "\u7BA1\u7406\u5458"}));
		comboBox.setBounds(406, 23, 132, 21);
		desktopPane_13.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("\u6240\u5C5E\u90E8\u95E8");
		lblNewLabel.setBounds(548, 26, 54, 15);
		desktopPane_13.add(lblNewLabel);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u5357\u4EAC\u5E02\u6816\u971E\u533A\u4ED9\u6797\u8857\u9053\u8425\u4E1A\u5385"}));
		comboBox_1.setBounds(612, 23, 200, 21);
		desktopPane_13.add(comboBox_1);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"\u7537", "\u5973"}));
		comboBox_5.setBounds(320, 23, 38, 21);
		desktopPane_13.add(comboBox_5);
		
		/*
		 * 雇佣新员工添加
		 */
		JButton button_3 = new JButton("\u6DFB\u52A0");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table_1.getRowCount();i++){
					if(table_1.getValueAt(i, 1)==null&&table_1.getValueAt(i, 2)==null){
						table_1.setValueAt(textField_3.getText(), i, 1);
						table_1.setValueAt(textField_4.getText(), i, 2);
						table_1.setValueAt(comboBox_5.getSelectedItem(), i, 3);
						table_1.setValueAt(comboBox.getSelectedItem(), i, 4);
						table_1.setValueAt(comboBox_1.getSelectedItem(), i, 5);
						textField_3.setText(null);
						textField_4.setText(null);
						comboBox.setToolTipText("快递员");
						comboBox_1.setToolTipText("南京市栖霞区仙林街道营业厅");
						break;
					}
				}
			}
		});
		button_3.setBounds(744, 66, 93, 23);
		desktopPane_13.add(button_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(70, 111, 767, 342);
		desktopPane_13.add(scrollPane_1);
		
//		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
			},
			new String[] {
				"\u7528\u6237ID", "\u59D3\u540D", "\u5E74\u9F84", "\u6027\u522B","\u804C\u4F4D", "\u6240\u5C5E\u90E8\u95E8"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		/*
		 * 雇佣新员工信息撤销
		 */
		JButton button_4 = new JButton("\u64A4\u9500");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				for(int i=table_1.getRowCount()-1;i>=0;i--){
					if(table_1.getValueAt(i, 1)!=null&&table_1.getValueAt(i, 2)!=null){
						table_1.setValueAt(null, i, 0);
						table_1.setValueAt(null, i, 1);
						table_1.setValueAt(null, i, 2);
						table_1.setValueAt(null, i, 3);
						table_1.setValueAt(null, i, 4);
						table_1.setValueAt(null, i, 5);
						
					}
				}
			}
		});
		
		button_4.setBounds(74, 467, 93, 23);
		desktopPane_13.add(button_4);
		
		/*
		 * 雇佣新员工信息提交
		 */
		JButton button_5 = new JButton("\u63D0\u4EA4");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				StaffVO[] staff=new StaffVO[20];
				boolean isboy=false;
				int count=0;
				while(table_1.getValueAt(count,1)!=null){
					++count;
				}
				for(int i=0;i<count;i++){
					//System.out.println(table_1.getValueAt(i, 3));
					if(table_1.getValueAt(i, 3).equals("男")){
						isboy=true;
					}
					else{
						isboy=false;
					}
					StaffVO staffvo= new StaffVO(table_1.getValueAt(i, 1).toString(),table_1.getValueAt(i, 2).toString(),
						table_1.getValueAt(i, 4).toString(),table_1.getValueAt(i, 5).toString(),isboy);
					staff[i]=staffvo;
					System.out.println(staff[i].name+" "+staff[i].department);
				}
				StaffManageBLService addnewstaff = new StaffManageController();
				boolean istrue=addnewstaff.addNewStaff(staff);
				if(istrue==true){
					for(int i=0;i<table_2.getRowCount();i++){
						table_2.setValueAt(null, i, 0);	
						table_2.setValueAt(null, i, 1);
						table_2.setValueAt(null, i, 2);
						table_2.setValueAt(null, i, 3);
						table_2.setValueAt(null, i, 4);
//						table_2.setValueAt(null, i, 5);
					}
				}else{
					
				}
			}
		});
		button_5.setBounds(744, 467, 93, 23);
		desktopPane_13.add(button_5);
		
		JLabel label_21 = new JLabel("\u6027\u522B");
		label_21.setBounds(286, 26, 54, 15);
		desktopPane_13.add(label_21);
		
		
		
		JDesktopPane desktopPane_14 = new JDesktopPane();
		desktopPane_14.setBackground(Color.WHITE);
		tabbedPane_2.addTab("解雇员工", null, desktopPane_14, null);
		
		JLabel lblid = new JLabel("\u5458\u5DE5ID");
		lblid.setBounds(210, 39, 54, 15);
		desktopPane_14.add(lblid);
		
		textField_5 = new JTextField();
		textField_5.setBounds(274, 36, 123, 21);
		desktopPane_14.add(textField_5);
		textField_5.setColumns(10);
		
		/*
		 * 解雇员工信息查询
		 */
		JButton button_6 = new JButton("\u67E5\u8BE2");
		button_6.setBounds(550, 65, 93, 23);
		desktopPane_14.add(button_6);
        button_6.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				StaffManageBLService getstaff = new StaffManageController();
				StaffVO staff;
				staff=getstaff.getStaff(textField_5.getText());
				if(staff.equals(null)){
			    	
			    }else{
			    	for(int i=0;i<table_2.getRowCount();i++){
			    		if(table_2.getValueAt(i, 0)==null){
			    			table_2.setValueAt(staff.ID, i, 0);
			    			table_2.setValueAt(staff.name, i, 1);
			    			table_2.setValueAt(staff.age, i, 2);
			    			table_2.setValueAt(staff.pos, i, 3);
			    			table_2.setValueAt(staff.department, i, 4);
			    		}
			    	}
			    }
			}
			});
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(77, 115, 675, 334);
		desktopPane_14.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
			},
			new String[] {
				 "用户ID", "姓名", "年龄", "职位", "所属部门"
			}
		));
		scrollPane_2.setViewportView(table_2);
		
		JCheckBox checkBox_2 = new JCheckBox("");
		checkBox_2.setBounds(77, 465, 21, 23);
		desktopPane_14.add(checkBox_2);
		
		/*
		 * 解雇员工信息撤销
		 */
		JButton button_7 = new JButton("\u64A4\u9500");
		button_7.setBounds(104, 465, 93, 23);
		desktopPane_14.add(button_7);
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_2.getRowCount()-1;i>=0;i--){
					if(table_2.getValueAt(i, 0)!=null&&table_2.getValueAt(i, 1)!=null){
						table_2.setValueAt(null, i, 0);
						table_2.setValueAt(null, i, 1);
						table_2.setValueAt(null, i, 2);
						table_2.setValueAt(null, i, 3);
						table_2.setValueAt(null, i, 4);
					}
				}
			}
		});
		
		/*
		 * 解雇员工信息提交
		 */
		JButton button_8 = new JButton("\u63D0\u4EA4");
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] staff=new String[table_2.getRowCount()];
				for(int i=0;i<table_2.getRowCount();i++){
					staff[i]=table_2.getValueAt(i, 0).toString();
				}
				StaffManageBLService deletestaff = new StaffManageController();
				boolean istrue=deletestaff.deleteStaff(staff);
				if(istrue){
					for(int i=0;i<table_2.getRowCount();i++){
						table_2.setValueAt(null, i, 1);
						table_2.setValueAt(null, i, 2);
						table_2.setValueAt(null, i, 3);
						table_2.setValueAt(null, i, 4);
						table_2.setValueAt(null, i, 5);
					}
				}else{
					
				}
			}
		});
		button_8.setBounds(697, 465, 93, 23);
		desktopPane_14.add(button_8);
		
		JDesktopPane desktopPane_15 = new JDesktopPane();
		desktopPane_15.setBackground(Color.WHITE);
		tabbedPane_2.addTab("人事调动", null, desktopPane_15, null);
		
		JLabel lblid_1 = new JLabel("\u5458\u5DE5ID");
		lblid_1.setBounds(98, 51, 54, 15);
		desktopPane_15.add(lblid_1);
		
		textField_6 = new JTextField();
		textField_6.setBounds(150, 48, 101, 21);
		desktopPane_15.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel label_3 = new JLabel("\u65B0\u804C\u4F4D");
		label_3.setBounds(287, 51, 54, 15);
		desktopPane_15.add(label_3);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"\u5FEB\u9012\u5458", "\u4E2D\u8F6C\u4E2D\u5FC3\u4ED3\u5E93\u7BA1\u7406\u4EBA\u5458"}));
		comboBox_2.setBounds(340, 48, 138, 21);
		desktopPane_15.add(comboBox_2);
		
		JLabel label_4 = new JLabel("\u65B0\u90E8\u95E8");
		label_4.setBounds(511, 51, 54, 15);
		desktopPane_15.add(label_4);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(563, 48, 200, 21);
		desktopPane_15.add(comboBox_3);
		
		/*
		 * 人事调动信息查询
		 */
		JButton button_9 = new JButton("\u6DFB\u52A0");
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StaffManageBLService getstaff = new StaffManageController();
				StaffVO staff;
				staff=getstaff.getStaff(textField_6.getText());
				if(staff.equals(null)){
			    	
			    }else{
			    	for(int i=0;i<table_3.getRowCount();i++){
			    		if(table_3.getValueAt(i, 0)==null){
			    			table_3.setValueAt(staff.ID, i, 0);
			    			table_3.setValueAt(staff.name, i, 1);
			    			table_3.setValueAt(staff.age, i, 2);
			    			table_3.setValueAt(staff.pos, i, 3);
			    			table_3.setValueAt(comboBox_2.getSelectedItem(), i, 4);
			    			table_3.setValueAt(staff.department, i, 5);
			    			table_3.setValueAt(comboBox_3.getSelectedItem(), i, 6);
			    		}
			    	}
			    }
			}
		});
		button_9.setBounds(706, 79, 93, 23);
		desktopPane_15.add(button_9);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(77, 115, 675, 334);
		desktopPane_15.add(scrollPane_3);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
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
			},
			new String[] {
				"\u7528\u6237ID", "\u59D3\u540D", "\u5E74\u9F84", "\u539F\u804C\u4F4D", "\u539F\u6240\u5C5E\u90E8\u95E8", "\u65B0\u804C\u4F4D", "\u65B0\u6240\u5C5E\u90E8\u95E8"
			}
		));
		scrollPane_3.setViewportView(table_3);
		
		/*
		 * 人事调动信息撤销
		 */
		JButton button_10 = new JButton("\u64A4\u9500");
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_3.getRowCount()-1;i>=0;i--){
					if(table_3.getValueAt(i, 0)!=null&&table_3.getValueAt(i, 1)!=null){
						table_3.setValueAt(null, i, 0);
						table_3.setValueAt(null, i, 1);
						table_3.setValueAt(null, i, 2);
						table_3.setValueAt(null, i, 3);
						table_3.setValueAt(null, i, 4);
						table_3.setValueAt(null, i, 5);
						table_3.setValueAt(null, i, 6);
					}
				}
			}
		});
		button_10.setBounds(77, 466, 93, 23);
		desktopPane_15.add(button_10);
		
		/*
		 * 人事调动信息提交
		 */
		JButton button_11 = new JButton("\u63D0\u4EA4");
		button_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] ID = new String[table_3.getRowCount()];
				String[] newPosition = new String[table_3.getRowCount()];
				String[] newDepartment = new String[table_3.getRowCount()];
				for(int i=0;i<table_3.getRowCount();i++){
					ID[i]=table_3.getValueAt(i, 1).toString();
					newPosition[i]=table_3.getValueAt(i, 6).toString();
					newDepartment[i]=table_3.getValueAt(i, 7).toString();
				}
				StaffManageBLService changeposition = new StaffManageController();
				boolean istrue=changeposition.changePosition(ID, newPosition, newDepartment);
				if(istrue){
					for(int i=0;i<table_3.getRowCount();i++){
						table_3.setValueAt(null, i, 0);
						table_3.setValueAt(null, i, 1);
						table_3.setValueAt(null, i, 2);
						table_3.setValueAt(null, i, 3);
						table_3.setValueAt(null, i, 4);
						table_3.setValueAt(null, i, 5);
						table_3.setValueAt(null, i, 6);
					}
				}else{
					
				}
			}
		});
		button_11.setBounds(670, 466, 93, 23);
		desktopPane_15.add(button_11);
		
		JDesktopPane desktopPane_16 = new JDesktopPane();
		desktopPane_16.setBackground(Color.WHITE);
		tabbedPane_2.addTab("薪水策略设定", null, desktopPane_16, null);
		
		JLabel lblid_2 = new JLabel("\u5458\u5DE5ID");
		lblid_2.setBounds(110, 49, 54, 15);
		desktopPane_16.add(lblid_2);
		
		textField_7 = new JTextField();
		textField_7.setBounds(170, 46, 109, 21);
		desktopPane_16.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel label_5 = new JLabel("\u85AA\u6C34\u7B56\u7565");
		label_5.setBounds(456, 49, 54, 15);
		desktopPane_16.add(label_5);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"\u6708\u85AA+\u63D0\u6210"}));
		comboBox_4.setBounds(537, 46, 99, 21);
		desktopPane_16.add(comboBox_4);
		
		/*
		 * 薪水策略信息查询
		 */
		JButton button_12 = new JButton("\u6DFB\u52A0");
		button_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StaffManageBLService getstaff = new StaffManageController();
				StaffVO staff;
				staff=getstaff.getStaff(textField_7.getText());
				if(staff.equals(null)){
			    	
			    }else{
			    	for(int i=0;i<table_4.getRowCount();i++){
			    		if(table_4.getValueAt(i, 0)==null){
			    			table_4.setValueAt(staff.ID, i, 0);
			    			table_4.setValueAt(staff.name, i, 1);
			    			table_4.setValueAt(staff.age, i, 2);
			    			table_4.setValueAt(staff.pos, i, 3);
			    			table_4.setValueAt(staff.SalaryModel, i, 4);
			    			table_4.setValueAt(comboBox_4.getSelectedItem(), i, 5);
			    		}
			    	}
			    }
			}
		});
		button_12.setBounds(670, 76, 93, 23);
		desktopPane_16.add(button_12);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(77, 115, 675, 334);
		desktopPane_16.add(scrollPane_4);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"\u7528\u6237ID", "\u59D3\u540D", "\u5E74\u9F84", "\u804C\u4F4D", "\u539F\u85AA\u6C34\u7B56\u7565", "\u73B0\u85AA\u6C34\u7B56\u7565"
			}
		));
		scrollPane_4.setViewportView(table_4);
		
		/*
		 * 薪水策略撤销
		 */
		JButton button_13 = new JButton("\u64A4\u9500");
		button_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_4.getRowCount()-1;i>=0;i--){
					if(table_4.getValueAt(i, 0)!=null&&table_4.getValueAt(i, 1)!=null){
						table_4.setValueAt(null, i, 0);
						table_4.setValueAt(null, i, 1);
						table_4.setValueAt(null, i, 2);
						table_4.setValueAt(null, i, 3);
						table_4.setValueAt(null, i, 4);
						table_4.setValueAt(null, i, 5);
					}
				}
			}
		});
		button_13.setBounds(77, 463, 93, 23);
		desktopPane_16.add(button_13);
		
		/*
		 * 薪水策略提交
		 */
		JButton button_14 = new JButton("\u63D0\u4EA4");
		button_14.setBounds(690, 463, 93, 23);
		desktopPane_16.add(button_14);
		button_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] ID = new String[table_4.getRowCount()];
				String[] salaryModel = new String[table_4.getRowCount()];
				for(int i=0;i<table_4.getRowCount();i++){
					ID[i]=table_4.getValueAt(i, 1).toString();
					salaryModel[i]=table_4.getValueAt(i, 6).toString();
				}
				StaffManageBLService changeSalarymodel = new StaffManageController();
				boolean istrue=changeSalarymodel.changesalarymodel(ID, salaryModel);
				if(istrue==true){
					for(int i=0;i<table_4.getRowCount();i++){
						table_4.setValueAt(null, i, 1);
						table_4.setValueAt(null, i, 2);
						table_4.setValueAt(null, i, 3);
						table_4.setValueAt(null, i, 4);
						table_4.setValueAt(null, i, 5);
						table_4.setValueAt(null, i, 6);
					}
				}else{
					
				}
			}
		});
		
		new Thread() {        
			public void run() {            
				try {                
					while (true) {           
						SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
						label_19.setText(df.format(new Date()));//显示当前时间
						Thread.sleep(1000);//暂停一秒                
						}            
					} catch (Exception e) {            
						
					}        
				}    
			}.start();
	}

}
