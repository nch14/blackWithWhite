package ui.informationui;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import vo.StaffVO;

public class DeleteStaffPanel extends JPanel{
	JLabel id;
	JTextField userid;
	JLabel labelofsalary;
	JComboBox comboBoxofsalary;
	JTextField userpay;
	JLabel pay;
	JTable table;
	JButton submit;
	JLabel pos;
	JComboBox userpos;
	JLabel city;
	JLabel department;
	JComboBox userdepartment;
	JComboBox usercity;
	public DeleteStaffPanel(){
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
		
		id= new JLabel("用户名");
		id.setFont(new Font("微软雅黑",Font.BOLD,16));
		id.setBounds(120, 50, 80, 30);
		this.add(id);
		
		userid = new JTextField();
		userid.setBounds(200, 50, 160, 30);
		userid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		this.add(userid);
		
		/*pos=new JLabel();
		pos.setFont(new Font("微软雅黑",Font.BOLD,16));
		pos.setBounds(540,50,60,30);
		pos.setText("新职位");
		this.add(pos);
		
		userpos=new JComboBox();
		userpos.setFont(new Font("微软雅黑",Font.BOLD,16));
		userpos.addItem("快递员");
		userpos.addItem("营业厅业务员");
		userpos.addItem("中转中心业务员");
		userpos.addItem("中转中心仓库管理人员");
		userpos.addItem("总经理");
		userpos.addItem("财务人员");
		userpos.addItem("管理员");
		userpos.setBounds(620,50,180,30);
		this.add(userpos);
		
		city=new JLabel();
		city.setFont(new Font("微软雅黑",Font.BOLD,16));
		city.setBounds(120,110,80,30);
		city.setText("调派城市");
		this.add(city);
		
		usercity=new JComboBox();
		usercity.setFont(new Font("微软雅黑",Font.BOLD,16));
		usercity.addItem("南京");
		usercity.addItem("北京");
		usercity.addItem("上海");
		usercity.addItem("广州");
		usercity.setBounds(200,110,80,30);
		this.add(usercity);
		
		department=new JLabel();
		department.setFont(new Font("微软雅黑",Font.BOLD,16));
		department.setBounds(540,110,80,30);
		department.setText("调派部门");
		this.add(department);
		
		userdepartment=new JComboBox();
		userdepartment.setFont(new Font("微软雅黑",Font.BOLD,16));
		userdepartment.addItem("寿康宫");
		userdepartment.addItem("霍格沃兹");
		userdepartment.addItem("对角巷");
		userdepartment.setBounds(620,110,280,30);
		this.add(userdepartment);*/

		

		submit = new JButton("提交");
		submit.setBounds(720, 180, 80, 30);
		this.add(submit);
		submit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

			}
		});
		
		
		ArrayList<StaffVO> staffs=new ArrayList<StaffVO>();
		StaffVO A=new StaffVO();
		A.ID="小龙女";
		A.name="陈妍希";
		A.age=18;
		A.pos="小笼包";
		A.department="仙二404";
		A.SalaryModel="月薪：5000";
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
	}
	
	public void buildTable(ArrayList<StaffVO> staffs){
		int size=staffs.size();
		
		Object[][] tableData=new Object[size][5];
		for(int i=0;i<size;i++){
			StaffVO mess=staffs.get(i);
			tableData[i]=new Object[]{mess.ID,mess.name,mess.age,mess.passwords,mess.pos," "};
		}
		Object[] columnTitle = {"用户名","姓名","年龄","职位","薪水"};  
		table=new JTable(tableData,columnTitle);
		int height=table.getRowHeight()*(size+1)+9;
		int ValidMaxHeight=250;
		if(height>=400)
			height=ValidMaxHeight;
		//table.setBounds(200, 50, 600, height);
		table.setOpaque(false); 
		table.setRowSelectionAllowed(true);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(140, 270, 658, height);
		scrollPane.setOpaque(false);
		this.add(scrollPane);
		scrollPane.setViewportView(table);
	}
}