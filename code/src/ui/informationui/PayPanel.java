package ui.informationui;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import bill.Account;
import bill.PaymentBill;
import bl.money.Impl.AccountManageController;
import bl.money.Impl.PayController;
import tools.TimeHelper;
import tools.VaildHelper;
import ui.NSwing.NButton;
import ui.NSwing.NLabel;
import ui.NSwing.NTextField;

public class PayPanel extends JPanel {
	private NTextField payDate;
	private NTextField money;
	private NTextField item;
	private NTextField payer;
	private NTextField remarks;
	NLabel ID;
	NTextField thisID;
	JScrollPane scrollPane;
	JComboBox accountNum;
	JTable table;
	ArrayList<PaymentBill> list;
	public PayPanel() {
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);

		list=new ArrayList<PaymentBill>();
		
		NLabel textPane = new NLabel();
		textPane.setText("付款日期");
		textPane.setBounds(120, 50, 80, 30);
		this.add(textPane);
		
		payDate = new NTextField();
		payDate.setBounds(220, 50, 160, 30);
		this.add(payDate);
		payDate.setColumns(10);
		
		NLabel textPane_4 = new NLabel();
		textPane_4.setText("付款金额");
		textPane_4.setBounds(400, 50, 80, 30);
		this.add(textPane_4);
		
		money = new NTextField();
		money.setBounds(500, 50, 80, 30);
		this.add(money);
		money.setColumns(10);
		
		NLabel textPane_5 = new NLabel();
		textPane_5.setText("条目");
		textPane_5.setBounds(610,50, 60, 30);
		this.add(textPane_5);
		
		item = new NTextField();
		item.setBounds(690, 50, 200, 30);
		this.add(item);
		item.setColumns(10);
		
		NLabel textPane_6 = new NLabel();
		textPane_6.setText("付款账号");
		textPane_6.setBounds(120, 110, 80, 30);
		this.add(textPane_6);
		
		NLabel textPane_7 = new NLabel();
		textPane_7.setText("付款人");
		textPane_7.setBounds(400, 110, 80, 30);
		this.add(textPane_7);
		
		payer = new NTextField();
		payer.setBounds(500, 110, 80, 30);
		this.add(payer);
		payer.setColumns(10);
		
		NLabel textPane_8 = new NLabel();
		textPane_8.setText("备注");
		textPane_8.setBounds(610, 110, 40, 30);
		this.add(textPane_8);
		
		remarks = new NTextField();
		remarks.setBounds(690, 110, 200, 30);
		this.add(remarks);
		remarks.setColumns(10);
		
		accountNum = new JComboBox();
		AccountManageController amc=new AccountManageController();
		ArrayList<Account> acc=amc.getAccount("");
		accountNum.setFont(new Font("微软雅黑  Light",Font.PLAIN,14));
		for(int i=0;i<acc.size();i++){
			accountNum.addItem((String)acc.get(i).name);
		}
		accountNum.setBounds(220, 110, 160, 30);
		this.add(accountNum);
		
		ID= new NLabel();
		ID.setText("付款单号");
		ID.setBounds(120, 170, 80, 30);
		this.add(ID);
		
		thisID = new NTextField();
		thisID.setBounds(220, 170, 160, 30);
		this.add(thisID);
		thisID.setColumns(10);
		
		//添加付款单的事件监听
		NButton button = new NButton("add");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				boolean valid=TimeHelper.isValidTime(payDate.getText());
				String moneyThis=money.getText();
				moneyThis=TimeHelper.adjustTime(moneyThis, 10);
				valid=valid&&VaildHelper.checkIsValidID(moneyThis, 10);
				String IDThis=thisID.getText();
				IDThis=TimeHelper.adjustTime(IDThis, 10);
				valid=valid&&VaildHelper.checkIsValidID(IDThis, 10);
				if(valid){
					PaymentBill aPay=new PaymentBill(IDThis,TimeHelper.String2Array(payDate.getText()),
						Double.parseDouble(money.getText()),payer.getText(),item.getText(),remarks.getText());
					list.add(aPay);
					removeTable();
					buildTable(list);
				}else{
					TimePanel.makeWords("请检查您的输入是否正确！");
				}
			}
		});
		button.setBounds(800, 170, 40, 40);
		this.add(button);
		
		NButton push = new NButton("ok");
		push.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(list!=null){
					PayController payController=new PayController();	
					boolean sucess=payController.addPaymentBill(list);		
					if(sucess){
						payDate.setText("");
						money.setText("");
						thisID.setText("");
						payer.setText("");
						item.setText("");
						remarks.setText("");
						list=new ArrayList<PaymentBill>();
						removeTable();
						TimePanel.makeWords("付款单创建成功！");
					}else{
						TimePanel.makeWords("请检查您的输入是否正确！");
					}
				}
			}
		});
		push.setBounds(800, 550, 40, 40);
		this.add(push);
		
	}
	public void buildTable(ArrayList<PaymentBill> list){
		int size=list.size();
		Object[][] tableData=new Object[size][6];
		for(int i=0;i<size;i++){
			PaymentBill mess=list.get(i);
			tableData[i]=new Object[]{mess.ID,TimeHelper.Array2String(mess.date),
					mess.payer,mess.money,mess.type,mess.remarks};
		}
		Object[] columnTitle = {"付款单号","付款日期","付款人","付款金额","付款条目","付款备注"};  
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


}
