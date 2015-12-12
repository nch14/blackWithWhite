package ui.receivementui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class receiveui extends JDesktopPane{
	
	private JTextField textField_8;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTable table;
	private JTextField textField_16;
	private JTextField textField_21;
	
	public receiveui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//营业厅到达单的界面
				this.setBackground(Color.WHITE);
				
				JLabel textPane_8 = new JLabel();
				textPane_8.setText("到达日期");
				textPane_8.setBounds(150, 58, 54, 21);
				this.add(textPane_8);
				
				JLabel textPane_9 = new JLabel();
				textPane_9.setText("（年/月/日）");
				textPane_9.setBounds(200, 58, 78, 21);
				this.add(textPane_9);
				
				textField_8 = new JTextField();
				textField_8.setBounds(290, 58, 40, 21);
				this.add(textField_8);
				textField_8.setColumns(10);
				
				final JList list = new JList();
				list.setBounds(314, 212, 36, -40);
				this.add(list);
				
				JLabel textPane_10 = new JLabel();
				textPane_10.setText("出发地");
				textPane_10.setBounds(150, 89, 44, 21);
				this.add(textPane_10);
				
				textField_11 = new JTextField();
				textField_11.setBounds(290, 89, 120, 21);
				this.add(textField_11);
				textField_11.setColumns(10);
				
				JLabel textPane_11 = new JLabel();
				textPane_11.setText("订单编号");
				textPane_11.setBounds(467, 132, 54, 21);
				this.add(textPane_11);
				
				textField_12 = new JTextField();
				textField_12.setBounds(540, 132, 126, 21);
				this.add(textField_12);
				textField_12.setColumns(10);
				
				final JComboBox comboBox = new JComboBox();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"货物到达状态", "完整", "破损"}));
				comboBox.setBounds(540, 58, 126, 21);
				this.add(comboBox);
				//添加营业厅到达单的事件监听
				JButton button_4 = new JButton("添加");
				button_4.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						for(int i=0;i<table.getRowCount();i++){
							if(table.getValueAt(i, 0)==null&&table.getValueAt(i, 1)==null&&table.getValueAt(i, 2)==null&&table.getValueAt(i, 3)==null){
						          table.setValueAt(textField_12.getText(), i, 0);
						          table.setValueAt(textField_8.getText()+textField_16.getText()+textField_21.getText(), i, 1);
						          table.setValueAt(textField_11.getText(), i, 2);
						          table.setValueAt(comboBox.getSelectedItem(), i, 3);
						          break;
							}
						}
					}
				});
				button_4.setBounds(708, 130, 93, 23);
				this.add(button_4);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(150, 190, 700, 325);
				this.add(scrollPane);
				
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
						"订单编号", "到达日期", "出发地", "货物到达状态"
					}
				));
				scrollPane.setViewportView(table);
				
				//撤消营业厅到达单table中的一行的事件监听
				JButton button_5 = new JButton("撤消");
				button_5.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						for(int i=table.getRowCount()-1;i>=0;i--){
							if(table.getValueAt(i, 0)!=null||table.getValueAt(i, 1)!=null||table.getValueAt(i, 2)!=null||table.getValueAt(i, 3)!=null){
								table.setValueAt(null, i, 0);
								table.setValueAt(null, i, 1);
								table.setValueAt(null, i, 2);
								table.setValueAt(null, i, 3);
								break;
							}
						}
					}
				});
				button_5.setBounds(259, 528, 93, 23);
				this.add(button_5);
				
				JButton button_6 = new JButton("提交");
				button_6.setBounds(708, 528, 93, 23);
				this.add(button_6);
				
				textField_16 = new JTextField();
				textField_16.setBounds(340, 58, 30, 21);
				this.add(textField_16);
				textField_16.setColumns(10);
				
				textField_21 = new JTextField();
				textField_21.setBounds(380, 58, 30, 21);
				this.add(textField_21);
				textField_21.setColumns(10);
				
				JLabel textPane_35 = new JLabel();
				textPane_35.setText("营业厅业务员：");
				textPane_35.setBounds(280, 0, 700, 21);
				this.add(textPane_35);
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
				textPane_35.setText(df.format(new Date()));
		
	}

}
