package ui.shipment;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import bill.TransportBill;
import bl.shipment.Impl.TransportController;
import tools.TimeHelper;
import tools.VaildHelper;
import ui.NSwing.NButton;
import ui.NSwing.NLabel;
import ui.NSwing.NTable;
import ui.NSwing.NTextField;
import ui.NSwing.TimePanel;

public class ShipPanel extends JPanel {
	private NTextField ChuFaDi;
	private NTextField JianZhuangYuan;
	private NTextField textField_transfer_order;
	private NTextField textField_planeNumber;
	private NTextField DaoDaDi;
	private NTextField textField_containerNumber;
	private NTextField textField_orderNumber;
	NLabel special;
	JLabel labelofstartdate;
	NTextField nian1;
	NTextField yue1 ;
	NTextField ri1 ;
	JLabel labelofstartyear;
	JLabel labelofstartmonth;
	JLabel labelofstartday;
	NLabel jianZhuangYuan;
	NLabel chuFaDi;
	NLabel cheCiHao;
	JScrollPane scrollPane;
	JComboBox<String> choose;
	NTable table;
	NButton add;
	NButton ok;
	String type1;
	String type2;
	TransportBill trans;
	public ShipPanel(){
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
		
		NLabel textPane_6 = new NLabel();
		textPane_6.setText("中转单编号");
		textPane_6.setBounds(530, 50, 100, 30);
		this.add(textPane_6);
		
		textField_transfer_order = new NTextField();
		textField_transfer_order.setBounds(630, 50, 150, 30);
		this.add(textField_transfer_order);
		
		JLabel type=new NLabel("请选择单据类型");
		type.setBounds(120, 50, 140, 30);
		this.add(type);
		
		choose=new JComboBox<String>();
		choose.setFont(new Font("微软雅黑",Font.BOLD,16));
		choose.addItem("汽车中转单");
		choose.addItem("火车中转单");
		choose.addItem("飞机中转单");
		choose.setBounds(250, 50, 160, 30);
		choose.addFocusListener(new SelectListener());
		this.add(choose);
		
		add=new NButton("add");

		
	}
	
