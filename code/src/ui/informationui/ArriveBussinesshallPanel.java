package ui.informationui;

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
import javax.swing.table.DefaultTableModel;

import bill.ArrivementBill_Shop;
import bl.receivement.Impl.DistributionController;
import bl.receivement.Service.DistributionBLService;
import ui.NSwing.NTable;
import ui.NSwing.NTextField;

public class ArriveBussinesshallPanel extends JPanel{
	private NTextField textField_year;
	private NTextField textField_departure;
	private NTextField textField_order_number;
	private NTable table_arrivalOrder;
	private NTextField textField_month;
	private NTextField textField_day;
	
	public ArriveBussinesshallPanel() {
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
		
		
		JLabel textPane_10 = new JLabel();
		textPane_10.setText("出发地");
		textPane_10.setBounds(150, 89, 44, 30);
		this.add(textPane_10);
		
		textField_departure = new NTextField();
		textField_departure.setBounds(290, 89, 120, 30);
		this.add(textField_departure);
		textField_departure.setColumns(10);
		
		JLabel textPane_11 = new JLabel();
		textPane_11.setText("订单编号");
		textPane_11.setBounds(467, 132, 54, 30);
		this.add(textPane_11);
		
		textField_order_number = new NTextField();
		textField_order_number.setBounds(540, 132, 126, 30);
		this.add(textField_order_number);
		textField_order_number.setColumns(10);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"货物到达状态", "完整", "破损"}));
		comboBox.setBounds(540, 58, 126, 30);
		this.add(comboBox);
		//添加营业厅到达单的事件监听
		JButton button_4 = new JButton("添加");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table_arrivalOrder.getRowCount();i++){
					if(table_arrivalOrder.getValueAt(i, 0)==null&&table_arrivalOrder.getValueAt(i, 1)==null&&table_arrivalOrder.getValueAt(i, 2)==null&&table_arrivalOrder.getValueAt(i, 3)==null){
				          table_arrivalOrder.setValueAt(textField_order_number.getText(), i, 0);
				          table_arrivalOrder.setValueAt(textField_year.getText()+textField_month.getText()+textField_day.getText(), i, 1);
				          table_arrivalOrder.setValueAt(textField_departure.getText(), i, 2);
				          table_arrivalOrder.setValueAt(comboBox.getSelectedItem(), i, 3);
				          break;
					}
				}
			}
		});
		button_4.setBounds(708, 130, 93, 23);
		this.add(button_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(150, 190, 700, 325);
		this.add(scrollPane);
		
	
		
		//撤消营业厅到达单table中的一行的事件监听
		JButton button_5 = new JButton("撤消");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_arrivalOrder.getRowCount()-1;i>=0;i--){
					if(table_arrivalOrder.getValueAt(i, 0)!=null||table_arrivalOrder.getValueAt(i, 1)!=null||table_arrivalOrder.getValueAt(i, 2)!=null||table_arrivalOrder.getValueAt(i, 3)!=null){
						table_arrivalOrder.setValueAt(null, i, 0);
						table_arrivalOrder.setValueAt(null, i, 1);
						table_arrivalOrder.setValueAt(null, i, 2);
						table_arrivalOrder.setValueAt(null, i, 3);
						break;
					}
				}
			}
		});
		button_5.setBounds(259, 528, 93, 23);
		this.add(button_5);
		
		//提交营业厅到达单的事件监听
		JButton button_6 = new JButton("提交");
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<ArrivementBill_Shop> arrivement = null;
				ArrivementBill_Shop ArrivementBill_Shop = new ArrivementBill_Shop();
				for(int i=0;i<table_arrivalOrder.getRowCount();i++){
					ArrivementBill_Shop.ID=(String) table_arrivalOrder.getValueAt(i, 0);
					ArrivementBill_Shop.date = (String[]) table_arrivalOrder.getValueAt(i, 1);
					ArrivementBill_Shop.placeOfDeparture = (String) table_arrivalOrder.getValueAt(i, 2);
				}
				arrivement.add(ArrivementBill_Shop);
				DistributionBLService distribution=new DistributionController();
				boolean istrue=distribution.receive(ArrivementBill_Shop);
				if(istrue=true){
					for(int i=0;i<table_arrivalOrder.getRowCount();i++){
						table_arrivalOrder.setValueAt(null, i, 0);
						table_arrivalOrder.setValueAt(null, i, 1);
						table_arrivalOrder.setValueAt(null, i, 2);
						table_arrivalOrder.setValueAt(null, i, 3);
					}
		
				}else{
					
				}
			}
		});
		button_6.setBounds(708, 528, 93, 23);
		this.add(button_6);
		
	}



}
