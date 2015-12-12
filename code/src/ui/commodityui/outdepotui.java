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
		
		
		JLabel label_11 = new JLabel("\u8BA2\u5355\u53F7");
		label_11.setBounds(172, 56, 54, 15);
		this.add(label_11);
		
		JTextField textField_3 = new JTextField();
		textField_3.setBounds(236, 53, 93, 21);
		this.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_4 = new JLabel("\u51FA\u5E93\u65E5\u671F");
		label_4.setBounds(370, 56, 54, 15);
		this.add(label_4);
		
		JTextField textField_4 = new JTextField();
		textField_4.setBounds(434, 53, 34, 21);
		this.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_5 = new JLabel("\u76EE\u7684\u5730");
		label_5.setBounds(538, 101, 54, 15);
		this.add(label_5);
		
		JTextField textField_5 = new JTextField();
		textField_5.setBounds(603, 98, 221, 21);
		this.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel label_6 = new JLabel("\u88C5\u8FD0\u5F62\u5F0F");
		label_6.setBounds(172, 101, 54, 15);
		this.add(label_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u98DE\u673A", "\u706B\u8F66", "\u6C7D\u8F66"}));
		comboBox.setBounds(236, 98, 59, 21);
		this.add(comboBox);
		
		JLabel label_7 = new JLabel("\u8D27\u8FD0\u7F16\u53F7");
		label_7.setBounds(370, 101, 54, 15);
		this.add(label_7);
		
		JTextField textField_6 = new JTextField();
		textField_6.setBounds(434, 98, 66, 21);
		this.add(textField_6);
		textField_6.setColumns(10);
		
		/*
		 * 出库确认
		 */
		JButton button_2 = new JButton("\u786E\u8BA4");
		button_2.setBounds(731, 149, 93, 23);
		this.add(button_2);
		JTable table_1 = new JTable();
		JTextField textField_26 = new JTextField();
		JTextField textField_27 = new JTextField();
		button_2.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				
				for(int i=0;i<table_1.getRowCount();i++){
					
					if(table_1.getValueAt(i, 0)==null&&table_1.getValueAt(i, 1)==null&&table_1.getValueAt(i, 2)==null&&table_1.getValueAt(i, 3)==null){
								String month=textField_26.getText();
								String day=textField_27.getText();
								if(month.length()==1){
									month="0"+month;
								}
								if(day.length()==1){
									day="0"+day;
								}
								String date=textField_4.getText()+month+day;
						table_1.setValueAt(textField_3.getText(), i, 0);
						table_1.setValueAt(date, i, 1);
						table_1.setValueAt(comboBox.getSelectedItem(), i, 2);
						table_1.setValueAt(textField_6.getText(), i, 3);
						table_1.setValueAt(textField_5.getText(), i, 4);
						textField_4.setText(null);
						textField_26.setText(null);
						textField_27.setText(null);
						textField_3.setText(null);
						comboBox.setSelectedIndex(0);
						textField_6.setText(null);
						textField_5.setText(null);
						break;
					}
				}
			}
		});
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(172, 231, 652, 280);
		this.add(scrollPane_1);
		
		
		table_1.setModel(new DefaultTableModel(
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
				"\u8BA2\u5355\u53F7", "\u51FA\u5E93\u65E5\u671F", "\u88C5\u8FD0\u5F62\u5F0F", "\u8D27\u8FD0\u7F16\u53F7", "\u76EE\u7684\u5730"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JLabel label_8 = new JLabel();
		label_8.setBounds(282, 0, 436, 21);
		this.add(label_8);
		
		
		/*
		 * 出库提交
		 */
		JButton button_3 = new JButton("\u63D0\u4EA4");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StockBill_Out stock_out= new StockBill_Out();
				OutDepotBLService outdepot= new OutDepotController();
				for(int i=0;i<table_1.getRowCount();i++){
					StockBill_Out.Info element =stock_out.new Info();
					element.ID=(String) table_1.getValueAt(i, 0);
					element.date[0]= table_1.getValueAt(i, 1).toString().substring(0, 3);
					element.date[1]= table_1.getValueAt(i, 1).toString().substring(4, 5);
					element.date[2]= table_1.getValueAt(i, 1).toString().substring(6, 7);
					element.form= table_1.getValueAt(i, 2).toString();
				    element.ListID=table_1.getValueAt(i, 3).toString();
				    element.destination=table_1.getValueAt(i, 4).toString();
					stock_out.list.set(i, element);
				}
				boolean istrue=outdepot.outDepot(stock_out);
				if(istrue==false){
					
				}else{
					for(int i=table_1.getRowCount()-1;i>=0;i--){	
							table_1.setValueAt(null, i, 0);
							table_1.setValueAt(null, i, 1);
							table_1.setValueAt(null, i, 2);
							table_1.setValueAt(null, i, 3);
							table_1.setValueAt(null, i, 4);
					}
				}
			}
		});
		button_3.setBounds(816, 537, 93, 23);
		this.add(button_3);
		
		JLabel label_24 = new JLabel("\u5E74");
		label_24.setBounds(478, 56, 54, 15);
		this.add(label_24);
		
		
		textField_26.setBounds(499, 53, 34, 21);
		this.add(textField_26);
		textField_26.setColumns(10);
		
		JLabel label_25 = new JLabel("\u6708");
		label_25.setBounds(542, 56, 54, 15);
		this.add(label_25);
		
		
		textField_27.setBounds(565, 53, 34, 21);
		this.add(textField_27);
		textField_27.setColumns(10);
		
		JLabel label_26 = new JLabel("\u65E5");
		label_26.setBounds(609, 56, 54, 15);
		this.add(label_26);
		
		/*
		 * 出库撤销
		 */
		JButton button_10 = new JButton("\u64A4\u9500");
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_1.getRowCount()-1;i>=0;i--){
					if(table_1.getValueAt(i, 0)!=null&&table_1.getValueAt(i, 1)!=null&&table_1.getValueAt(i, 2)!=null&&table_1.getValueAt(i, 3)!=null){
						table_1.setValueAt(null, i, 0);
						table_1.setValueAt(null, i, 1);
						table_1.setValueAt(null, i, 2);
						table_1.setValueAt(null, i, 3);
						table_1.setValueAt(null, i, 4);
						break;
					}
				}
			}
		});
		button_10.setBounds(172, 537, 93, 23);
		this.add(button_10);
	
	
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
