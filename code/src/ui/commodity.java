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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class commodity {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table_1;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		textField_1.setBounds(419, 119, 66, 21);
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(154, 229, 650, 308);
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
		
		textField_7 = new JTextField();
		textField_7.setBounds(0, 0, 979, 21);
		desktopPane.add(textField_7);
		textField_7.setColumns(10);
		
		JDesktopPane desktopPane_4 = new JDesktopPane();
		desktopPane_4.setBackground(Color.WHITE);
		tabbedPane.addTab("出库", null, desktopPane_4, null);
		
		JLabel label_3 = new JLabel("\u8BA2\u5355\u53F7");
		label_3.setBounds(172, 56, 54, 15);
		desktopPane_4.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(236, 53, 93, 21);
		desktopPane_4.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_4 = new JLabel("\u51FA\u5E93\u65E5\u671F");
		label_4.setBounds(370, 56, 54, 15);
		desktopPane_4.add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(434, 53, 66, 21);
		desktopPane_4.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_5 = new JLabel("\u76EE\u7684\u5730");
		label_5.setBounds(539, 56, 54, 15);
		desktopPane_4.add(label_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(603, 53, 221, 21);
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
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(172, 231, 652, 280);
		desktopPane_4.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
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
			},
			new String[] {
				"\u8BA2\u5355\u53F7", "\u51FA\u5E93\u65E5\u671F", "\u76EE\u7684\u5730", "\u88C5\u8FD0\u5F62\u5F0F", "\u8D27\u8FD0\u7F16\u53F7"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JButton button_3 = new JButton("\u63D0\u4EA4");
		button_3.setBounds(816, 537, 93, 23);
		desktopPane_4.add(button_3);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(0, 0, 979, 21);
		desktopPane_4.add(textField_11);
		
		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBackground(Color.WHITE);
		tabbedPane.addTab("库存盘点", null, desktopPane_2, null);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(0, 0, 979, 21);
		desktopPane_2.add(textField_10);
		
		JLabel label_8 = new JLabel("\u65E5\u671F\uFF1A");
		label_8.setBounds(330, 82, 54, 15);
		desktopPane_2.add(label_8);
		
		textField_12 = new JTextField();
		textField_12.setBounds(394, 79, 66, 21);
		desktopPane_2.add(textField_12);
		textField_12.setColumns(10);
		
		JButton button_4 = new JButton("\u67E5\u8BE2");
		button_4.setBounds(346, 149, 93, 23);
		desktopPane_2.add(button_4);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(133, 206, 663, 311);
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
		
		JDesktopPane desktopPane_3 = new JDesktopPane();
		desktopPane_3.setBackground(Color.WHITE);
		tabbedPane.addTab("库区调整", null, desktopPane_3, null);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(0, 0, 979, 21);
		desktopPane_3.add(textField_9);
		
		JLabel label_9 = new JLabel("\u6392\u53F7");
		label_9.setBounds(328, 88, 54, 15);
		desktopPane_3.add(label_9);
		
		textField_13 = new JTextField();
		textField_13.setBounds(383, 85, 66, 21);
		desktopPane_3.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel label_10 = new JLabel("\u539F\u5206\u533A");
		label_10.setBounds(328, 122, 54, 15);
		desktopPane_3.add(label_10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(383, 119, 66, 21);
		desktopPane_3.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(383, 156, 66, 21);
		desktopPane_3.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel label_11 = new JLabel("\u73B0\u5206\u533A");
		label_11.setBounds(328, 159, 54, 15);
		desktopPane_3.add(label_11);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(243, 219, 374, 201);
		desktopPane_3.add(scrollPane_3);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
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
			},
			new String[] {
				"\u67B6\u53F7", "\u539F\u5206\u533A", "\u73B0\u5206\u533A"
			}
		));
		scrollPane_3.setViewportView(table_3);
		
		JButton button_6 = new JButton("\u63D0\u4EA4");
		button_6.setBounds(630, 481, 93, 23);
		desktopPane_3.add(button_6);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(Color.WHITE);
		tabbedPane.addTab("库存信息初始化", null, desktopPane_1, null);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(0, 0, 979, 21);
		desktopPane_1.add(textField_8);
		
		JLabel lblNewLabel = new JLabel("\u822A\u8FD0\u533A");
		lblNewLabel.setBounds(327, 90, 54, 15);
		desktopPane_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u94C1\u8FD0\u533A");
		lblNewLabel_1.setBounds(327, 115, 54, 15);
		desktopPane_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u6C7D\u8FD0\u533A");
		lblNewLabel_2.setBounds(327, 140, 54, 15);
		desktopPane_1.add(lblNewLabel_2);
		
		JLabel label_12 = new JLabel("\u673A\u52A8\u533A");
		label_12.setBounds(327, 165, 54, 15);
		desktopPane_1.add(label_12);
		
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
		
		JLabel label_13 = new JLabel("\u6392 \u5230");
		label_13.setBounds(461, 90, 54, 15);
		desktopPane_1.add(label_13);
		
		JLabel label_14 = new JLabel("\u6392 \u5230");
		label_14.setBounds(461, 115, 54, 15);
		desktopPane_1.add(label_14);
		
		JLabel label_15 = new JLabel("\u6392 \u5230");
		label_15.setBounds(461, 140, 54, 15);
		desktopPane_1.add(label_15);
		
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
		scrollPane_4.setBounds(235, 215, 467, 212);
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
	}
}
