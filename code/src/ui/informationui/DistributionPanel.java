package ui.informationui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import bill.AllocateBill;
import bl.receivement.Impl.DistributionController;
import tools.TimeHelper;
import tools.VaildHelper;
import ui.NSwing.NLabel;
import ui.NSwing.NTextField;

public class DistributionPanel extends JPanel {
	JTable table;
	NTextField textFieldofday;
	NTextField textFieldofmonth;
	NTextField billID;
	NLabel name ;
	JButton okButton;
	JScrollPane scrollPane;
	AllocateBill bill;
	NTextField userName;
	NTextField textFieldofyear ;
	NLabel id;
	NLabel id2;
	NTextField billID2;
	public DistributionPanel(){
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);	
		
		id = new NLabel("派件单编号");
		id.setBounds(120, 90, 80, 30);
		this.add(id);
		
		billID = new NTextField();
		billID.setBounds(210, 90, 140, 30);
		this.add(billID);
		billID.setColumns(10);
		
		name= new NLabel("快递员");
		name.setBounds(390, 90, 60, 30);
		this.add(name);
		
		userName = new NTextField();
		userName.setBounds(460, 90, 80, 30);
		this.add(userName);
		userName.setColumns(10);
		
		NLabel labelofdate = new NLabel("派送日期");
		labelofdate.setBounds(580, 90, 70, 30);
		this.add(labelofdate);
		
		textFieldofyear = new NTextField();
		textFieldofyear.setBounds(660, 90, 50, 30);
		this.add(textFieldofyear);
		textFieldofyear.setColumns(4);
		
		NLabel labelofyear = new NLabel("年");
		labelofyear.setBounds(715, 90, 20, 30);
		this.add(labelofyear);
		
		textFieldofmonth = new NTextField();
		textFieldofmonth.setBounds(740, 90, 50, 30);
		this.add(textFieldofmonth);
		textFieldofmonth.setColumns(2);
		
		
		NLabel labelofmonth = new NLabel("月");
		labelofmonth.setBounds(795, 90, 20, 30);
		this.add(labelofmonth);
		
		textFieldofday = new NTextField();
		textFieldofday.setBounds(820, 90,50, 30);
		this.add(textFieldofday);
		textFieldofday.setColumns(2);
		
		NLabel labelofday = new NLabel("日");
		labelofday.setBounds(875, 90, 20, 30);
		this.add(labelofday);
		
		id2 = new NLabel("订单号");
		id2.setBounds(120, 200, 80, 30);
		this.add(id2);
		
		billID2 = new NTextField();
		billID2.setBounds(210, 200, 140, 30);
		this.add(billID2);
		billID2.setColumns(10);

		JButton addButton = new JButton("添加");
		addButton.addActionListener(new AddListener());
		addButton.setBounds(800, 200, 80, 30);
		this.add(addButton);

		okButton=new JButton();
		okButton.setIcon(new ImageIcon("pic/ok40.png"));
		okButton.setBounds(800, 560, 40, 40);
		okButton.setBorder(null);
		okButton.setFocusPainted(false);
		okButton.setBorderPainted(false);
		okButton.setContentAreaFilled(false);
		okButton.addActionListener(new PushListener());
		this.add(okButton);
	}
	
	public void buildTable(ArrayList<String> list){

		int size=list.size();
		Object[][] tableData=new Object[size][4];
		for(int i=0;i<size;i++){
			String mess=list.get(i);
			tableData[i]=new Object[]{bill.ID,mess,bill.name,
					bill.date[0]+bill.date[1]+bill.date[2]};
		}
		Object[] columnTitle = {"派件单编号","订单号","快递员","收件日期"};  
		table=new JTable(tableData,columnTitle);
		int height=table.getRowHeight()*(size+1)+9;
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
	public void removeTable(){
		this.remove(scrollPane);
	}
	class AddListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(bill==null){
				String thisID=billID2.getText();
				String thisName=userName.getText();
				String thisDate=TimeHelper.adjustTime(textFieldofyear.getText(), 4)+
						TimeHelper.adjustTime(textFieldofmonth.getText(),2)+
						TimeHelper.adjustTime(textFieldofday.getText(),2);
				boolean result=true;
				result=result&&VaildHelper.checkIsValidID(thisID, 10);
				result=result&&VaildHelper.checkIsValidID(thisDate,8);
				if(result){
					String[] dateArray=new String[]{TimeHelper.adjustTime(textFieldofyear.getText(), 4),
							TimeHelper.adjustTime(textFieldofmonth.getText(),2),
							TimeHelper.adjustTime(textFieldofday.getText(),2)};
					bill=new AllocateBill(billID.getText(),thisName,dateArray);
					bill.list.add(billID2.getText());
					billID2.setText("");
					buildTable(bill.list);
					repaint();
				}
			}else if(bill!=null&&
					((!billID.getText().equals(bill.ID))||
							(!(userName.getText().equals(bill.name))))){
				TimePanel.makeWords("每次请只为一位快递员分配任务！");
			}else{
				if(VaildHelper.checkIsValidID(billID2.getText(), 10)){
				removeTable();
				bill.list.add(billID2.getText());
				billID2.setText("");
				buildTable(bill.list);
				}
			}
		}		
	}
	
	class PushListener implements ActionListener{	
		public void actionPerformed(ActionEvent arg0) {
			DistributionController trans=new DistributionController();
			ArrayList<AllocateBill> bills=new ArrayList<AllocateBill>();
			bills.add(bill);
			boolean result=trans.distribution(bills);
			if(result){
				billID2.setText("");
				billID.setText("");
				id.setText("");
				id2.setText("");
				userName.setText("");
				textFieldofyear.setText("");
				textFieldofmonth.setText("");
				textFieldofday.setText("");
				TimePanel.makeWords("提交成功！");
				removeTable();
			}else{
				TimePanel.change=true;
				TimePanel.text="提交失败！请重试！";
			}
		}
		
	}
}
