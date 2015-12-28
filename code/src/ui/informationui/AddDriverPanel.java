package ui.informationui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import bill.DriverPO;
import bl.staff.Impl.StaffManageController;
import bl.staff.Impl.UserManageController;
import vo.StaffVO;

public class AddDriverPanel extends JPanel{
	JLabel driverid;
	JLabel name;
	JLabel sex;
	JLabel birthday;
	JLabel validDate;
	JLabel tel;
	JLabel IDNumbers;
	JTextField usertel;
	JTextField userid;
	JTextField userpass;
	JTextField username;
	JTextField userValidTime;
	JTextField userbirthday;
	JComboBox usersex;  
    JButton okButton;
    JTable table;
	public AddDriverPanel(){
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
		
		name=new JLabel();
		name.setFont(new Font("微软雅黑",Font.BOLD,16));
		name.setBounds(120,50,40,30);
		name.setText("姓名");
		
		username=new JTextField();
		username.setFont(new Font("微软雅黑",Font.BOLD,16));
		username.setBounds(210,50,80,30);
		
		sex=new JLabel();
		sex.setFont(new Font("微软雅黑",Font.BOLD,16));
		sex.setBounds(340,50,40,30);
		sex.setText("性别");
		
		usersex=new JComboBox();
		usersex.setFont(new Font("微软雅黑",Font.BOLD,16));
		usersex.addItem("男");
		usersex.addItem("女");
		usersex.setBounds(410,50,60,30);
		
		birthday=new JLabel();
		birthday.setFont(new Font("微软雅黑",Font.BOLD,16));
		birthday.setBounds(540,50,80,30);
		birthday.setText("出生日期");
		
		userbirthday=new JTextField();
		userbirthday.setFont(new Font("微软雅黑",Font.BOLD,16));
		userbirthday.setBounds(630,50,200,30);
		userbirthday.addFocusListener(new AgeListener());
		
		tel=new JLabel();
		tel.setFont(new Font("微软雅黑",Font.BOLD,16));
		tel.setBounds(120,110,160,30);
		tel.setText("手机号码");
		
		usertel=new JTextField();
		usertel.setFont(new Font("微软雅黑",Font.BOLD,16));
		usertel.setBounds(210,110,120,30);
		
		validDate=new JLabel();
		validDate.setFont(new Font("微软雅黑",Font.BOLD,16));
		validDate.setBounds(540,110,80,30);
		validDate.setText("行驶证期限");
		
		 
		userValidTime=new JTextField();
		userValidTime.setFont(new Font("微软雅黑",Font.BOLD,16));
		userValidTime.setBounds(630,110,200,30);
		
		driverid=new JLabel();
		driverid.setFont(new Font("微软雅黑",Font.BOLD,16));
		driverid.setBounds(120,170,80,30);
		driverid.setText("司机编号");
		
		userid=new JTextField();
		userid.setFont(new Font("微软雅黑",Font.BOLD,16));
		userid.setBounds(210,170,200,30);
		
		IDNumbers=new JLabel();
		IDNumbers.setFont(new Font("微软雅黑",Font.BOLD,16));
		IDNumbers.setBounds(540,170,80,30);
		IDNumbers.setText("身份证号");
		
		userpass=new JTextField();
		userpass.setFont(new Font("微软雅黑",Font.BOLD,16));
		userpass.setBounds(630,170,200,30);

		
		okButton=new JButton();
		okButton.setBounds(700, 210, 40, 40);
		okButton.addActionListener(new PushListener());
		
/*		StaffManageController staff=new StaffManageController();
		ArrayList<StaffVO> staffs=staff.getAllStaff("");
		int size=staffs.size();*/
		ArrayList<DriverPO> staffs=new ArrayList<DriverPO>();
		DriverPO A=new DriverPO("0010", "杨过","320921199602111010", "19960219", true, "18912593173", "20151005");
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
		
		
		
		this.add(birthday);
		this.add(userbirthday);
		this.add(name);
		this.add(username);
		this.add(sex);
		this.add(usersex);
		this.add(validDate);
		this.add(driverid);
		this.add(userid);
		this.add(IDNumbers);
		this.add(userpass);
		this.add(tel);
		this.add(usertel);
		this.add(okButton);
		this.add(userValidTime);
	}
	
	public void buildTable(ArrayList<DriverPO> staffs){
		int size=staffs.size();
		
		Object[][] tableData=new Object[size][7];
		for(int i=0;i<size;i++){
			DriverPO mess=staffs.get(i);
			String sex="男";
			if(!mess.isBoy)
				sex="女";
			tableData[i]=new Object[]{mess.ID,mess.name,sex,mess.birthday,mess.tel,mess.validData,mess.IDNumber};
		}
		Object[] columnTitle = {"司机编号" ,"姓名","性别","出生日期","手机号码","行驶证期限","身份证号"};  
		
		DefaultTableModel tableModel=new DefaultTableModel(tableData,columnTitle);
		table=new JTable(tableModel);
		DefaultTableCellRenderer r=new DefaultTableCellRenderer();   
	  	r.setHorizontalAlignment(JLabel.CENTER); 
	  	table.setDefaultRenderer(Object.class,r);
		int height=table.getRowHeight()*(size+1)+9;
		int ValidMaxHeight=250;
		if(height>=300)
			height=ValidMaxHeight;
		table.setOpaque(false); 
		table.setRowSelectionAllowed(true);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(120, 280, 700, height);
		scrollPane.setOpaque(false);
		this.add(scrollPane);
		scrollPane.setViewportView(table);
	}
	 class PushListener implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			/*String id=userid.getText();
			String pass=userpass.getText();
			String name=username.getText();
			String age=userbirthday.getText();
			String sex=(String)usersex.getSelectedItem();
			String pos=(String)userpos.getSelectedItem();
			String department=(String)userdepartment.getSelectedItem();
			
			if(id!=null&&pass!=null&&name!=null&&age!=null&&sex!=null&&pos!=null&&department!=null){
				boolean isBoy=true;
				if(sex.equals("女"))
					isBoy=false;
				
				StaffVO staff=new StaffVO(id,name,age,pos,department,isBoy,pass);
				StaffVO[] staffs=new StaffVO[1];
				staffs[0]=staff;
				StaffManageController user=new StaffManageController();			
				boolean result=true;
				result=result&user.addNewStaff(staffs);
				if(result){
					TimePanel.change=true;
					TimePanel.text="您已成功增加该员工！";
				}else{
					TimePanel.change=true;
					TimePanel.text="添加员工失败，可能存在网络故障！";
				}
			}else{
				TimePanel.change=true;
				TimePanel.text="请检查您的输入！";
			}*/
		}
		 
	 }
	 class AgeListener implements FocusListener{

		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		 
	 }
}
