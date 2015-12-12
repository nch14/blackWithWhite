package ui.receivementui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class distributionui extends JDesktopPane{
	
	
	private JTextField textField_14;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTable table_1;
	private JTextField textField_22;
	private JTextField textField_49;
	
	public distributionui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.setBackground(Color.WHITE);

		JLabel textPane_12 = new JLabel();
		textPane_12.setText("到达日期（年/月/日）");
		textPane_12.setBounds(150, 46, 126, 21);
		this.add(textPane_12);
		
		textField_14 = new JTextField();
		textField_14.setBounds(286, 46, 40, 21);
		this.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel textPane_13 = new JLabel();
		textPane_13.setText("派送员");
		textPane_13.setBounds(500, 46, 45, 21);
		this.add(textPane_13);
		
		textField_17 = new JTextField();
		textField_17.setBounds(555, 46, 85, 21);
		this.add(textField_17);
		textField_17.setColumns(10);
		
		JLabel textPane_14 = new JLabel();
		textPane_14.setText("订单编号");
		textPane_14.setBounds(425, 100, 54, 21);
		this.add(textPane_14);
		
		textField_18 = new JTextField();
		textField_18.setBounds(500, 100, 140, 21);
		this.add(textField_18);
		textField_18.setColumns(10);
		//添加派件单的事件监听
		JButton button_7 = new JButton("添加");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table_1.getRowCount();i++){
					if(table_1.getValueAt(i, 0)==null&&table_1.getValueAt(i, 1)==null&&table_1.getValueAt(i, 2)==null){
				        table_1.setValueAt(textField_18.getText(), i, 0);
				        table_1.setValueAt(textField_14.getText()+textField_22.getText()+textField_49.getText(), i, 1);
				        table_1.setValueAt(textField_17.getText(), i, 2);
				        break;
					}
				}
			}
		});
		button_7.setBounds(693, 99, 93, 23);
		this.add(button_7);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(150, 190, 700, 325);
		this.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
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
				"订单编号", "到达日期", "派送员"
			}
		));
		scrollPane_1.setViewportView(table_1);
		//撤消派件单table中的一行的事件监听
		JButton button_8 = new JButton("撤消");
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_1.getRowCount()-1;i>=0;i--){
					if(table_1.getValueAt(i, 0)!=null||table_1.getValueAt(i, 1)!=null||table_1.getValueAt(i, 2)!=null){
						table_1.setValueAt(null, i, 0);
						table_1.setValueAt(null, i, 1);
						table_1.setValueAt(null, i, 2);
						break;
					}
				}
			}
		});
		button_8.setBounds(200, 522, 93, 23);
		this.add(button_8);
		
		JButton button_9 = new JButton("提交");
		button_9.setBounds(693, 522, 93, 23);
		this.add(button_9);
		
		//收款单填写的界面
		textField_22 = new JTextField();
		textField_22.setBounds(336, 46, 30, 21);
		this.add(textField_22);
		textField_22.setColumns(10);
		
		textField_49 = new JTextField();
		textField_49.setBounds(376, 46, 30, 21);
		this.add(textField_49);
		textField_49.setColumns(10);
		
		JLabel textPane_36 = new JLabel();
		textPane_36.setText("营业厅业务员：");
		textPane_36.setBounds(280, 0, 700, 21);
		this.add(textPane_36);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		textPane_36.setText(df.format(new Date()));
	}

}
