package ui.commodityui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import bill.StockBill_In;
import bl.commoditybl.Impl.InDepotController;
import bl.commoditybl.Impl.OutDepotController;
import tools.TimeHelper;
import tools.VaildHelper;
import ui.NSwing.NLabel;
import ui.NSwing.NTable;
import ui.NSwing.NTextField;
import ui.NSwing.TimePanel;
import ui.commodityui.OutDepotPanel.PushListener;

public class InDepotPanel extends JPanel {
	
	private JTextField textFieldofindepotnumber;
	private JTextField textFieldofyear;
	private JTextField textFieldofmonth;
	private JTextField textFieldofday;
	private JTextField textFieldofdestination;
	private JTextField textFieldofordernumber;
	private JTable table;
	JScrollPane scrollPane;
	StockBill_In indepot;
	JButton okButton;
	
	public InDepotPanel() {
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
		
		JLabel labelofindepotnumber = new NLabel("入库单号");
		labelofindepotnumber.setBounds(120, 50, 80, 30);
		this.add(labelofindepotnumber);
		
		textFieldofindepotnumber= new NTextField();
		textFieldofindepotnumber.setBounds(250, 50, 160, 30);
		this.add(textFieldofindepotnumber);
		textFieldofindepotnumber.setColumns(10);
		
		JLabel labelofindepotdate = new NLabel("入库日期");
		labelofindepotdate.setBounds(580, 50, 70, 30);
		this.add(labelofindepotdate);
		
		textFieldofyear = new NTextField();
		textFieldofyear.setBounds(660, 50, 50, 30);
		this.add(textFieldofyear);
		textFieldofyear.setColumns(10);
		
		JLabel labelofyear = new NLabel("年");
		labelofyear.setBounds(715, 50, 20, 30);
		this.add(labelofyear);
		
		textFieldofmonth = new NTextField();
		textFieldofmonth.setBounds(740, 50, 50, 30);
		this.add(textFieldofmonth);
		textFieldofmonth.setColumns(10);
		
		JLabel labelofmonth = new NLabel("月");
		labelofmonth.setBounds(795, 50, 20, 30);
		this.add(labelofmonth);
		
		textFieldofday = new NTextField();
		textFieldofday.setBounds(820, 50, 50, 30);
		this.add(textFieldofday);
		textFieldofday.setColumns(10);
		
		JLabel labelofday = new NLabel("日");
		labelofday.setBounds(875, 50, 20, 30);
		this.add(labelofday);
		
		JLabel labelofdestination = new NLabel("目的地");
		labelofdestination.setBounds(120, 110, 60, 30);
		this.add(labelofdestination);
		
		textFieldofdestination = new NTextField();
		textFieldofdestination.setBounds(250, 110, 160, 30);
		this.add(textFieldofdestination);
		textFieldofdestination.setColumns(10);
		
		JLabel labelofordernumber = new NLabel("订单号");
		labelofordernumber.setBounds(580, 110, 60, 30);
		this.add(labelofordernumber);
		
		textFieldofordernumber = new NTextField();
		textFieldofordernumber.setBounds(660, 110, 235, 30);
		this.add(textFieldofordernumber);
		textFieldofordernumber.setColumns(10);
		

		
		JButton addButton = new JButton("添加");
		addButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(indepot==null){
					String thisBillID=textFieldofindepotnumber.getText();
				    String thisID=textFieldofordernumber.getText();
					String thisDestination=textFieldofdestination.getText();
					String thisDate=TimeHelper.adjustTime(textFieldofyear.getText(), 4)+
							TimeHelper.adjustTime(textFieldofmonth.getText(),2)+
							TimeHelper.adjustTime(textFieldofday.getText(),2);
					boolean result=true;
					System.out.println(thisDate);
					result=result&&VaildHelper.checkIsValidID(thisID, 10);
					result=result&&VaildHelper.checkIsValidID(thisDate,8);
					if(result){
						indepot = new StockBill_In();
						indepot.addlist(thisBillID,thisID,thisDate,thisDestination);
						textFieldofordernumber.setText("");
						textFieldofdestination.setText("");
						buildTable(indepot);
						repaint();
					}
				}else if(indepot!=null&&
						((!textFieldofindepotnumber.getText().equals(indepot.ID))||
								(!((TimeHelper.adjustTime(textFieldofyear.getText(), 4)+
										TimeHelper.adjustTime(textFieldofmonth.getText(),2)+
										TimeHelper.adjustTime(textFieldofday.getText(),2)).equals(indepot.list.get(0).date))))){
					TimePanel.makeWords("入库单编号及入库日期不可改！");
				}else{
					    String thisID=textFieldofordernumber.getText();
						String thisDestination=textFieldofdestination.getText();
						boolean result=true;
						result=result&&VaildHelper.checkIsValidID(thisID, 10);
						if(result){
							indepot.addlist(indepot.ID,thisID,indepot.list.get(0).date.toString(),thisDestination);
							buildTable(indepot);
							textFieldofordernumber.setText("");
							textFieldofdestination.setText("");
							repaint();
						}
				}
			}
		});
		addButton.setBounds(815, 160, 80, 30);
		this.add(addButton);
		
		okButton=new JButton();
		okButton.setIcon(new ImageIcon("pic/ok40.png"));
		okButton.setBounds(800, 560, 40, 40);
		okButton.setBorder(null);
		okButton.setFocusPainted(false);
		okButton.setBorderPainted(false);
		okButton.setContentAreaFilled(false);
		okButton.addActionListener(new PushListener());
		this.add(okButton);
	}
	
	public void buildTable(StockBill_In indepot){
		if(this.scrollPane!=null)
			this.remove(scrollPane);

		int size=indepot.list.size();
		Object[][] tableData=new Object[size][7];
		for(int i=0;i<size;i++){
			tableData[i]=new Object[]{indepot.list.get(i).ID,indepot.list.get(i).date,indepot.list.get(i).destination,
					indepot.list.get(i).zoneID,indepot.list.get(i).rowID,indepot.list.get(i).frameID,indepot.list.get(i).positionID};
		}
		Object[] columnTitle = {"订单号", "入库日期", "目的地","区号","排号","架号","位号"};  
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
	public void removeTable(){
		if(scrollPane!=null)
			this.remove(scrollPane);
	}
	
	class PushListener implements ActionListener{	
		public void actionPerformed(ActionEvent arg0) {
			InDepotController Indepot=new InDepotController();
			StockBill_In result=Indepot.inDepot(indepot);
			if(result!=null){
				textFieldofindepotnumber.setText("");
				textFieldofordernumber.setText("");
				textFieldofyear.setText("");
				textFieldofmonth.setText("");
				textFieldofday.setText("");
				textFieldofdestination.setText("");
				TimePanel.makeWords("提交成功！");
				removeTable();
			}else{
				TimePanel.change=true;
				TimePanel.text="提交失败！请重试！";
			}
		}
		
	}

}
