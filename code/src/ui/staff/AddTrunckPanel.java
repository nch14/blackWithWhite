package ui.staff;

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

import bill.TruckPO;

import bl.staff.Impl.TruckManageController;
import vo.StaffVO;

public class AddTrunckPanel extends JPanel{
	JLabel driverid;
	JLabel validDate;
	JLabel IDNumbers;	
	JTextField userid;
	JTextField userValidTime;
	JTextField userIDNumbers;
    JButton okButton;
    JTable table;
	public AddTrunckPanel(){
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
	
		driverid=new JLabel();
		driverid.setFont(new Font("微软雅黑",Font.BOLD,16));
		driverid.setBounds(100,100,80,30);
		driverid.setText("车辆代号");
		
		userid=new JTextField();
		userid.setFont(new Font("微软雅黑",Font.BOLD,16));
		userid.setBounds(190,100,200,30);
	
		IDNumbers=new JLabel();
		IDNumbers.setFont(new Font("微软雅黑",Font.BOLD,16));
		IDNumbers.setBounds(540,100,80,30);
		IDNumbers.setText("车牌号");
		
		userIDNumbers=new JTextField();
		userIDNumbers.setFont(new Font("微软雅黑",Font.BOLD,16));
		userIDNumbers.setBounds(630,100,200,30);
		
		validDate=new JLabel();
		validDate.setFont(new Font("微软雅黑",Font.BOLD,16));
		validDate.setBounds(100,160,80,30);
		validDate.setText("服役时间");
		
		 
		userValidTime=new JTextField();
		userValidTime.setFont(new Font("微软雅黑",Font.BOLD,16));
		userValidTime.setBounds(190,160,200,30);
		
		
		


		
		okButton=new JButton();
		okButton.setBounds(700, 210, 40, 40);
		okButton.addActionListener(new PushListener());
		
/*		TruckManageController staff=new TruckManageController();
		ArrayList<TruckPO> staffs=staff.getTruck();
		int size=staffs.size();
		if(staffs!=null)
			buildTable(staffs);*/
		
		
	
		this.add(validDate);
		this.add(driverid);
		this.add(userid);
		this.add(IDNumbers);
		this.add(userIDNumbers);
		this.add(okButton);
		this.add(userValidTime);
	}
	
	public void buildTable(ArrayList<TruckPO> staffs){
		int size=staffs.size();
		
		Object[][] tableData=new Object[size][3];
		for(int i=0;i<size;i++){
			TruckPO mess=staffs.get(i);
			tableData[i]=new Object[]{mess.vehicleCode,mess.licensePlate,mess.serviceTime};
		}
		Object[] columnTitle = {"车辆代号" ,"车牌号","服役时间"};  
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
