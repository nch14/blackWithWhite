package ui;
/*
 * 总经理界面
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.swing.JDesktopPane;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

import bl.report.impl.BussinessSheetController;
import bl.report.impl.ProfitSheetController;
import bl.report.service.BussinessSheetBLService;
import bl.report.service.ProfitSheetBLService;
import bl.staff.Impl.StaffManageController;
import bl.staff.service.StaffManageBLService;
import vo.BussinessSheetVO;
import vo.ProfitSheetVO;
import vo.StaffVO;

import javax.swing.JLabel;
import javax.swing.AbstractCellEditor;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.lang.Thread;

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
	private JTextField textField_15;
	private JTextField textField_16;
	BussinessSheetBLService bussinesssheet = new BussinessSheetController();
	
	ProfitSheetBLService profitsheet = new ProfitSheetController();
	
	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					manager window = new manager();
					window.frame.setVisible(true);
					
					Thread t1 = new Thread();//定义第一个线程  
					//启动  
					t1.start();//启动第一个线程
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
		frame.setResizable(false);
		frame.setTitle("\u7269\u6D41\u4FE1\u606F\u7BA1\u7406\u7CFB\u7EDF");
		frame.setBounds(100, 100, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1053, 611);
		frame.getContentPane().add(tabbedPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		tabbedPane.addTab("审判单据", null, desktopPane, null);
		
		JLabel label_18 = new JLabel();
		label_18.setBounds(282, 0, 436, 21);
		desktopPane.add(label_18);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(46, 36, 883, 536);
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
				"New column", "\u8BA2\u5355\u53F7", "\u8D39\u7528\u5408\u8BA1\uFF08\u5143\uFF09", "\u5FEB\u9012\u7C7B\u578B", "\u5355\u636E\u72B6\u6001", "\u64CD\u4F5C"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(15);
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
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
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
		
		JLabel label_19 = new JLabel();
		label_19.setBounds(282, 0, 436, 21);
		desktopPane_1.add(label_19);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(46, 36, 881, 536);
		desktopPane_1.add(tabbedPane_2);
		
		JDesktopPane desktopPane_13 = new JDesktopPane();
		desktopPane_13.setBackground(Color.WHITE);
		tabbedPane_2.addTab("雇佣新员工", null, desktopPane_13, null);
		
		JLabel label = new JLabel("\u59D3\u540D");
		label.setBounds(60, 26, 54, 15);
		desktopPane_13.add(label);
		
		textField_3 = new JTextField();
		textField_3.setBounds(101, 23, 66, 21);
		desktopPane_13.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_1 = new JLabel("\u5E74\u9F84");
		label_1.setBounds(177, 26, 54, 15);
		desktopPane_13.add(label_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(216, 23, 60, 21);
		desktopPane_13.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_2 = new JLabel("\u804C\u4F4D");
		label_2.setBounds(368, 26, 54, 15);
		desktopPane_13.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u5FEB\u9012\u5458", "\u8425\u4E1A\u5385\u4E1A\u52A1\u5458", "\u4E2D\u8F6C\u4E2D\u5FC3\u4E1A\u52A1\u5458", "\u4E2D\u8F6C\u4E2D\u5FC3\u4ED3\u5E93\u7BA1\u7406\u4EBA\u5458", "\u8D22\u52A1\u4EBA\u5458", "\u7BA1\u7406\u5458"}));
		comboBox.setBounds(406, 23, 132, 21);
		desktopPane_13.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("\u6240\u5C5E\u90E8\u95E8");
		lblNewLabel.setBounds(548, 26, 54, 15);
		desktopPane_13.add(lblNewLabel);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u5357\u4EAC\u5E02\u6816\u971E\u533A\u4ED9\u6797\u8857\u9053\u8425\u4E1A\u5385"}));
		comboBox_1.setBounds(612, 23, 200, 21);
		desktopPane_13.add(comboBox_1);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"\u7537", "\u5973"}));
		comboBox_5.setBounds(320, 23, 38, 21);
		desktopPane_13.add(comboBox_5);
		
		/*
		 * 雇佣新员工添加
		 */
		JButton button_3 = new JButton("\u6DFB\u52A0");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table_1.getRowCount();i++){
					if(table_1.getValueAt(i, 1)==null&&table_1.getValueAt(i, 2)==null){
						table_1.setValueAt(textField_3.getText(), i, 1);
						table_1.setValueAt(textField_4.getText(), i, 2);
						table_1.setValueAt(comboBox_5.getSelectedItem(), i, 3);
						table_1.setValueAt(comboBox.getSelectedItem(), i, 4);
						table_1.setValueAt(comboBox_1.getSelectedItem(), i, 5);
						textField_3.setText(null);
						textField_4.setText(null);
						comboBox.setToolTipText("快递员");
						comboBox_1.setToolTipText("南京市栖霞区仙林街道营业厅");
						break;
					}
				}
			}
		});
		button_3.setBounds(744, 66, 93, 23);
		desktopPane_13.add(button_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(70, 111, 767, 342);
		desktopPane_13.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
				{null, null, null, null, null,null},
			},
			new String[] {
				"\u7528\u6237ID", "\u59D3\u540D", "\u5E74\u9F84", "6027\u522B","\u804C\u4F4D", "\u6240\u5C5E\u90E8\u95E8"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		/*
		 * 雇佣新员工信息撤销
		 */
		JButton button_4 = new JButton("\u64A4\u9500");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				for(int i=table_1.getRowCount()-1;i>=0;i--){
					if(table_1.getValueAt(i, 1)!=null&&table_1.getValueAt(i, 2)!=null){
						table_1.setValueAt(null, i, 0);
						table_1.setValueAt(null, i, 1);
						table_1.setValueAt(null, i, 2);
						table_1.setValueAt(null, i, 3);
						table_1.setValueAt(null, i, 4);
						table_1.setValueAt(null, i, 5);
						
					}
				}
			}
		});
		
		button_4.setBounds(74, 467, 93, 23);
		desktopPane_13.add(button_4);
		
		/*
		 * 雇佣新员工信息提交
		 */
		JButton button_5 = new JButton("\u63D0\u4EA4");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				StaffVO[] staff=null;
				for(int i=0;i<table_1.getRowCount();i++){
				StaffVO staffvo= new StaffVO(table_1.getValueAt(i, 1).toString(),table_1.getValueAt(i, 2).toString(),
						table_1.getValueAt(i, 3).toString(),table_1.getValueAt(i, 4).toString(),table_1.getValueAt(i, 5).toString());
				staff[i]=staffvo;
				}
				StaffManageBLService addnewstaff = new StaffManageController();
				boolean istrue=addnewstaff.addNewStaff(staff);
				if(istrue==true){
					for(int i=0;i<table_2.getRowCount();i++){
						table_2.setValueAt(null, i, 0);	
						table_2.setValueAt(null, i, 1);
						table_2.setValueAt(null, i, 2);
						table_2.setValueAt(null, i, 3);
						table_2.setValueAt(null, i, 4);
						table_2.setValueAt(null, i, 5);
					}
				}else{
					
				}
			}
		});
		button_5.setBounds(744, 467, 93, 23);
		desktopPane_13.add(button_5);
		
		JLabel label_21 = new JLabel("\u6027\u522B");
		label_21.setBounds(286, 26, 54, 15);
		desktopPane_13.add(label_21);
		
		
		
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
		
		/*
		 * 解雇员工信息查询
		 */
		JButton button_6 = new JButton("\u67E5\u8BE2");
		button_6.setBounds(550, 65, 93, 23);
		desktopPane_14.add(button_6);
        button_6.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				StaffManageBLService getstaff = new StaffManageController();
				StaffVO staff;
				staff=getstaff.getStaff(textField_5.getText());
				if(staff==null){
			    	
			    }else{
			    	for(int i=0;i<table_2.getRowCount();i++){
			    		if(table_2.getValueAt(i, 0)==null){
			    			table_2.setValueAt(staff.ID, i, 0);
			    			table_2.setValueAt(staff.name, i, 1);
			    			table_2.setValueAt(staff.age, i, 2);
			    			table_2.setValueAt(staff.pos, i, 3);
			    			table_2.setValueAt(staff.department, i, 4);
			    		}
			    	}
			    }
			}
			});
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(77, 115, 675, 334);
		desktopPane_14.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
				{ null, null, null, null, null},
			},
			new String[] {
				 "用户ID", "姓名", "年龄", "职位", "所属部门"
			}
		));
		scrollPane_2.setViewportView(table_2);
		
		JCheckBox checkBox_2 = new JCheckBox("");
		checkBox_2.setBounds(77, 465, 21, 23);
		desktopPane_14.add(checkBox_2);
		
		/*
		 * 解雇员工信息撤销
		 */
		JButton button_7 = new JButton("\u64A4\u9500");
		button_7.setBounds(104, 465, 93, 23);
		desktopPane_14.add(button_7);
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_2.getRowCount()-1;i>=0;i--){
					if(table_2.getValueAt(i, 0)!=null&&table_2.getValueAt(i, 1)!=null){
						table_2.setValueAt(null, i, 0);
						table_2.setValueAt(null, i, 1);
						table_2.setValueAt(null, i, 2);
						table_2.setValueAt(null, i, 3);
						table_2.setValueAt(null, i, 4);
					}
				}
			}
		});
		
		/*
		 * 解雇员工信息提交
		 */
		JButton button_8 = new JButton("\u63D0\u4EA4");
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] staff=new String[table_2.getRowCount()];
				for(int i=0;i<table_2.getRowCount();i++){
					staff[i]=table_2.getValueAt(i, 0).toString();
				}
				StaffManageBLService deletestaff = new StaffManageController();
				boolean istrue=deletestaff.deleteStaff(staff);
				if(istrue){
					for(int i=0;i<table_2.getRowCount();i++){
						table_2.setValueAt(null, i, 1);
						table_2.setValueAt(null, i, 2);
						table_2.setValueAt(null, i, 3);
						table_2.setValueAt(null, i, 4);
						table_2.setValueAt(null, i, 5);
					}
				}else{
					
				}
			}
		});
		button_8.setBounds(697, 465, 93, 23);
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
		
		/*
		 * 人事调动信息查询
		 */
		JButton button_9 = new JButton("\u6DFB\u52A0");
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StaffManageBLService getstaff = new StaffManageController();
				StaffVO staff;
				staff=getstaff.getStaff(textField_6.getText());
				if(staff==null){
			    	
			    }else{
			    	for(int i=0;i<table_3.getRowCount();i++){
			    		if(table_3.getValueAt(i, 0)==null){
			    			table_3.setValueAt(staff.ID, i, 0);
			    			table_3.setValueAt(staff.name, i, 1);
			    			table_3.setValueAt(staff.age, i, 2);
			    			table_3.setValueAt(staff.pos, i, 3);
			    			table_3.setValueAt(comboBox_2.getSelectedItem(), i, 4);
			    			table_3.setValueAt(staff.department, i, 5);
			    			table_3.setValueAt(comboBox_3.getSelectedItem(), i, 6);
			    		}
			    	}
			    }
			}
		});
		button_9.setBounds(706, 79, 93, 23);
		desktopPane_15.add(button_9);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(77, 115, 675, 334);
		desktopPane_15.add(scrollPane_3);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
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
				"\u7528\u6237ID", "\u59D3\u540D", "\u5E74\u9F84", "\u539F\u804C\u4F4D", "\u539F\u6240\u5C5E\u90E8\u95E8", "\u65B0\u804C\u4F4D", "\u65B0\u6240\u5C5E\u90E8\u95E8"
			}
		));
		scrollPane_3.setViewportView(table_3);
		
		/*
		 * 人事调动信息撤销
		 */
		JButton button_10 = new JButton("\u64A4\u9500");
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_3.getRowCount()-1;i>=0;i--){
					if(table_3.getValueAt(i, 0)!=null&&table_3.getValueAt(i, 1)!=null){
						table_3.setValueAt(null, i, 0);
						table_3.setValueAt(null, i, 1);
						table_3.setValueAt(null, i, 2);
						table_3.setValueAt(null, i, 3);
						table_3.setValueAt(null, i, 4);
						table_3.setValueAt(null, i, 5);
						table_3.setValueAt(null, i, 6);
					}
				}
			}
		});
		button_10.setBounds(77, 466, 93, 23);
		desktopPane_15.add(button_10);
		
		/*
		 * 人事调动信息提交
		 */
		JButton button_11 = new JButton("\u63D0\u4EA4");
		button_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] ID = new String[table_3.getRowCount()];
				String[] newPosition = new String[table_3.getRowCount()];
				String[] newDepartment = new String[table_3.getRowCount()];
				for(int i=0;i<table_3.getRowCount();i++){
					ID[i]=table_3.getValueAt(i, 1).toString();
					newPosition[i]=table_3.getValueAt(i, 6).toString();
					newDepartment[i]=table_3.getValueAt(i, 7).toString();
				}
				StaffManageBLService changeposition = new StaffManageController();
				boolean istrue=changeposition.changePosition(ID, newPosition, newDepartment);
				if(istrue){
					for(int i=0;i<table_3.getRowCount();i++){
						table_3.setValueAt(null, i, 0);
						table_3.setValueAt(null, i, 1);
						table_3.setValueAt(null, i, 2);
						table_3.setValueAt(null, i, 3);
						table_3.setValueAt(null, i, 4);
						table_3.setValueAt(null, i, 5);
						table_3.setValueAt(null, i, 6);
					}
				}else{
					
				}
			}
		});
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
		
		/*
		 * 薪水策略信息查询
		 */
		JButton button_12 = new JButton("\u6DFB\u52A0");
		button_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StaffManageBLService getstaff = new StaffManageController();
				StaffVO staff;
				staff=getstaff.getStaff(textField_7.getText());
				if(staff==null){
			    	
			    }else{
			    	for(int i=0;i<table_4.getRowCount();i++){
			    		if(table_4.getValueAt(i, 0)==null){
			    			table_4.setValueAt(staff.ID, i, 0);
			    			table_4.setValueAt(staff.name, i, 1);
			    			table_4.setValueAt(staff.age, i, 2);
			    			table_4.setValueAt(staff.pos, i, 3);
			    			table_4.setValueAt(staff.SalaryModel, i, 4);
			    			table_4.setValueAt(comboBox_4.getSelectedItem(), i, 5);
			    		}
			    	}
			    }
			}
		});
		button_12.setBounds(670, 76, 93, 23);
		desktopPane_16.add(button_12);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(77, 115, 675, 334);
		desktopPane_16.add(scrollPane_4);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
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
				"\u7528\u6237ID", "\u59D3\u540D", "\u5E74\u9F84", "\u804C\u4F4D", "\u539F\u85AA\u6C34\u7B56\u7565", "\u73B0\u85AA\u6C34\u7B56\u7565"
			}
		));
		scrollPane_4.setViewportView(table_4);
		
		/*
		 * 薪水策略撤销
		 */
		JButton button_13 = new JButton("\u64A4\u9500");
		button_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_4.getRowCount()-1;i>=0;i--){
					if(table_4.getValueAt(i, 0)!=null&&table_4.getValueAt(i, 1)!=null){
						table_4.setValueAt(null, i, 0);
						table_4.setValueAt(null, i, 1);
						table_4.setValueAt(null, i, 2);
						table_4.setValueAt(null, i, 3);
						table_4.setValueAt(null, i, 4);
						table_4.setValueAt(null, i, 5);
					}
				}
			}
		});
		button_13.setBounds(77, 463, 93, 23);
		desktopPane_16.add(button_13);
		
		/*
		 * 薪水策略提交
		 */
		JButton button_14 = new JButton("\u63D0\u4EA4");
		button_14.setBounds(690, 463, 93, 23);
		desktopPane_16.add(button_14);
		button_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] ID = new String[table_4.getRowCount()];
				String[] salaryModel = new String[table_4.getRowCount()];
				for(int i=0;i<table_4.getRowCount();i++){
					ID[i]=table_4.getValueAt(i, 1).toString();
					salaryModel[i]=table_4.getValueAt(i, 6).toString();
				}
				StaffManageBLService changeSalarymodel = new StaffManageController();
				boolean istrue=changeSalarymodel.changesalarymodel(ID, salaryModel);
				if(istrue==true){
					for(int i=0;i<table_4.getRowCount();i++){
						table_4.setValueAt(null, i, 1);
						table_4.setValueAt(null, i, 2);
						table_4.setValueAt(null, i, 3);
						table_4.setValueAt(null, i, 4);
						table_4.setValueAt(null, i, 5);
						table_4.setValueAt(null, i, 6);
					}
				}else{
					
				}
			}
		});
		
		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBackground(Color.WHITE);
		tabbedPane.addTab("查看报表", null, desktopPane_2, null);
		
		JLabel label_20 = new JLabel();
		label_20.setBounds(282, 0, 436, 21);
		desktopPane_2.add(label_20);
		
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
		textField_8.setBounds(334, 95, 34, 21);
		desktopPane_17.add(textField_8);
		textField_8.setColumns(10);
		
		/*
		 * 查看成本收益表
		 */
		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.setBounds(519, 153, 93, 23);
		desktopPane_17.add(btnNewButton);
		 btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				ProfitSheetVO profitSheet = profitsheet.show();
				table_5.setValueAt(profitSheet.totalGet, 0, 0);
				table_5.setValueAt(profitSheet.totalPay, 0, 1);
				table_5.setValueAt(profitSheet.profit, 0, 2);
				table_5.setValueAt(profitSheet.time, 0, 3);
			}
		});
		
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
		
		JLabel label_15 = new JLabel("\u5E74");
		label_15.setBounds(378, 98, 54, 15);
		desktopPane_17.add(label_15);
		
		textField_15 = new JTextField();
		textField_15.setBounds(400, 95, 34, 21);
		desktopPane_17.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel label_16 = new JLabel("\u6708");
		label_16.setBounds(442, 98, 54, 15);
		desktopPane_17.add(label_16);
		
		textField_16 = new JTextField();
		textField_16.setBounds(462, 95, 34, 21);
		desktopPane_17.add(textField_16);
		textField_16.setColumns(10);
		
		JLabel label_17 = new JLabel("\u65E5");
		label_17.setBounds(506, 98, 54, 15);
		desktopPane_17.add(label_17);
		
		/*
		 * 导出成本收益表
		 */
		JButton button_17 = new JButton("\u5BFC\u51FA");
		button_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				boolean istrue=profitsheet.export();
				if(istrue){
					table_5.setValueAt(null, 0, 0);
					table_5.setValueAt(null, 0, 1);
					table_5.setValueAt(null, 0, 2);
					table_5.setValueAt(null, 0, 3);
				}else{
					
				}
			}
		});
		button_17.setBounds(636, 360, 93, 23);
		desktopPane_17.add(button_17);
		
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
		
		/*
		 * 查看经营情况表
		 */
		JButton button_15 = new JButton("\u67E5\u8BE2");
		button_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String start = null;
				String end = null;
				if(textField_9.getText().length()!=4&&textField_12.getText().length()!=4){
					
				}else{
					start+=textField_9.getText();
					end+=textField_12.getText();
					if(textField_10.getText().length()==2){
						start+=textField_10.getText();
					}else if(textField_10.getText().length()==1){
						start+="0"+textField_10.getText();
					}else{
						
					}
					if(textField_11.getText().length()==2){
						start+=textField_11.getText();
					}else if(textField_11.getText().length()==1){
						start+="0"+textField_11.getText();
					}else{
						
					}
					if(textField_13.getText().length()==2){
						end+=textField_13.getText();
					}else if(textField_13.getText().length()==1){
						end+="0"+textField_13.getText();
					}else{
						
					}
					if(textField_14.getText().length()==2){
						end+=textField_14.getText();
					}else if(textField_14.getText().length()==1){
						end+="0"+textField_14.getText();
					}else{
						
					}
				}
				BussinessSheetVO bussinessvo;
				bussinessvo=bussinesssheet.show(start, end);
				if(bussinessvo==null){
					
				}else{
					for(int i=0;i<table_6.getRowCount();i++){
						table_6.setValueAt(bussinessvo.paid.get(i).ID, i, 0);
						table_6.setValueAt(bussinessvo.paid.get(i).getDate(), i, 1);
						table_6.setValueAt(bussinessvo.paid.get(i).transactor, i, 2);
						table_6.setValueAt(bussinessvo.paid.get(i).money, i, 3);
						table_6.setValueAt(bussinessvo.paid.get(i).bussinessHallCode, i, 4);
						table_6.setValueAt(bussinessvo.pay.get(i).ID, i, 5);
						table_6.setValueAt(bussinessvo.pay.get(i).getDate(), i, 6);
						table_6.setValueAt(bussinessvo.pay.get(i).payer, i, 7);
						table_6.setValueAt(bussinessvo.pay.get(i).money, i, 8);
						table_6.setValueAt(bussinessvo.pay.get(i).type, i, 9);
					}
				}
			}
		});
		button_15.setBounds(564, 161, 93, 23);
		desktopPane_18.add(button_15);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(103, 200, 670, 264);
		desktopPane_18.add(scrollPane_6);
		
		table_6 = new JTable();
		table_6.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"\u6536\u6B3E\u5355\u7F16\u53F7", "\u6536\u6B3E\u65E5\u671F", "\u6536\u6B3E\u4EBA", "\u6536\u6B3E\u91D1\u989D", "\u6536\u6B3E\u6761\u76EE", "\u4ED8\u6B3E\u5355\u7F16\u53F7", "\u4ED8\u6B3E\u65E5\u671F", "\u4ED8\u6B3E\u4EBA", "\u4ED8\u6B3E\u91D1\u989D", "\u4ED8\u6B3E\u6761\u76EE"
			}
		));
		table_6.getColumnModel().getColumn(0).setPreferredWidth(85);
		table_6.getColumnModel().getColumn(5).setPreferredWidth(85);
		scrollPane_6.setViewportView(table_6);
		
		/*
		 * 导出经营情况表
		 */
		JButton button_16 = new JButton("\u5BFC\u51FA");
		button_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				boolean istrue=bussinesssheet.export();
				if(istrue==true){
					for(int i=0;i<table_6.getRowCount();i++){
						table_6.setValueAt(null, i, 0);
						table_6.setValueAt(null, i, 1);
						table_6.setValueAt(null, i, 2);
						table_6.setValueAt(null, i, 3);
						table_6.setValueAt(null, i, 4);
						table_6.setValueAt(null, i, 5);
						table_6.setValueAt(null, i, 6);
						table_6.setValueAt(null, i, 7);
						table_6.setValueAt(null, i, 8);
						table_6.setValueAt(null, i, 9);
					}
				}else{
					
				}
			}
		});
		button_16.setBounds(733, 474, 93, 23);
		desktopPane_18.add(button_16);
		
		new Thread() {        
			public void run() {            
				try {                
					while (true) {                    
						label_18.setText(df.format(new Date()));//显示当前时间      
						label_19.setText(df.format(new Date()));//显示当前时间
						label_20.setText(df.format(new Date()));//显示当前时间
						
						Thread.sleep(1000);//暂停一秒                
						}            
					} catch (Exception e) {            
						
					}        
				}    
			}.start();
	}
}
