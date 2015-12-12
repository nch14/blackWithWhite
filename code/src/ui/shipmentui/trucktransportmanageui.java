package ui.shipmentui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class trucktransportmanageui extends JDesktopPane{
	
	
	private JTable table_3;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JButton button_6;
	private JComboBox comboBox_1;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_22;
	
	
	
	public trucktransportmanageui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//汽车装运管理的界面
				this.setBackground(Color.WHITE);

				
				JScrollPane scrollPane_2 = new JScrollPane();
				scrollPane_2.setBounds(150, 210, 700, 320);
				this.add(scrollPane_2);
				
				table_3 = new JTable();
				table_3.setModel(new DefaultTableModel(
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
				scrollPane_2.setViewportView(table_3);
				
				JLabel textPane_26 = new JLabel();
				textPane_26.setText("日期（年/月/日）");
				textPane_26.setBounds(150, 49, 102, 21);
				this.add(textPane_26);
				
				textField_22 = new JTextField();
				textField_22.setBounds(262, 49, 40, 21);
				this.add(textField_22);
				textField_22.setColumns(10);
				
				JLabel textPane_30 = new JLabel();
				textPane_30.setText("出发地");
				textPane_30.setBounds(150, 80, 45, 21);
				this.add(textPane_30);
				
				JLabel textPane_31 = new JLabel();
				textPane_31.setText("监装员");
				textPane_31.setBounds(150, 110, 45, 21);
				this.add(textPane_31);
				
				JLabel textPane_32 = new JLabel();
				textPane_32.setText("中转中心中转单编号");
				textPane_32.setBounds(145, 142, 125, 21);
				this.add(textPane_32);
				
				textField_26 = new JTextField();
				textField_26.setBounds(205, 80, 200, 21);
				this.add(textField_26);
				textField_26.setColumns(10);
				
				textField_27 = new JTextField();
				textField_27.setBounds(205, 110, 200, 21);
				this.add(textField_27);
				textField_27.setColumns(10);
				
				textField_28 = new JTextField();
				textField_28.setBounds(280, 142, 212, 21);
				this.add(textField_28);
				textField_28.setColumns(10);
				
				JLabel textPane_33 = new JLabel();
				textPane_33.setText("车次号");
				textPane_33.setBounds(504, 49, 45, 21);
				this.add(textPane_33);
				
				JLabel textPane_34 = new JLabel();
				textPane_34.setText("到达地");
				textPane_34.setBounds(504, 80, 45, 21);
				this.add(textPane_34);
				
				JLabel textPane_35 = new JLabel();
				textPane_35.setText("押运员");
				textPane_35.setBounds(504, 110, 45, 21);
				this.add(textPane_35);
				
				textField_29 = new JTextField();
				textField_29.setBounds(559, 49, 196, 21);
				this.add(textField_29);
				textField_29.setColumns(10);
				
				textField_30 = new JTextField();
				textField_30.setBounds(559, 80, 196, 21);
				this.add(textField_30);
				textField_30.setColumns(10);
				
				textField_31 = new JTextField();
				textField_31.setBounds(559, 110, 196, 21);
				this.add(textField_31);
				textField_31.setColumns(10);
				
				JLabel textPane_36 = new JLabel();
				textPane_36.setText("本车货物登记");
				textPane_36.setBounds(150, 179, 82, 21);
				this.add(textPane_36);
				
				JLabel textPane_37 = new JLabel();
				textPane_37.setBounds(172, 184, 6, 21);
				this.add(textPane_37);
				
				JLabel textPane_38 = new JLabel();
				textPane_38.setText("订单号");
				textPane_38.setBounds(290, 180, 45, 21);
				this.add(textPane_38);
				
				textField_32 = new JTextField();
				textField_32.setBounds(345, 179, 147, 21);
				this.add(textField_32);
				textField_32.setColumns(10);
				//添加汽车装运单的事件监听
				button_6 = new JButton("添加");
				button_6.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						for(int i=0;i<table_3.getRowCount();i++){
							if(table_3.getValueAt(i, 0)==null&&table_3.getValueAt(i, 1)==null){
								table_3.setValueAt(textField_32.getText(), i, 0);
								table_3.setValueAt(textField_28.getText(), i, 1);
								break;
							}
						}
					}
				});
				button_6.setBounds(750, 170, 93, 23);
				this.add(button_6);
				
				JLabel textPane_40 = new JLabel();
				textPane_40.setText("单据属性");
				textPane_40.setBounds(504, 179, 54, 21);
				this.add(textPane_40);
				
				comboBox_1 = new JComboBox();
				comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"中转单", "装车单"}));
				comboBox_1.setBounds(569, 179, 65, 21);
				this.add(comboBox_1);
				
				//撤消汽车装运单中一行的事件监听
				JButton button_10 = new JButton("撤消");
				button_10.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						for(int i=table_3.getRowCount()-1;i>=0;i--){
							if(table_3.getValueAt(i, 0)!=null||table_3.getValueAt(i, 1)!=null){
								table_3.setValueAt(null, i, 0);
								table_3.setValueAt(null, i, 1);
								break;
							}
						}
					}
				});
				button_10.setBounds(200, 540, 93, 23);
				this.add(button_10);
				
				JButton button_11 = new JButton("提交");
				button_11.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				button_11.setBounds(750, 540, 93, 23);
				this.add(button_11);
				
				textField_13 = new JTextField();
				textField_13.setBounds(312, 49, 30, 21);
				this.add(textField_13);
				textField_13.setColumns(10);
				
				textField_14 = new JTextField();
				textField_14.setBounds(352, 49, 30, 21);
				this.add(textField_14);
				textField_14.setColumns(10);
				
				JLabel textPane_5 = new JLabel();
				textPane_5.setText("\u4E2D\u8F6C\u4E2D\u5FC3\u4E1A\u52A1\u5458");
				textPane_5.setBounds(280, 0, 700, 21);
				this.add(textPane_5);
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
				textPane_5.setText(df.format(new Date()));
	}

}
