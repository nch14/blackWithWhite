package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import bl.commoditybl.Impl.AreaAdjustController;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JCheckBox;

public class commodity {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table_1;
	private JTextField textField_12;
	private JTable table_2;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTable table_3;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTable table_4;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;

	/**
	 * Launch the application.
	 */
	public void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					commodity window = new commodity();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public commodity() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u7269\u6D41\u4FE1\u606F\u7BA1\u7406\u7CFB\u7EDF");
		frame.setResizable(false);
		frame.setBounds(100, 100, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		tabbedPane.addTab("入库", null, desktopPane, null);
		
		JLabel label = new JLabel("\u8BA2\u5355\u53F7");
		label.setBounds(331, 79, 54, 15);
		desktopPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(419, 76, 66, 21);
		desktopPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("\u5165\u5E93\u65E5\u671F");
		label_1.setBounds(331, 122, 54, 15);
		desktopPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(419, 119, 35, 21);
		desktopPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("\u76EE\u7684\u5730");
		label_2.setBounds(331, 165, 54, 15);
		desktopPane.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(419, 162, 206, 21);
		desktopPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton button = new JButton("\u6DFB\u52A0");
		button.setBounds(670, 197, 93, 23);
		desktopPane.add(button);
		button.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			AreaAdjustController areaAdjustController= new AreaAdjustController();
			
		    }	 
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(172, 231, 652, 280);
		desktopPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"\u8BA2\u5355\u53F7", "\u5165\u5E93\u65E5\u671F", "\u76EE\u7684\u5730", "\u533A\u53F7", "\u6392\u53F7", "\u67B6\u53F7", "\u4F4D\u53F7", "\u662F\u5426\u53D1\u751F\u5E93\u5B58\u62A5\u8B66"
			}
		));
		table.getColumnModel().getColumn(2).setPreferredWidth(78);
		table.getColumnModel().getColumn(3).setPreferredWidth(70);
		table.getColumnModel().getColumn(4).setPreferredWidth(70);
		table.getColumnModel().getColumn(5).setPreferredWidth(70);
		table.getColumnModel().getColumn(6).setPreferredWidth(70);
		table.getColumnModel().getColumn(7).setPreferredWidth(106);
		scrollPane.setViewportView(table);
		
		JButton button_1 = new JButton("\u63D0\u4EA4");
		button_1.setBounds(780, 549, 93, 23);
		desktopPane.add(button_1);
		
		JLabel label_3 = new JLabel();
		label_3.setBounds(282, 0, 436, 21);
		desktopPane.add(label_3);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		label_3.setText(df.format(new Date()));
		
		JLabel label_27 = new JLabel("\u5E74");
		label_27.setBounds(464, 122, 54, 15);
		desktopPane.add(label_27);
		
		textField_28 = new JTextField();
		textField_28.setBounds(486, 119, 35, 21);
		desktopPane.add(textField_28);
		textField_28.setColumns(10);
		
		JLabel label_28 = new JLabel("\u6708");
		label_28.setBounds(531, 122, 54, 15);
		desktopPane.add(label_28);
		
		textField_29 = new JTextField();
		textField_29.setBounds(556, 119, 35, 21);
		desktopPane.add(textField_29);
		textField_29.setColumns(10);
		
		JLabel label_29 = new JLabel("\u65E5");
		label_29.setBounds(601, 122, 54, 15);
		desktopPane.add(label_29);df.format(new Date());// new Date()为获取当前系统时间
		
		JDesktopPane desktopPane_4 = new JDesktopPane();
		desktopPane_4.setBackground(Color.WHITE);
		tabbedPane.addTab("出库", null, desktopPane_4, null);
		
		JLabel label_11 = new JLabel("\u8BA2\u5355\u53F7");
		label_11.setBounds(172, 56, 54, 15);
		desktopPane_4.add(label_11);
		
		textField_3 = new JTextField();
		textField_3.setBounds(236, 53, 93, 21);
		desktopPane_4.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_4 = new JLabel("\u51FA\u5E93\u65E5\u671F");
		label_4.setBounds(370, 56, 54, 15);
		desktopPane_4.add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(434, 53, 34, 21);
		desktopPane_4.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_5 = new JLabel("\u76EE\u7684\u5730");
		label_5.setBounds(538, 101, 54, 15);
		desktopPane_4.add(label_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(603, 98, 221, 21);
		desktopPane_4.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel label_6 = new JLabel("\u88C5\u8FD0\u5F62\u5F0F");
		label_6.setBounds(172, 101, 54, 15);
		desktopPane_4.add(label_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u98DE\u673A", "\u706B\u8F66", "\u6C7D\u8F66"}));
		comboBox.setBounds(236, 98, 59, 21);
		desktopPane_4.add(comboBox);
		
		JLabel label_7 = new JLabel("\u8D27\u8FD0\u7F16\u53F7");
		label_7.setBounds(370, 101, 54, 15);
		desktopPane_4.add(label_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(434, 98, 66, 21);
		desktopPane_4.add(textField_6);
		textField_6.setColumns(10);
		
		JButton button_2 = new JButton("\u786E\u8BA4");
		button_2.setBounds(731, 149, 93, 23);
		desktopPane_4.add(button_2);
		button_2.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				for(int i=0;i<table_1.getRowCount();i++){
					if(table_1.getValueAt(i, 1)==null&&table_1.getValueAt(i, 2)==null&&table_1.getValueAt(i, 3)==null&&table_1.getValueAt(i, 4)==null){
						String str=textField_4.getText()+"/"+textField_26.getText()+"/"+textField_27.getText();
						table_1.setValueAt(textField_3.getText(), i, 1);
						table_1.setValueAt(str, i, 2);
						table_1.setValueAt(comboBox.getSelectedItem(), i, 3);
						table_1.setValueAt(textField_6.getText(), i, 4);
						table_1.setValueAt(textField_5.getText(), i, 5);
						
						break;
					}
				}
			}
		});
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(172, 231, 652, 280);
		desktopPane_4.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"New column", "\u8BA2\u5355\u53F7", "\u51FA\u5E93\u65E5\u671F", "\u88C5\u8FD0\u5F62\u5F0F", "\u8D27\u8FD0\u7F16\u53F7", "\u76EE\u7684\u5730"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JButton button_3 = new JButton("\u63D0\u4EA4");
		button_3.setBounds(816, 537, 93, 23);
		desktopPane_4.add(button_3);
		
		JLabel label_8 = new JLabel();
		label_8.setBounds(282, 0, 436, 21);
		desktopPane_4.add(label_8);
		label_8.setText(df.format(new Date()));
		
		JLabel label_24 = new JLabel("\u5E74");
		label_24.setBounds(478, 56, 54, 15);
		desktopPane_4.add(label_24);
		
		textField_26 = new JTextField();
		textField_26.setBounds(499, 53, 34, 21);
		desktopPane_4.add(textField_26);
		textField_26.setColumns(10);
		
		JLabel label_25 = new JLabel("\u6708");
		label_25.setBounds(542, 56, 54, 15);
		desktopPane_4.add(label_25);
		
		textField_27 = new JTextField();
		textField_27.setBounds(565, 53, 34, 21);
		desktopPane_4.add(textField_27);
		textField_27.setColumns(10);
		
		JLabel label_26 = new JLabel("\u65E5");
		label_26.setBounds(609, 56, 54, 15);
		desktopPane_4.add(label_26);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setBounds(172, 517, 21, 23);
		desktopPane_4.add(checkBox_1);
		
		JButton button_10 = new JButton("\u64A4\u9500");
		button_10.setBounds(199, 517, 93, 23);
		desktopPane_4.add(button_10);df.format(new Date());
		
		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBackground(Color.WHITE);
		tabbedPane.addTab("库存盘点", null, desktopPane_2, null);
		
		JLabel label_9 = new JLabel();
		label_9.setBounds(282, 0, 436, 21);
		desktopPane_2.add(label_9);
		label_9.setText(df.format(new Date()));df.format(new Date());
		
		JLabel label_10 = new JLabel("\u65E5\u671F\uFF1A");
		label_10.setBounds(330, 82, 54, 15);
		desktopPane_2.add(label_10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(394, 79, 34, 21);
		desktopPane_2.add(textField_12);
		textField_12.setColumns(10);
		
		JButton button_4 = new JButton("\u67E5\u8BE2");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		button_4.setBounds(625, 148, 93, 23);
		desktopPane_2.add(button_4);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(172, 231, 652, 280);
		desktopPane_2.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"\u5FEB\u9012\u7F16\u53F7", "\u5165\u5E93\u65E5\u671F", "\u76EE\u7684\u5730", "\u533A\u53F7", "\u6392\u53F7", "\u67B6\u53F7", "\u4F4D\u53F7"
			}
		));
		scrollPane_2.setViewportView(table_2);
		
		JButton button_5 = new JButton("\u5BFC\u51FA");
		button_5.setBounds(795, 536, 93, 23);
		desktopPane_2.add(button_5);
		
		JLabel label_21 = new JLabel("\u5E74");
		label_21.setBounds(438, 82, 54, 15);
		desktopPane_2.add(label_21);
		
		textField_24 = new JTextField();
		textField_24.setBounds(458, 79, 34, 21);
		desktopPane_2.add(textField_24);
		textField_24.setColumns(10);
		
		JLabel label_22 = new JLabel("\u6708");
		label_22.setBounds(502, 82, 54, 15);
		desktopPane_2.add(label_22);
		
		textField_25 = new JTextField();
		textField_25.setBounds(525, 79, 34, 21);
		desktopPane_2.add(textField_25);
		textField_25.setColumns(10);
		
		JLabel label_23 = new JLabel("\u65E5");
		label_23.setBounds(566, 82, 54, 15);
		desktopPane_2.add(label_23);
		
		JDesktopPane desktopPane_3 = new JDesktopPane();
		desktopPane_3.setBackground(Color.WHITE);
		tabbedPane.addTab("库区调整", null, desktopPane_3, null);
		
		JLabel label_33 = new JLabel();
		label_33.setBounds(282, 0, 436, 21);
		desktopPane_3.add(label_33);
		label_33.setText(df.format(new Date()));df.format(new Date());
		
		JLabel label_12 = new JLabel("\u6392\u53F7");
		label_12.setBounds(328, 88, 54, 15);
		desktopPane_3.add(label_12);
		
		textField_13 = new JTextField();
		textField_13.setBounds(383, 85, 66, 21);
		desktopPane_3.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel label_13 = new JLabel("\u539F\u5206\u533A");
		label_13.setBounds(328, 122, 54, 15);
		desktopPane_3.add(label_13);
		
		textField_14 = new JTextField();
		textField_14.setBounds(383, 119, 66, 21);
		desktopPane_3.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(383, 156, 66, 21);
		desktopPane_3.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel label_14 = new JLabel("\u73B0\u5206\u533A");
		label_14.setBounds(328, 159, 54, 15);
		desktopPane_3.add(label_14);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(236, 230, 467, 212);
		desktopPane_3.add(scrollPane_3);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "\u67B6\u53F7", "\u539F\u5206\u533A", "\u73B0\u5206\u533A"
			}
		));
		scrollPane_3.setViewportView(table_3);
		
		JButton button_6 = new JButton("\u63D0\u4EA4");
		button_6.setBounds(631, 493, 93, 23);
		desktopPane_3.add(button_6);
		
		JButton btnNewButton = new JButton("\u786E\u8BA4");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				for(int i=0;i<table_1.getRowCount();i++){
					if(table_3.getValueAt(i, 1)==null&&table_3.getValueAt(i, 2)==null&&table_3.getValueAt(i, 3)==null){
						table_3.setValueAt(textField_13.getText(), i, 1);
						table_3.setValueAt(textField_14.getText(), i, 2);
						table_3.setValueAt(textField_15.getText(), i, 3);
						textField_13.setText(null);
						textField_14.setText(null);
						textField_15.setText(null);
						break;
					}
				}
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(524, 186, 93, 23);
		desktopPane_3.add(btnNewButton);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(243, 460, 21, 23);
		desktopPane_3.add(checkBox);
		
		JButton button_9 = new JButton("\u64A4\u9500");
		button_9.setBounds(270, 460, 93, 23);
		desktopPane_3.add(button_9);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(Color.WHITE);
		tabbedPane.addTab("库存信息初始化", null, desktopPane_1, null);
		
		JLabel label_34 = new JLabel();
		label_34.setBounds(282, 0, 436, 21);
		desktopPane_1.add(label_34);
		label_34.setText(df.format(new Date()));df.format(new Date());
		
		JLabel lblNewLabel = new JLabel("\u822A\u8FD0\u533A");
		lblNewLabel.setBounds(327, 90, 54, 15);
		desktopPane_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u94C1\u8FD0\u533A");
		lblNewLabel_1.setBounds(327, 115, 54, 15);
		desktopPane_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u6C7D\u8FD0\u533A");
		lblNewLabel_2.setBounds(327, 140, 54, 15);
		desktopPane_1.add(lblNewLabel_2);
		
		JLabel label_15 = new JLabel("\u673A\u52A8\u533A");
		label_15.setBounds(327, 165, 54, 15);
		desktopPane_1.add(label_15);
		
		textField_16 = new JTextField();
		textField_16.setBounds(385, 87, 66, 21);
		desktopPane_1.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(385, 112, 66, 21);
		desktopPane_1.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(385, 137, 66, 21);
		desktopPane_1.add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setBounds(385, 162, 66, 21);
		desktopPane_1.add(textField_19);
		textField_19.setColumns(10);
		
		JLabel label_30 = new JLabel("\u6392 \u5230");
		label_30.setBounds(461, 90, 54, 15);
		desktopPane_1.add(label_30);
		
		JLabel label_31 = new JLabel("\u6392 \u5230");
		label_31.setBounds(461, 115, 54, 15);
		desktopPane_1.add(label_31);
		
		JLabel label_32 = new JLabel("\u6392 \u5230");
		label_32.setBounds(461, 140, 54, 15);
		desktopPane_1.add(label_32);
		
		JLabel label_16 = new JLabel("\u6392 \u5230");
		label_16.setBounds(461, 165, 54, 15);
		desktopPane_1.add(label_16);
		
		textField_20 = new JTextField();
		textField_20.setBounds(503, 87, 66, 21);
		desktopPane_1.add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(503, 112, 66, 21);
		desktopPane_1.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(503, 137, 66, 21);
		desktopPane_1.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(503, 162, 66, 21);
		desktopPane_1.add(textField_23);
		
		JLabel label_17 = new JLabel("\u6392");
		label_17.setBounds(579, 90, 54, 15);
		desktopPane_1.add(label_17);
		
		JLabel label_18 = new JLabel("\u6392");
		label_18.setBounds(579, 115, 54, 15);
		desktopPane_1.add(label_18);
		
		JLabel label_19 = new JLabel("\u6392");
		label_19.setBounds(579, 140, 54, 15);
		desktopPane_1.add(label_19);
		
		JLabel label_20 = new JLabel("\u6392");
		label_20.setBounds(579, 165, 54, 15);
		desktopPane_1.add(label_20);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(236, 230, 467, 212);
		desktopPane_1.add(scrollPane_4);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
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
			},
			new String[] {
				"\u6392\u53F7", "\u5206\u533A"
			}
		));
		scrollPane_4.setViewportView(table_4);
		
		JButton button_7 = new JButton("\u63D0\u4EA4");
		button_7.setBounds(714, 479, 93, 23);
		desktopPane_1.add(button_7);
		
		JButton button_8 = new JButton("\u786E\u8BA4");
		button_8.setBounds(617, 186, 93, 23);
		desktopPane_1.add(button_8);
	}
}
