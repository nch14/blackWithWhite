package ui.staff;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import bl.staff.Impl.StaffManageController;
import bl.staff.Impl.UserManageController;
import settings.BussinessHall;
import settings.CompanySettingsController;
import settings.TransportCenter;
import ui.NSwing.NButton;
import ui.NSwing.NTable;
import ui.NSwing.NTableModel;
import ui.NSwing.NTextField;
import ui.NSwing.TimePanel;
import vo.StaffVO;

public class AddStaffPanel extends JPanel{
	JLabel id;
	JLabel pass;
	JLabel name;
	JLabel sex;
	JLabel age;
	JLabel pos;
	JLabel department;
	JLabel city;
	JComboBox usercity;
	NTextField userid;
	NTextField userpass;
	NTextField username;
	NTextField userage;
	JComboBox usersex; 
    JComboBox userpos;  
    JComboBox userdepartment;
    NButton okButton;
    NTable table;
    JScrollPane scrollPane;
	public AddStaffPanel(){
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
		
		name=new JLabel();
		name.setFont(new Font("微软雅黑",Font.BOLD,16));
		name.setBounds(50,50,40,30);
		name.setText("姓名");
		
		username=new NTextField();
		username.setFont(new Font("微软雅黑",Font.BOLD,16));
		username.setBounds(100,50,80,30);
		
		sex=new JLabel();
		sex.setFont(new Font("微软雅黑",Font.BOLD,16));
		sex.setBounds(240,50,40,30);
		sex.setText("性别");
		
		usersex=new JComboBox();
		usersex.setFont(new Font("微软雅黑",Font.BOLD,16));
		usersex.addItem("男");
		usersex.addItem("女");
		usersex.setBounds(290,50,60,30);
		
		age=new JLabel();
		age.setFont(new Font("微软雅黑",Font.BOLD,16));
		age.setBounds(420,50,40,30);
		age.setText("年龄");
		
		userage=new NTextField();
		userage.setFont(new Font("微软雅黑",Font.BOLD,16));
		userage.setBounds(470,50,60,30);
		age.addFocusListener(new AgeListener());
		
		pos=new JLabel();
		pos.setFont(new Font("微软雅黑",Font.BOLD,16));
		pos.setBounds(590,50,40,30);
		pos.setText("职位");
		
		userpos=new JComboBox();
		userpos.setFont(new Font("微软雅黑",Font.BOLD,16));
		userpos.addItem("快递员");
		userpos.addItem("营业厅业务员");
		userpos.addItem("中转中心业务员");
		userpos.addItem("中转中心仓库管理人员");
		userpos.addItem("总经理");
		userpos.addItem("财务人员");
		userpos.addItem("管理员");
		userpos.addFocusListener(new PosListener());
		userpos.setBounds(650,50,180,30);
		
		city=new JLabel();
		city.setFont(new Font("微软雅黑",Font.BOLD,16));
		city.setBounds(50,110,40,30);
		city.setText("城市");
		
		usercity=new JComboBox();
		usercity.setFont(new Font("微软雅黑",Font.BOLD,16));
		usercity.addFocusListener(new SelectListener());
		usercity.setBounds(100,110,80,30);
		
		department=new JLabel();
		department.setFont(new Font("微软雅黑",Font.BOLD,16));
		department.setBounds(240,110,40,30);
		department.setText("部门");
		
		userdepartment=new JComboBox();
		userdepartment.setFont(new Font("微软雅黑",Font.BOLD,16));
		userdepartment.setBounds(290,110,280,30);
		
		id=new JLabel();
		id.setFont(new Font("微软雅黑",Font.BOLD,16));
		id.setBounds(50,170,60,30);
		id.setText("用户名");
		
		userid=new NTextField();
		userid.setFont(new Font("微软雅黑",Font.BOLD,16));
		userid.setBounds(100,170,200,30);
		
		pass=new JLabel();
		pass.setFont(new Font("微软雅黑",Font.BOLD,16));
		pass.setBounds(420,170,40,30);
		pass.setText("密码");
		
		userpass=new NTextField();
		userpass.setFont(new Font("微软雅黑",Font.BOLD,16));
		userpass.setBounds(470,170,200,30);

		
		okButton=new NButton("ok");
		okButton.setBounds(640, 210, 40, 40);
		okButton.setBorder(null);
		okButton.setFocusPainted(false);
		okButton.setBorderPainted(false);
		okButton.setContentAreaFilled(false);
		okButton.addActionListener(new PushListener());
		
		StaffManageController staff=new StaffManageController();
		ArrayList<StaffVO> staffs=staff.getAllStaff("");
	
		buildTable(staffs);
				
		
		this.add(age);
		this.add(userage);
		this.add(name);
		this.add(username);
		this.add(sex);
		this.add(usersex);
		this.add(pos);
		this.add(userpos);
		this.add(department);
		this.add(userdepartment);
		this.add(id);
		this.add(userid);
		this.add(pass);
		this.add(userpass);
		this.add(city);
		this.add(usercity);
		this.add(okButton);
	}
	
