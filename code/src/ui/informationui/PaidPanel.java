package ui.informationui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import bill.ReceiveMoneyBill;
import bill.ReceiveMoneyBill;
import bl.money.Impl.PayController;
import tools.TimeHelper;
import tools.VaildHelper;

public class PaidPanel extends JPanel {
	private NTextField payDate;
	private NTextField money;
	private NTextField billID;
	private NTextField payer;
	private NTextField remarks;
	NLabel ID;
	NTextField thisID;
	JScrollPane scrollPane;
	JComboBox accountNum;
	JTable table;
	ArrayList<ReceiveMoneyBill> list;
	
	public PaidPanel() {
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);

		list=new ArrayList<ReceiveMoneyBill>();
		
		NLabel textPane = new NLabel();
		textPane.setText("收款日期");
		textPane.setBounds(120, 50, 80, 30);
		this.add(textPane);
		
		payDate = new NTextField();
		payDate.setBounds(220, 50, 160, 30);
		this.add(payDate);
		payDate.setColumns(10);
		
		NLabel textPane_4 = new NLabel();
		textPane_4.setText("收款金额");
		textPane_4.setBounds(400, 50, 80, 30);
		this.add(textPane_4);
		
		money = new NTextField();
		money.setBounds(500, 50, 80, 30);
		this.add(money);
		money.setColumns(10);
		
		NLabel textPane_5 = new NLabel();
		textPane_5.setText("收款单号");
		textPane_5.setBounds(600,50, 60, 30);
		this.add(textPane_5);
		
		billID = new NTextField();
		billID.setBounds(680, 50, 200, 30);
		this.add(billID);
		billID.setColumns(10);
		
		
		NLabel textPane_7 = new NLabel();
		textPane_7.setText("收款快递员");
		textPane_7.setBounds(400, 110, 80, 30);
		this.add(textPane_7);
		
		payer = new NTextField();
		payer.setBounds(500, 110, 80, 30);
		this.add(payer);
		payer.setColumns(10);
		
		ID= new NLabel();
		ID.setText("订单号");
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
					/*ReceiveMoneyBill aPay=new ReceiveMoneyBill(IDThis,TimeHelper.String2Array(payDate.getText()),
						Double.parseDouble(money.getText()),payer.getText(),item.getText(),remarks.getText());*/
					/*list.add(aPay);
					removeTable();
					buildTable(list);*/
				}else{
					TimePanel.makeWords("请检查您的输入是否正确！");
				}
			}
		});
		button.setBounds(800, 150, 40, 40);
		this.add(button);
		
		NButton push = new NButton("push");
		push.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*if(list!=null){
					PayController payController=new PayController();	
					boolean sucess=payController.addReceiveMoneyBill(list);		
					if(sucess){
						payDate.setText("");
						money.setText("");
						thisID.setText("");
						payer.setText("");
						item.setText("");
						remarks.setText("");
						list=new ArrayList<ReceiveMoneyBill>();
						removeTable();
						TimePanel.makeWords("付款单创建成功！");
					}else{
						TimePanel.makeWords("请检查您的输入是否正确！");
					}
				}*/
			}
		});
		push.setBounds(800, 550, 40, 40);
		this.add(push);
		
	}
	public void buildTable(ArrayList<ReceiveMoneyBill> list){
		int size=list.size();
		Object[][] tableData=new Object[size][4];
		for(int i=0;i<size;i++){
			ReceiveMoneyBill mess=list.get(i);
			tableData[i]=new Object[]{mess.ID,TimeHelper.adjustTime(mess.date),
					mess.transactor,mess.money};
		}
		Object[] columnTitle = {"收款单编号","收款日期","收款快递员","收款金额"};  
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
