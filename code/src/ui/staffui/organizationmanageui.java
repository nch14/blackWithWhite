package ui.staffui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class organizationmanageui extends JDesktopPane{
	private JTextField textField_17;
	private JTextField textField_18;
	private JTable table_9;
	private JTable table_10;
	private JTable table_11;
	
	public organizationmanageui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBackground(Color.WHITE);
		
		
		JLabel label_22 = new JLabel();
		label_22.setBounds(282, 0, 436, 21);
		this.add(label_22);
		
		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_4.setBounds(46, 36, 881, 536);
		this.add(tabbedPane_4);
		
		JDesktopPane desktopPane_20 = new JDesktopPane();
		desktopPane_20.setBackground(Color.WHITE);
		tabbedPane_4.addTab("添加新城市", null, desktopPane_20, null);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(207, 111, 421, 342);
		desktopPane_20.add(scrollPane_7);
		
		table_9 = new JTable();
		table_9.setModel(new DefaultTableModel(
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
			},
			new String[] {
				"\u65B0\u589E\u57CE\u5E02\u540D", "\u539F\u6709\u57CE\u5E02\u540D", "\u8DDD\u79BB"
			}
		));
		scrollPane_7.setColumnHeaderView(table_9);
		
		JLabel label_23 = new JLabel("\u65B0\u589E\u57CE\u5E02");
		label_23.setBounds(155, 63, 54, 15);
		desktopPane_20.add(label_23);
		
		textField_17 = new JTextField();
		textField_17.setBounds(252, 60, 66, 21);
		desktopPane_20.add(textField_17);
		textField_17.setColumns(10);
		
		JLabel label_24 = new JLabel("\u8DDD\u79BB");
		label_24.setBounds(387, 63, 54, 15);
		desktopPane_20.add(label_24);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(451, 60, 54, 21);
		desktopPane_20.add(comboBox_6);
		
		textField_18 = new JTextField();
		textField_18.setBounds(562, 60, 66, 21);
		desktopPane_20.add(textField_18);
		textField_18.setColumns(10);
		
		JLabel lblKm = new JLabel("km");
		lblKm.setBounds(638, 63, 54, 15);
		desktopPane_20.add(lblKm);
		
		JButton button_18 = new JButton("\u6DFB\u52A0");
		button_18.setBounds(648, 88, 93, 23);
		desktopPane_20.add(button_18);
		
		JButton button_19 = new JButton("\u64A4\u9500");
		button_19.setBounds(207, 463, 93, 23);
		desktopPane_20.add(button_19);
		
		JButton button_20 = new JButton("\u63D0\u4EA4");
		button_20.setBounds(648, 463, 93, 23);
		desktopPane_20.add(button_20);
		
		JDesktopPane desktopPane_21 = new JDesktopPane();
		desktopPane_21.setBackground(Color.WHITE);
		tabbedPane_4.addTab("中转中心管理", null, desktopPane_21, null);
		
		JScrollPane scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(207, 111, 421, 342);
		desktopPane_21.add(scrollPane_8);
		
		table_10 = new JTable();
		table_10.setModel(new DefaultTableModel(
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
				"\u57CE\u5E02", "\u8425\u4E1A\u5385", "\u8425\u4E1A\u5385\u7F16\u53F7"
			}
		));
		scrollPane_8.setViewportView(table_10);
		
		JLabel label_25 = new JLabel("\u57CE\u5E02");
		label_25.setBounds(337, 32, 54, 15);
		desktopPane_21.add(label_25);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(432, 29, 66, 21);
		desktopPane_21.add(comboBox_7);
		
		JButton button_21 = new JButton("\u67E5\u8BE2");
		button_21.setBounds(370, 71, 93, 23);
		desktopPane_21.add(button_21);
		
		JButton button_22 = new JButton("\u4FDD\u5B58");
		button_22.setBounds(663, 460, 93, 23);
		desktopPane_21.add(button_22);
		
		JButton button_25 = new JButton("\u64A4\u9500");
		button_25.setBounds(207, 460, 93, 23);
		desktopPane_21.add(button_25);
		
		JDesktopPane desktopPane_22 = new JDesktopPane();
		desktopPane_22.setBackground(Color.WHITE);
		tabbedPane_4.addTab("营业厅管理", null, desktopPane_22, null);
		
		JScrollPane scrollPane_9 = new JScrollPane();
		scrollPane_9.setBounds(207, 111, 421, 342);
		desktopPane_22.add(scrollPane_9);
		
		table_11 = new JTable();
		table_11.setModel(new DefaultTableModel(
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
			},
			new String[] {
				"\u57CE\u5E02", "\u4E2D\u8F6C\u4E2D\u5FC3", "\u4E2D\u8F6C\u4E2D\u5FC3\u7F16\u53F7"
			}
		));
		scrollPane_9.setViewportView(table_11);
		
		JLabel label_26 = new JLabel("\u57CE\u5E02");
		label_26.setBounds(337, 32, 54, 15);
		desktopPane_22.add(label_26);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setBounds(432, 29, 66, 21);
		desktopPane_22.add(comboBox_8);
		
		JButton button_23 = new JButton("\u67E5\u8BE2");
		button_23.setBounds(370, 71, 93, 23);
		desktopPane_22.add(button_23);
		
		JButton button_24 = new JButton("\u4FDD\u5B58");
		button_24.setBounds(663, 460, 93, 23);
		desktopPane_22.add(button_24);
		
		JButton button_26 = new JButton("\u64A4\u9500");
		button_26.setBounds(207, 460, 93, 23);
		desktopPane_22.add(button_26);
		
	}
}
