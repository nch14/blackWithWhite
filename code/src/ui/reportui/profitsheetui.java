package ui.reportui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import bl.report.impl.ProfitSheetController;
import bl.report.service.ProfitSheetBLService;
import vo.ProfitSheetVO;

public class profitsheetui extends JDesktopPane{
	
	JTable table_5;
	ProfitSheetBLService profitsheet = new ProfitSheetController();
	/**
	 * Create the application.
	 */
	public profitsheetui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		this.setBackground(Color.WHITE);
		
		
		JLabel label_20 = new JLabel();
		label_20.setBounds(282, 0, 436, 21);
		this.add(label_20);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setBounds(46, 36, 881, 536);
		this.add(tabbedPane_3);
		
		JDesktopPane desktopPane_17 = new JDesktopPane();
		desktopPane_17.setBackground(Color.WHITE);
		tabbedPane_3.addTab("成本收益表", null, desktopPane_17, null);
		
		JLabel label_6 = new JLabel("\u7CFB\u7EDF\u5F53\u524D\u65E5\u671F\uFF1A");
		label_6.setBounds(235, 98, 89, 15);
		desktopPane_17.add(label_6);
		
		JTextField textField_8 = new JTextField();
		textField_8.setBounds(334, 95, 34, 21);
		desktopPane_17.add(textField_8);
		textField_8.setColumns(10);
		
		/*
		 * 查看成本收益表
		 */
		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.setBounds(519, 153, 93, 23);
		desktopPane_17.add(btnNewButton);
		 btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				ProfitSheetVO profitSheet = profitsheet.show();
				table_5.setValueAt(profitSheet.totalGet, 0, 0);
				table_5.setValueAt(profitSheet.totalPay, 0, 1);
				table_5.setValueAt(profitSheet.profit, 0, 2);
				table_5.setValueAt(profitSheet.time, 0, 3);
			}
		});
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(235, 247, 377, 44);
		desktopPane_17.add(scrollPane_5);
		
		table_5 = new JTable();
		table_5.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"\u603B\u6536\u5165", "\u603B\u652F\u51FA", "\u603B\u5229\u6DA6", "\u622A\u6B62\u65E5\u671F"
			}
		));
		scrollPane_5.setViewportView(table_5);
		
		JLabel label_15 = new JLabel("\u5E74");
		label_15.setBounds(378, 98, 54, 15);
		desktopPane_17.add(label_15);
		
		JTextField textField_15 = new JTextField();
		textField_15.setBounds(400, 95, 34, 21);
		desktopPane_17.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel label_16 = new JLabel("\u6708");
		label_16.setBounds(442, 98, 54, 15);
		desktopPane_17.add(label_16);
		
		JTextField textField_16 = new JTextField();
		textField_16.setBounds(462, 95, 34, 21);
		desktopPane_17.add(textField_16);
		textField_16.setColumns(10);
		
		JLabel label_17 = new JLabel("\u65E5");
		label_17.setBounds(506, 98, 54, 15);
		desktopPane_17.add(label_17);
		
		/*
		 * 导出成本收益表
		 */
		JButton button_17 = new JButton("\u5BFC\u51FA");
		button_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				boolean istrue=profitsheet.export();
				if(istrue){
					table_5.setValueAt(null, 0, 0);
					table_5.setValueAt(null, 0, 1);
					table_5.setValueAt(null, 0, 2);
					table_5.setValueAt(null, 0, 3);
				}else{
					
				}
			}
		});
		button_17.setBounds(636, 360, 93, 23);
		desktopPane_17.add(button_17);
		
		bussinesssheetui t1 = new bussinesssheetui();
		tabbedPane_3.addTab("报表查询", null, t1, null);
		
		new Thread() {        
			public void run() {            
				try {                
					while (true) {                    
						SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
						label_20.setText(df.format(new Date()));//显示当前时间
						
						Thread.sleep(1000);//暂停一秒                
						}            
					} catch (Exception e) {            
						
					}        
				}    
			}.start();
	}

}
