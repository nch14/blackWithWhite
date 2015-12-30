package ui.informationui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import bill.Account;
import tools.TimeHelper;
import ui.NSwing.NButton;
import ui.NSwing.NLabel;
import ui.NSwing.NTextField;



public class AccountManagePanel extends JPanel {
	private NTextField accountID;
	private NTextField accountName;
	private NTextField accountMoney;
	NButton add;
	JTable table;
	JScrollPane scrollPane;
	
	public AccountManagePanel() {
		this.setBounds(200, 60, 1000, 615);
		this.setLayout(null);
		

		NLabel textPane_30 = new NLabel();
		textPane_30.setText("ÕËºÅ");
		textPane_30.setBounds(100, 110, 40, 30);
		this.add(textPane_30);
		
		accountID = new NTextField();
		accountID.setBounds(160, 110, 160, 30);
		this.add(accountID);
		accountID.setColumns(10);
		
		NLabel textPane_22 = new NLabel();
		textPane_22.setText("Ãû³Æ");
		textPane_22.setBounds(370, 110, 40, 30);
		this.add(textPane_22);
		
		accountName = new NTextField();
		accountName.setBounds(430, 110, 200, 30);
		this.add(accountName);
		accountName.setColumns(10);
		
		NLabel textPane_23 = new NLabel();
		textPane_23.setText("½ð¶î");
		textPane_23.setBounds(680, 110, 40, 30);
		this.add(textPane_23);
		
		accountMoney = new NTextField();
		accountMoney.setBounds(740, 110, 100, 30);
		this.add(accountMoney);
		accountMoney.setColumns(10);
		
		add=new NButton("add");
		add.setBounds(700, 130, 40, 40);
		add.addActionListener(new AddListener());
		this.add(add);
		
		
		
	}
	public void buildTable(ArrayList<Account> list){

		int size=list.size();
		Object[][] tableData=new Object[size][3];
		for(int i=0;i<size;i++){
			Account mess=list.get(i);
			tableData[i]=new Object[]{mess.getID(),mess.name,mess.getMoney()};
		}
		Object[] columnTitle = {"ÕËºÅ", "ÕË»§Ãû³Æ", "ÕË»§½ð¶î"};  
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
		if(scrollPane!=null)
			this.remove(scrollPane);
	}
	class AddListener implements ActionListener{


		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
		
	

}
