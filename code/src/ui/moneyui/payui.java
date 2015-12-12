package ui.moneyui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class payui extends JDesktopPane{
	
	
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table;
	private JTextField textField;
	private JTextField textField_9;
	
	public payui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//财务支出的界面
				this.setBackground(Color.WHITE);
				
				JLabel textPane = new JLabel();
				textPane.setText("付款日期(年/月/日）");
				textPane.setBounds(150, 31, 121, 21);
				this.add(textPane);
				
				textField_1 = new JTextField();
				textField_1.setBounds(281, 31, 42, 21);
				this.add(textField_1);
				textField_1.setColumns(10);
				
				JLabel textPane_4 = new JLabel();
				textPane_4.setText("付款金额");
				textPane_4.setBounds(472, 31, 54, 21);
				this.add(textPane_4);
				
				textField_4 = new JTextField();
				textField_4.setBounds(536, 31, 66, 21);
				this.add(textField_4);
				textField_4.setColumns(10);
				
				JLabel textPane_5 = new JLabel();
				textPane_5.setText("付款人");
				textPane_5.setBounds(653, 31, 42, 21);
				this.add(textPane_5);
				
				textField_5 = new JTextField();
				textField_5.setBounds(705, 31, 128, 21);
				this.add(textField_5);
				textField_5.setColumns(10);
				
				JLabel textPane_6 = new JLabel();
				textPane_6.setText("付款账号");
				textPane_6.setBounds(150, 62, 54, 21);
				this.add(textPane_6);
				
				JLabel textPane_7 = new JLabel();
				textPane_7.setText("条目");
				textPane_7.setBounds(482, 62, 31, 21);
				this.add(textPane_7);
				
				textField_6 = new JTextField();
				textField_6.setBounds(536, 62, 66, 21);
				this.add(textField_6);
				textField_6.setColumns(10);
				
				JLabel textPane_8 = new JLabel();
				textPane_8.setText("备注");
				textPane_8.setBounds(663, 62, 31, 21);
				this.add(textPane_8);
				
				textField_7 = new JTextField();
				textField_7.setBounds(705, 62, 128, 21);
				this.add(textField_7);
				textField_7.setColumns(10);
				
				final JComboBox comboBox_1 = new JComboBox();
				comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"中国农业银行", "中国工商银行", "中国建设银行", "南京银行"}));
				comboBox_1.setBounds(214, 62, 191, 21);
				this.add(comboBox_1);
				
				//添加付款单的事件监听
				JButton button = new JButton("添加");
				button.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						for(int i=0;i<table.getRowCount();i++){
							if(table.getValueAt(i, 0)==null&&table.getValueAt(i, 1)==null&&table.getValueAt(i, 2)==null&&table.getValueAt(i, 3)==null&&table.getValueAt(i, 4)==null
									&&table.getValueAt(i, 5)==null&&table.getValueAt(i, 6)==null){
						           table.setValueAt(i+1, i, 0);
						           table.setValueAt(textField_1.getText()+textField.getText()+textField_9.getText(), i, 1);
						           table.setValueAt(textField_4.getText(), i, 2);
						           table.setValueAt(textField_5.getText(), i, 3);
						           table.setValueAt(comboBox_1.getSelectedItem(), i, 4);
						           table.setValueAt(textField_6.getText(), i, 5);
						           table.setValueAt(textField_7.getText(), i, 6);
						           break;
							}
						}
					}
				});
				button.setBounds(705, 116, 93, 23);
				this.add(button);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(150, 155, 700, 375);
				this.add(scrollPane);
				
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
						"付款单ID", "付款日期", "付款金额", "付款人", "付款账户", "条目", "备注"
					}
				));
				scrollPane.setViewportView(table);
				
				//撤消付款单table中一行的事件监听
				JButton button_1 = new JButton("撤消");
				button_1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						for(int i =table.getRowCount()-1;i>=0;i--){
							if(table.getValueAt(i, 0)!=null||table.getValueAt(i, 1)!=null||table.getValueAt(i, 2)!=null||table.getValueAt(i, 3)!=null||
									table.getValueAt(i, 4)!=null||table.getValueAt(i, 5)!=null||table.getValueAt(i, 6)!=null){
								table.setValueAt(null, i, 0);
								table.setValueAt(null, i, 1);
								table.setValueAt(null, i, 2);
								table.setValueAt(null, i, 3);
								table.setValueAt(null, i, 4);
								table.setValueAt(null, i, 5);
								table.setValueAt(null, i, 6);
								break;
							}
						}
					}
				});
				button_1.setBounds(173, 549, 93, 23);
				this.add(button_1);
				
				JButton button_2 = new JButton("提交");
				button_2.setBounds(705, 549, 93, 23);
				this.add(button_2);
				
				SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				JLabel textPane_1 = new JLabel();
				textPane_1.setText("财务人员：");
				textPane_1.setBounds(280, 0, 700, 21);
				this.add(textPane_1);
				textPane_1.setText(df.format(new Date()));
				
				textField = new JTextField();
				textField.setBounds(333, 31, 31, 21);
				this.add(textField);
				textField.setColumns(10);
				
				textField_9 = new JTextField();
				textField_9.setBounds(374, 31, 31, 21);
				this.add(textField_9);
				textField_9.setColumns(10);
	}

}