	public void buildTable(ArrayList<StaffVO> staffs){
		int size=staffs.size();
		
		Object[][] tableData=new Object[size][6];
		for(int i=0;i<size;i++){
			StaffVO mess=staffs.get(i);
			tableData[i]=new Object[]{mess.ID,mess.name,mess.age,mess.passwords,mess.pos,mess.department};
		}
		Object[] columnTitle = {"用户名" ,"姓名","年龄","密码","职位","部门"};  
		TableModel tableModel=new DefaultTableModel(tableData,columnTitle);
		table=new NTable(tableModel);
		int height=table.getRowHeight()*(size+1)+13;
		int ValidMaxHeight=250;
		if(height>=400)
			height=ValidMaxHeight;
		
		table.setOpaque(false); 
		table.setRowSelectionAllowed(true);
		scrollPane = new JScrollPane();
		scrollPane.setBounds(140, 270, 658, height);
		scrollPane.setOpaque(false);
		this.add(scrollPane);
		scrollPane.setViewportView(table);
	}
	 class PushListener implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			String id=userid.getText();
			String pass=userpass.getText();
			String name=username.getText();
			String age=userage.getText();
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
					ArrayList<StaffVO> staffsNew=user.getAllStaff("");
					removeTable();
					buildTable(staffsNew);
					repaint();
				}else{
					TimePanel.change=true;
					TimePanel.text="添加员工失败，可能存在网络故障！";
				}
			}else{
				TimePanel.change=true;
				TimePanel.text="请检查您的输入！";
			}
		}
		 
	 }
	 
	public void removeTable(){
		if(scrollPane!=null)
			this.remove(scrollPane);
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
	 
	 class PosListener implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			switch((String)userpos.getSelectedItem()){
			case "总经理":
				usercity.removeAllItems();
				usercity.addItem("总部");
				repaint();
				break;
			case "财务人员":
				usercity.removeAllItems();
				usercity.addItem("总部");
				repaint();
				break;
			case "管理员":
				usercity.removeAllItems();
				usercity.addItem("总部");
				repaint();
				break;
			default:
				usercity.removeAllItems();
				CompanySettingsController csc=new CompanySettingsController();
				String[] names=csc.getCityName();
				for(int i=0;i<names.length;i++){
					usercity.addItem((String)names[i]);
				}
				repaint();
				break;
			}
		}
		 
	 }
	 class SelectListener implements FocusListener{

		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			// TODO Auto-generated method stub
			switch((String)userpos.getSelectedItem()){
			case "总经理":
				userdepartment.removeAllItems();
				userdepartment.addItem("执行部");
				repaint();
				break;
			case "财务人员":
				userdepartment.removeAllItems();
				userdepartment.addItem("财务部");
				repaint();
				break;
			case "管理员":
				userdepartment.removeAllItems();
				userdepartment.addItem("技术部");
				repaint();
				break;		
			case "中转中心业务员":
				userdepartment.removeAllItems();
				CompanySettingsController csc=new CompanySettingsController();
				TransportCenter[] names=csc.getTransportCenters((String)usercity.getSelectedItem());
				for(int i=0;i<names.length;i++){
					userdepartment.addItem((String)names[i].getName());
				}
				repaint();
				break;	
			case "中转中心仓库管理人员":
				userdepartment.removeAllItems();
				CompanySettingsController csc2=new CompanySettingsController();
				TransportCenter[] names2=csc2.getTransportCenters((String)usercity.getSelectedItem());
				for(int i=0;i<names2.length;i++){
					userdepartment.addItem((String)names2[i].getName());
				}
				repaint();
				break;
			default:
				userdepartment.removeAllItems();
				CompanySettingsController csc3=new CompanySettingsController();
				BussinessHall[] names3=csc3.getBussinessHalls((String)usercity.getSelectedItem());
				for(int i=0;i<names3.length;i++){
					userdepartment.addItem((String)names3[i].name);
				}
				repaint();
				break;
			
			}
		}
		 
	 }
}
