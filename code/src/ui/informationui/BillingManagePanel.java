package ui.informationui;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import bill.ReceiveMoneyBill;
import bl.money.Impl.BillingManagementController;
import ui.NSwing.NLabel;
import ui.NSwing.NTextField;

public class BillingManagePanel extends JPanel{
	private JFrame frame_money;
	private NTextField textField_year;
	private JTable table_receive_voucher;
	private NTextField textField_month;
	private NTextField textField_day;
	NLabel city;
	JComboBox usercity;
	NLabel bussiness;
	JScrollPane scrollPane;
	JTable table;
	public BillingManagePanel() {
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
		
		NLabel textPane_9 = new NLabel();
		textPane_9.setText("查看日期");
		textPane_9.setBounds(120, 50, 80, 30);
		this.add(textPane_9);
		
		textField_year = new NTextField();
		textField_year.setBounds(220, 50, 120, 30);
		this.add(textField_year);
		textField_year.setColumns(10);
		
		city=new NLabel();
		city.setFont(new Font("微软雅黑",Font.BOLD,16));
		city.setBounds(480,50,40,30);
		city.setText("城市");
		this.add(city);
		
		usercity=new JComboBox();
		usercity.setFont(new Font("微软雅黑",Font.BOLD,16));
		usercity.addItem("南京");
		usercity.addItem("北京");
		usercity.addItem("上海");
		usercity.addItem("广州");
		usercity.setBounds(560,50,80,30);
		this.add(usercity);
		
		bussiness=new NLabel();
		bussiness.setFont(new Font("微软雅黑",Font.BOLD,16));
		bussiness.setBounds(120,110,40,30);
		bussiness.setText("营业厅");
		this.add(bussiness);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {" "}));
		comboBox.setBounds(220, 110, 120, 30);
		this.add(comboBox);
		
		//查询收款单的事件监听
		JButton button_3 = new JButton("查询");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] time={textField_year.getText(),textField_month.getText(),textField_day.getText()};
				BillingManagementController bmc=new BillingManagementController();
				ReceiveMoneyBill[] bills=bmc.getBills(time,(String) comboBox.getSelectedItem());
				if(bills==null){
					
				}else{
					for(int i=0;i<bills.length;i++){
						ReceiveMoneyBill bill=bills[i];
					    table_receive_voucher.setValueAt(bill.date[0]+bill.date[1]+bill.date[2], i, 0);
					    table_receive_voucher.setValueAt(bill.ID, i, 1);
					    table_receive_voucher.setValueAt(bill.transactor, i, 2);
					    table_receive_voucher.setValueAt(bill.transactor, i, 3);
					    table_receive_voucher.setValueAt(bill.list, i, 4);
					    table_receive_voucher.setValueAt(bill.money, i, 5);
					    table_receive_voucher.setValueAt(bill.bussinessHallCode, i, 6);
					}
				}
					
			}
		});
		button_3.setBounds(649, 93, 93, 23);
		this.add(button_3);
	}
	
	
	public void buildTable(ArrayList<String> list){

		int size=list.size();
		Object[][] tableData=new Object[size][4];
		for(int i=0;i<size;i++){
			String mess=list.get(i);
			/*tableData[i]=new Object[]{bill.ID,mess,bill.name,
					bill.date[0]+bill.date[1]+bill.date[2]};*/
		}
		Object[] columnTitle = {"收款日期", "收款单位", "收款人", "收款方", "收款金额", "收款地点"};  
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
