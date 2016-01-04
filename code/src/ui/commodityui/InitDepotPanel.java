package ui.commodityui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import bl.commoditybl.Impl.InitDepotAreaController;
import bl.commoditybl.Service.InitDepotAreaBLService;
import ui.NSwing.NButton;
import ui.NSwing.NLabel;
import ui.NSwing.NTable;
import ui.NSwing.NTextField;
import ui.NSwing.TimePanel;

public class InitDepotPanel extends JPanel{
	NLabel labelofairarea;
	NLabel labeloftrainarea;
	NLabel labeloftruckarea;
	NLabel labelofmanoeuveringarea;
	private NTextField textFieldofairrownumber_1;
	private NTextField textFieldoftrainrownumber_1;
	private NTextField textFieldoftruckrownumber_1;
	private NTextField textFieldofmanoeuveringrownumber_1;
	private NTextField textFieldofairrownumber_2;
	private NTextField textFieldoftrainrownumber_2;
	private NTextField textFieldoftrucknumber_2;
	private NTextField textFieldofmanoeuveringrownumber_2;
	NTable table;
	JScrollPane scrollPane;
	
	public InitDepotPanel(){
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
		
		NLabel labelofairarea = new NLabel("航运区");
		labelofairarea.setBounds(300, 90, 60, 30);
		this.add(labelofairarea);
		
		NLabel labeloftrainarea = new NLabel("铁运区");
		labeloftrainarea.setBounds(300, 140, 60, 30);
		this.add(labeloftrainarea);
		
		NLabel labeloftruckarea = new NLabel("汽运区");
		labeloftruckarea.setBounds(300, 190, 60, 30);
		this.add(labeloftruckarea);
		
		labelofmanoeuveringarea = new NLabel("机动区");
		labelofmanoeuveringarea.setBounds(300, 230, 60, 30);
		this.add(labelofmanoeuveringarea);
		
		textFieldofairrownumber_1 = new NTextField();
		textFieldofairrownumber_1.setBounds(380, 90, 60, 30);
		this.add(textFieldofairrownumber_1);
		textFieldofairrownumber_1.setColumns(10);
		
		textFieldoftrainrownumber_1 = new NTextField();
		textFieldoftrainrownumber_1.setBounds(380, 140, 60, 30);
		this.add(textFieldoftrainrownumber_1);
		textFieldoftrainrownumber_1.setColumns(10);
		
		textFieldoftruckrownumber_1 = new NTextField();
		textFieldoftruckrownumber_1.setBounds(380, 190, 60, 30);
		this.add(textFieldoftruckrownumber_1);
		textFieldoftruckrownumber_1.setColumns(10);
		
		textFieldofmanoeuveringrownumber_1 = new NTextField();
		textFieldofmanoeuveringrownumber_1.setBounds(380, 230, 60, 30);
		this.add(textFieldofmanoeuveringrownumber_1);
		textFieldofmanoeuveringrownumber_1.setColumns(10);

		NLabel labelofairrownumber_1 = new NLabel("排 到");
		labelofairrownumber_1.setBounds(460, 90, 60, 30);
		this.add(labelofairrownumber_1);
		
		NLabel labeloftrainrownumber_1 = new NLabel("排 到");
		labeloftrainrownumber_1.setBounds(460, 140, 60, 30);
		this.add(labeloftrainrownumber_1);
		
		NLabel labeloftruckrownumber_1 = new NLabel("排 到");
		labeloftruckrownumber_1.setBounds(460, 190, 60, 30);
		this.add(labeloftruckrownumber_1);
		
		NLabel labelofmanoeuveringrownumber_1 = new NLabel("排 到");
		labelofmanoeuveringrownumber_1.setBounds(460, 230, 60, 30);
		this.add(labelofmanoeuveringrownumber_1);
		
		textFieldofairrownumber_2 = new NTextField();
		textFieldofairrownumber_2.setBounds(540, 90, 60, 30);
		this.add(textFieldofairrownumber_2);
		textFieldofairrownumber_2.setColumns(10);
		
		textFieldoftrainrownumber_2 = new NTextField();
		textFieldoftrainrownumber_2.setColumns(10);
		textFieldoftrainrownumber_2.setBounds(540, 140, 60, 30);
		this.add(textFieldoftrainrownumber_2);
		
		textFieldoftrucknumber_2 = new NTextField();
		textFieldoftrucknumber_2.setColumns(10);
		textFieldoftrucknumber_2.setBounds(540, 190, 60, 30);
		this.add(textFieldoftrucknumber_2);
		
		textFieldofmanoeuveringrownumber_2 = new NTextField();
		textFieldofmanoeuveringrownumber_2.setColumns(10);
		textFieldofmanoeuveringrownumber_2.setBounds(540, 230, 60, 30);
		this.add(textFieldofmanoeuveringrownumber_2);
		
		NLabel labelofairrownumber_2 = new NLabel("排");
		labelofairrownumber_2.setBounds(620, 90, 60, 30);
		this.add(labelofairrownumber_2);
		
		NLabel labeloftrainrownumber_2 = new NLabel("排");
		labeloftrainrownumber_2.setBounds(620, 140, 60, 30);
		this.add(labeloftrainrownumber_2);
		
		NLabel labeloftruckrownumber_2 = new NLabel("排");
		labeloftruckrownumber_2.setBounds(620, 190, 60, 30);
		this.add(labeloftruckrownumber_2);
		
		NLabel labelofmanoeuveringrownumber_2 = new NLabel("排");
		labelofmanoeuveringrownumber_2.setBounds(620, 230, 60, 30);
		this.add(labelofmanoeuveringrownumber_2);
		
		NButton buttonofadd = new NButton("添加");
		buttonofadd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				for(int i =Integer.parseInt(textFieldofairrownumber_1.getText())-1;i<Integer.parseInt(textFieldofairrownumber_2.getText());i++){
					table.setValueAt(i+1, i, 0);
					table.setValueAt("航运区", i,1);
				}
				for(int i =Integer.parseInt(textFieldoftrainrownumber_1.getText())-1;i<Integer.parseInt(textFieldoftrainrownumber_2.getText());i++){
					table.setValueAt(i+1, i, 0);
					table.setValueAt("铁运区", i,1);
				}
				for(int i =Integer.parseInt(textFieldoftruckrownumber_1.getText())-1;i<Integer.parseInt(textFieldoftrucknumber_2.getText());i++){
					table.setValueAt(i+1, i, 0);
					table.setValueAt("汽运区", i,1);
				}
				for(int i =Integer.parseInt(textFieldofmanoeuveringrownumber_1.getText())-1;i<Integer.parseInt(textFieldofmanoeuveringrownumber_2.getText());i++){
					table.setValueAt(i+1, i, 0);
					table.setValueAt("机动区", i,1);
				}
				
			}
		});
		buttonofadd.setBounds(640, 280, 40, 40);
		this.add(buttonofadd);
		
		NButton buttonofsubmit = new NButton("提交");
		buttonofsubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int[] motorTransport = new int[table.getRowCount()];
				int[] trainTransport = new int[table.getRowCount()];
				int[] airTransport = new int[table.getRowCount()];
				int[] balnkSpace = new int[table.getRowCount()];
				for(int i=0;i<table.getRowCount();i++){
					if(table.getValueAt(i, 1).equals("航运区")){
						airTransport[i]=(int)table.getValueAt(i, 0);
					}else if(table.getValueAt(i, 1).equals("铁运区")){
						trainTransport[i]=(int)table.getValueAt(i, 0);
					}else if(table.getValueAt(i, 1).equals("汽运区")){
						motorTransport[i]=(int)table.getValueAt(i, 0);
					}else if(table.getValueAt(i, 1).equals("机动区")){
						balnkSpace[i]=(int)table.getValueAt(i, 0);
					}
				}
				InitDepotAreaBLService initdepotarea = new InitDepotAreaController();
				 boolean istrue=initdepotarea.init(motorTransport, trainTransport, airTransport, balnkSpace);
				if(istrue==false){
					TimePanel.makeWords("提交失败！");
				}else{
					for(int i=0;i<table.getRowCount();i++){
						table.setValueAt(null, i, 0);
						table.setValueAt(null, i, 1);
					}
					TimePanel.makeWords("提交成功！");
				}
			}
		});
		buttonofsubmit.setBounds(640, 600, 40, 40);
		this.add(buttonofsubmit);
		
		int[] rows = new int[4];
		String area[] = {"航运区","铁运区","汽运区","机动区"};
		buildTable(rows,area);
		repaint();
	}
	
	public void buildTable(int[] rows,String[] area){
		int size = rows.length;
		Object[][] tableData=new Object[size][2];
		for(int i=0;i<size;i++){
			tableData[i]=new Object[]{rows,area};
		}
		Object[] columnTitle = {"排号","分区"};  
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
