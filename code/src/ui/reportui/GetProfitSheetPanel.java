package ui.reportui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import bl.report.impl.ProfitSheetController;
import bl.report.service.ProfitSheetBLService;
import ui.informationui.StartFrame;
import vo.ProfitSheetVO;

public class GetProfitSheetPanel extends JPanel{
	JTable tableofprofitsheet;
	ProfitSheetBLService profitsheet = new ProfitSheetController();
	public GetProfitSheetPanel(){
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
		

		JButton btnNewButton = new JButton("查询");
		btnNewButton.setBounds(450, 160, 100, 30);
		this.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				ProfitSheetVO profitSheet = profitsheet.show();
				tableofprofitsheet.setValueAt(profitSheet.totalGet, 0, 0);
				tableofprofitsheet.setValueAt(profitSheet.totalPay, 0, 1);
				tableofprofitsheet.setValueAt(profitSheet.profit, 0, 2);
				tableofprofitsheet.setValueAt(profitSheet.time, 0, 3);
			}
		});
		

		
		tableofprofitsheet = new JTable();
		tableofprofitsheet.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"总收入", "总支出", "总利润", "截止日期"
			}
		));
		tableofprofitsheet.getColumnModel().getColumn(3).setMinWidth(120);
		tableofprofitsheet.setRowHeight(30);
		tableofprofitsheet.setFont(new Font("微软雅黑 Light",Font.PLAIN,24));
		int height=55;
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(250, 250,500, height);
		this.add(scrollPane_5);
		scrollPane_5.setViewportView(tableofprofitsheet);
		
		JButton buttonofexport = new JButton("导出");
		
		buttonofexport.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				boolean istrue=profitsheet.export();
				if(istrue){
					tableofprofitsheet.setValueAt(null, 0, 0);
					tableofprofitsheet.setValueAt(null, 0, 1);
					tableofprofitsheet.setValueAt(null, 0, 2);
					tableofprofitsheet.setValueAt(null, 0, 3);
				}else{
					
				}
			}
		});
		buttonofexport.setBounds(700, 500, 80,30);
		this.add(buttonofexport);
		
	}
}
