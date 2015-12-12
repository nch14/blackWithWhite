package ui.receivementui;

import java.awt.Color;
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

import bl.receivement.Impl.TransportFinishedController;
import bl.receivement.Service.TransportFinishedBLService;
import vo.ReceiveInformationVO;

public class transportfinishedui extends JDesktopPane{
	private JTable table_1;
	private JTextField textField_29;
	private JTextField textField_28;
	public transportfinishedui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBackground(Color.WHITE);
		
		JLabel label_31 = new JLabel();
		label_31.setBounds(282, 0, 436, 21);
		this.add(label_31);
		
		
		JLabel label = new JLabel("\u8BA2\u5355\u7F16\u53F7\uFF1A");
		label.setBounds(157, 87, 66, 15);
		this.add(label);
		
		JTextField textField_4 = new JTextField();
		textField_4.setBounds(223, 84, 66, 21);
		this.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_1 = new JLabel("\u6536\u4EF6\u4EBA\uFF1A");
		label_1.setBounds(353, 87, 54, 15);
		this.add(label_1);
		
		JTextField textField_5 = new JTextField();
		textField_5.setBounds(404, 84, 66, 21);
		this.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel label_2 = new JLabel("\u6536\u4EF6\u65E5\u671F\uFF1A");
		label_2.setBounds(519, 87, 74, 15);
		this.add(label_2);
		
		JTextField textField_6 = new JTextField();
		textField_6.setBounds(594, 82, 34, 21);
		this.add(textField_6);
		textField_6.setColumns(10);
		
		/*
		 * 收件信息添加
		 */
		JButton button = new JButton("\u6DFB\u52A0");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				for(int i=0;i<table_1.getRowCount();i++){
					if(table_1.getValueAt(i, 0)==null&&table_1.getValueAt(i, 1)==null&&table_1.getValueAt(i, 2)==null){
						String month=textField_28.getText();
						String day=textField_29.getText();
						if(month.length()==1){
							month="0"+month;
						}
						if(day.length()==1){
							day="0"+day;
						}
						String date=textField_6.getText()+month+day;
						table_1.setValueAt(textField_4.getText(), i, 0);
						table_1.setValueAt(textField_5.getText(), i, 1);
						table_1.setValueAt(date, i, 2);
						textField_4.setText(null);
						textField_5.setText(null);
						textField_6.setText(null);
						textField_28.setText(null);
						textField_29.setText(null);
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
				"\u8BA2\u5355\u7F16\u53F7", "\u6536\u4EF6\u4EBA", "\u6536\u4EF6\u65E5\u671F"
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
				ReceiveInformationVO[] receive = new ReceiveInformationVO[table_1.getRowCount()];
				for(int i=0;i<table_1.getRowCount();i++){
					receive[i].ID=(String) table_1.getValueAt(i, 0);
					receive[i].nameOfReceiver=(String) table_1.getValueAt(i, 1);
					receive[i].time[0]= table_1.getValueAt(i, 2).toString().substring(0, 3);
					receive[i].time[1]= table_1.getValueAt(i, 2).toString().substring(4, 5);
					receive[i].time[2]= table_1.getValueAt(i, 2).toString().substring(6, 7);
				}
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
		
		JLabel label_26 = new JLabel("\u5E74");
		label_26.setBounds(638, 87, 54, 15);
		this.add(label_26);
		
		textField_28 = new JTextField();
		textField_28.setBounds(658, 84, 34, 21);
		this.add(textField_28);
		textField_28.setColumns(10);
		
		JLabel label_27 = new JLabel("\u6708");
		label_27.setBounds(699, 87, 54, 15);
		this.add(label_27);
		
		textField_29 = new JTextField();
		textField_29.setBounds(718, 84, 34, 21);
		this.add(textField_29);
		textField_29.setColumns(10);
		
		JLabel label_28 = new JLabel("\u65E5");
		label_28.setBounds(763, 87, 54, 15);
		this.add(label_28);
		
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
