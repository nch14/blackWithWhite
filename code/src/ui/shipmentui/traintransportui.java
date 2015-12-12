package ui.shipmentui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

public class traintransportui extends JDesktopPane{
	
	
	private JTable table_2;
	private JTextField textField_12;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_23;
	private JTextField textField_24;
	
	public traintransportui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//火车装运管理的界面
				this.setBackground(Color.WHITE);
				
				JScrollPane scrollPane_1 = new JScrollPane();
				scrollPane_1.setBounds(150, 210, 700, 320);
				this.add(scrollPane_1);
				
				table_2 = new JTable();
				table_2.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
					},
					new String[] {
						"订单号", "中转中心中转单编号"
					}
				));
				table_2.getColumnModel().getColumn(0).setPreferredWidth(30);
				scrollPane_1.setViewportView(table_2);
				
				JLabel textPane_13 = new JLabel();
				textPane_13.setText("日期（年/月/日）");
				textPane_13.setBounds(150, 49, 102, 21);
				this.add(textPane_13);
				
				textField_12 = new JTextField();
				textField_12.setBounds(262, 49, 40, 21);
				this.add(textField_12);
				textField_12.setColumns(10);
				
				JLabel textPane_17 = new JLabel();
				textPane_17.setText("出发地");
				textPane_17.setBounds(150, 80, 45, 21);
				this.add(textPane_17);
				
				textField_15 = new JTextField();
				textField_15.setBounds(200, 80, 200, 21);
				this.add(textField_15);
				textField_15.setColumns(10);
				
				JLabel textPane_18 = new JLabel();
				textPane_18.setText("监装员");
				textPane_18.setBounds(150, 110, 45, 21);
				this.add(textPane_18);
				
				textField_16 = new JTextField();
				textField_16.setBounds(200, 110, 200, 21);
				this.add(textField_16);
				textField_16.setColumns(10);
				
				JLabel textPane_19 = new JLabel();
				textPane_19.setText("中转中心中转单编号");
				textPane_19.setBounds(150, 142, 126, 21);
				this.add(textPane_19);
				
				textField_17 = new JTextField();
				textField_17.setBounds(276, 142, 212, 21);
				this.add(textField_17);
				textField_17.setColumns(10);
				
				JLabel textPane_20 = new JLabel();
				textPane_20.setText("本货柜货物登记");
				textPane_20.setBounds(150, 180, 100, 21);
				this.add(textPane_20);
				
				JLabel textPane_21 = new JLabel();
				textPane_21.setText("订单号");
				textPane_21.setBounds(290, 180, 45, 21);
				this.add(textPane_21);
				
				textField_18 = new JTextField();
				textField_18.setBounds(345, 179, 143, 21);
				this.add(textField_18);
				textField_18.setColumns(10);
				
				JLabel textPane_22 = new JLabel();
				textPane_22.setText("车次号");
				textPane_22.setBounds(504, 49, 45, 21);
				this.add(textPane_22);
				
				JLabel textPane_23 = new JLabel();
				textPane_23.setText("到达地");
				textPane_23.setBounds(504, 80, 45, 21);
				this.add(textPane_23);
				
				JLabel textPane_24 = new JLabel();
				textPane_24.setText("车厢号");
				textPane_24.setBounds(504, 110, 45, 21);
				this.add(textPane_24);
				
				textField_19 = new JTextField();
				textField_19.setBounds(559, 49, 196, 21);
				this.add(textField_19);
				textField_19.setColumns(10);
				
				textField_20 = new JTextField();
				textField_20.setBounds(559, 80, 196, 21);
				this.add(textField_20);
				textField_20.setColumns(10);
				
				textField_21 = new JTextField();
				textField_21.setBounds(559, 110, 196, 21);
				this.add(textField_21);
				textField_21.setColumns(10);
				//添加火车装运单号的事件监听
				JButton button_3 = new JButton("添加");
				button_3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						for(int i=0;i<table_2.getRowCount();i++){
							if(table_2.getValueAt(i, 0)==null&&table_2.getValueAt(i, 1)==null){
								table_2.setValueAt(textField_18.getText(), i, 0);
								table_2.setValueAt(textField_17.getText(), i, 1);
								break;
							}
						}
					}
				});
				button_3.setBounds(750, 170, 93, 23);
				this.add(button_3);
				
				//撤消火车装运单中一行的事件监听
				JButton button_4 = new JButton("撤消");
				button_4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				button_4.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						for(int i=table_2.getRowCount()-1;i>=0;i--){
							if(table_2.getValueAt(i, 0)!=null||table_2.getValueAt(i, 1)!=null){
								table_2.setValueAt(null, i, 0);
								table_2.setValueAt(null, i, 1);
								break;
							}
						}
					}
				});
				button_4.setBounds(200, 540, 93, 23);
				this.add(button_4);
				
				textField_23 = new JTextField();
				textField_23.setBounds(312, 49, 30, 21);
				this.add(textField_23);
				textField_23.setColumns(10);
				
				textField_24 = new JTextField();
				textField_24.setBounds(352, 49, 30, 21);
				this.add(textField_24);
				textField_24.setColumns(10);
				
				JLabel textPane_4 = new JLabel();
				textPane_4.setText("\u4E2D\u8F6C\u4E2D\u5FC3\u4E1A\u52A1\u5458");
				textPane_4.setBounds(280, 0, 700, 21);
				this.add(textPane_4);
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
				textPane_4.setText(df.format(new Date()));
				
				JButton button_5 = new JButton("\u63D0\u4EA4");
				button_5.setBounds(750, 540, 93, 23);
				this.add(button_5);
	}

}
