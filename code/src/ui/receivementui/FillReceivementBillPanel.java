package ui.receivementui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import bl.receivement.Impl.TransportFinishedController;
import tools.TimeHelper;
import tools.VaildHelper;
import ui.NSwing.NLabel;
import ui.NSwing.NTable;
import ui.NSwing.NTextField;
import ui.NSwing.TimePanel;
import vo.ReceiveInformationVO;

public class FillReceivementBillPanel extends JPanel {
	private JTable table;
	private NTextField textFieldofday;
	private NTextField textFieldofmonth;
	JButton okButton;
	JScrollPane scrollPane;
	ArrayList<ReceiveInformationVO> staffs;
	public FillReceivementBillPanel(){
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);	
		
		NLabel id = new NLabel("订单编号");
		id.setBounds(120, 90, 80, 30);
		this.add(id);
		
		final NTextField billID = new NTextField();
		billID.setBounds(210, 90, 140, 30);
		this.add(billID);
		billID.setColumns(10);
		
		NLabel name = new NLabel("收件人");
		name.setBounds(390, 90, 60, 30);
		this.add(name);
		
		final NTextField userName = new NTextField();
		userName.setBounds(460, 90, 80, 30);
		this.add(userName);
		userName.setColumns(10);
		
		NLabel labelofdate = new NLabel("收件日期");
		labelofdate.setBounds(580, 90, 70, 30);
		this.add(labelofdate);
		
		NTextField textFieldofyear = new NTextField();
		textFieldofyear.setBounds(660, 90, 50, 30);
		this.add(textFieldofyear);
		textFieldofyear.setColumns(4);
		
		NLabel labelofyear = new NLabel("年");
		labelofyear.setBounds(715, 90, 20, 30);
		this.add(labelofyear);
		
		textFieldofmonth = new NTextField();
		textFieldofmonth.setBounds(740, 90, 50, 30);
		this.add(textFieldofmonth);
		textFieldofmonth.setColumns(2);
		
		
		NLabel labelofmonth = new NLabel("月");
		labelofmonth.setBounds(795, 90, 20, 30);
		this.add(labelofmonth);
		
		textFieldofday = new NTextField();
		textFieldofday.setBounds(820, 90,50, 30);
		this.add(textFieldofday);
		textFieldofday.setColumns(2);
		
		NLabel labelofday = new NLabel("日");
		labelofday.setBounds(875, 90, 20, 30);
		this.add(labelofday);
		
		staffs=new ArrayList<ReceiveInformationVO>(); 

		JButton addButton = new JButton("添加");
		addButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String thisID=billID.getText();
				String thisName=userName.getText();
				String thisDate=TimeHelper.adjustTime(textFieldofyear.getText(), 4)+
						TimeHelper.adjustTime(textFieldofmonth.getText(),2)+
						TimeHelper.adjustTime(textFieldofday.getText(),2);
				boolean result=true;
				System.out.println(thisDate);
				result=result&&VaildHelper.checkIsValidID(thisID, 10);
				result=result&&VaildHelper.checkIsValidID(thisDate,8);
				if(result){
					staffs.add(new ReceiveInformationVO(thisID,thisName,thisDate));
					billID.setText("");
					userName.setText("");
					textFieldofyear.setText("");
					textFieldofmonth.setText("");
					textFieldofday.setText("");
					buildTable(staffs);
					repaint();
				}
			}
		});
		addButton.setBounds(755, 140, 80, 30);
		this.add(addButton);

		okButton=new JButton();
		okButton.setIcon(new ImageIcon("pic/ok40.png"));
		okButton.setBounds(720, 500, 40, 40);
		okButton.setBorder(null);
		okButton.setFocusPainted(false);
		okButton.setBorderPainted(false);
		okButton.setContentAreaFilled(false);
		okButton.addActionListener(new PushListener());
		this.add(okButton);
	}
	
	protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.gray);
        g.drawRect(125, 250, 690, 300);
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
	

	
	class PushListener implements ActionListener{	
		public void actionPerformed(ActionEvent arg0) {
			TransportFinishedController trans=new TransportFinishedController();
			boolean result=trans.billFilled(staffs);
			if(result){
				staffs=new ArrayList<ReceiveInformationVO>();
				buildTable(staffs);
				System.out.println(" tongguo");
				repaint();
			}else{
				TimePanel.change=true;
				TimePanel.text="提交失败！请重试！";
			}
		}
		
	}
}
