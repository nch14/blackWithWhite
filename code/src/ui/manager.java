package ui;
/*
 * 总经理界面
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import java.awt.List;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;

public class manager {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTable table_8;
	private JTable table_7;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table_1;
	private JTextField textField_5;
	private JTable table_2;
	private JTextField textField_6;
	private JTable table_3;
	private JTextField textField_7;
	private JTable table_4;
	private JTextField textField_8;
	private JTable table_5;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTable table_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					manager window = new manager();
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
	public manager() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u7269\u6D41\u4FE1\u606F\u7BA1\u7406\u7CFB\u7EDF");
		frame.setBounds(100, 100, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 984, 611);
		frame.getContentPane().add(tabbedPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		tabbedPane.addTab("审判单据", null, desktopPane, null);
		
		textField = new JTextField();
		textField.setBounds(0, 0, 979, 21);
		desktopPane.add(textField);
		textField.setColumns(10);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(46, 36, 881, 536);
		desktopPane.add(tabbedPane_1);
		
		JDesktopPane desktopPane_5 = new JDesktopPane();
		desktopPane_5.setBackground(Color.WHITE);
		tabbedPane_1.addTab("寄件单", null, desktopPane_5, null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(154, 36, 657, 433);
		desktopPane_5.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
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
				"New column", "订单号", "费用合计（元）", "快递类型", "单据状态", "操作"
			}
		));
		scrollPane.setViewportView(table);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(154, 479, 21, 23);
		desktopPane_5.add(checkBox);
		
		JButton button = new JButton("\u901A\u8FC7\u5BA1\u6279");
		button.setBounds(181, 479, 93, 23);
		desktopPane_5.add(button);
		
		JButton button_1 = new JButton("\u64A4\u9500\u5BA1\u5224");
		button_1.setBounds(284, 479, 93, 23);
		desktopPane_5.add(button_1);
		
		JButton button_2 = new JButton("\u63D0\u4EA4");
		button_2.setBounds(718, 479, 93, 23);
		desktopPane_5.add(button_2);
		
		JDesktopPane desktopPane_3 = new JDesktopPane();
		desktopPane_3.setBackground(Color.WHITE);
		tabbedPane_1.addTab("装车单", null, desktopPane_3, null);
		
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(154, 36, 657, 433);
		desktopPane_3.add(scrollPane1);
		
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
				"New column", "\u88C5\u8F66\u65E5\u671F", "\u5230\u8FBE\u5730", "\u8F66\u8F86\u4EE3\u53F7", "\u6C7D\u8FD0\u7F16\u53F7", "\u8425\u4E1A\u5385\u7F16\u53F7", "\u5355\u636E\u72B6\u6001", "\u64CD\u4F5C"
			}
		));
		scrollPane1.setViewportView(table);
		
		JCheckBox checkBox1 = new JCheckBox("");
		checkBox.setBounds(154, 479, 21, 23);
		desktopPane_3.add(checkBox1);
		
		JButton button1_1  = new JButton("\u901A\u8FC7\u5BA1\u6279");
		button1_1.setBounds(181, 479, 93, 23);
		desktopPane_3.add(button1_1);
		
		JButton button1_2 = new JButton("\u64A4\u9500\u5BA1\u5224");
		button1_2.setBounds(284, 479, 93, 23);
		desktopPane_3.add(button1_2);
		
		JButton button1_3 = new JButton("\u63D0\u4EA4");
		button1_3.setBounds(718, 479, 93, 23);
		desktopPane_3.add(button1_3);
		
		JDesktopPane desktopPane_6 = new JDesktopPane();
		desktopPane_6.setBackground(Color.WHITE);
		tabbedPane_1.addTab("营业厅到达单", null, desktopPane_6, null);
		
		JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setBounds(154, 36, 657, 433);
		desktopPane_6.add(scrollPane2);
		
		table_7 = new JTable();
		table_7.setModel(new DefaultTableModel(
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
				"New column", "\u8BA2\u5355\u53F7", "\u5230\u8FBE\u65E5\u671F", "\u51FA\u53D1\u5730", "\u8D27\u7269\u5230\u8FBE\u72B6\u6001", "\u5355\u636E\u72B6\u6001", "\u64CD\u4F5C"
			}
		));
		table_7.getColumnModel().getColumn(4).setPreferredWidth(84);
		scrollPane2.setViewportView(table_7);
		
		JCheckBox checkBox2 = new JCheckBox("");
		checkBox2.setBounds(154, 479, 21, 23);
		desktopPane_6.add(checkBox2);
		
		JButton button2_1 = new JButton("\u901A\u8FC7\u5BA1\u6279");
		button2_1.setBounds(181, 479, 93, 23);
		desktopPane_6.add(button2_1);
		
		JButton button2_2 = new JButton("\u64A4\u9500\u5BA1\u5224");
		button2_2.setBounds(284, 479, 93, 23);
		desktopPane_6.add(button2_2);
		
		JButton button2_3 = new JButton("\u63D0\u4EA4");
		button2_3.setBounds(718, 479, 93, 23);
		desktopPane_6.add(button2_3);
		
		JDesktopPane desktopPane_7 = new JDesktopPane();
		desktopPane_7.setBackground(Color.WHITE);
		tabbedPane_1.addTab("收款单", null, desktopPane_7, null);
		
		JScrollPane scrollPane3 = new JScrollPane();
		scrollPane3.setBounds(154, 36, 657, 433);
		desktopPane_7.add(scrollPane3);
		
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
				"New column", "\u6536\u6B3E\u5355\u7F16\u53F7", "\u6536\u6B3E\u65E5\u671F", "\u6536\u6B3E\u5FEB\u9012\u5458", "\u6536\u6B3E\u91D1\u989D", "\u8BA2\u5355\u7F16\u53F7", "\u5355\u636E\u72B6\u6001", "\u64CD\u4F5C"
			}
		));
		scrollPane3.setViewportView(table);
		
		JCheckBox checkBox3 = new JCheckBox("");
		checkBox.setBounds(154, 479, 21, 23);
		desktopPane_7.add(checkBox3);
		
		JButton button3_1 = new JButton("\u901A\u8FC7\u5BA1\u6279");
		button3_1.setBounds(181, 479, 93, 23);
		desktopPane_7.add(button3_1);
		
		JButton button3_2 = new JButton("\u64A4\u9500\u5BA1\u5224");
		button3_2.setBounds(284, 479, 93, 23);
		desktopPane_7.add(button3_2);
		
		JButton button3_3 = new JButton("\u63D0\u4EA4");
		button3_3.setBounds(718, 479, 93, 23);
		desktopPane_7.add(button3_3);
		
		JDesktopPane desktopPane_8 = new JDesktopPane();
		desktopPane_8.setBackground(Color.WHITE);
		tabbedPane_1.addTab("派件单", null, desktopPane_8, null);
		
		JScrollPane scrollPane4 = new JScrollPane();
		scrollPane4.setBounds(154, 36, 657, 433);
		desktopPane_8.add(scrollPane4);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
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
				"New column", "\u8BA2\u5355\u53F7", "\u5230\u8FBE\u65E5\u671F", "\u6D3E\u9001\u5458", "\u5355\u636E\u72B6\u6001", "\u64CD\u4F5C"
			}
		));
		scrollPane4.setViewportView(table);
		
		JCheckBox checkBox4 = new JCheckBox("");
		checkBox4.setBounds(154, 479, 21, 23);
		desktopPane_8.add(checkBox4);
		
		JButton button4_1 = new JButton("\u901A\u8FC7\u5BA1\u6279");
		button4_1.setBounds(181, 479, 93, 23);
		desktopPane_8.add(button4_1);
		
		JButton button4_2 = new JButton("\u64A4\u9500\u5BA1\u5224");
		button4_2.setBounds(284, 479, 93, 23);
		desktopPane_8.add(button4_2);
		
		JButton button4_3 = new JButton("\u63D0\u4EA4");
		button4_3.setBounds(718, 479, 93, 23);
		desktopPane_8.add(button4_3);
		
		JDesktopPane desktopPane_9 = new JDesktopPane();
		desktopPane_9.setBackground(Color.WHITE);
		tabbedPane_1.addTab("中转中心到达单", null, desktopPane_9, null);
		
		JScrollPane scrollPane5 = new JScrollPane();
		scrollPane5.setBounds(154, 36, 657, 433);
		desktopPane_9.add(scrollPane5);
		
		table_8 = new JTable();
		table_8.setModel(new DefaultTableModel(
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
				"New column", "\u8BA2\u5355\u65E5\u671F", "\u51FA\u53D1\u5730", "\u88C5\u8F66\u5355\u53F7", "\u4E2D\u8F6C\u4E2D\u5FC3\u7F16\u53F7", "\u5355\u636E\u72B6\u6001", "\u64CD\u4F5C"
			}
		));
		table_8.getColumnModel().getColumn(4).setPreferredWidth(82);
		scrollPane5.setViewportView(table_8);
		
		JCheckBox checkBox5 = new JCheckBox("");
		checkBox5.setBounds(154, 479, 21, 23);
		desktopPane_9.add(checkBox5);
		
		JButton button5_1 = new JButton("\u901A\u8FC7\u5BA1\u6279");
		button5_1.setBounds(181, 479, 93, 23);
		desktopPane_9.add(button5_1);
		
		JButton button5_2 = new JButton("\u64A4\u9500\u5BA1\u5224");
		button5_2.setBounds(284, 479, 93, 23);
		desktopPane_9.add(button5_2);
		
		JButton button5_3 = new JButton("\u63D0\u4EA4");
		button5_3.setBounds(718, 479, 93, 23);
		desktopPane_9.add(button5_3);
		
		JDesktopPane desktopPane_10 = new JDesktopPane();
		desktopPane_10.setBackground(Color.WHITE);
		tabbedPane_1.addTab("入库单", null, desktopPane_10, null);
		
		JScrollPane scrollPane6 = new JScrollPane();
		scrollPane6.setBounds(154, 36, 657, 433);
		desktopPane_10.add(scrollPane6);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "\u5165\u5E93\u5355\u7F16\u53F7", "\u5165\u5E93\u65E5\u671F", "\u5355\u636E\u72B6\u6001", "\u64CD\u4F5C"
			}
		));
		scrollPane6.setViewportView(table);
		
		JCheckBox checkBox6 = new JCheckBox("");
		checkBox6.setBounds(154, 479, 21, 23);
		desktopPane_10.add(checkBox6);
		
		JButton button6_1 = new JButton("\u901A\u8FC7\u5BA1\u6279");
		button6_1.setBounds(181, 479, 93, 23);
		desktopPane_10.add(button6_1);
		
		JButton button6_2 = new JButton("\u64A4\u9500\u5BA1\u5224");
		button6_2.setBounds(284, 479, 93, 23);
		desktopPane_10.add(button6_2);
		
		JButton button6_3 = new JButton("\u63D0\u4EA4");
		button6_3.setBounds(718, 479, 93, 23);
		desktopPane_10.add(button6_3);
		
		JDesktopPane desktopPane_11 = new JDesktopPane();
		desktopPane_11.setBackground(Color.WHITE);
		tabbedPane_1.addTab("出库单", null, desktopPane_11, null);
		
		JScrollPane scrollPane7 = new JScrollPane();
		scrollPane7.setBounds(154, 36, 657, 433);
		desktopPane_11.add(scrollPane7);
		
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
				"New column", "\u51FA\u5E93\u5355\u7F16\u53F7", "\u51FA\u5E93\u65E5\u671F", "\u76EE\u7684\u5730", "\u88C5\u8FD0\u5F62\u5F0F", "\u8D27\u8FD0\u7F16\u53F7", "\u5355\u636E\u72B6\u6001", "\u64CD\u4F5C"
			}
		));
		scrollPane7.setViewportView(table);
		
		JCheckBox checkBox7 = new JCheckBox("");
		checkBox7.setBounds(154, 479, 21, 23);
		desktopPane_11.add(checkBox7);
		
		JButton button7_1 = new JButton("\u901A\u8FC7\u5BA1\u6279");
		button7_1.setBounds(181, 479, 93, 23);
		desktopPane_11.add(button7_1);
		
		JButton button7_2 = new JButton("\u64A4\u9500\u5BA1\u5224");
		button7_2.setBounds(284, 479, 93, 23);
		desktopPane_11.add(button7_2);
		
		JButton button7_3 = new JButton("\u63D0\u4EA4");
		button7_3.setBounds(718, 479, 93, 23);
		desktopPane_11.add(button7_3);
		
		JDesktopPane desktopPane_12 = new JDesktopPane();
		desktopPane_12.setBackground(Color.WHITE);
		tabbedPane_1.addTab("中转单", null, desktopPane_12, null);
		
		JScrollPane scrollPane8 = new JScrollPane();
		scrollPane8.setBounds(154, 36, 657, 433);
		desktopPane_12.add(scrollPane8);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "\u4E2D\u8F6C\u5355\u7F16\u53F7", "\u4E2D\u8F6C\u65E5\u671F", "\u51FA\u53D1\u5730", "\u8D27\u8FD0\u7F16\u53F7", "\u8FD0\u8D39", "\u5230\u8FBE\u5730", "\u5355\u636E\u72B6\u6001", "\u64CD\u4F5C"
			}
		));
		scrollPane8.setViewportView(table);
		
		JCheckBox checkBox8 = new JCheckBox("");
		checkBox8.setBounds(154, 479, 21, 23);
		desktopPane_12.add(checkBox8);
		
		JButton button8_1 = new JButton("\u901A\u8FC7\u5BA1\u6279");
		button8_1.setBounds(181, 479, 93, 23);
		desktopPane_12.add(button8_1);
		
		JButton button8_2 = new JButton("\u64A4\u9500\u5BA1\u5224");
		button8_2.setBounds(284, 479, 93, 23);
		desktopPane_12.add(button8_2);
		
		JButton button8_3 = new JButton("\u63D0\u4EA4");
		button8_3.setBounds(718, 479, 93, 23);
		desktopPane_12.add(button8_3);
		
		JDesktopPane desktopPane_4 = new JDesktopPane();
		desktopPane_4.setBackground(Color.WHITE);
		tabbedPane_1.addTab("付款单", null, desktopPane_4, null);
		
		JScrollPane scrollPane9 = new JScrollPane();
		scrollPane9.setBounds(154, 36, 657, 433);
		desktopPane_4.add(scrollPane9);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
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
				"New column", "\u4ED8\u6B3E\u5355\u7F16\u53F7", "\u4ED8\u6B3E\u91D1\u989D", "\u4ED8\u6B3E\u4EBA", "\u5355\u636E\u72B6\u6001", "\u64CD\u4F5C"
			}
		));
		scrollPane9.setViewportView(table);
		
		JCheckBox checkBox9 = new JCheckBox("");
		checkBox9.setBounds(154, 479, 21, 23);
		desktopPane_4.add(checkBox9);
		
		JButton button9_1 = new JButton("\u901A\u8FC7\u5BA1\u6279");
		button9_1.setBounds(181, 479, 93, 23);
		desktopPane_4.add(button9_1);
		
		JButton button9_2 = new JButton("\u64A4\u9500\u5BA1\u5224");
		button9_2.setBounds(284, 479, 93, 23);
		desktopPane_4.add(button9_2);
		
		JButton button9_3 = new JButton("\u63D0\u4EA4");
		button9_3.setBounds(718, 479, 93, 23);
		desktopPane_4.add(button9_3);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(Color.WHITE);
		tabbedPane.addTab("人员与机构管理", null, desktopPane_1, null);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(0, 0, 979, 21);
		desktopPane_1.add(textField_1);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(46, 36, 881, 536);
		desktopPane_1.add(tabbedPane_2);
		
		JDesktopPane desktopPane_13 = new JDesktopPane();
		desktopPane_13.setBackground(Color.WHITE);
		tabbedPane_2.addTab("雇佣新员工", null, desktopPane_13, null);
		
		JLabel label = new JLabel("\u59D3\u540D");
		label.setBounds(70, 26, 54, 15);
		desktopPane_13.add(label);
		
		textField_3 = new JTextField();
		textField_3.setBounds(106, 23, 66, 21);
		desktopPane_13.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_1 = new JLabel("\u5E74\u9F84");
		label_1.setBounds(203, 26, 54, 15);
		desktopPane_13.add(label_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(240, 23, 60, 21);
		desktopPane_13.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_2 = new JLabel("\u804C\u4F4D");
		label_2.setBounds(335, 26, 54, 15);
		desktopPane_13.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u5FEB\u9012\u5458", "\u8425\u4E1A\u5385\u4E1A\u52A1\u5458", "\u4E2D\u8F6C\u4E2D\u5FC3\u4E1A\u52A1\u5458", "\u4E2D\u8F6C\u4E2D\u5FC3\u4ED3\u5E93\u7BA1\u7406\u4EBA\u5458", "\u8D22\u52A1\u4EBA\u5458", "\u7BA1\u7406\u5458"}));
		comboBox.setBounds(375, 23, 132, 21);
		desktopPane_13.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("\u6240\u5C5E\u90E8\u95E8");
		lblNewLabel.setBounds(548, 26, 54, 15);
		desktopPane_13.add(lblNewLabel);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u5357\u4EAC\u5E02\u6816\u971E\u533A\u4ED9\u6797\u8857\u9053\u8425\u4E1A\u5385"}));
		comboBox_1.setBounds(612, 23, 200, 21);
		desktopPane_13.add(comboBox_1);
		
		JButton button_3 = new JButton("\u6DFB\u52A0");
		button_3.setBounds(744, 66, 93, 23);
		desktopPane_13.add(button_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(70, 111, 767, 342);
		desktopPane_13.add(scrollPane_1);
		
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
				{null, null, null, null, null, null},
			},
			new String[] {
				"New column", "用户ID", "姓名", "年龄", "职位", "所属部门"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setBounds(70, 467, 21, 23);
		desktopPane_13.add(checkBox_1);
		
		JButton button_4 = new JButton("\u64A4\u9500");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_4.setBounds(97, 467, 93, 23);
		desktopPane_13.add(button_4);
		
		JButton button_5 = new JButton("\u63D0\u4EA4");
		button_5.setBounds(744, 467, 93, 23);
		desktopPane_13.add(button_5);
		
		JDesktopPane desktopPane_14 = new JDesktopPane();
		desktopPane_14.setBackground(Color.WHITE);
		tabbedPane_2.addTab("解雇员工", null, desktopPane_14, null);
		
		JLabel lblid = new JLabel("\u5458\u5DE5ID");
		lblid.setBounds(210, 39, 54, 15);
		desktopPane_14.add(lblid);
		
		textField_5 = new JTextField();
		textField_5.setBounds(274, 36, 123, 21);
		desktopPane_14.add(textField_5);
		textField_5.setColumns(10);
		
		JButton button_6 = new JButton("\u63D0\u4EA4");
		button_6.setBounds(550, 65, 93, 23);
		desktopPane_14.add(button_6);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(77, 115, 675, 334);
		desktopPane_14.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
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
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"New column", "用户ID", "姓名", "年龄", "职位", "所属部门"
			}
		));
		scrollPane_2.setViewportView(table_2);
		
		JCheckBox checkBox_2 = new JCheckBox("");
		checkBox_2.setBounds(77, 465, 21, 23);
		desktopPane_14.add(checkBox_2);
		
		JButton button_7 = new JButton("\u64A4\u9500");
		button_7.setBounds(104, 465, 93, 23);
		desktopPane_14.add(button_7);
		
		JButton button_8 = new JButton("\u63D0\u4EA4");
		button_8.setBounds(659, 465, 93, 23);
		desktopPane_14.add(button_8);
		
		JDesktopPane desktopPane_15 = new JDesktopPane();
		desktopPane_15.setBackground(Color.WHITE);
		tabbedPane_2.addTab("人事调动", null, desktopPane_15, null);
		
		JLabel lblid_1 = new JLabel("\u5458\u5DE5ID");
		lblid_1.setBounds(98, 51, 54, 15);
		desktopPane_15.add(lblid_1);
		
		textField_6 = new JTextField();
		textField_6.setBounds(150, 48, 101, 21);
		desktopPane_15.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel label_3 = new JLabel("\u65B0\u804C\u4F4D");
		label_3.setBounds(287, 51, 54, 15);
		desktopPane_15.add(label_3);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"\u5FEB\u9012\u5458", "\u4E2D\u8F6C\u4E2D\u5FC3\u4ED3\u5E93\u7BA1\u7406\u4EBA\u5458"}));
		comboBox_2.setBounds(340, 48, 138, 21);
		desktopPane_15.add(comboBox_2);
		
		JLabel label_4 = new JLabel("\u65B0\u90E8\u95E8");
		label_4.setBounds(511, 51, 54, 15);
		desktopPane_15.add(label_4);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(563, 48, 200, 21);
		desktopPane_15.add(comboBox_3);
		
		JButton button_9 = new JButton("\u6DFB\u52A0");
		button_9.setBounds(698, 94, 93, 23);
		desktopPane_15.add(button_9);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(98, 157, 665, 294);
		desktopPane_15.add(scrollPane_3);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
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
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "用户ID", "姓名", "年龄", "原职位", "原所属部门", "新职位", "新所属部门"
			}
		));
		scrollPane_3.setViewportView(table_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(98, 466, 21, 23);
		desktopPane_15.add(chckbxNewCheckBox);
		
		JButton button_10 = new JButton("\u64A4\u9500");
		button_10.setBounds(125, 466, 93, 23);
		desktopPane_15.add(button_10);
		
		JButton button_11 = new JButton("\u63D0\u4EA4");
		button_11.setBounds(670, 466, 93, 23);
		desktopPane_15.add(button_11);
		
		JDesktopPane desktopPane_16 = new JDesktopPane();
		desktopPane_16.setBackground(Color.WHITE);
		tabbedPane_2.addTab("薪水策略设定", null, desktopPane_16, null);
		
		JLabel lblid_2 = new JLabel("\u5458\u5DE5ID");
		lblid_2.setBounds(110, 49, 54, 15);
		desktopPane_16.add(lblid_2);
		
		textField_7 = new JTextField();
		textField_7.setBounds(170, 46, 109, 21);
		desktopPane_16.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel label_5 = new JLabel("\u85AA\u6C34\u7B56\u7565");
		label_5.setBounds(456, 49, 54, 15);
		desktopPane_16.add(label_5);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"\u6708\u85AA+\u63D0\u6210"}));
		comboBox_4.setBounds(537, 46, 99, 21);
		desktopPane_16.add(comboBox_4);
		
		JButton button_12 = new JButton("\u6DFB\u52A0");
		button_12.setBounds(670, 76, 93, 23);
		desktopPane_16.add(button_12);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(110, 136, 653, 309);
		desktopPane_16.add(scrollPane_4);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
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
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "用户ID", "姓名", "年龄", "职位", "原薪水策略", "现薪水策略"
			}
		));
		scrollPane_4.setViewportView(table_4);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.setBounds(110, 463, 21, 23);
		desktopPane_16.add(chckbxNewCheckBox_1);
		
		JButton button_13 = new JButton("\u64A4\u9500");
		button_13.setBounds(137, 463, 93, 23);
		desktopPane_16.add(button_13);
		
		JButton button_14 = new JButton("\u63D0\u4EA4");
		button_14.setBounds(690, 463, 93, 23);
		desktopPane_16.add(button_14);
		
		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBackground(Color.WHITE);
		tabbedPane.addTab("查看报表", null, desktopPane_2, null);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(0, 0, 979, 21);
		desktopPane_2.add(textField_2);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setBounds(46, 36, 881, 536);
		desktopPane_2.add(tabbedPane_3);
		
		JDesktopPane desktopPane_17 = new JDesktopPane();
		desktopPane_17.setBackground(Color.WHITE);
		tabbedPane_3.addTab("成本收益表", null, desktopPane_17, null);
		
		JLabel label_6 = new JLabel("\u7CFB\u7EDF\u5F53\u524D\u65E5\u671F\uFF1A");
		label_6.setBounds(235, 98, 89, 15);
		desktopPane_17.add(label_6);
		
		textField_8 = new JTextField();
		textField_8.setBounds(334, 95, 66, 21);
		desktopPane_17.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.setBounds(519, 153, 93, 23);
		desktopPane_17.add(btnNewButton);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(235, 247, 377, 44);
		desktopPane_17.add(scrollPane_5);
		
		table_5 = new JTable();
		table_5.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"\u603B\u6536\u5165", "\u603B\u652F\u51FA", "\u603B\u5229\u6DA6", "\u622A\u6B62\u65E5\u671F"
			}
		));
		scrollPane_5.setViewportView(table_5);
		
		JDesktopPane desktopPane_18 = new JDesktopPane();
		desktopPane_18.setBackground(Color.WHITE);
		tabbedPane_3.addTab("经营情况表", null, desktopPane_18, null);
		
		JLabel label_7 = new JLabel("\u5F00\u59CB\u65E5\u671F");
		label_7.setBounds(190, 62, 54, 15);
		desktopPane_18.add(label_7);
		
		JLabel label_8 = new JLabel("\u7ED3\u675F\u65E5\u671F");
		label_8.setBounds(190, 112, 54, 15);
		desktopPane_18.add(label_8);
		
		textField_9 = new JTextField();
		textField_9.setBounds(250, 59, 36, 21);
		desktopPane_18.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(250, 109, 36, 21);
		desktopPane_18.add(textField_10);
		
		JLabel label_9 = new JLabel("\u5E74");
		label_9.setBounds(296, 62, 54, 15);
		desktopPane_18.add(label_9);
		
		JLabel label_10 = new JLabel("\u5E74");
		label_10.setBounds(296, 112, 54, 15);
		desktopPane_18.add(label_10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(317, 109, 23, 21);
		desktopPane_18.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(317, 59, 23, 21);
		desktopPane_18.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(371, 59, 23, 21);
		desktopPane_18.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(371, 109, 23, 21);
		desktopPane_18.add(textField_14);
		
		JLabel label_11 = new JLabel("\u6708");
		label_11.setBounds(350, 62, 54, 15);
		desktopPane_18.add(label_11);
		
		JLabel label_12 = new JLabel("\u6708");
		label_12.setBounds(350, 112, 54, 15);
		desktopPane_18.add(label_12);
		
		JLabel label_13 = new JLabel("\u65E5");
		label_13.setBounds(404, 62, 54, 15);
		desktopPane_18.add(label_13);
		
		JLabel label_14 = new JLabel("\u65E5");
		label_14.setBounds(404, 112, 54, 15);
		desktopPane_18.add(label_14);
		
		JButton button_15 = new JButton("\u67E5\u8BE2");
		button_15.setBounds(564, 161, 93, 23);
		desktopPane_18.add(button_15);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(103, 200, 670, 264);
		desktopPane_18.add(scrollPane_6);
		
		table_6 = new JTable();
		table_6.setModel(new DefaultTableModel(
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
			},
			new String[] {
				"\u6536\u6B3E\u5355", "\u4ED8\u6B3E\u5355"
			}
		));
		scrollPane_6.setViewportView(table_6);
		
		JButton button_16 = new JButton("\u5BFC\u51FA");
		button_16.setBounds(733, 474, 93, 23);
		desktopPane_18.add(button_16);
	}
}
