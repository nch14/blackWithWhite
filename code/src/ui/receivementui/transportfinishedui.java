package ui.receivementui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import bl.receivement.Impl.TransportFinishedController;
import bl.receivement.Service.TransportFinishedBLService;
import vo.ReceiveInformationVO;

public class transportfinishedui extends JDesktopPane{
	private JTable table_1;
	private JTextField textFieldofday;
	private JTextField textFieldofmonth;
	public transportfinishedui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBackground(Color.WHITE);
		
		final JLabel label_31 = new JLabel();
		label_31.setBounds(282, 0, 436, 21);
		this.add(label_31);
		
		
		JLabel labelofordernumber = new JLabel("订单编号");
		labelofordernumber.setBounds(157, 87, 66, 15);
		this.add(labelofordernumber);
		
		final JTextField textFieldofordernumber = new JTextField();
		textFieldofordernumber.setBounds(223, 84, 66, 21);
		this.add(textFieldofordernumber);
		textFieldofordernumber.setColumns(10);
		
		JLabel labelofconsignee = new JLabel("收件人");
		labelofconsignee.setBounds(353, 87, 54, 15);
		this.add(labelofconsignee);
		
		final JTextField textFieldofconsignee = new JTextField();
		textFieldofconsignee.setBounds(404, 84, 66, 21);
		this.add(textFieldofconsignee);
		textFieldofconsignee.setColumns(10);
		
		JLabel labelofdate = new JLabel("收件日期");
		labelofdate.setBounds(519, 87, 74, 15);
		this.add(labelofdate);
		
		final JTextField textFieldofyear = new JTextField();
		textFieldofyear.setBounds(594, 82, 34, 21);
		this.add(textFieldofyear);
		textFieldofyear.setColumns(10);
		
		/*
		 * 收件信息添加
		 */
		JButton button = new JButton("\u6DFB\u52A0");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				for(int i=0;i<table_1.getRowCount();i++){
					if(table_1.getValueAt(i, 0)==null&&table_1.getValueAt(i, 1)==null&&table_1.getValueAt(i, 2)==null){
						String month=textFieldofmonth.getText();
						String day=textFieldofday.getText();
						if(month.length()==1){
							month="0"+month;
						}
						if(day.length()==1){
							day="0"+day;
						}
						String date=textFieldofyear.getText()+month+day;
						table_1.setValueAt(textFieldofordernumber.getText(), i, 0);
						table_1.setValueAt(textFieldofconsignee.getText(), i, 1);
						table_1.setValueAt(date, i, 2);
						textFieldofordernumber.setText(null);
						textFieldofconsignee.setText(null);
						textFieldofyear.setText(null);
						textFieldofmonth.setText(null);
						textFieldofday.setText(null);
						break;
					}
				}
			}
		});
		button.setBounds(755, 122, 93, 23);
		this.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(157, 174, 668, 347);
		this.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
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
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"订单编号", "收件人", "收件日期"
			}
		));
		scrollPane.setViewportView(table_1);
		
		/*
		 * 收件信息撤销
		 */
		JButton button_1 = new JButton("\u64A4\u9500");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_1.getRowCount()-1;i>=0;i--){
					if(table_1.getValueAt(i, 0)!=null&&table_1.getValueAt(i, 1)!=null&&table_1.getValueAt(i, 2)!=null){
						table_1.setValueAt(null, i, 0);
						table_1.setValueAt(null, i, 1);
						table_1.setValueAt(null, i, 2);
					}
				}
			}
		});
		button_1.setBounds(157, 531, 93, 23);
		this.add(button_1);
		
		/*
		 * 收件信息提交
		 */
		JButton button_2 = new JButton("\u63D0\u4EA4");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ReceiveInformationVO receiveInfo = new ReceiveInformationVO();
				ArrayList<ReceiveInformationVO> receive = new ArrayList<ReceiveInformationVO>();
				int count=0;
				while(!(table_1.getValueAt(count, 0)==null)){
					++count;
				}
				for(int i=0;i<count;i++){
					receiveInfo.ID= table_1.getValueAt(i, 0).toString();
					receiveInfo.nameOfReceiver=(String) table_1.getValueAt(i, 1);
					receiveInfo.time[0]= table_1.getValueAt(i, 2).toString().substring(0, 3);
					receiveInfo.time[1]= table_1.getValueAt(i, 2).toString().substring(4, 5);
					receiveInfo.time[2]= table_1.getValueAt(i, 2).toString().substring(6, 7);
				}
				receive.add(receiveInfo);
				TransportFinishedBLService finish= new TransportFinishedController();
				boolean istrue=finish.billFilled(receive);
				if(istrue){
					for(int i=0; i<table_1.getRowCount();i++){
						table_1.setValueAt(null, i, 0);
						table_1.setValueAt(null, i, 1);
						table_1.setValueAt(null, i, 2);
					}
				}else{
					
				}
			}
		});
		button_2.setBounds(755, 531, 93, 23);
		this.add(button_2);
		
		JLabel labelofyear = new JLabel("年");
		labelofyear.setBounds(638, 87, 54, 15);
		this.add(labelofyear);
		
		textFieldofmonth = new JTextField();
		textFieldofmonth.setBounds(658, 84, 34, 21);
		this.add(textFieldofmonth);
		textFieldofmonth.setColumns(10);
		
		JLabel labelofmonth = new JLabel("月");
		labelofmonth.setBounds(699, 87, 54, 15);
		this.add(labelofmonth);
		
		textFieldofday = new JTextField();
		textFieldofday.setBounds(718, 84, 34, 21);
		this.add(textFieldofday);
		textFieldofday.setColumns(10);
		
		JLabel labelofday = new JLabel("日");
		labelofday.setBounds(763, 87, 54, 15);
		this.add(labelofday);
		
		new Thread() {        
			public void run() {            
				try {                
					while (true) {                    
						SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
						label_31.setText(df.format(new Date()));//显示当前时间
						Thread.sleep(1000);//暂停一秒                
						}            
					} catch (Exception e) {            
						
					}        
				}    
			}.start();
	}
}
