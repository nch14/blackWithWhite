package ui.informationui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import bl.information.Impl.InformationController;
import bl.staff.Impl.StaffManageController;
import bl.staff.Impl.UserManageController;
import ui.informationui.InformationPanel.SearchListener;
import vo.PackageVO;
import vo.StaffVO;

public class UserManagePanel extends JPanel {
	StartFrame belongsTO;
	/*JButton okButton;*/
	JButton search; 
	JTextField inputID;
	JLabel LOGO;
	JLabel wrongMess;
	JLabel bussinessMess;
	JTable table;
	JButton save;
	
	public UserManagePanel(StartFrame belongsTO){
		this.belongsTO=belongsTO;
		this.setLayout(null);
		this.setBounds(200,60,1000,615);
		
		search=new JButton();
		search.setIcon(new ImageIcon("pic/搜索按钮.png"));
		search.setBounds(650,50, 40, 40);
		search.addActionListener(new SearchListener());
		
		inputID=new JTextField();
		inputID.setFont(new Font("微软雅黑 Light",Font.PLAIN,24));
		inputID.setBounds(350, 50, 260, 40);
		inputID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 138, 255)));
		
/*		StaffManageController staff=new StaffManageController();
		ArrayList<StaffVO> staffs=staff.getAllStaff("");
		int size=staffs.size();*/
		ArrayList<StaffVO> staffs=new ArrayList<StaffVO>();
		StaffVO A=new StaffVO();
		A.ID="laoshu";
		A.name="仓鼠";
		A.age=18;
		A.passwords="888";
		A.pos="xiaolongbao";
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		buildTable(staffs);
		int size=staffs.size();
		int height=table.getRowHeight()*(size+1)+9;
		if(height>=400)
			height=400;
		save=new JButton();
		save.setBounds(700, 120+height+30, 40, 40);
		save.addActionListener(new PushListener());
		this.add(search);
		this.add(inputID);
		this.add(save);
		/*this.add(table);*/
	}
	public void buildTable(ArrayList<StaffVO> staffs){
		int size=staffs.size();
		
		Object[][] tableData=new Object[size][5];
		for(int i=0;i<size;i++){
			StaffVO mess=staffs.get(i);
			tableData[i]=new Object[]{mess.ID,mess.name,mess.age,mess.passwords,mess.pos," "};
		}
		Object[] columnTitle = {"用户名" ,"姓名","年龄","密码","职位","优先级"};  
		table=new JTable(tableData,columnTitle);
		int height=table.getRowHeight()*(size+1)+9;
		int ValidMaxHeight=400;
		if(height>=400)
			height=ValidMaxHeight;
		//table.setBounds(200, 50, 600, height);
		table.setOpaque(false); 
		table.setRowSelectionAllowed(true);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(161, 120, 658, height);
		scrollPane.setOpaque(false);
		this.add(scrollPane);
		scrollPane.setViewportView(table);
	}
	 class PushListener implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			UserManageController user=new UserManageController();
			
			int rows=table.getRowCount();
			boolean result=true;
			for(int i=0;i<rows;i++){
				result=result&user.changeStaffInfo((String)table.getValueAt(i, 4), (String)table.getValueAt(i, 3), 
						(String)table.getValueAt(i, 2),(String)table.getValueAt(i, 1),
						(String)table.getValueAt(i, 0),(String)table.getValueAt(i, 5));	
			}
			if(result){
				
			}else{
				TimePanel.change=true;
				TimePanel.text="更新人员信息时出现问题，请重试";
			}
			
			
			
		}
		 
	 }
	
	class SearchListener implements ActionListener{	
		public void actionPerformed(ActionEvent arg0) {
			String TransID=inputID.getText();
			
			UserManageController user=new UserManageController();
			ArrayList<StaffVO> staffs;
			staffs=user.getAllStaff(TransID);
			if(staffs==null){
				TimePanel.change=true;
				TimePanel.text="系统中找不到您要找的用户，该用户可能尚未被创建！";
			}else{
				buildTable(staffs);	
			}	
		}
		
	}
	
}
