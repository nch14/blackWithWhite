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
		
		
		JLabel labelofrownumber = new JLabel("排号");
		labelofrownumber.setBounds(328, 88, 54, 15);
		this.add(labelofrownumber);
		
		JTextField textFieldofrownumber = new JTextField();
		textFieldofrownumber.setBounds(383, 85, 66, 21);
		this.add(textFieldofrownumber);
		textFieldofrownumber.setColumns(10);
		
		JLabel labeloforiginalarea = new JLabel("原分区");
		labeloforiginalarea.setBounds(328, 122, 54, 15);
		this.add(labeloforiginalarea);
		
		JLabel labelofnewarea = new JLabel("现分区");
		labelofnewarea.setBounds(328, 159, 54, 15);
		this.add(labelofnewarea);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(236, 230, 467, 212);
		this.add(scrollPane_3);
		
		JTable tableofareaadjust = new JTable();
		tableofareaadjust.setModel(new DefaultTableModel(
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
				"排号", "原分区", "现分区"
			}
		));
		scrollPane_3.setViewportView(tableofareaadjust);
		
		/*
		 * 库区调整提交
		 */
		JButton buttonofsubmit = new JButton("提交");
		buttonofsubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int[] rows= new int[tableofareaadjust.getRowCount()];
				for(int i=0;i<tableofareaadjust.getRowCount();i++){
					rows[i]=(int) tableofareaadjust.getValueAt(i, 0);
					
				}
				String type=(String) tableofareaadjust.getValueAt(0, 1);
				AreaAdjustBLService areaadjust = new AreaAdjustController();
				boolean istrue=areaadjust.areaAdjust(rows, type);
				if(istrue==false){
					
				}else{
					for(int i=0; i<tableofareaadjust.getRowCount();i++){
						tableofareaadjust.setValueAt(null, i, 0);
						tableofareaadjust.setValueAt(null, i, 1);
						tableofareaadjust.setValueAt(null, i, 2);
					}
				}
			}
		});
		buttonofsubmit.setBounds(631, 493, 93, 23);
		this.add(buttonofsubmit);
		
		JComboBox comboBoxoforiginalarea = new JComboBox();
		comboBoxoforiginalarea.setModel(new DefaultComboBoxModel(new String[] {"\u673A\u52A8\u533A", "\u822A\u8FD0\u533A", "\u94C1\u8FD0\u533A", "\u6C7D\u8FD0\u533A"}));
		comboBoxoforiginalarea.setBounds(383, 119, 66, 21);
		this.add(comboBoxoforiginalarea);
		
		JComboBox comboBoxofnewarea = new JComboBox();
		comboBoxofnewarea.setModel(new DefaultComboBoxModel(new String[] {"\u673A\u52A8\u533A", "\u822A\u8FD0\u533A", "\u94C1\u8FD0\u533A", "\u6C7D\u8FD0\u533A"}));
		comboBoxofnewarea.setBounds(383, 156, 66, 21);
		this.add(comboBoxofnewarea);
		
		/*
		 * 库区调整添加
		 */
		JButton buttonofack = new JButton("确认");
		buttonofack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				for(int i=0;i<tableofareaadjust.getRowCount();i++){
					if(tableofareaadjust.getValueAt(i, 1)==null&&tableofareaadjust.getValueAt(i, 2)==null&&tableofareaadjust.getValueAt(i, 3)==null){
						tableofareaadjust.setValueAt(textFieldofrownumber.getText(), i, 1);
						tableofareaadjust.setValueAt(comboBoxoforiginalarea.getSelectedItem(), i, 2);
						tableofareaadjust.setValueAt(comboBoxofnewarea.getSelectedItem(), i, 3);
						textFieldofrownumber.setText(null);
						comboBoxoforiginalarea.setSelectedIndex(0);
						comboBoxofnewarea.setSelectedIndex(0);
						break;
					}
				}
			}
		});
		buttonofack.setBounds(524, 186, 93, 23);
		this.add(buttonofack);
		
		/*
		 * 库区调整撤销
		 */
		JButton buttonofcancel = new JButton("撤销");
		buttonofcancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=tableofareaadjust.getRowCount()-1;i>=0;i--){
					if(tableofareaadjust.getValueAt(i, 0)!=null&&tableofareaadjust.getValueAt(i, 1)!=null
							&&tableofareaadjust.getValueAt(i, 2)!=null){
						tableofareaadjust.setValueAt(null, i, 0);
						tableofareaadjust.setValueAt(null, i, 1);
						tableofareaadjust.setValueAt(null, i, 2);
					}
				}
			}
		});
		buttonofcancel.setBounds(236, 493, 93, 23);
		this.add(buttonofcancel);
		
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
