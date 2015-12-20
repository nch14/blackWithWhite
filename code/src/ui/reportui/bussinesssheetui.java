package ui.reportui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import bl.report.impl.BussinessSheetController;
import bl.report.service.BussinessSheetBLService;
import vo.BussinessSheetVO;

public class bussinesssheetui extends JDesktopPane{
	
	JTable table_6;
	BussinessSheetBLService bussinesssheet = new BussinessSheetController();

	/**
	 * Create the application.
	 */
	public bussinesssheetui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBackground(Color.WHITE);
		
		JLabel label_7 = new JLabel("\u5F00\u59CB\u65E5\u671F");
		label_7.setBounds(190, 62, 54, 15);
		this.add(label_7);
		
		JLabel label_8 = new JLabel("\u7ED3\u675F\u65E5\u671F");
		label_8.setBounds(190, 112, 54, 15);
		this.add(label_8);
		
		JTextField textField_9 = new JTextField();
		textField_9.setBounds(250, 59, 36, 21);
		this.add(textField_9);
		textField_9.setColumns(10);
		
		JTextField textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(250, 109, 36, 21);
		this.add(textField_10);
		
		JLabel label_9 = new JLabel("\u5E74");
		label_9.setBounds(296, 62, 54, 15);
		this.add(label_9);
		
		JLabel label_10 = new JLabel("\u5E74");
		label_10.setBounds(296, 112, 54, 15);
		this.add(label_10);
		
		JTextField textField_11 = new JTextField();
		textField_11.setBounds(317, 109, 23, 21);
		this.add(textField_11);
		textField_11.setColumns(10);
		
		JTextField textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(317, 59, 23, 21);
		this.add(textField_12);
		
		JTextField textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(371, 59, 23, 21);
		this.add(textField_13);
		
		JTextField textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(371, 109, 23, 21);
		this.add(textField_14);
		
		JLabel label_11 = new JLabel("\u6708");
		label_11.setBounds(350, 62, 54, 15);
		this.add(label_11);
		
		JLabel label_12 = new JLabel("\u6708");
		label_12.setBounds(350, 112, 54, 15);
		this.add(label_12);
		
		JLabel label_13 = new JLabel("\u65E5");
		label_13.setBounds(404, 62, 54, 15);
		this.add(label_13);
		
		JLabel label_14 = new JLabel("\u65E5");
		label_14.setBounds(404, 112, 54, 15);
		this.add(label_14);
		
		/*
		 * 查看经营情况表
		 */
		JButton button_15 = new JButton("\u67E5\u8BE2");
		button_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String start = null;
				String end = null;
				if(textField_9.getText().length()!=4&&textField_12.getText().length()!=4){
					
				}else{
					start+=textField_9.getText();
					end+=textField_12.getText();
					if(textField_10.getText().length()==2){
						start+=textField_10.getText();
					}else if(textField_10.getText().length()==1){
						start+="0"+textField_10.getText();
					}else{
						
					}
					if(textField_11.getText().length()==2){
						start+=textField_11.getText();
					}else if(textField_11.getText().length()==1){
						start+="0"+textField_11.getText();
					}else{
						
					}
					if(textField_13.getText().length()==2){
						end+=textField_13.getText();
					}else if(textField_13.getText().length()==1){
						end+="0"+textField_13.getText();
					}else{
						
					}
					if(textField_14.getText().length()==2){
						end+=textField_14.getText();
					}else if(textField_14.getText().length()==1){
						end+="0"+textField_14.getText();
					}else{
						
					}
				}
				BussinessSheetVO bussinessvo;
				bussinessvo=bussinesssheet.show(start, end);
				if(bussinessvo.equals(null)){
					
				}else{
					for(int i=0;i<table_6.getRowCount();i++){
						table_6.setValueAt(bussinessvo.paid.get(i).ID, i, 0);
						table_6.setValueAt(bussinessvo.paid.get(i).getDate(), i, 1);
						table_6.setValueAt(bussinessvo.paid.get(i).transactor, i, 2);
						table_6.setValueAt(bussinessvo.paid.get(i).money, i, 3);
						table_6.setValueAt(bussinessvo.paid.get(i).bussinessHallCode, i, 4);
						table_6.setValueAt(bussinessvo.pay.get(i).ID, i, 5);
						table_6.setValueAt(bussinessvo.pay.get(i).getDate(), i, 6);
						table_6.setValueAt(bussinessvo.pay.get(i).payer, i, 7);
						table_6.setValueAt(bussinessvo.pay.get(i).money, i, 8);
						table_6.setValueAt(bussinessvo.pay.get(i).type, i, 9);
					}
				}
			}
		});
		button_15.setBounds(564, 161, 93, 23);
		this.add(button_15);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(103, 200, 670, 264);
		this.add(scrollPane_6);
		
		table_6 = new JTable();
		table_6.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"\u6536\u6B3E\u5355\u7F16\u53F7", "\u6536\u6B3E\u65E5\u671F", "\u6536\u6B3E\u4EBA", "\u6536\u6B3E\u91D1\u989D", "\u6536\u6B3E\u6761\u76EE", "\u4ED8\u6B3E\u5355\u7F16\u53F7", "\u4ED8\u6B3E\u65E5\u671F", "\u4ED8\u6B3E\u4EBA", "\u4ED8\u6B3E\u91D1\u989D", "\u4ED8\u6B3E\u6761\u76EE"
			}
		));
		table_6.getColumnModel().getColumn(0).setPreferredWidth(85);
		table_6.getColumnModel().getColumn(5).setPreferredWidth(85);
		scrollPane_6.setViewportView(table_6);
		
		/*
		 * 导出经营情况表
		 */
		JButton button_16 = new JButton("\u5BFC\u51FA");
		button_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				boolean istrue=bussinesssheet.export();
				if(istrue==true){
					for(int i=0;i<table_6.getRowCount();i++){
						table_6.setValueAt(null, i, 0);
						table_6.setValueAt(null, i, 1);
						table_6.setValueAt(null, i, 2);
						table_6.setValueAt(null, i, 3);
						table_6.setValueAt(null, i, 4);
						table_6.setValueAt(null, i, 5);
						table_6.setValueAt(null, i, 6);
						table_6.setValueAt(null, i, 7);
						table_6.setValueAt(null, i, 8);
						table_6.setValueAt(null, i, 9);
					}
				}else{
					
				}
			}
		});
		button_16.setBounds(733, 474, 93, 23);
		this.add(button_16);
		
	}
}
