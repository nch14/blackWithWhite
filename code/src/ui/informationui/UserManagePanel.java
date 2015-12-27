package ui.informationui;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import bl.staff.Impl.StaffManageController;
import ui.informationui.InformationPanel.SearchListener;
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
	
	public UserManagePanel(StartFrame belongsTO){
		this.belongsTO=belongsTO;
		this.setLayout(null);
		this.setBounds(200,60,1000,615);
		
		search=new JButton();
		search.setIcon(new ImageIcon("pic/搜索按钮.png"));
		search.setBounds(650,50, 40, 40);
		//search.addActionListener(new SearchListener());
		
		inputID=new JTextField();
		inputID.setFont(new Font("微软雅黑 Light",Font.PLAIN,24));
		inputID.setBounds(350, 50, 260, 40);
		inputID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 138, 255)));
		
		StaffManageController staff=new StaffManageController();
		ArrayList<StaffVO> staffs=staff.getAllStaff("");
		int size=staffs.size();
/*		ArrayList<StaffVO> staffs=new ArrayList<StaffVO>();
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
		int size=staffs.size();*/
		
		Object[][] tableData=new Object[size][5];
		for(int i=0;i<size;i++){
			StaffVO mess=staffs.get(i);
			tableData[i]=new Object[]{mess.ID,mess.name,mess.age,mess.passwords,mess.pos," "};
		}
		Object[] columnTitle = {"用户名" ,"姓名","年龄","密码","职位","优先级"};  
		table=new JTable(tableData,columnTitle);
		int height=table.getRowHeight()*(size+1);
		table.setBounds(200, 50, 600, height);
		table.setOpaque(false); 
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(161, 229, 658, height);
		this.add(scrollPane);
		scrollPane.setViewportView(table);
		this.add(search);
		this.add(inputID);
		/*this.add(table);*/
	}
	
}
