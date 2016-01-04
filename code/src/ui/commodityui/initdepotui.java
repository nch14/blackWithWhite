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
import tools.DepartmentHelper;

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
	
		
		JLabel labelofairarea = new JLabel("航运区");
		labelofairarea.setBounds(327, 90, 54, 15);
		this.add(labelofairarea);
		
		JLabel labeloftrainarea = new JLabel("铁运区");
		labeloftrainarea.setBounds(327, 115, 54, 15);
		this.add(labeloftrainarea);
		
		JLabel labeloftruckarea = new JLabel("汽运区");
		labeloftruckarea.setBounds(327, 140, 54, 15);
		this.add(labeloftruckarea);
		
		JLabel labelofmanoeuveringarea = new JLabel("机动区");
		labelofmanoeuveringarea.setBounds(327, 165, 54, 15);
		this.add(labelofmanoeuveringarea);
		
		JTextField textFieldofairrownumber_1 = new JTextField();
		textFieldofairrownumber_1.setBounds(385, 87, 66, 21);
		this.add(textFieldofairrownumber_1);
		textFieldofairrownumber_1.setColumns(10);
		
		JTextField textFieldoftrainrownumber_1 = new JTextField();
		textFieldoftrainrownumber_1.setBounds(385, 112, 66, 21);
		this.add(textFieldoftrainrownumber_1);
		textFieldoftrainrownumber_1.setColumns(10);
		
		JTextField textFieldoftruckrownumber_1 = new JTextField();
		textFieldoftruckrownumber_1.setBounds(385, 137, 66, 21);
		this.add(textFieldoftruckrownumber_1);
		textFieldoftruckrownumber_1.setColumns(10);
		
		 JTextField textFieldofmanoeuveringrownumber_1 = new JTextField();
		textFieldofmanoeuveringrownumber_1.setBounds(385, 162, 66, 21);
		this.add(textFieldofmanoeuveringrownumber_1);
		textFieldofmanoeuveringrownumber_1.setColumns(10);
		
		JLabel labelofairrownumber_1 = new JLabel("排 到");
		labelofairrownumber_1.setBounds(461, 90, 54, 15);
		this.add(labelofairrownumber_1);
		
		JLabel labeloftrainrownumber_1 = new JLabel("排 到");
		labeloftrainrownumber_1.setBounds(461, 115, 54, 15);
		this.add(labeloftrainrownumber_1);
		
		JLabel labeloftruckrownumber_1 = new JLabel("排 到");
		labeloftruckrownumber_1.setBounds(461, 140, 54, 15);
		this.add(labeloftruckrownumber_1);
		
		JLabel labelofmanoeuveringrownumber_1 = new JLabel("排 到");
		labelofmanoeuveringrownumber_1.setBounds(461, 165, 54, 15);
		this.add(labelofmanoeuveringrownumber_1);
		
		JTextField textFieldofairrownumber_2 = new JTextField();
		textFieldofairrownumber_2.setBounds(503, 87, 66, 21);
		this.add(textFieldofairrownumber_2);
		textFieldofairrownumber_2.setColumns(10);
		
		JTextField textFieldoftrainrownumber_2 = new JTextField();
		textFieldoftrainrownumber_2.setColumns(10);
		textFieldoftrainrownumber_2.setBounds(503, 112, 66, 21);
		this.add(textFieldoftrainrownumber_2);
		
		JTextField textFieldoftrucknumber_2 = new JTextField();
		textFieldoftrucknumber_2.setColumns(10);
		textFieldoftrucknumber_2.setBounds(503, 137, 66, 21);
		this.add(textFieldoftrucknumber_2);
		
		JTextField textFieldofmanoeuveringrownumber_2 = new JTextField();
		textFieldofmanoeuveringrownumber_2.setColumns(10);
		textFieldofmanoeuveringrownumber_2.setBounds(503, 162, 66, 21);
		this.add(textFieldofmanoeuveringrownumber_2);
		
		JLabel labelofairrownumber_2 = new JLabel("排");
		labelofairrownumber_2.setBounds(579, 90, 54, 15);
		this.add(labelofairrownumber_2);
		
		JLabel labeloftrainrownumber_2 = new JLabel("排");
		labeloftrainrownumber_2.setBounds(579, 115, 54, 15);
		this.add(labeloftrainrownumber_2);
		
		JLabel labeloftruckrownumber_2 = new JLabel("排");
		labeloftruckrownumber_2.setBounds(579, 140, 54, 15);
		this.add(labeloftruckrownumber_2);
		
		JLabel labelofmanoeuveringrownumber_2 = new JLabel("排");
		labelofmanoeuveringrownumber_2.setBounds(579, 165, 54, 15);
		this.add(labelofmanoeuveringrownumber_2);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(236, 230, 467, 212);
		this.add(scrollPane_4);
		
		JTable tableofinitdepot = new JTable();
		tableofinitdepot.setModel(new DefaultTableModel(
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
				"排号", "分区"
			}
		));
		scrollPane_4.setViewportView(tableofinitdepot);
		
		/*
		 * 将库区初始化信息提交
		 */
		JButton buttonofsubmit = new JButton("提交");
		buttonofsubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int[] motorTransport=null;
				int[] trainTransport=null;
				int[] airTransport=null;
				int[] balnkSpace=null;
				for(int i=0;i<tableofinitdepot.getRowCount();i++){
					if(tableofinitdepot.getValueAt(i, 1)=="航运区"){
						airTransport[i]=(int)tableofinitdepot.getValueAt(i, 0);
					}else if(tableofinitdepot.getValueAt(i, 1)=="铁运区"){
						trainTransport[i]=(int)tableofinitdepot.getValueAt(i, 0);
					}else if(tableofinitdepot.getValueAt(i, 1)=="汽运区"){
						motorTransport[i]=(int)tableofinitdepot.getValueAt(i, 0);
					}else if(tableofinitdepot.getValueAt(i, 1)=="机动区"){
						balnkSpace[i]=(int)tableofinitdepot.getValueAt(i, 0);
					}
				}
				InitDepotAreaBLService initdepotarea = new InitDepotAreaController();
				 boolean istrue=initdepotarea.init(DepartmentHelper.getDepartment(),motorTransport, trainTransport, airTransport, balnkSpace);
				if(istrue==false){
					
				}else{
					for(int i=0;i<tableofinitdepot.getRowCount();i++){
						tableofinitdepot.setValueAt(null, i, 0);
						tableofinitdepot.setValueAt(null, i, 1);
					}
				}
			}
		});
		buttonofsubmit.setBounds(714, 479, 93, 23);
		this.add(buttonofsubmit);
	
		/*
		 * 将库区初始化信息加入table
		 */
		JButton buttonofadd = new JButton("添加");
		buttonofadd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				for(int i =Integer.parseInt(textFieldofairrownumber_1.getText())-1;i<Integer.parseInt(textFieldofairrownumber_2.getText());i++){
					tableofinitdepot.setValueAt(i+1, i, 0);
					tableofinitdepot.setValueAt("航运区", i,1);
				}
				for(int i =Integer.parseInt(textFieldoftrainrownumber_1.getText())-1;i<Integer.parseInt(textFieldoftrainrownumber_2.getText());i++){
					tableofinitdepot.setValueAt(i+1, i, 0);
					tableofinitdepot.setValueAt("铁运区", i,1);
				}
				for(int i =Integer.parseInt(textFieldoftruckrownumber_1.getText())-1;i<Integer.parseInt(textFieldoftrucknumber_2.getText());i++){
					tableofinitdepot.setValueAt(i+1, i, 0);
					tableofinitdepot.setValueAt("汽运区", i,1);
				}
				for(int i =Integer.parseInt(textFieldofmanoeuveringrownumber_1.getText())-1;i<Integer.parseInt(textFieldofmanoeuveringrownumber_2.getText());i++){
					tableofinitdepot.setValueAt(i+1, i, 0);
					tableofinitdepot.setValueAt("机动区", i,1);
				}
				
			}
		});
		buttonofadd.setBounds(617, 186, 93, 23);
		this.add(buttonofadd);
		
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
