package ui.commodityui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import bill.Account;
import bl.commoditybl.Impl.AreaAdjust;
import bl.commoditybl.Impl.AreaAdjustController;
import bl.commoditybl.Service.AreaAdjustBLService;
import ui.NSwing.NButton;
import ui.NSwing.NLabel;
import ui.NSwing.NTable;
import ui.NSwing.NTextField;
import ui.NSwing.TimePanel;

public class AdjustAreaPanel extends JPanel{
	private NTextField textFieldofrownumber;
	NLabel labeloforiginalarea;
	NLabel labelofnewarea;
	JComboBox comboBoxoforiginalarea;
	JComboBox comboBoxofnewarea;
	NButton buttonofack;
	NButton buttonofcancel;
	NButton buttonofsubmit;
	NTable table;
	JScrollPane scrollPane;
	
	public AdjustAreaPanel(){
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
		
		NLabel rownumber = new NLabel("排号");
		rownumber.setBounds(300, 80, 60, 30);
		this.add(rownumber);
		
		textFieldofrownumber = new NTextField();
		textFieldofrownumber.setBounds(380, 80, 80, 30);
		this.add(textFieldofrownumber);
		textFieldofrownumber.setColumns(10);
		
		labeloforiginalarea = new NLabel("原分区");
		labeloforiginalarea.setBounds(300, 120, 60, 30);
		this.add(labeloforiginalarea);
		
		labelofnewarea = new NLabel("现分区");
		labelofnewarea.setBounds(300, 160, 60, 30);
		this.add(labelofnewarea);
		
		comboBoxoforiginalarea = new JComboBox();
		comboBoxoforiginalarea.setModel(new DefaultComboBoxModel(new String[] {"航空区", "汽运区", "铁运区", "机动区"}));
		comboBoxoforiginalarea.setBounds(380, 120, 80, 30);
		this.add(comboBoxoforiginalarea);
		
		comboBoxofnewarea = new JComboBox();
		comboBoxofnewarea.setModel(new DefaultComboBoxModel(new String[] {"航空区", "汽运区", "铁运区", "机动区"}));
		comboBoxofnewarea.setBounds(380, 160, 80, 30);
		this.add(comboBoxofnewarea);
		
		buttonofack = new NButton("确认");
		buttonofack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				for(int i=0;i<table.getRowCount();i++){
					if(table.getValueAt(i, 1)==null&&table.getValueAt(i, 2)==null&&table.getValueAt(i, 3)==null){
						table.setValueAt(textFieldofrownumber.getText(), i, 1);
						table.setValueAt(comboBoxoforiginalarea.getSelectedItem(), i, 2);
						table.setValueAt(comboBoxofnewarea.getSelectedItem(), i, 3);
						textFieldofrownumber.setText(null);
						comboBoxoforiginalarea.setSelectedIndex(0);
						comboBoxofnewarea.setSelectedIndex(0);
						break;
					}
				}
			}
		});
		buttonofack.setBounds(600, 210, 40, 40);
		this.add(buttonofack);
		
		buttonofcancel = new NButton("撤销");
		buttonofcancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table.getRowCount()-1;i>=0;i--){
					if(table.getValueAt(i, 0)!=null&&table.getValueAt(i, 1)!=null
							&&table.getValueAt(i, 2)!=null){
						table.setValueAt(null, i, 0);
						table.setValueAt(null, i, 1);
						table.setValueAt(null, i, 2);
					}
				}
			}
		});
		buttonofcancel.setBounds(240, 600, 40, 40);
		this.add(buttonofcancel);
		
		buttonofsubmit = new NButton("提交");
		buttonofsubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int[] rows= new int[table.getRowCount()];
				for(int i=0;i<table.getRowCount();i++){
					rows[i]=(int) table.getValueAt(i, 0);
					
				}
				String type=(String) table.getValueAt(0, 1);
				AreaAdjustBLService areaadjust = new AreaAdjustController();
				boolean istrue=areaadjust.areaAdjust(rows, type);
				if(istrue==false){
					TimePanel.makeWords("提交失败！");
				}else{
					for(int i=0; i<table.getRowCount();i++){
						table.setValueAt(null, i, 0);
						table.setValueAt(null, i, 1);
						table.setValueAt(null, i, 2);
					}
					TimePanel.makeWords("提交成功！");
				}
			}
		});
		buttonofsubmit.setBounds(240, 600, 40, 40);
		this.add(buttonofsubmit);
		
		String rows = rownumber.getText();
		String orignal = (String) comboBoxoforiginalarea.getSelectedItem();
		String now = (String) comboBoxofnewarea.getSelectedItem();
		buildTable(rows,orignal,now);
		repaint();
	}
	
	public void buildTable(String rows,String orignal,String now){
		int size = rows.length();
		Object[][] tableData=new Object[size][3];
		for(int i=0;i<size;i++){
			tableData[i]=new Object[]{rows,orignal,now};
		}
		Object[] columnTitle = {"排号","原分区","现分区"};  
		table=new NTable(tableData,columnTitle);
		int height=table.getRowHeight()*(size+1)+13;
		int ValidMaxHeight=250;
		if(height>=400)
			height=ValidMaxHeight;
		table.setOpaque(false); 
		table.setRowSelectionAllowed(true);
		scrollPane = new JScrollPane();
		scrollPane.setBounds(140, 270, 658, height);
		scrollPane.setOpaque(false);
		this.add(scrollPane);
		scrollPane.setViewportView(table);
	}
}

