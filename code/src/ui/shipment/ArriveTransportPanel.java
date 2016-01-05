package ui.shipment;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import bill.ArrivementBill.struct;
import bill.ArrivementBill_Center;
import bl.shipment.Impl.TransportAndReceiveController;
import bill.ArrivementBill_Center;
import tools.TimeHelper;
import tools.VaildHelper;
import ui.NSwing.NButton;
import ui.NSwing.NLabel;
import ui.NSwing.NTable;
import ui.NSwing.NTextField;
import ui.NSwing.TimePanel;

public class ArriveTransportPanel extends JPanel{
	private NTextField textField_year;
	private NTextField textField_departure;
	private NTextField textField_order_number;
	JScrollPane scrollPane;
	NTable table;
	ArrivementBill_Center list;
	public ArriveTransportPanel() {
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
		
		JLabel labelofordernumber = new JLabel();
		labelofordernumber.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofordernumber.setText("中转中心到达单号");
		labelofordernumber.setBounds(760, 230, 180, 30);
		this.add(labelofordernumber);
		
		
		JTextField textFieldofordernumber = new JTextField();
		textFieldofordernumber.setColumns(10);
		textFieldofordernumber.setBounds(760, 260, 180, 30);
		this.add(textFieldofordernumber);
		textFieldofordernumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		
		NLabel textPane_9 = new NLabel();
		textPane_9.setText("到达日期");
		textPane_9.setBounds(120, 50, 80, 30);
		this.add(textPane_9);
		
		textField_year = new NTextField();
		textField_year.setBounds(220, 50, 120, 30);
		this.add(textField_year);
		textField_year.setColumns(10);
		
		NLabel textPane_10 = new NLabel();
		textPane_10.setText("中转中心编号");
		textPane_10.setBounds(450, 50, 100, 30);
		this.add(textPane_10);
		
		textField_departure = new NTextField();
		textField_departure.setBounds(560, 50, 120, 30);
		this.add(textField_departure);
		textField_departure.setColumns(10);
		
		NLabel textPane_11 = new NLabel();
		textPane_11.setText("订单编号");
		textPane_11.setBounds(120, 110, 80, 30);
		this.add(textPane_11);
		
		textField_order_number = new NTextField();
		textField_order_number.setBounds(220, 110, 120, 30);
		this.add(textField_order_number);
		textField_order_number.setColumns(10);
		
		
		NLabel chufadi = new NLabel();
		chufadi.setText("货物状态");
		chufadi.setBounds(450, 110,80, 30);
		this.add(chufadi);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "完整", "破损","丢失"}));
		comboBox.setBounds(560, 110, 120, 30);
		this.add(comboBox);
		//添加营业厅到达单的事件监听
		NButton add = new NButton("add");
		add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(list==null){
					String orderID=textFieldofordernumber.getText();
					String orderDate=textField_year.getText();
					String orderDepart=textField_departure.getText();
					
					boolean sucess=true;
					sucess=sucess&&VaildHelper.checkIfValidDate(orderDate);
					sucess=sucess&&VaildHelper.checkIsValidID(orderID, 10);
					
					if(sucess){
						if(VaildHelper.checkIsValidID(textField_order_number.getText(), 10)){
							list=new ArrivementBill_Center(TimeHelper.String2Array(orderDate),orderID,orderDepart);
							list.addID(textField_order_number.getText(), (String)comboBox.getSelectedItem());
							buildTable();
							repaint();
						}else{
							list=new ArrivementBill_Center(TimeHelper.String2Array(orderDate),orderID,orderDepart);
						}
					}
				}else{
					if(VaildHelper.checkIsValidID(textField_order_number.getText(), 10)){
						list.addID(textField_order_number.getText(), (String)comboBox.getSelectedItem());
						removeTable();
						buildTable();
						repaint();
					}
				}
			}
		});
		add.setBounds(720, 140, 40, 40);
		this.add(add);
		//提交营业厅到达单的事件监听
		JButton ok = new JButton("ok");
		ok.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				TransportAndReceiveController trc=new TransportAndReceiveController();
				boolean suceess=trc.submitBills(list);
				if(suceess){
					list=null;
					removeTable();
					TimePanel.makeWords("提交成功");
				}else{
					TimePanel.makeWords("提交失败");
				}
			}
		});
		ok.setBounds(708, 528, 93, 23);
		this.add(ok);
		
	}

	public void buildTable(){
		if(list!=null){
			ArrayList<String > a=list.showAllID();
			ArrayList<String > b=list.showAllState();
			int size=a.size();
			Object[][] tableData=new Object[size][5];
			for(int i=0;i<size;i++){
				tableData[i]=new Object[]{list.ID,TimeHelper.Array2String(list.date),a.get(i),list.centerID,b.get(i)};
			}
			Object[] columnTitle = {"中转中心到达单编号","到达日期", "订单编号", "中转中心编号", "货物状态"};  
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
	}
	public void removeTable(){
		if(scrollPane!=null)
			this.remove(scrollPane);
	}
}
