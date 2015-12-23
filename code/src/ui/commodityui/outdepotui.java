package ui.commodityui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import bill.StockBill_Out;
import bill.StockBill_Out.Info;
import bl.commoditybl.Impl.OutDepotController;
import bl.commoditybl.Service.OutDepotBLService;

public class outdepotui extends JDesktopPane{
	
	

	public outdepotui() {
		initialize();
	}
	
	private void initialize() {
		
		this.setBackground(Color.WHITE);
		
		
		JLabel labelofordernumber = new JLabel("订单号");
		labelofordernumber.setBounds(172, 56, 54, 15);
		this.add(labelofordernumber);
		
		JTextField textFieldofordernumber = new JTextField();
		textFieldofordernumber.setBounds(236, 53, 93, 21);
		this.add(textFieldofordernumber);
		textFieldofordernumber.setColumns(10);
		
		JLabel labelofdate = new JLabel("出库日期");
		labelofdate.setBounds(370, 56, 54, 15);
		this.add(labelofdate);
		
		JTextField textFieldofyear = new JTextField();
		textFieldofyear.setBounds(434, 53, 34, 21);
		this.add(textFieldofyear);
		textFieldofyear.setColumns(10);
		
		JLabel labelofdestination = new JLabel("目的地");
		labelofdestination.setBounds(538, 101, 54, 15);
		this.add(labelofdestination);
		
		JTextField textFieldofdestination = new JTextField();
		textFieldofdestination.setBounds(603, 98, 221, 21);
		this.add(textFieldofdestination);
		textFieldofdestination.setColumns(10);
		
		JLabel labelofshipment = new JLabel("装运形式");
		labelofshipment.setBounds(172, 101, 54, 15);
		this.add(labelofshipment);
		
		JComboBox comboBoxofshipment = new JComboBox();
		comboBoxofshipment.setModel(new DefaultComboBoxModel(new String[] {"\u98DE\u673A", "\u706B\u8F66", "\u6C7D\u8F66"}));
		comboBoxofshipment.setBounds(236, 98, 59, 21);
		this.add(comboBoxofshipment);
		
		JLabel labeloftransport = new JLabel("货运编号");
		labeloftransport.setBounds(370, 101, 54, 15);
		this.add(labeloftransport);
		
		JTextField textFieldoftransport = new JTextField();
		textFieldoftransport.setBounds(434, 98, 66, 21);
		this.add(textFieldoftransport);
		textFieldoftransport.setColumns(10);
		
		/*
		 * 出库确认
		 */
		JButton buttonofack = new JButton("确认");
		buttonofack.setBounds(731, 149, 93, 23);
		this.add(buttonofack);
		JTable tableofoutdepot = new JTable();
		JTextField textFieldofmonth = new JTextField();
		JTextField textFieldofday = new JTextField();
		buttonofack.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				
				for(int i=0;i<tableofoutdepot.getRowCount();i++){
					
					if(tableofoutdepot.getValueAt(i, 0)==null&&tableofoutdepot.getValueAt(i, 1)==null&&tableofoutdepot.getValueAt(i, 2)==null&&tableofoutdepot.getValueAt(i, 3)==null){
								String month=textFieldofmonth.getText();
								String day=textFieldofday.getText();
								if(month.length()==1){
									month="0"+month;
								}
								if(day.length()==1){
									day="0"+day;
								}
								String date=textFieldofyear.getText()+month+day;
						tableofoutdepot.setValueAt(textFieldofordernumber.getText(), i, 0);
						tableofoutdepot.setValueAt(date, i, 1);
						tableofoutdepot.setValueAt(comboBoxofshipment.getSelectedItem(), i, 2);
						tableofoutdepot.setValueAt(textFieldoftransport.getText(), i, 3);
						tableofoutdepot.setValueAt(textFieldofdestination.getText(), i, 4);
						textFieldofyear.setText(null);
						textFieldofmonth.setText(null);
						textFieldofday.setText(null);
						textFieldofordernumber.setText(null);
						comboBoxofshipment.setSelectedIndex(0);
						textFieldoftransport.setText(null);
						textFieldofdestination.setText(null);
						break;
					}
				}
			}
		});
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(172, 231, 652, 280);
		this.add(scrollPane_1);
		
		
		tableofoutdepot.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"订单号", "出库日期", "装运形式", "货运编号", "目的地"
			}
		));
		scrollPane_1.setViewportView(tableofoutdepot);
		
		JLabel label_8 = new JLabel();
		label_8.setBounds(282, 0, 436, 21);
		this.add(label_8);
		
		
		/*
		 * 出库提交
		 */
		JButton buttonofsubmit = new JButton("提交");
		buttonofsubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StockBill_Out stock_out= new StockBill_Out();
				OutDepotBLService outdepot= new OutDepotController();
				for(int i=0;i<tableofoutdepot.getRowCount();i++){
					StockBill_Out.Info element =stock_out.new Info();
					element.ID=(String) tableofoutdepot.getValueAt(i, 0);
					element.date[0]= tableofoutdepot.getValueAt(i, 1).toString().substring(0, 3);
					element.date[1]= tableofoutdepot.getValueAt(i, 1).toString().substring(4, 5);
					element.date[2]= tableofoutdepot.getValueAt(i, 1).toString().substring(6, 7);
					element.form= tableofoutdepot.getValueAt(i, 2).toString();
				    element.ListID=tableofoutdepot.getValueAt(i, 3).toString();
				    element.destination=tableofoutdepot.getValueAt(i, 4).toString();
					stock_out.list.set(i, element);
				}
				boolean istrue=outdepot.outDepot(stock_out);
				if(istrue==false){
					
				}else{
					for(int i=tableofoutdepot.getRowCount()-1;i>=0;i--){	
							tableofoutdepot.setValueAt(null, i, 0);
							tableofoutdepot.setValueAt(null, i, 1);
							tableofoutdepot.setValueAt(null, i, 2);
							tableofoutdepot.setValueAt(null, i, 3);
							tableofoutdepot.setValueAt(null, i, 4);
					}
				}
			}
		});
		buttonofsubmit.setBounds(816, 537, 93, 23);
		this.add(buttonofsubmit);
		
		JLabel labelofyear = new JLabel("年");
		labelofyear.setBounds(478, 56, 54, 15);
		this.add(labelofyear);
		
		
		textFieldofmonth.setBounds(499, 53, 34, 21);
		this.add(textFieldofmonth);
		textFieldofmonth.setColumns(10);
		
		JLabel labelofmonth = new JLabel("月");
		labelofmonth.setBounds(542, 56, 54, 15);
		this.add(labelofmonth);
		
		
		textFieldofday.setBounds(565, 53, 34, 21);
		this.add(textFieldofday);
		textFieldofday.setColumns(10);
		
		JLabel labelofday = new JLabel("日");
		labelofday.setBounds(609, 56, 54, 15);
		this.add(labelofday);
		
		/*
		 * 出库撤销
		 */
		JButton buttonofcancel = new JButton("撤销");
		buttonofcancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=tableofoutdepot.getRowCount()-1;i>=0;i--){
					if(tableofoutdepot.getValueAt(i, 0)!=null&&tableofoutdepot.getValueAt(i, 1)!=null&&tableofoutdepot.getValueAt(i, 2)!=null&&tableofoutdepot.getValueAt(i, 3)!=null){
						tableofoutdepot.setValueAt(null, i, 0);
						tableofoutdepot.setValueAt(null, i, 1);
						tableofoutdepot.setValueAt(null, i, 2);
						tableofoutdepot.setValueAt(null, i, 3);
						tableofoutdepot.setValueAt(null, i, 4);
						break;
					}
				}
			}
		});
		buttonofcancel.setBounds(172, 537, 93, 23);
		this.add(buttonofcancel);
	
	
	new Thread() {        
		public void run() {            
			try {                
				while (true) {                    
					
					SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
					label_8.setText(df.format(new Date()));//显示当前时间
					Thread.sleep(1000);//暂停一秒                
					}            
				} catch (Exception e) {            
					
				}        
			}    
		}.start();
	}
}
