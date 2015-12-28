package ui.reportui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import bill.PaymentBill;
import bill.ReceiveMoneyBill;
import bl.report.impl.BussinessSheetController;
import bl.report.service.BussinessSheetBLService;
import tools.TimeHelper;
import tools.VaildHelper;
import ui.informationui.TimePanel;
import vo.BussinessSheetVO;
import vo.ProfitSheetVO;
import vo.StaffVO;

public class GetBussinesssheetPanel extends JPanel {
	JTable table;
	JButton search;
	BussinessSheetBLService bussinesssheet = new BussinessSheetController();
	public GetBussinesssheetPanel(){
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
		
		JLabel labelofstartdate = new JLabel();
		labelofstartdate.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofstartdate.setText("开始日期");
		labelofstartdate.setBounds(150, 60, 80, 30);
		this.add(labelofstartdate);
		
		JLabel labelofenddate = new JLabel();
		labelofenddate.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofenddate.setText("结束日期");
		labelofenddate.setBounds(150, 120, 80, 30);
		this.add(labelofenddate);
		
		JTextField nian1 = new JTextField();
		nian1.setBounds(250, 60, 40,30);
		this.add(nian1);
		nian1.setColumns(10);
		
		JTextField nian2 = new JTextField();
		nian2.setColumns(10);
		nian2.setBounds(250, 120, 40, 30);
		this.add(nian2);
		
		JLabel labelofstartyear = new JLabel();
		labelofstartyear.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofstartyear.setText("年");
		labelofstartyear.setBounds(295, 60, 20, 30);
		this.add(labelofstartyear);
		
		JLabel labelofendyear = new JLabel();
		labelofendyear.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofendyear.setText("年");
		labelofendyear.setBounds(295, 120, 20, 30);
		this.add(labelofendyear);
		

		
		JTextField yue1 = new JTextField();
		yue1.setColumns(10);
		yue1.setBounds(325, 60, 40, 30);
		this.add(yue1);
		
		JTextField yue2 = new JTextField();
		yue2.setBounds(325, 120, 40, 30);
		this.add(yue2);
		yue2.setColumns(10);
		
		JLabel labelofstartmonth = new JLabel();
		labelofstartmonth.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofstartmonth.setText("月");
		labelofstartmonth.setBounds(370, 60, 20, 30);
		this.add(labelofstartmonth);
		
		JLabel labelofendmonth = new JLabel();
		labelofendmonth.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofendmonth.setText("月");
		labelofendmonth.setBounds(370, 120, 20, 30);
		this.add(labelofendmonth);
		
		JTextField ri1 = new JTextField();
		ri1.setColumns(10);
		ri1.setBounds(400, 60, 40, 30);
		this.add(ri1);
		
		JTextField ri2 = new JTextField();
		ri2.setColumns(10);
		ri2.setBounds(400, 120, 40, 30);
		this.add(ri2);
		
		JLabel labelofstartday = new JLabel();
		labelofstartday.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofstartday.setText("日");
		labelofstartday.setBounds(445, 60, 20, 30);
		this.add(labelofstartday);
		
		JLabel labelofendday = new JLabel();
		labelofendday.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofendday.setText("日");
		labelofendday.setBounds(445, 120, 20, 30);
		this.add(labelofendday);
			
		
		
		JButton btnNewButton = new JButton("查询");
		btnNewButton.setBounds(450, 160, 100, 30);
		this.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String year1=nian1.getText();
				String month1=yue1.getText();
				String day1=ri1.getText();
				String year2=nian2.getText();
				String month2=yue2.getText();
				String day2=ri2.getText();
				
				TimeHelper.adjustTime(year1, 4);
				year1=TimeHelper.adjustTime(year1, 4);
				month1=TimeHelper.adjustTime(month1, 2);
				day1=TimeHelper.adjustTime(day1, 2);
				year2=TimeHelper.adjustTime(year2,4);
				month2=TimeHelper.adjustTime(month2,2);
				day2=TimeHelper.adjustTime(day2,2);
				boolean result=true;
				result=result&&VaildHelper.checkIsValidID(year1, 4);
				result=result&&VaildHelper.checkIsValidID(month1, 2);
				result=result&&VaildHelper.checkIsValidID(day1, 2);
				result=result&&VaildHelper.checkIsValidID(year2,4);
				result=result&&VaildHelper.checkIsValidID(month2,2);
				result=result&&VaildHelper.checkIsValidID(day2,2);
				
				if(result){
					BussinessSheetVO toShow=bussinesssheet.show(year1+month1+day1, year2+month2+day2);
					if(toShow!=null){
						buildTable(toShow);
					}else{
						TimePanel.change=true;
						TimePanel.text="查询失败！请重试";
					}
				}
			}
		});
		
		JButton buttonofexport = new JButton("导出");
		
		buttonofexport.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				boolean istrue=bussinesssheet.export();
				if(istrue){
					TimePanel.change=true;
					TimePanel.text="导出成功";
				}else{
					TimePanel.change=true;
					TimePanel.text="导出失败";
				}
			}
		});
		buttonofexport.setBounds(700, 500, 80,30);
		this.add(buttonofexport);
		
	}
	
	
	public void buildTable(BussinessSheetVO sheet){
		ArrayList<PaymentBill> pay=sheet.pay;
		ArrayList<ReceiveMoneyBill> paid=sheet.paid;
		
		int size=Math.max(pay.size(), paid.size());
		Object[][] tableData=new Object[size][9];
		for(int i=0;i<size;i++){
			
			ReceiveMoneyBill paidbill;
			PaymentBill paybill;
			
			if(size>pay.size()){
				paybill=new PaymentBill();
			}else{
				paybill=pay.get(i);
			}
			if(size>paid.size()){
				paidbill=new ReceiveMoneyBill();
			}else{
				paidbill=paid.get(i);
			}
			tableData[i]=new Object[]{paidbill.ID,paidbill.date,paidbill.transactor,
					paidbill.money,paybill.ID,paybill.date,paybill.payer,
					paybill.money,paybill.type,paybill.remarks};					
		}
		Object[] columnTitle = {"收款单编号","收款日期","收款快递员","收款金额","付款单编号","付款日期","付款人","付款金额","付款条目","付款备注"};  
		table=new JTable(tableData,columnTitle);
		int height=table.getRowHeight()*(size+1)+9;
		int ValidMaxHeight=250;
		if(height>=400)
			height=ValidMaxHeight;
		table.setOpaque(false); 
		table.setRowSelectionAllowed(true);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(140, 270, 720, height);
		scrollPane.setOpaque(false);
		this.add(scrollPane);
		scrollPane.setViewportView(table);
	}
}