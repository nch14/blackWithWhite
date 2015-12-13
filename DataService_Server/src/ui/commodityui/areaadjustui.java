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

import bl.commoditybl.Impl.AreaAdjustController;
import bl.commoditybl.Service.AreaAdjustBLService;

public class areaadjustui extends JDesktopPane{
	
	

	public areaadjustui() {
		initialize();
	}
	
	private void initialize() {
		
		this.setBackground(Color.WHITE);
		
		
		JLabel label_33 = new JLabel();;
		label_33.setBounds(282, 0, 436, 21);
		this.add(label_33);
		
		
		JLabel label_12 = new JLabel("\u6392\u53F7");
		label_12.setBounds(328, 88, 54, 15);
		this.add(label_12);
		
		JTextField textField_13 = new JTextField();
		textField_13.setBounds(383, 85, 66, 21);
		this.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel label_13 = new JLabel("\u539F\u5206\u533A");
		label_13.setBounds(328, 122, 54, 15);
		this.add(label_13);
		
		JLabel label_14 = new JLabel("\u73B0\u5206\u533A");
		label_14.setBounds(328, 159, 54, 15);
		this.add(label_14);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(236, 230, 467, 212);
		this.add(scrollPane_3);
		
		JTable table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"\u6392\u53F7", "\u539F\u5206\u533A", "\u73B0\u5206\u533A"
			}
		));
		scrollPane_3.setViewportView(table_3);
		
		/*
		 * 库区调整提交
		 */
		JButton button_6 = new JButton("\u63D0\u4EA4");
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int[] rows= new int[table_3.getRowCount()];
				for(int i=0;i<table_3.getRowCount();i++){
					rows[i]=(int) table_3.getValueAt(i, 0);
					
				}
				String type=(String) table_3.getValueAt(0, 1);
				AreaAdjustBLService areaadjust = new AreaAdjustController();
				areaadjust.areaAdjust(rows, type);
				if(areaadjust.areaAdjust(rows, type)==false){
					
				}else{
					for(int i=0; i<table_3.getRowCount();i++){
						table_3.setValueAt(null, i, 0);
						table_3.setValueAt(null, i, 1);
						table_3.setValueAt(null, i, 2);
					}
				}
			}
		});
		button_6.setBounds(631, 493, 93, 23);
		this.add(button_6);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u673A\u52A8\u533A", "\u822A\u8FD0\u533A", "\u94C1\u8FD0\u533A", "\u6C7D\u8FD0\u533A"}));
		comboBox_1.setBounds(383, 119, 66, 21);
		this.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"\u673A\u52A8\u533A", "\u822A\u8FD0\u533A", "\u94C1\u8FD0\u533A", "\u6C7D\u8FD0\u533A"}));
		comboBox_2.setBounds(383, 156, 66, 21);
		this.add(comboBox_2);
		
		/*
		 * 库区调整添加
		 */
		JButton btnNewButton = new JButton("\u786E\u8BA4");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				for(int i=0;i<table_3.getRowCount();i++){
					if(table_3.getValueAt(i, 1)==null&&table_3.getValueAt(i, 2)==null&&table_3.getValueAt(i, 3)==null){
						table_3.setValueAt(textField_13.getText(), i, 1);
						table_3.setValueAt(comboBox_1.getSelectedItem(), i, 2);
						table_3.setValueAt(comboBox_2.getSelectedItem(), i, 3);
						textField_13.setText(null);
						comboBox_1.setSelectedIndex(0);
						comboBox_2.setSelectedIndex(0);
						break;
					}
				}
			}
		});
		btnNewButton.setBounds(524, 186, 93, 23);
		this.add(btnNewButton);
		
		/*
		 * 库区调整撤销
		 */
		JButton button_9 = new JButton("\u64A4\u9500");
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_3.getRowCount()-1;i>=0;i--){
					if(table_3.getValueAt(i, 0)!=null&&table_3.getValueAt(i, 1)!=null
							&&table_3.getValueAt(i, 2)!=null){
						table_3.setValueAt(null, i, 0);
						table_3.setValueAt(null, i, 1);
						table_3.setValueAt(null, i, 2);
					}
				}
			}
		});
		button_9.setBounds(236, 493, 93, 23);
		this.add(button_9);
		
		new Thread() {        
			public void run() {            
				try {                
					while (true) {                    
						
						SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
						label_33.setText(df.format(new Date()));//显示当前时间
						Thread.sleep(1000);//暂停一秒                
						}            
					} catch (Exception e) {            
						
					}        
				}    
			}.start();
	}


}
