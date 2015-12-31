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

import bl.staff.Impl.StaffManageController;
import ui.NSwing.NButton;
import ui.NSwing.NTable;
import vo.StaffVO;

public class DeleteStaffPanel extends JPanel{
	JLabel id;
	JTextField userid;
	JLabel labelofsalary;
	JComboBox comboBoxofsalary;
	JTextField userpay;
	JLabel pay;
	NTable table;
	NButton submit;
	JLabel pos;
	JComboBox userpos;
	JLabel city;
	JLabel department;
	JComboBox userdepartment;
	JComboBox usercity;
	JScrollPane scrollPane;
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
	
		submit = new NButton("ok");
		submit.setBounds(720, 180, 80, 30);
		this.add(submit);
		
		
		StaffManageController staff=new StaffManageController();
		ArrayList<StaffVO> staffs=staff.getAllStaff("");
		buildTable(staffs);
		
		submit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StaffManageController staffManage=new StaffManageController();
				boolean success=staffManage.deleteStaff(new String[]{userid.getText()});
				if(success){
					userid.setText("");
					removeTable();
					ArrayList<StaffVO> staffs=staffManage.getAllStaff("");
					buildTable(staffs);
					repaint();
					TimePanel.makeWords("您已成功解雇该员工！");
				}else{
					TimePanel.makeWords("解雇该员工发生错误，请重试！");
				}
			}
		});
		
		
		
		
	}
	
	public void buildTable(ArrayList<StaffVO> staffs){
		int size=staffs.size();
		
		Object[][] tableData=new Object[size][7];
		for(int i=0;i<size;i++){
			StaffVO mess=staffs.get(i);
			String sex="";
			if(mess.isBoy){
				sex="男";
			}else{
				sex="女";
			}
			tableData[i]=new Object[]{mess.ID,mess.name,sex,mess.age,mess.pos,mess.department,mess.SalaryModel};
		}
		Object[] columnTitle = {"用户名","姓名","性别","年龄","职位","部门","薪水"};  
		table=new NTable(tableData,columnTitle);
		int height=table.getRowHeight()*(size+1)+9;
		int ValidMaxHeight=250;
		if(height>=400)
			height=ValidMaxHeight;
		//table.setBounds(200, 50, 600, height);
		table.setOpaque(false); 
		table.setRowSelectionAllowed(true);
		scrollPane = new JScrollPane();
		scrollPane.setBounds(140, 270, 658, height);
		scrollPane.setOpaque(false);
		this.add(scrollPane);
		scrollPane.setViewportView(table);
	}
	
	public void removeTable(){
		if(scrollPane!=null)
			this.remove(scrollPane);
	}
}