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

import bill.DriverPO;
import bill.TruckPO;
import bl.staff.Impl.DriverManageCotroller;
import bl.staff.Impl.TruckManageController;
import ui.NSwing.TimePanel;
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
    JScrollPane scrollPane;
	public AddTrunckPanel(){
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
	
		driverid=new JLabel();
		driverid.setFont(new Font("Î¢ÈíÑÅºÚ",Font.BOLD,16));
		driverid.setBounds(100,100,80,30);
		driverid.setText("³µÁ¾´úºÅ");
		
		userid=new JTextField();
		userid.setFont(new Font("Î¢ÈíÑÅºÚ",Font.BOLD,16));
		userid.setBounds(190,100,200,30);
	
		IDNumbers=new JLabel();
		IDNumbers.setFont(new Font("Î¢ÈíÑÅºÚ",Font.BOLD,16));
		IDNumbers.setBounds(540,100,80,30);
		IDNumbers.setText("³µÅÆºÅ");
		
		userIDNumbers=new JTextField();
		userIDNumbers.setFont(new Font("Î¢ÈíÑÅºÚ",Font.BOLD,16));
		userIDNumbers.setBounds(630,100,200,30);
		
		validDate=new JLabel();
		validDate.setFont(new Font("Î¢ÈíÑÅºÚ",Font.BOLD,16));
		validDate.setBounds(100,160,80,30);
		validDate.setText("·þÒÛÊ±¼ä");
		
		 
		userValidTime=new JTextField();
		userValidTime.setFont(new Font("Î¢ÈíÑÅºÚ",Font.BOLD,16));
		userValidTime.setBounds(190,160,200,30);
		
		
		


		
		okButton=new JButton();
		okButton.setBounds(700, 210, 40, 40);
		okButton.addActionListener(new PushListener());
		
		TruckManageController staff=new TruckManageController();
		ArrayList<TruckPO> staffs=staff.getTruck();
		buildTable(staffs);
		
		
	
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
		Object[] columnTitle = {"³µÁ¾´úºÅ" ,"³µÅÆºÅ","·þÒÛÊ±¼ä"};  
		table=new JTable(tableData,columnTitle);
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
	 class PushListener implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			TruckPO t=new TruckPO(userid.getText(),userIDNumbers.getText(),userValidTime.getText());
			TruckManageController staff=new TruckManageController();
			boolean suceess=staff.addNewTruck(new TruckPO[]{t});
			if(suceess){
				TimePanel.makeWords("Ôö¼Ó³É¹¦");
			}else{
				TimePanel.makeWords("Ôö¼ÓÊ§°Ü");
			}
			removeTable();
			ArrayList<TruckPO> staffs=staff.getTruck();
			buildTable(staffs);
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
	 public void removeTable(){
			if(scrollPane!=null)
				this.remove(scrollPane);
		}
}
