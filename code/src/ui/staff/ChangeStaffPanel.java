package ui.staff;

import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


import bl.staff.Impl.StaffManageController;
import settings.BussinessHall;
import settings.CompanySettingsController;
import settings.TransportCenter;
import ui.NSwing.NButton;
import ui.NSwing.NTable;
import ui.NSwing.NTextField;
import ui.informationui.StartFrame;
import ui.informationui.TimePanel;
import ui.staff.AddStaffPanel.PosListener;
import ui.staff.AddStaffPanel.SelectListener;
import vo.StaffVO;

public class ChangeStaffPanel extends JPanel{
	StartFrame belongsTO;
	JLabel id;
	NTextField userid;
	JLabel labelofsalary;
	JComboBox comboBoxofsalary;
	NTextField userpay;
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
	public ChangeStaffPanel(){
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
		
		id= new JLabel("用户名");
		id.setFont(new Font("微软雅黑",Font.BOLD,16));
		id.setBounds(120, 50, 80, 30);
		this.add(id);
		
		userid = new NTextField();
		userid.setBounds(200, 50, 160, 30);
		userid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		this.add(userid);
		
		pos=new JLabel();
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
		userpos.addFocusListener(new PosListener());
		this.add(userpos);
		
		city=new JLabel();
		city.setFont(new Font("微软雅黑",Font.BOLD,16));
		city.setBounds(120,110,80,30);
		city.setText("调派城市");
		this.add(city);
		
		usercity=new JComboBox();
		usercity.setFont(new Font("微软雅黑",Font.BOLD,16));
		usercity.setBounds(200,110,80,30);
		usercity.addFocusListener(new SelectListener());
		this.add(usercity);
		
		department=new JLabel();
		department.setFont(new Font("微软雅黑",Font.BOLD,16));
		department.setBounds(540,110,80,30);
		department.setText("调派部门");
		this.add(department);
		
		userdepartment=new JComboBox();
		userdepartment.setFont(new Font("微软雅黑",Font.BOLD,16));
		userdepartment.setBounds(620,110,280,30);
		this.add(userdepartment);

		

		submit = new NButton("ok");
		submit.setBounds(720, 180, 80, 30);
		this.add(submit);
		submit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StaffManageController staff=new StaffManageController();
				boolean result=staff.changePosition(new String[]{userid.getText()},
						new String[]{(String)userpos.getSelectedItem()}, new String[]{(String)userdepartment.getSelectedItem()});
			
				if(result){
					userid.setText("");
					usercity.setSelectedIndex(0);
					userpos.setSelectedIndex(0);
					userdepartment.setSelectedIndex(0);
					removeTable();
					ArrayList<StaffVO> staffs=staff.getAllStaff("");
					buildTable(staffs);
					TimePanel.makeWords("您已成功解雇该员工！");
				}else{
					TimePanel.makeWords("发生错误，请重试！");
				}
			
			}
		});
		
		
		StaffManageController staff=new StaffManageController();
		ArrayList<StaffVO> staffs=staff.getAllStaff("");
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
		table=new NTable(tableData,columnTitle);
		int height=table.getRowHeight()*(size+1)+13;
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
