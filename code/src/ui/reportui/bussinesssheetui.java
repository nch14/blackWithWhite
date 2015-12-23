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
	
	JTable tableofbussinesssheet;
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
		
		JLabel labelofstartdate = new JLabel("开始日期");
		labelofstartdate.setBounds(190, 62, 54, 15);
		this.add(labelofstartdate);
		
		JLabel labelofenddate = new JLabel("结束日期");
		labelofenddate.setBounds(190, 112, 54, 15);
		this.add(labelofenddate);
		
		JTextField textFieldofstartyear = new JTextField();
		textFieldofstartyear.setBounds(250, 59, 36, 21);
		this.add(textFieldofstartyear);
		textFieldofstartyear.setColumns(10);
		
		JTextField textFieldofendyear = new JTextField();
		textFieldofendyear.setColumns(10);
		textFieldofendyear.setBounds(250, 109, 36, 21);
		this.add(textFieldofendyear);
		
		JLabel labelofstartyear = new JLabel("年");
		labelofstartyear.setBounds(296, 62, 54, 15);
		this.add(labelofstartyear);
		
		JLabel labelofendyear = new JLabel("年");
		labelofendyear.setBounds(296, 112, 54, 15);
		this.add(labelofendyear);
		
		JTextField textFieldofstartmonth = new JTextField();
		textFieldofstartmonth.setBounds(317, 109, 23, 21);
		this.add(textFieldofstartmonth);
		textFieldofstartmonth.setColumns(10);
		
		JTextField textFieldofendmonth = new JTextField();
		textFieldofendmonth.setColumns(10);
		textFieldofendmonth.setBounds(317, 59, 23, 21);
		this.add(textFieldofendmonth);
		
		JTextField textFieldofstartday = new JTextField();
		textFieldofstartday.setColumns(10);
		textFieldofstartday.setBounds(371, 59, 23, 21);
		this.add(textFieldofstartday);
		
		JTextField textFieldofendday = new JTextField();
		textFieldofendday.setColumns(10);
		textFieldofendday.setBounds(371, 109, 23, 21);
		this.add(textFieldofendday);
		
		JLabel labelofstartmonth = new JLabel("月");
		labelofstartmonth.setBounds(350, 62, 54, 15);
		this.add(labelofstartmonth);
		
		JLabel labelofendmonth = new JLabel("月");
		labelofendmonth.setBounds(350, 112, 54, 15);
		this.add(labelofendmonth);
		
		JLabel labelofstartday = new JLabel("日");
		labelofstartday.setBounds(404, 62, 54, 15);
		this.add(labelofstartday);
		
		JLabel labelofendday = new JLabel("日");
		labelofendday.setBounds(404, 112, 54, 15);
		this.add(labelofendday);
		
		/*
		 * 查看经营情况表
		 */
		JButton buttonofquery = new JButton("查询");
		buttonofquery.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String start = null;
				String end = null;
				if(textFieldofstartyear.getText().length()!=4&&textFieldofendmonth.getText().length()!=4){
					
				}else{
					start+=textFieldofstartyear.getText();
					end+=textFieldofendmonth.getText();
					if(textFieldofendyear.getText().length()==2){
						start+=textFieldofendyear.getText();
					}else if(textFieldofendyear.getText().length()==1){
						start+="0"+textFieldofendyear.getText();
					}else{
						
					}
					if(textFieldofstartmonth.getText().length()==2){
						start+=textFieldofstartmonth.getText();
					}else if(textFieldofstartmonth.getText().length()==1){
						start+="0"+textFieldofstartmonth.getText();
					}else{
						
					}
					if(textFieldofstartday.getText().length()==2){
						end+=textFieldofstartday.getText();
					}else if(textFieldofstartday.getText().length()==1){
						end+="0"+textFieldofstartday.getText();
					}else{
						
					}
					if(textFieldofendday.getText().length()==2){
						end+=textFieldofendday.getText();
					}else if(textFieldofendday.getText().length()==1){
						end+="0"+textFieldofendday.getText();
					}else{
						
					}
				}
				BussinessSheetVO bussinessvo;
				bussinessvo=bussinesssheet.show(start, end);
				if(bussinessvo.equals(null)){
					
				}else{
					for(int i=0;i<tableofbussinesssheet.getRowCount();i++){
						tableofbussinesssheet.setValueAt(bussinessvo.paid.get(i).ID, i, 0);
						tableofbussinesssheet.setValueAt(bussinessvo.paid.get(i).getDate(), i, 1);
						tableofbussinesssheet.setValueAt(bussinessvo.paid.get(i).transactor, i, 2);
						tableofbussinesssheet.setValueAt(bussinessvo.paid.get(i).money, i, 3);
						tableofbussinesssheet.setValueAt(bussinessvo.paid.get(i).bussinessHallCode, i, 4);
						tableofbussinesssheet.setValueAt(bussinessvo.pay.get(i).ID, i, 5);
						tableofbussinesssheet.setValueAt(bussinessvo.pay.get(i).getDate(), i, 6);
						tableofbussinesssheet.setValueAt(bussinessvo.pay.get(i).payer, i, 7);
						tableofbussinesssheet.setValueAt(bussinessvo.pay.get(i).money, i, 8);
						tableofbussinesssheet.setValueAt(bussinessvo.pay.get(i).type, i, 9);
					}
				}
			}
		});
		buttonofquery.setBounds(564, 161, 93, 23);
		this.add(buttonofquery);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(103, 200, 670, 264);
		this.add(scrollPane_6);
		
		tableofbussinesssheet = new JTable();
		tableofbussinesssheet.setModel(new DefaultTableModel(
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
				"收款单编号", "收款日期", "收款人", "收款金额", "收款条目", "付款单编号", "付款日期", "付款人", "付款金额", "付款条目"
			}
		));
		tableofbussinesssheet.getColumnModel().getColumn(0).setPreferredWidth(85);
		tableofbussinesssheet.getColumnModel().getColumn(5).setPreferredWidth(85);
		scrollPane_6.setViewportView(tableofbussinesssheet);
		
		/*
		 * 导出经营情况表
		 */
		JButton buttonofexport = new JButton("导出");
		buttonofexport.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				boolean istrue=bussinesssheet.export();
				if(istrue==true){
					for(int i=0;i<tableofbussinesssheet.getRowCount();i++){
						tableofbussinesssheet.setValueAt(null, i, 0);
						tableofbussinesssheet.setValueAt(null, i, 1);
						tableofbussinesssheet.setValueAt(null, i, 2);
						tableofbussinesssheet.setValueAt(null, i, 3);
						tableofbussinesssheet.setValueAt(null, i, 4);
						tableofbussinesssheet.setValueAt(null, i, 5);
						tableofbussinesssheet.setValueAt(null, i, 6);
						tableofbussinesssheet.setValueAt(null, i, 7);
						tableofbussinesssheet.setValueAt(null, i, 8);
						tableofbussinesssheet.setValueAt(null, i, 9);
					}
				}else{
					
				}
			}
		});
		buttonofexport.setBounds(733, 474, 93, 23);
		this.add(buttonofexport);
		
	}
}
