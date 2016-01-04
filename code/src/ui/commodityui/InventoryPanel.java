package ui.commodityui;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import ui.NSwing.NLabel;
import ui.NSwing.NTable;
import ui.NSwing.NTextField;
import vo.ReceiveInformationVO;

public class InventoryPanel extends JPanel{
	
	private JTable table;
	JScrollPane scrollPane;
	
	public InventoryPanel(){
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);	
		
		NLabel labelofdate = new NLabel("截止日期");
		labelofdate.setBounds(400, 200, 80, 30);
		this.add(labelofdate);
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		
	    NLabel date = new NLabel("");
		date.setText(df.format(new Date()));//显示当前时间
		date.setBounds(550, 200, 200, 30);
		this.add(date);
		
		
	}
	
	public void buildTable(ArrayList<ReceiveInformationVO> staffs){
		if(this.scrollPane!=null)
			this.remove(scrollPane);
		int size=staffs.size();
		
		Object[][] tableData=new Object[size][3];
		for(int i=0;i<size;i++){
			ReceiveInformationVO mess=staffs.get(i);
			System.out.println(mess.time[0]+mess.time[1]+mess.time[2]);
			tableData[i]=new Object[]{mess.ID,mess.nameOfReceiver,
					mess.time[0]+mess.time[1]+mess.time[2]};
		}
		Object[] columnTitle = {"订单编号" ,"收件人","收件日期"};  
		table=new NTable(tableData,columnTitle);
		int height=table.getRowHeight()*(size+1)+13;
		int ValidMaxHeight=250;
		if(height>=400)
			height=ValidMaxHeight;
		//table.setBounds(200, 50, 600, height);
		table.setOpaque(false); 
		table.setRowSelectionAllowed(true);
		scrollPane = new JScrollPane();
		scrollPane.setBounds(140, 270, 658, height);
		scrollPane.setOpaque(false);
		this.add(scrollPane);
		scrollPane.setViewportView(table);
		
	}

}
