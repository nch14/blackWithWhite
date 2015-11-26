package ui;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JTabbedPane;
import javax.swing.JDesktopPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerListModel;

public class flight {

	private JFrame frame;
	private JTable table;
	private JTabbedPane tabbedPane;
	private JDesktopPane desktopPane;
	private JTable table_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextPane textPane;
	private JTextField textField;
	private JTextPane textPane_1;
	private JTextField textField_1;
	private JTextPane textPane_4;
	private JTextField textField_2;
	private JTextPane textPane_5;
	private JTextPane textPane_6;
	private JTextField textField_6;
	private JTextPane textPane_7;
	private JTextField textField_7;
	private JTextPane textPane_8;
	private JTextField textField_8;
	private JTextPane textPane_9;
	private JTextField textField_9;
	private JTextPane textPane_10;
	private JTextPane textPane_11;
	private JTextField textField_10;
	private JButton button;
	private JTextPane textPane_12;
	private JTable table_2;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTable table_3;
	private JTextPane textPane_26;
	private JTextField textField_22;
	private JTextPane textPane_27;
	private JTextField textField_23;
	private JTextPane textPane_28;
	private JTextField textField_24;
	private JTextPane textPane_29;
	private JTextField textField_25;
	private JTextPane textPane_30;
	private JTextPane textPane_31;
	private JTextPane textPane_32;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextPane textPane_33;
	private JTextPane textPane_34;
	private JTextPane textPane_35;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextPane textPane_36;
	private JTextPane textPane_37;
	private JTextPane textPane_38;
	private JTextField textField_32;
	private JButton button_6;
	private JTextPane textPane_39;
	private JTextPane textPane_40;
	private JTable table_5;
	private JTable table_4;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JCheckBox chckbxNewCheckBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					flight window = new flight();
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
	public flight() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 80, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		table = new JTable();
		frame.getContentPane().add(table, BorderLayout.WEST);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		tabbedPane.addTab("飞机装运", null, desktopPane, null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(117, 209, 765, 316);
		desktopPane.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
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
				" ", "订单号"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(25);
		scrollPane.setViewportView(table_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("出发地");
		textPane_2.setBounds(145, 80, 60, 21);
		desktopPane.add(textPane_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(226, 80, 133, 21);
		desktopPane.add(textField_3);
		textField_3.setColumns(10);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setText("监装员");
		textPane_3.setBounds(145, 110, 50, 21);
		desktopPane.add(textPane_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(226, 111, 133, 21);
		desktopPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setText("  中转中心业务员：");
		textField_5.setBounds(117, 0, 765, 21);
		desktopPane.add(textField_5);
		textField_5.setColumns(10);
		
		textPane = new JTextPane();
		textPane.setText("日期");
		textPane.setBounds(145, 49, 36, 21);
		desktopPane.add(textPane);
		
		textField = new JTextField();
		textField.setBounds(226, 49, 50, 21);
		desktopPane.add(textField);
		textField.setColumns(10);
		
		textPane_1 = new JTextPane();
		textPane_1.setText("年");
		textPane_1.setBounds(286, 49, 23, 21);
		desktopPane.add(textPane_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(310, 49, 30, 21);
		desktopPane.add(textField_1);
		textField_1.setColumns(10);
		
		textPane_4 = new JTextPane();
		textPane_4.setText("月");
		textPane_4.setBounds(350, 49, 23, 21);
		desktopPane.add(textPane_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(375, 49, 30, 21);
		desktopPane.add(textField_2);
		textField_2.setColumns(10);
		
		textPane_5 = new JTextPane();
		textPane_5.setText("日");
		textPane_5.setBounds(415, 49, 23, 21);
		desktopPane.add(textPane_5);
		
		textPane_6 = new JTextPane();
		textPane_6.setText("中转中心中转单编号");
		textPane_6.setBounds(145, 141, 118, 26);
		desktopPane.add(textPane_6);
		
		textField_6 = new JTextField();
		textField_6.setBounds(273, 142, 212, 21);
		desktopPane.add(textField_6);
		textField_6.setColumns(10);
		
		textPane_7 = new JTextPane();
		textPane_7.setText("航班号");
		textPane_7.setBounds(504, 49, 60, 21);
		desktopPane.add(textPane_7);
		
		textField_7 = new JTextField();
		textField_7.setBounds(569, 49, 196, 21);
		desktopPane.add(textField_7);
		textField_7.setColumns(10);
		
		textPane_8 = new JTextPane();
		textPane_8.setText("到达地");
		textPane_8.setBounds(504, 80, 50, 21);
		desktopPane.add(textPane_8);
		
		textField_8 = new JTextField();
		textField_8.setBounds(569, 80, 196, 21);
		desktopPane.add(textField_8);
		textField_8.setColumns(10);
		
		textPane_9 = new JTextPane();
		textPane_9.setText("货柜号");
		textPane_9.setBounds(504, 110, 50, 21);
		desktopPane.add(textPane_9);
		
		textField_9 = new JTextField();
		textField_9.setBounds(569, 110, 196, 21);
		desktopPane.add(textField_9);
		textField_9.setColumns(10);
		
		textPane_10 = new JTextPane();
		textPane_10.setText("本货柜货物登记");
		textPane_10.setBounds(145, 173, 102, 26);
		desktopPane.add(textPane_10);
		
		textPane_11 = new JTextPane();
		textPane_11.setText("订单号");
		textPane_11.setBounds(257, 173, 60, 21);
		desktopPane.add(textPane_11);
		
		textField_10 = new JTextField();
		textField_10.setBounds(321, 173, 152, 21);
		desktopPane.add(textField_10);
		textField_10.setColumns(10);
		
		button = new JButton("添加");
		button.setBounds(752, 173, 93, 23);
		desktopPane.add(button);
		
		textPane_12 = new JTextPane();
		textPane_12.setText("运费：");
		textPane_12.setBounds(768, 146, 60, 21);
		desktopPane.add(textPane_12);
		
		JCheckBox checkBox = new JCheckBox(" ");
		checkBox.setBounds(173, 541, 23, 23);
		desktopPane.add(checkBox);
		
		JButton button_1 = new JButton("撤消");
		button_1.setBounds(230, 541, 93, 23);
		desktopPane.add(button_1);
		
		JButton button_2 = new JButton("提交");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(787, 541, 93, 23);
		desktopPane.add(button_2);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(Color.WHITE);
		tabbedPane.addTab("火车装运", null, desktopPane_1, null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(116, 213, 744, 281);
		desktopPane_1.add(scrollPane_1);
		
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
				" ", "订单号"
			}
		));
		table_2.getColumnModel().getColumn(0).setPreferredWidth(30);
		scrollPane_1.setViewportView(table_2);
		
		textField_11 = new JTextField();
		textField_11.setText("  中转中心业务员：");
		textField_11.setBounds(116, 0, 744, 21);
		desktopPane_1.add(textField_11);
		textField_11.setColumns(10);
		
		JTextPane textPane_13 = new JTextPane();
		textPane_13.setText("日期");
		textPane_13.setBounds(101, 41, 30, 21);
		desktopPane_1.add(textPane_13);
		
		textField_12 = new JTextField();
		textField_12.setBounds(156, 41, 45, 21);
		desktopPane_1.add(textField_12);
		textField_12.setColumns(10);
		
		JTextPane textPane_14 = new JTextPane();
		textPane_14.setText("年");
		textPane_14.setBounds(211, 41, 18, 21);
		desktopPane_1.add(textPane_14);
		
		textField_13 = new JTextField();
		textField_13.setBounds(239, 41, 30, 21);
		desktopPane_1.add(textField_13);
		textField_13.setColumns(10);
		
		JTextPane textPane_15 = new JTextPane();
		textPane_15.setText("月");
		textPane_15.setBounds(279, 41, 18, 21);
		desktopPane_1.add(textPane_15);
		
		textField_14 = new JTextField();
		textField_14.setBounds(307, 41, 30, 21);
		desktopPane_1.add(textField_14);
		textField_14.setColumns(10);
		
		JTextPane textPane_16 = new JTextPane();
		textPane_16.setText("日");
		textPane_16.setBounds(347, 41, 18, 21);
		desktopPane_1.add(textPane_16);
		
		JTextPane textPane_17 = new JTextPane();
		textPane_17.setText("出发地");
		textPane_17.setBounds(101, 72, 45, 21);
		desktopPane_1.add(textPane_17);
		
		textField_15 = new JTextField();
		textField_15.setBounds(156, 72, 209, 21);
		desktopPane_1.add(textField_15);
		textField_15.setColumns(10);
		
		JTextPane textPane_18 = new JTextPane();
		textPane_18.setText("监装员");
		textPane_18.setBounds(101, 103, 45, 21);
		desktopPane_1.add(textPane_18);
		
		textField_16 = new JTextField();
		textField_16.setBounds(156, 103, 209, 21);
		desktopPane_1.add(textField_16);
		textField_16.setColumns(10);
		
		JTextPane textPane_19 = new JTextPane();
		textPane_19.setText("中转中心中转单编号");
		textPane_19.setBounds(101, 134, 115, 21);
		desktopPane_1.add(textPane_19);
		
		textField_17 = new JTextField();
		textField_17.setBounds(226, 134, 139, 21);
		desktopPane_1.add(textField_17);
		textField_17.setColumns(10);
		
		JTextPane textPane_20 = new JTextPane();
		textPane_20.setText("本货柜货物登记");
		textPane_20.setBounds(101, 172, 100, 21);
		desktopPane_1.add(textPane_20);
		
		JTextPane textPane_21 = new JTextPane();
		textPane_21.setText("订单号");
		textPane_21.setBounds(211, 172, 45, 21);
		desktopPane_1.add(textPane_21);
		
		textField_18 = new JTextField();
		textField_18.setBounds(266, 172, 99, 21);
		desktopPane_1.add(textField_18);
		textField_18.setColumns(10);
		
		JTextPane textPane_22 = new JTextPane();
		textPane_22.setText("车次号");
		textPane_22.setBounds(436, 41, 45, 21);
		desktopPane_1.add(textPane_22);
		
		JTextPane textPane_23 = new JTextPane();
		textPane_23.setText("到达地");
		textPane_23.setBounds(436, 72, 45, 21);
		desktopPane_1.add(textPane_23);
		
		JTextPane textPane_24 = new JTextPane();
		textPane_24.setText("车厢号");
		textPane_24.setBounds(436, 103, 45, 21);
		desktopPane_1.add(textPane_24);
		
		textField_19 = new JTextField();
		textField_19.setBounds(491, 41, 226, 21);
		desktopPane_1.add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setBounds(491, 72, 226, 21);
		desktopPane_1.add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setBounds(491, 103, 226, 21);
		desktopPane_1.add(textField_21);
		textField_21.setColumns(10);
		
		JButton button_3 = new JButton("添加");
		button_3.setBounds(723, 172, 93, 23);
		desktopPane_1.add(button_3);
		
		JTextPane textPane_25 = new JTextPane();
		textPane_25.setText("订单号");
		textPane_25.setBounds(723, 134, 45, 21);
		desktopPane_1.add(textPane_25);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setBounds(166, 519, 21, 23);
		desktopPane_1.add(checkBox_1);
		
		JButton button_4 = new JButton("撤消");
		button_4.setBounds(204, 519, 93, 23);
		desktopPane_1.add(button_4);
		
		JButton button_5 = new JButton("提交");
		button_5.setBounds(778, 519, 93, 23);
		desktopPane_1.add(button_5);
		
		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBackground(Color.WHITE);
		tabbedPane.addTab("汽车装运", null, desktopPane_2, null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(117, 215, 720, 285);
		desktopPane_2.add(scrollPane_2);
		
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
				" ", "订单号"
			}
		));
		scrollPane_2.setViewportView(table_3);
		
		textPane_26 = new JTextPane();
		textPane_26.setText("日期");
		textPane_26.setBounds(117, 44, 30, 21);
		desktopPane_2.add(textPane_26);
		
		textField_22 = new JTextField();
		textField_22.setBounds(154, 44, 45, 21);
		desktopPane_2.add(textField_22);
		textField_22.setColumns(10);
		
		textPane_27 = new JTextPane();
		textPane_27.setText("年");
		textPane_27.setBounds(209, 44, 18, 21);
		desktopPane_2.add(textPane_27);
		
		textField_23 = new JTextField();
		textField_23.setBounds(237, 44, 30, 21);
		desktopPane_2.add(textField_23);
		textField_23.setColumns(10);
		
		textPane_28 = new JTextPane();
		textPane_28.setText("月");
		textPane_28.setBounds(277, 44, 18, 21);
		desktopPane_2.add(textPane_28);
		
		textField_24 = new JTextField();
		textField_24.setBounds(305, 44, 30, 21);
		desktopPane_2.add(textField_24);
		textField_24.setColumns(10);
		
		textPane_29 = new JTextPane();
		textPane_29.setText("日");
		textPane_29.setBounds(345, 44, 18, 21);
		desktopPane_2.add(textPane_29);
		
		textField_25 = new JTextField();
		textField_25.setText("  中转中心业务员：");
		textField_25.setBounds(117, 0, 720, 21);
		desktopPane_2.add(textField_25);
		textField_25.setColumns(10);
		
		textPane_30 = new JTextPane();
		textPane_30.setText("出发地");
		textPane_30.setBounds(117, 75, 45, 21);
		desktopPane_2.add(textPane_30);
		
		textPane_31 = new JTextPane();
		textPane_31.setText("监装员");
		textPane_31.setBounds(117, 106, 45, 21);
		desktopPane_2.add(textPane_31);
		
		textPane_32 = new JTextPane();
		textPane_32.setText("中转中心中转单编号");
		textPane_32.setBounds(117, 137, 120, 21);
		desktopPane_2.add(textPane_32);
		
		textField_26 = new JTextField();
		textField_26.setBounds(172, 75, 191, 21);
		desktopPane_2.add(textField_26);
		textField_26.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setBounds(172, 106, 191, 21);
		desktopPane_2.add(textField_27);
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setBounds(247, 137, 116, 21);
		desktopPane_2.add(textField_28);
		textField_28.setColumns(10);
		
		textPane_33 = new JTextPane();
		textPane_33.setText("车次号");
		textPane_33.setBounds(470, 44, 45, 21);
		desktopPane_2.add(textPane_33);
		
		textPane_34 = new JTextPane();
		textPane_34.setText("到达地");
		textPane_34.setBounds(470, 75, 45, 21);
		desktopPane_2.add(textPane_34);
		
		textPane_35 = new JTextPane();
		textPane_35.setText("押运员");
		textPane_35.setBounds(470, 106, 45, 21);
		desktopPane_2.add(textPane_35);
		
		textField_29 = new JTextField();
		textField_29.setBounds(525, 44, 166, 21);
		desktopPane_2.add(textField_29);
		textField_29.setColumns(10);
		
		textField_30 = new JTextField();
		textField_30.setBounds(524, 75, 167, 21);
		desktopPane_2.add(textField_30);
		textField_30.setColumns(10);
		
		textField_31 = new JTextField();
		textField_31.setBounds(525, 106, 166, 21);
		desktopPane_2.add(textField_31);
		textField_31.setColumns(10);
		
		textPane_36 = new JTextPane();
		textPane_36.setText("本车货物登记");
		textPane_36.setBounds(117, 176, 82, 21);
		desktopPane_2.add(textPane_36);
		
		textPane_37 = new JTextPane();
		textPane_37.setBounds(172, 184, 6, 21);
		desktopPane_2.add(textPane_37);
		
		textPane_38 = new JTextPane();
		textPane_38.setText("订单号");
		textPane_38.setBounds(209, 176, 45, 21);
		desktopPane_2.add(textPane_38);
		
		textField_32 = new JTextField();
		textField_32.setBounds(257, 176, 106, 21);
		desktopPane_2.add(textField_32);
		textField_32.setColumns(10);
		
		button_6 = new JButton("添加");
		button_6.setBounds(666, 174, 96, 23);
		desktopPane_2.add(button_6);
		
		textPane_39 = new JTextPane();
		textPane_39.setText("运费：");
		textPane_39.setBounds(669, 137, 45, 21);
		desktopPane_2.add(textPane_39);
		
		textPane_40 = new JTextPane();
		textPane_40.setText("单据属性");
		textPane_40.setBounds(708, 44, 54, 21);
		desktopPane_2.add(textPane_40);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerListModel(new String[] {"中转单", "装车单"}));
		spinner.setBounds(772, 43, 65, 22);
		desktopPane_2.add(spinner);
		
		JDesktopPane desktopPane_3 = new JDesktopPane();
		desktopPane_3.setBackground(Color.WHITE);
		tabbedPane.addTab("中转中心到达单", null, desktopPane_3, null);
		
		table_5 = new JTable();
		table_5.setBounds(446, 366, 1, 1);
		desktopPane_3.add(table_5);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(116, 212, 735, 294);
		desktopPane_3.add(scrollPane_3);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
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
				" ", "订单号", "到达状态"
			}
		));
		scrollPane_3.setViewportView(table_4);
		
		chckbxNewCheckBox = new JCheckBox("New check box");
		scrollPane_3.setColumnHeaderView(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		scrollPane_3.setColumnHeaderView(chckbxNewCheckBox_1);
		
		textField_33 = new JTextField();
		textField_33.setText("  中转中心业务员：");
		textField_33.setBounds(116, 0, 735, 21);
		desktopPane_3.add(textField_33);
		textField_33.setColumns(10);
		
		JTextPane textPane_41 = new JTextPane();
		textPane_41.setText("日期");
		textPane_41.setBounds(116, 31, 30, 21);
		desktopPane_3.add(textPane_41);
		
		textField_34 = new JTextField();
		textField_34.setBounds(156, 31, 45, 21);
		desktopPane_3.add(textField_34);
		textField_34.setColumns(10);
		
		JTextPane textPane_42 = new JTextPane();
		textPane_42.setText("年");
		textPane_42.setBounds(211, 31, 18, 21);
		desktopPane_3.add(textPane_42);
		
		textField_35 = new JTextField();
		textField_35.setBounds(239, 31, 30, 21);
		desktopPane_3.add(textField_35);
		textField_35.setColumns(10);
		
		JTextPane textPane_43 = new JTextPane();
		textPane_43.setText("月");
		textPane_43.setBounds(279, 31, 18, 21);
		desktopPane_3.add(textPane_43);
		
		textField_36 = new JTextField();
		textField_36.setBounds(307, 31, 30, 21);
		desktopPane_3.add(textField_36);
		textField_36.setColumns(10);
		
		JTextPane textPane_44 = new JTextPane();
		textPane_44.setText("日");
		textPane_44.setBounds(347, 31, 18, 21);
		desktopPane_3.add(textPane_44);
		
		JTextPane textPane_45 = new JTextPane();
		textPane_45.setText("出发地");
		textPane_45.setBounds(116, 62, 45, 21);
		desktopPane_3.add(textPane_45);
		
		textField_37 = new JTextField();
		textField_37.setBounds(166, 62, 199, 21);
		desktopPane_3.add(textField_37);
		textField_37.setColumns(10);
		
		JTextPane textPane_46 = new JTextPane();
		textPane_46.setText("装车单号");
		textPane_46.setBounds(446, 31, 55, 21);
		desktopPane_3.add(textPane_46);
		
		textField_38 = new JTextField();
		textField_38.setBounds(511, 31, 145, 21);
		desktopPane_3.add(textField_38);
		textField_38.setColumns(10);
		
		JTextPane textPane_47 = new JTextPane();
		textPane_47.setText("中转中心编号");
		textPane_47.setBounds(446, 62, 78, 21);
		desktopPane_3.add(textPane_47);
		
		textField_39 = new JTextField();
		textField_39.setBounds(534, 62, 122, 21);
		desktopPane_3.add(textField_39);
		textField_39.setColumns(10);
		
		JTextPane textPane_48 = new JTextPane();
		textPane_48.setText("\u5F02\u5E38\u8D27\u7269\u5230\u8FBE\u72B6\u6001\u767B\u8BB0");
		textPane_48.setBounds(116, 111, 126, 21);
		desktopPane_3.add(textPane_48);
		
		JTextPane textPane_49 = new JTextPane();
		textPane_49.setText("\u8BA2\u5355\u53F7");
		textPane_49.setBounds(166, 148, 45, 21);
		desktopPane_3.add(textPane_49);
		
		textField_40 = new JTextField();
		textField_40.setBounds(211, 148, 154, 21);
		desktopPane_3.add(textField_40);
		textField_40.setColumns(10);
		
		JTextPane textPane_50 = new JTextPane();
		textPane_50.setText("到达状态");
		textPane_50.setBounds(446, 148, 55, 21);
		desktopPane_3.add(textPane_50);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerListModel(new String[] {"丢失", "损坏"}));
		spinner_1.setBounds(511, 147, 55, 22);
		desktopPane_3.add(spinner_1);
		
		JButton button_7 = new JButton("添加");
		button_7.setBounds(687, 168, 93, 23);
		desktopPane_3.add(button_7);
		
		JCheckBox checkBox_2 = new JCheckBox("");
		checkBox_2.setBounds(139, 533, 22, 23);
		desktopPane_3.add(checkBox_2);
		
		JButton button_8 = new JButton("撤消");
		button_8.setBounds(166, 533, 93, 23);
		desktopPane_3.add(button_8);
		
		JButton button_9 = new JButton("提交");
		button_9.setBounds(687, 533, 93, 23);
		desktopPane_3.add(button_9);
	}
}
