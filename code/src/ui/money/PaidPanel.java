package ui.money;

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
import bl.money.Impl.PaidController;
import bl.money.Impl.PayController;
import tools.TimeHelper;
import tools.VaildHelper;
import ui.NSwing.NButton;
import ui.NSwing.NLabel;
import ui.NSwing.NTextField;
import ui.NSwing.TimePanel;

public class PaidPanel extends JPanel {
	private NTextField payDate;
	private NTextField money;
	private NTextField billID;
	private NTextField payer;
	NLabel ID;
	NTextField thisID;
	JScrollPane scrollPane;
	JTable table;
	ReceiveMoneyBill list;
	
	public PaidPanel() {
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
		
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
		textPane_4.setBounds(500, 50, 80, 30);
		this.add(textPane_4);
		
		money = new NTextField();
		money.setBounds(600, 50, 80, 30);
		this.add(money);
		money.setColumns(10);
		
		NLabel textPane_5 = new NLabel();
		textPane_5.setText("收款单号");
		textPane_5.setBounds(120,110, 80, 30);
		this.add(textPane_5);
		
		billID = new NTextField();
		billID.setBounds(220, 110, 160, 30);
		this.add(billID);
		billID.setColumns(10);
		
		
		NLabel textPane_7 = new NLabel();
		textPane_7.setText("收款快递员");
		textPane_7.setBounds(500, 110, 80, 30);
		this.add(textPane_7);
		
		payer = new NTextField();
		payer.setBounds(600, 110, 80, 30);
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
		

		NButton button = new NButton("add");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(list==null){
					boolean valid=TimeHelper.isValidTime(payDate.getText());
					String moneyThis=money.getText();
					valid=valid&&VaildHelper.checkIsValidID(moneyThis);
					String IDThis=billID.getText();
					IDThis=TimeHelper.adjustTime(IDThis, 10);
					valid=valid&&VaildHelper.checkIsValidID(IDThis, 10);
					if(valid){
						list=new ReceiveMoneyBill(billID.getText(),TimeHelper.String2Array(payDate.getText()),
							Double.parseDouble(money.getText()),payer.getText(),"营业厅代号");
						list.list.add(thisID.getText());
						removeTable();
						buildTable(list.list);
					}else{
						TimePanel.makeWords("请检查您的输入是否正确！");
					}
				}else if(!billID.getText().equals(list.ID)){
					System.out.println(billID.getText());
					System.out.println(list.ID);
						TimePanel.makeWords("系统不允许一次操作两张收款单！");
				}else{
					list.list.add(thisID.getText());
					removeTable();
					buildTable(list.list);
				}
			}
		});
		button.setBounds(800, 150, 40, 40);
		this.add(button);
		
		NButton push = new NButton("ok");
		push.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(list!=null){
					PaidController paidController=new PaidController();	
					
					ArrayList<ReceiveMoneyBill> bills=new ArrayList<ReceiveMoneyBill>();
					bills.add(list);
					boolean sucess=paidController.addPaidmentBill(bills);		
					if(sucess){
						payDate.setText("");
						money.setText("");
						thisID.setText("");
						payer.setText("");
						billID.setText("");
						list=null;
						removeTable();
						TimePanel.makeWords("收款单创建成功！");
					}else{
						TimePanel.makeWords("请检查您的输入！");
					}
				}
			}
		});
		push.setBounds(800, 550, 40, 40);
		this.add(push);
		
	}
	public void buildTable(ArrayList<String> ids){
		int size=ids.size();
		Object[][] tableData=new Object[size][4];
		for(int i=0;i<size;i++){
			String mess=ids.get(i);
			tableData[i]=new Object[]{list.ID,TimeHelper.Array2String(list.date),list.transactor,list.money};
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
