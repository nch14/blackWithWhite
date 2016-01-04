package ui.information;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import settings.BussinessHall;
import settings.CompanySettingsController;
import settings.TransportCenter;
import ui.NSwing.NButton;
import ui.NSwing.NLabel;
import ui.NSwing.NTable;
import ui.NSwing.TimePanel;

public class DeleteDepartmentPanel extends JPanel {
	NLabel chooseType;
	JComboBox<String> chooseType1;
	
	NLabel chooseCity;
	JComboBox<String> chooseCity1;
	
	NLabel chooseTrans;
	JComboBox<String> chooseTrans1;
	
	NLabel chooseBussess;
	JComboBox<String> chooseBussess1;
	
	NButton ok;
	
	NTable table;
	JScrollPane scrollPane;
	public DeleteDepartmentPanel (){
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
		
		chooseType=new NLabel("请选择删除类型");
		chooseType.setBounds(120, 50, 140, 30);
		this.add(chooseType);
		
		chooseType1=new JComboBox<String>();
		chooseType1.addItem("城市");
		chooseType1.addItem("中转中心");
		chooseType1.addItem("营业厅");
		chooseType1.setBounds(300, 50, 100, 30);
		chooseType1.addFocusListener(new SelectListener());
		this.add(chooseType1);
		
		deleteCity();
	}
	
	public void deleteCity(){
		if(chooseTrans!=null){
			this.remove(chooseTrans);
			this.remove(chooseTrans1);
			this.remove(ok);
			chooseTrans=null;
			chooseTrans1=null;
			ok=null;
			repaint();
		}
		if(chooseBussess!=null){
			this.remove(chooseBussess);
			this.remove(chooseBussess);
			chooseBussess=null;
			chooseBussess=null;
			repaint();
		}
		
		chooseCity=new NLabel("选择城市");
		chooseCity.setBounds(120, 110, 80, 30);
		this.add(chooseCity);
		
		chooseCity1=new JComboBox<String>();
		CompanySettingsController csc=new CompanySettingsController();
		String[] names=csc.getCityName();
		for(int i=0;i<names.length;i++){
			chooseCity1.addItem((String)names[i]);
		}
		chooseCity1.setBounds(220, 110, 100, 30);
		this.add(chooseCity1);
		
		ok=new NButton("ok");
		ok.setBounds(700, 50, 40, 40);
		ok.addActionListener(new DeleteListener());
		this.add(ok);
		removeTable();
		buildTable(names);
	}
	
	public void deleteTransport(){
		if(ok!=null){
			this.remove(ok);
			ok=null;
			repaint();
		}
		if(chooseBussess!=null){
			this.remove(chooseBussess);
			this.remove(chooseBussess1);
			chooseBussess=null;
			chooseBussess1=null;
			repaint();
		}
		chooseCity=new NLabel("选择城市");
		chooseCity.setBounds(120, 110, 80, 30);
		this.add(chooseCity);
		
		chooseCity1=new JComboBox<String>();
		CompanySettingsController csc=new CompanySettingsController();
		String[] names=csc.getCityName();
		for(int i=0;i<names.length;i++){
			chooseCity1.addItem((String)names[i]);
		}
		chooseCity1.setBounds(220, 110, 100, 30);
		chooseCity1.addFocusListener(new SelectTransListener());
		this.add(chooseCity1);
		
		chooseTrans=new NLabel("选择中转中心");
		chooseTrans.setBounds(500, 110, 140, 30);
		this.add(chooseTrans);
		
		chooseTrans1=new JComboBox<String>();
		chooseTrans1.setBounds(660, 110, 100, 30);
		this.add(chooseTrans1);
		
		ok=new NButton("ok");
		ok.setBounds(750, 110, 40, 40);
		ok.addActionListener(new DeleteTransListener());
		this.add(ok);
	}
	
