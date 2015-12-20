package ui.judgementui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ui.reportui.profitsheetui;
import ui.staffui.staffmanageui;

public class judgementui {

	private JFrame frame;
	private JTable table;
	private JTable table_8;
	private JTable table_7;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					judgementui window = new judgementui();
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
	public judgementui() {
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
		
		staffmanageui t = new staffmanageui();
		tabbedPane.addTab("人员与机构管理", null, t, null);
		
		profitsheetui t1 = new profitsheetui();
		tabbedPane.addTab("查看报表", null, t1, null);
		
		new Thread() {        
			public void run() {            
				try {                
					while (true) {       
						SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
						label_18.setText(df.format(new Date()));//显示当前时间      
						Thread.sleep(1000);//暂停一秒                
						}            
					} catch (Exception e) {            
						
					}        
				}    
			}.start();
	}

}
