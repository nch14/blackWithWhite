package ui.staff;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import bill.Account;
import bl.money.Impl.AccountManageController;
import tools.TimeHelper;
import tools.VaildHelper;
import ui.NSwing.NButton;
import ui.NSwing.NLabel;
import ui.NSwing.NTable;
import ui.NSwing.NTextField;
import ui.NSwing.TimePanel;



public class DeleteAccountPanel extends JPanel {
	private NTextField accountID;
	NButton add;
	NTable table;
	JScrollPane scrollPane;
	NLabel help1;
	NLabel help2;
	public DeleteAccountPanel() {
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
		accountID.addFocusListener(new ValidListener());
		
		help1 = new NLabel("ÕËºÅ±ØÐëÎª18Î»Êý×Ö£¡","tips");
		help1.setBounds(160, 140, 160, 30);
		
		
		add=new NButton("ok");
		add.setBounds(740, 150, 40, 40);
		add.addActionListener(new AddListener());
		this.add(add);
		
		AccountManageController amc=new AccountManageController();
		ArrayList<Account> list=amc.getAccount("");
		buildTable(list);
		repaint();
		
	}
	
	public void addWarning(NLabel l){
		this.add(l);
		repaint();
	}
	public void removeWarning(NLabel l){
		this.remove(l);
		repaint();
	}
	public void buildTable(ArrayList<Account> list){

		int size=list.size();
		Object[][] tableData=new Object[size][3];
		for(int i=0;i<size;i++){
			Account mess=list.get(i);
			tableData[i]=new Object[]{mess.getID(),mess.name,mess.getMoney()};
		}
		Object[] columnTitle = {"ÕËºÅ", "ÕË»§Ãû³Æ", "ÕË»§½ð¶î"};  
		table=new NTable(tableData,columnTitle);
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
	public void removeTable(){
		if(scrollPane!=null)
			this.remove(scrollPane);
	}
	class AddListener implements ActionListener{


		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			AccountManageController amc=new AccountManageController();
			boolean result=VaildHelper.checkIsValidID(accountID.getText(),18);
			if(result){
				amc.delateAccount(new String[]{accountID.getText()});
				accountID.setText("");
				removeTable();
				repaint();
				ArrayList<Account> list=amc.getAccount("");
				buildTable(list);
				repaint();
			}else{
				TimePanel.makeWords("É¾³ýÕË»§Ê§°Ü");
			}
		}
		
	}
	
	
	
	class ValidListener implements FocusListener{

		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			// TODO Auto-generated method stub
			String id=accountID.getText();
			boolean result=VaildHelper.checkIsValidID(id,18);
			if(!result){
				addWarning(help1);
			}else{
				removeWarning(help1);
			}
		}
		
	}
	

}
