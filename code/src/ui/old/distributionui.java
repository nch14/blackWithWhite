package ui.old;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import vo.ReceiveInformationVO;
import bill.AllocateBill;
import bl.receivement.Impl.DistributionController;
import bl.receivement.Impl.TransportFinishedController;
import bl.receivement.Service.DistributionBLService;
import bl.receivement.Service.TransportFinishedBLService;

public class distributionui extends JDesktopPane{
	
	
	private JTextField textField_year;
	private JTextField textField_courier;
	private JTextField textField_orderNumber;
	private JTable table_send;
	private JTextField textField_month;
	private JTextField textField_day;
	
	public distributionui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.setBackground(Color.WHITE);
		
		final JLabel textPane_36 = new JLabel();
		textPane_36.setText("营业厅业务员：");
		textPane_36.setBounds(280, 0, 700, 21);
		this.add(textPane_36);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		textPane_36.setText(df.format(new Date()));

		JLabel textPane_12 = new JLabel();
		textPane_12.setText("到达日期（年/月/日）");
		textPane_12.setBounds(150, 46, 126, 21);
		this.add(textPane_12);
		
		textField_year = new JTextField();
		textField_year.setBounds(286, 46, 40, 21);
		this.add(textField_year);
		textField_year.setColumns(10);
		
		JLabel textPane_13 = new JLabel();
		textPane_13.setText("派送员");
		textPane_13.setBounds(500, 46, 45, 21);
		this.add(textPane_13);
		
		textField_courier = new JTextField();
		textField_courier.setBounds(555, 46, 85, 21);
		this.add(textField_courier);
		textField_courier.setColumns(10);
		
		JLabel textPane_14 = new JLabel();
		textPane_14.setText("订单编号");
		textPane_14.setBounds(425, 100, 54, 21);
		this.add(textPane_14);
		
		textField_orderNumber = new JTextField();
		textField_orderNumber.setBounds(500, 100, 140, 21);
		this.add(textField_orderNumber);
		textField_orderNumber.setColumns(10);
		//添加派件单的事件监听
		JButton button_7 = new JButton("添加");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table_send.getRowCount();i++){
					if(table_send.getValueAt(i, 0)==null&&table_send.getValueAt(i, 1)==null&&table_send.getValueAt(i, 2)==null){
				        table_send.setValueAt(textField_orderNumber.getText(), i, 0);
				        table_send.setValueAt(textField_year.getText()+textField_month.getText()+textField_day.getText(), i, 1);
				        table_send.setValueAt(textField_courier.getText(), i, 2);
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
		
		table_send = new JTable();
		table_send.setModel(new DefaultTableModel(
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
		scrollPane_1.setViewportView(table_send);
		//撤消派件单table中的一行的事件监听
		JButton button_8 = new JButton("撤消");
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_send.getRowCount()-1;i>=0;i--){
					if(table_send.getValueAt(i, 0)!=null||table_send.getValueAt(i, 1)!=null||table_send.getValueAt(i, 2)!=null){
						table_send.setValueAt(null, i, 0);
						table_send.setValueAt(null, i, 1);
						table_send.setValueAt(null, i, 2);
						break;
					}
				}
			}
		});
		button_8.setBounds(200, 522, 93, 23);
		this.add(button_8);
		
		//提交派件单的事件监听
		JButton button_9 = new JButton("提交");
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AllocateBill allocate = null;
				for(int i=0;i<table_send.getRowCount();i++){
					allocate.date=(String[]) table_send.getValueAt(i, 1);
					allocate.ID = (String) table_send.getValueAt(i, 0);
				}
				ArrayList<AllocateBill> allocateBill = null;
				allocateBill.add(allocate);
				DistributionBLService distribution=new DistributionController();
				boolean istrue=distribution.distribution(allocateBill);
				if(istrue==true){
					for(int i=0;i<table_send.getRowCount();i++){
						table_send.setValueAt(null, i, 0);
						table_send.setValueAt(null, i, 1);
						table_send.setValueAt(null, i, 2);
					}
					textPane_36.setText("提交成功！");
				}else{
					textPane_36.setText("提交失败！");
				}
			}
		});
		button_9.setBounds(693, 522, 93, 23);
		this.add(button_9);
		
		//收款单填写的界面
		textField_month = new JTextField();
		textField_month.setBounds(336, 46, 30, 21);
		this.add(textField_month);
		textField_month.setColumns(10);
		
		textField_day = new JTextField();
		textField_day.setBounds(376, 46, 30, 21);
		this.add(textField_day);
		textField_day.setColumns(10);
	}

}
