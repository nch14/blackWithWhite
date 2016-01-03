package ui.money;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import bill.ReceiveMoneyBill;
import bl.money.Impl.BillingManagementController;
import settings.BussinessHall;
import settings.CompanySettingsController;
import settings.TransportCenter;
import tools.TimeHelper;
import tools.VaildHelper;
import ui.NSwing.NButton;
import ui.NSwing.NLabel;
import ui.NSwing.NTextField;
import ui.informationui.TimePanel;

public class BillingManagePanel extends JPanel{
	private NTextField textField_year;
	NLabel city;
	JComboBox usercity;
	NLabel bussiness;
	NLabel totalLabel;
	NLabel totalNText;
	JScrollPane scrollPane;
	JTable table;
	NButton check;
	NButton total;
	JComboBox comboBox ;
	ArrayList<ReceiveMoneyBill> list;
	public BillingManagePanel() {
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
		
		NLabel textPane_9 = new NLabel();
		textPane_9.setText("查看日期");
		textPane_9.setBounds(120, 50, 80, 30);
		this.add(textPane_9);
		
		textField_year = new NTextField();
		textField_year.setBounds(220, 50, 160, 30);
		this.add(textField_year);
		textField_year.setColumns(10);
		
		city=new NLabel();
		city.setFont(new Font("微软雅黑",Font.BOLD,16));
		city.setBounds(540,50,40,30);
		city.setText("城市");
		this.add(city);
		
		usercity=new JComboBox();
		usercity.setFont(new Font("微软雅黑",Font.BOLD,16));
		usercity.addItem("南京");
		usercity.addItem("北京");
		usercity.addItem("上海");
		usercity.addItem("广州");
		usercity.addFocusListener(new SelectListener());
		usercity.setBounds(620,50,80,30);
		this.add(usercity);
		
		bussiness=new NLabel();
		bussiness.setFont(new Font("微软雅黑",Font.BOLD,16));
		bussiness.setBounds(120,110,60,30);
		bussiness.setText("营业厅");
		this.add(bussiness);
		
		comboBox= new JComboBox();
		comboBox.setBounds(220, 110, 160, 30);
		this.add(comboBox);
		
		check=new NButton("check");
		check.setBounds(800, 110, 40, 40);
		this.add(check);
		check.addActionListener(new CheckListener());
		
		total=new NButton("total");
		total.setBounds(800, 500, 40, 40);
		this.add(total);
		total.addActionListener(new TotalListener());
		
		totalLabel=new NLabel("合计金额");
		totalLabel.setBounds(600, 580, 80, 30);
		this.add(totalLabel);
		

	}
	
	public void showTotalMoney(String money){
		if(totalNText!=null)
			this.remove(totalNText);
		totalNText=new NLabel();
		totalNText.setText(money);
		totalNText.setBounds(700,580, 80, 30);
		this.add(totalNText);
		repaint();
	}
	public void buildTable(ArrayList<ReceiveMoneyBill> list){

		int size=list.size();
		Object[][] tableData=new Object[size][4];
		for(int i=0;i<size;i++){
			ReceiveMoneyBill mess=list.get(i);
			tableData[i]=new Object[]{TimeHelper.Array2String(mess.date),
					mess.bussinessHallCode,mess.transactor,mess.money};
		}
		Object[] columnTitle = {"收款日期", "收款单位", "收款人", "收款金额"};  
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
	class TotalListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(list!=null){
				double totalMoney=0;
				for(int i=0;i<list.size();i++){
					totalMoney+=list.get(i).money;					
				}
				showTotalMoney(""+totalMoney);
			}
		}
	}
	class CheckListener implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			String date=textField_year.getText();
			boolean result=VaildHelper.checkIsValidID(date, 8);
			String bussinessHall=(String)comboBox.getSelectedItem();
			
			BillingManagementController bmc=new BillingManagementController();
			ReceiveMoneyBill[] bills=bmc.getBills(TimeHelper.String2Array(date), bussinessHall);
			
			if(bills!=null){
				list=new ArrayList<ReceiveMoneyBill>();
				for(int i=0;i<bills.length;i++){
					list.add(bills[i]);
				}
				removeTable();
				buildTable(list);			
			}else{
				TimePanel.makeWords("查询失败");
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
				comboBox.removeAllItems();
				CompanySettingsController csc3=new CompanySettingsController();
				BussinessHall[] names3=csc3.getBussinessHalls((String)usercity.getSelectedItem());
				for(int i=0;i<names3.length;i++){
					comboBox.addItem((String)names3[i].name);
				}
				repaint();
			
		}
	}
}
		 