	class SelectListener implements FocusListener{

		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			// TODO Auto-generated method stub
			String chosed=(String)choose.getSelectedItem();
			if(chosed.equals("汽车中转单")){
				romoveList(); 
				type1="押运员";
				type2="车次号";		
				buildList();
				repaint();
			}
			if(chosed.equals("火车中转单")){
				romoveList(); 
				type1="车厢号";
				type2="车次号";	
				buildList();
				 repaint();
			}
			if(chosed.equals("飞机中转单")){
				romoveList(); 
				type1="货柜号";
				type2="航班号";	
				buildList();
				repaint();
			}
		}
	
	}
	public void romoveList(){
		if(special!=null){
			this.remove(special);
			this.remove(cheCiHao);
		}
		this.repaint();
	}
	public void buildList(){
		labelofstartdate = new JLabel();
		labelofstartdate.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofstartdate.setText("中转日期");
		labelofstartdate.setBounds(120, 110, 80, 30);
		this.add(labelofstartdate);
		nian1 = new NTextField();
		nian1.setBounds(220, 110, 40,30);
		this.add(nian1);
		nian1.setColumns(10);
		labelofstartyear = new JLabel();
		labelofstartyear.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofstartyear.setText("年");
		labelofstartyear.setBounds(265,110, 20, 30);
		this.add(labelofstartyear);
		yue1 = new NTextField();
		yue1.setColumns(10);
		yue1.setBounds(295, 110, 40, 30);
		this.add(yue1);
		labelofstartmonth = new JLabel();
		labelofstartmonth.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofstartmonth.setText("月");
		labelofstartmonth.setBounds(340, 110, 20, 30);
		this.add(labelofstartmonth);
		ri1 = new NTextField();
		ri1.setColumns(10);
		ri1.setBounds(370, 110, 40, 30);
		this.add(ri1);
		labelofstartday = new JLabel();
		labelofstartday.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofstartday.setText("日");
		labelofstartday.setBounds(415, 110, 20, 30);
		this.add(labelofstartday);
		
		
		chuFaDi = new NLabel();
		chuFaDi.setText("出发地");
		chuFaDi.setBounds(530, 110,60, 30);
		this.add(chuFaDi);
		
		ChuFaDi = new NTextField();
		ChuFaDi.setBounds(610, 110, 100, 30);
		this.add(ChuFaDi);
		ChuFaDi.setColumns(10);
		
		jianZhuangYuan = new NLabel();
		jianZhuangYuan.setText("监装员");
		jianZhuangYuan.setBounds(120, 170, 80, 30);
		this.add(jianZhuangYuan);
		
		JianZhuangYuan = new NTextField();
		JianZhuangYuan.setBounds(220, 170, 100, 30);
		this.add(JianZhuangYuan);
		JianZhuangYuan.setColumns(10);

		special = new NLabel();
		special.setText(type2);
		special.setBounds(120, 230, 50, 30);
		this.add(special);
		
		textField_containerNumber = new NTextField();
		textField_containerNumber.setBounds(220, 230, 100, 30);
		this.add(textField_containerNumber);
		textField_containerNumber.setColumns(10);
		
		NLabel textPane_8 = new NLabel();
		textPane_8.setText("到达地");
		textPane_8.setBounds(530, 170,60, 30);
		this.add(textPane_8);
		
		DaoDaDi = new NTextField();
		DaoDaDi.setBounds(610, 170, 100, 30);
		this.add(DaoDaDi);
		DaoDaDi.setColumns(10);
		
		
		
		
		cheCiHao = new NLabel();
		cheCiHao.setText(type1);
		cheCiHao.setBounds(530, 230, 60, 30);
		this.add(cheCiHao);
		
		textField_planeNumber = new NTextField();
		textField_planeNumber.setBounds(610, 230, 100, 30);
		this.add(textField_planeNumber);
		textField_planeNumber.setColumns(10);
		
		NLabel textPane_11 = new NLabel();
		textPane_11.setText("订单号");
		textPane_11.setBounds(350, 270, 60, 30);
		this.add(textPane_11);
		
		textField_orderNumber = new NTextField();
		textField_orderNumber.setBounds(440, 270, 120, 30);
		this.add(textField_orderNumber);
		textField_orderNumber.setColumns(10);
		
		add=new NButton("add");
		add.setBounds(600, 270, 40, 40);
		add.addActionListener(new AddListener());
		this.add(add);
		
		ok=new NButton("ok");
		ok.setBounds(800, 560, 40, 40);
		ok.addActionListener(new PushListener());
		this.add(ok);
		this.repaint();
	}
	

	public void buildTable(){
		ArrayList<String> list=trans.list;
		int size=list.size();
		Object[][] tableData=new Object[size][8];
		for(int i=0;i<size;i++){
			tableData[i]=new Object[]{trans.transBillID,TimeHelper.Array2String(trans.date),trans.placeOfDeparture,trans.destination,
					trans.observer,trans.yaYun,trans.cheCihao,list.get(i)};
		}
		Object[] columnTitle = {"中转单编号","中转日期","出发地","到达地","监装员",type1,type2,"订单号"};  
		table=new NTable(tableData,columnTitle);
		int height=table.getRowHeight()*(size+1)+13;
		int ValidMaxHeight=250;
		if(height>=275)
			height=ValidMaxHeight;
		table.setOpaque(false); 
		table.setRowSelectionAllowed(true);
		scrollPane = new JScrollPane();
		scrollPane.setBounds(140, 320, 658, height);
		scrollPane.setOpaque(false);
		this.add(scrollPane);
		scrollPane.setViewportView(table);
	}
	public void removeTable(){
		if(scrollPane!=null)
			this.remove(scrollPane);
	}
	class AddListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			String[] time=new String[]{nian1.getText(),yue1.getText(),ri1.getText()};
			boolean success=VaildHelper.checkIfValidDate(time)&&VaildHelper.checkIsValidID(textField_transfer_order.getText());			
			if(success){
				if(trans==null){
					trans=new TransportBill(time,textField_transfer_order.getText(),ChuFaDi.getText(),
							DaoDaDi.getText(),JianZhuangYuan.getText(),textField_containerNumber.getText(),textField_planeNumber.getText(),500);
					if(VaildHelper.checkIsValidID(textField_orderNumber.getText()))
						trans.list.add(textField_orderNumber.getText());
					removeTable();
					buildTable();
				}else{
					if(VaildHelper.checkIsValidID(textField_orderNumber.getText())){
						trans.list.add(textField_orderNumber.getText());
						removeTable();
						buildTable();
					}
				}
			}
		}
			
	}
	
	class PushListener implements ActionListener{

	
		public void actionPerformed(ActionEvent arg0) {
			TransportController tc=new TransportController();
			double d=tc.submitBills(trans);
			if(d>=0){
				TimePanel.makeWords("成功");
				trans=null;
				removeTable();
			}else{
				TimePanel.makeWords("失败");
			}
			
			
			
			
		}
		
	}
}