	public void deleteBussiness(){
		if(ok!=null){
			this.remove(ok);
			ok=null;
			repaint();
		}
		chooseCity=new NLabel("选择城市");
		chooseCity.setBounds(120, 110, 80, 30);
		this.add(chooseCity);
		
		chooseCity1=new JComboBox<String>();
		CompanySettingsController csc=new CompanySettingsController();
		String[] names=csc.getCityName();
		for(int i=0;i<names.length;i++){
			chooseCity1.addItem((String)names[i]);
		}
		chooseCity1.setBounds(220, 110, 100, 30);
		chooseCity1.addFocusListener(new SelectTransListener());
		this.add(chooseCity1);
		
		chooseTrans=new NLabel("选择中转中心");
		chooseTrans.setBounds(500, 110, 140, 30);
		this.add(chooseTrans);
		
		chooseTrans1=new JComboBox<String>();
		chooseTrans1.setBounds(660, 110, 100, 30);
		chooseTrans1.addFocusListener(new SelectBussessListener());
		this.add(chooseTrans1);
		
		chooseBussess=new NLabel("选择营业厅");
		chooseBussess.setBounds(120, 170, 140, 30);
		this.add(chooseBussess);
		
		chooseBussess1=new JComboBox<String>();
		chooseBussess1.setBounds(280, 170, 100, 30);
		this.add(chooseBussess1);
		
		ok=new NButton("ok");
		ok.setBounds(750, 110, 40, 40);
		ok.addActionListener(new DeleteBussinessListener());
		this.add(ok);
	}
	class SelectListener implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			String chosed=(String)chooseType1.getSelectedItem();
			if(chosed.equals("城市")){
				deleteCity();
			}
			if(chosed.equals("中转中心")){
				deleteTransport();
			}
			if(chosed.equals("营业厅")){
				deleteBussiness();
			}
		}
		
	}
	
	class DeleteListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String one=(String) chooseCity1.getSelectedItem();
			CompanySettingsController csc=new CompanySettingsController();
			boolean result=csc.deleteCity(one);
			if(result){
				TimePanel.makeWords("成功删除该城市！");
			}
		}
		
	}
	
	class SelectTransListener implements FocusListener{

		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			// TODO Auto-generated method stub
			String text=(String) chooseCity1.getSelectedItem();
			System.out.println("text");
			CompanySettingsController csc=new CompanySettingsController();			
			try {
				chooseTrans1.removeAllItems();
			} catch (Exception e) {
			}
			TransportCenter[] names=csc.getTransportCenters(text);
			for(int i=0;i<names.length;i++){
				chooseTrans1.addItem((String)names[i].getName());
			}
			removeTable();
			String name[]=new String[names.length];
			for(int i=0;i<name.length;i++){
				name[i]=names[i].getName();
			}
			buildTable("中转中心",name);
			repaint();
		}
		
	}
	
	class DeleteTransListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String one=(String) chooseTrans1.getSelectedItem();
			CompanySettingsController csc=new CompanySettingsController();
			boolean result=csc.deleteTrans((String)chooseCity1.getSelectedItem(),one);
			if(result){
				TimePanel.makeWords("成功删除该中转中心！");
			}	
		}
		
	}
	
	class SelectBussessListener implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			String text1=(String) chooseCity1.getSelectedItem();			
			try {
				chooseBussess1.removeAllItems();
			} catch (Exception f) {
			}
			CompanySettingsController csc3=new CompanySettingsController();
			BussinessHall[] names3=csc3.getBussinessHalls(text1);
			for(int i=0;i<names3.length;i++){
				chooseBussess1.addItem((String)names3[i].name);
			}
			removeTable();
			String name[]=new String[names3.length];
			for(int i=0;i<name.length;i++){
				name[i]=names3[i].name;
			}
			buildTable("营业厅",name);
			repaint();
		}
		
	}
	class DeleteBussinessListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String text1=(String) chooseCity1.getSelectedItem();
			String text2=(String) chooseTrans1.getSelectedItem();
			CompanySettingsController csc=new CompanySettingsController();
			boolean result=csc.deleteBussiness(text1,text2,(String)chooseBussess1.getSelectedItem());
			if(result){
				TimePanel.makeWords("成功删除该营业厅！");
			}	
		}
		
	}
	
	public void buildTable(String[] names){
		int size=names.length;
		
		Object[][] tableData=new Object[size][1];
		for(int i=0;i<size;i++){
			tableData[i]=new Object[]{names[i]};
		}
		Object[] columnTitle = {"城市列表"};  
		table=new NTable(tableData,columnTitle);
		int height=table.getRowHeight()*(size+1)+9;
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
	public void buildTable(String type,String[] names){
		int size=names.length;
		
		Object[][] tableData=new Object[size][2];
		for(int i=0;i<size;i++){
			tableData[i]=new Object[]{type,names[i]};
		}
		Object[] columnTitle = {"机构类型","机构名称"};  
		table=new NTable(tableData,columnTitle);
		int height=table.getRowHeight()*(size+1)+9;
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
	public void removeTable(){
		if(scrollPane!=null)
			this.remove(scrollPane);
	}
}
