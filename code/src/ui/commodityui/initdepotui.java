package ui.commodityui;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import bl.commoditybl.Impl.InitDepotAreaController;
import bl.commoditybl.Service.InitDepotAreaBLService;

public class initdepotui extends JDesktopPane{
	


	public initdepotui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		this.setBackground(Color.WHITE);
		
		
		JLabel label_34 = new JLabel();
		label_34.setBounds(282, 0, 436, 21);
		this.add(label_34);
	
		
		JLabel lblNewLabel = new JLabel("\u822A\u8FD0\u533A");
		lblNewLabel.setBounds(327, 90, 54, 15);
		this.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u94C1\u8FD0\u533A");
		lblNewLabel_1.setBounds(327, 115, 54, 15);
		this.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u6C7D\u8FD0\u533A");
		lblNewLabel_2.setBounds(327, 140, 54, 15);
		this.add(lblNewLabel_2);
		
		JLabel label_15 = new JLabel("\u673A\u52A8\u533A");
		label_15.setBounds(327, 165, 54, 15);
		this.add(label_15);
		
		JTextField textField_16 = new JTextField();
		textField_16.setBounds(385, 87, 66, 21);
		this.add(textField_16);
		textField_16.setColumns(10);
		
		JTextField textField_17 = new JTextField();
		textField_17.setBounds(385, 112, 66, 21);
		this.add(textField_17);
		textField_17.setColumns(10);
		
		JTextField textField_18 = new JTextField();
		textField_18.setBounds(385, 137, 66, 21);
		this.add(textField_18);
		textField_18.setColumns(10);
		
		 JTextField textField_19 = new JTextField();
		textField_19.setBounds(385, 162, 66, 21);
		this.add(textField_19);
		textField_19.setColumns(10);
		
		JLabel label_30 = new JLabel("\u6392 \u5230");
		label_30.setBounds(461, 90, 54, 15);
		this.add(label_30);
		
		JLabel label_31 = new JLabel("\u6392 \u5230");
		label_31.setBounds(461, 115, 54, 15);
		this.add(label_31);
		
		JLabel label_32 = new JLabel("\u6392 \u5230");
		label_32.setBounds(461, 140, 54, 15);
		this.add(label_32);
		
		JLabel label_16 = new JLabel("\u6392 \u5230");
		label_16.setBounds(461, 165, 54, 15);
		this.add(label_16);
		
		JTextField textField_20 = new JTextField();
		textField_20.setBounds(503, 87, 66, 21);
		this.add(textField_20);
		textField_20.setColumns(10);
		
		JTextField textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(503, 112, 66, 21);
		this.add(textField_21);
		
		JTextField textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(503, 137, 66, 21);
		this.add(textField_22);
		
		JTextField textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(503, 162, 66, 21);
		this.add(textField_23);
		
		JLabel label_17 = new JLabel("\u6392");
		label_17.setBounds(579, 90, 54, 15);
		this.add(label_17);
		
		JLabel label_18 = new JLabel("\u6392");
		label_18.setBounds(579, 115, 54, 15);
		this.add(label_18);
		
		JLabel label_19 = new JLabel("\u6392");
		label_19.setBounds(579, 140, 54, 15);
		this.add(label_19);
		
		JLabel label_20 = new JLabel("\u6392");
		label_20.setBounds(579, 165, 54, 15);
		this.add(label_20);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(236, 230, 467, 212);
		this.add(scrollPane_4);
		
		JTable table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"\u6392\u53F7", "\u5206\u533A"
			}
		));
		scrollPane_4.setViewportView(table_4);
		
		/*
		 * 将库区初始化信息提交
		 */
		JButton button_7 = new JButton("\u63D0\u4EA4");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int[] motorTransport=null;
				int[] trainTransport=null;
				int[] airTransport=null;
				int[] balnkSpace=null;
				for(int i=0;i<table_4.getRowCount();i++){
					if(table_4.getValueAt(i, 1)=="航运区"){
						airTransport[i]=(int)table_4.getValueAt(i, 0);
					}else if(table_4.getValueAt(i, 1)=="铁运区"){
						trainTransport[i]=(int)table_4.getValueAt(i, 0);
					}else if(table_4.getValueAt(i, 1)=="汽运区"){
						motorTransport[i]=(int)table_4.getValueAt(i, 0);
					}else if(table_4.getValueAt(i, 1)=="机动区"){
						balnkSpace[i]=(int)table_4.getValueAt(i, 0);
					}
				}
				InitDepotAreaBLService initdepotarea = new InitDepotAreaController();
				 boolean istrue=initdepotarea.init(motorTransport, trainTransport, airTransport, balnkSpace);
				if(istrue==false){
					
				}else{
					for(int i=0;i<table_4.getRowCount();i++){
						table_4.setValueAt(null, i, 0);
						table_4.setValueAt(null, i, 1);
					}
				}
			}
		});
		button_7.setBounds(714, 479, 93, 23);
		this.add(button_7);
	
		/*
		 * 将库区初始化信息加入table
		 */
		JButton button_8 = new JButton("\u786E\u8BA4");
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				for(int i =Integer.parseInt(textField_16.getText())-1;i<Integer.parseInt(textField_20.getText());i++){
					table_4.setValueAt(i+1, i, 0);
					table_4.setValueAt("航运区", i,1);
				}
				for(int i =Integer.parseInt(textField_17.getText())-1;i<Integer.parseInt(textField_21.getText());i++){
					table_4.setValueAt(i+1, i, 0);
					table_4.setValueAt("铁运区", i,1);
				}
				for(int i =Integer.parseInt(textField_18.getText())-1;i<Integer.parseInt(textField_22.getText());i++){
					table_4.setValueAt(i+1, i, 0);
					table_4.setValueAt("汽运区", i,1);
				}
				for(int i =Integer.parseInt(textField_19.getText())-1;i<Integer.parseInt(textField_23.getText());i++){
					table_4.setValueAt(i+1, i, 0);
					table_4.setValueAt("机动区", i,1);
				}
				
			}
		});
		button_8.setBounds(617, 186, 93, 23);
		this.add(button_8);
		
		new Thread() {        
			public void run() {            
				try {                
					while (true) {                    
						
						SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
						label_34.setText(df.format(new Date()));//显示当前时间
						Thread.sleep(1000);//暂停一秒                
						}            
					} catch (Exception e) {            
						
					}        
				}    
			}.start();
	}

}
