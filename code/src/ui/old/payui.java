package ui.old;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

import bill.PaymentBill;
import bl.money.Impl.PayController;
import bl.money.Service.PayBLService;

public class payui extends JDesktopPane{
	
	
	private JTextField textField_year;
	private JTextField textField_money;
	private JTextField textField_payer;
	private JTextField textField_entry;
	private JTextField textField_remarks;
	private JTable table_billsOfPayment;
	private JTextField textField_month;
	private JTextField textField_day;
	
	public payui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//财务支出的界面
				this.setBackground(Color.WHITE);
				
				SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				final JLabel textPane_1 = new JLabel();
				textPane_1.setText("财务人员：");
				textPane_1.setBounds(280, 0, 700, 21);
				this.add(textPane_1);
				textPane_1.setText(df.format(new Date()));
				
				JLabel textPane = new JLabel();
				textPane.setText("付款日期(年/月/日）");
				textPane.setBounds(150, 31, 121, 21);
				this.add(textPane);
				
				textField_year = new JTextField();
				textField_year.setBounds(281, 31, 42, 21);
				this.add(textField_year);
				textField_year.setColumns(10);
				
				JLabel textPane_4 = new JLabel();
				textPane_4.setText("付款金额");
				textPane_4.setBounds(472, 31, 54, 21);
				this.add(textPane_4);
				
				textField_money = new JTextField();
				textField_money.setBounds(536, 31, 66, 21);
				this.add(textField_money);
				textField_money.setColumns(10);
				
				JLabel textPane_5 = new JLabel();
				textPane_5.setText("付款人");
				textPane_5.setBounds(653, 31, 42, 21);
				this.add(textPane_5);
				
				textField_payer = new JTextField();
				textField_payer.setBounds(705, 31, 128, 21);
				this.add(textField_payer);
				textField_payer.setColumns(10);
				
				JLabel textPane_6 = new JLabel();
				textPane_6.setText("付款账号");
				textPane_6.setBounds(150, 62, 54, 21);
				this.add(textPane_6);
				
				JLabel textPane_7 = new JLabel();
				textPane_7.setText("条目");
				textPane_7.setBounds(482, 62, 31, 21);
				this.add(textPane_7);
				
				textField_entry = new JTextField();
				textField_entry.setBounds(536, 62, 66, 21);
				this.add(textField_entry);
				textField_entry.setColumns(10);
				
				JLabel textPane_8 = new JLabel();
				textPane_8.setText("备注");
				textPane_8.setBounds(663, 62, 31, 21);
				this.add(textPane_8);
				
				textField_remarks = new JTextField();
				textField_remarks.setBounds(705, 62, 128, 21);
				this.add(textField_remarks);
				textField_remarks.setColumns(10);
				
				final JComboBox comboBox_1 = new JComboBox();
				comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"中国农业银行", "中国工商银行", "中国建设银行", "南京银行"}));
				comboBox_1.setBounds(214, 62, 191, 21);
				this.add(comboBox_1);
				
				//添加付款单的事件监听
				JButton button = new JButton("添加");
				button.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						for(int i=0;i<table_billsOfPayment.getRowCount();i++){
							if(table_billsOfPayment.getValueAt(i, 0)==null&&table_billsOfPayment.getValueAt(i, 1)==null&&table_billsOfPayment.getValueAt(i, 2)==null&&table_billsOfPayment.getValueAt(i, 3)==null&&table_billsOfPayment.getValueAt(i, 4)==null
									&&table_billsOfPayment.getValueAt(i, 5)==null&&table_billsOfPayment.getValueAt(i, 6)==null){
						           table_billsOfPayment.setValueAt(i+1, i, 0);
						           table_billsOfPayment.setValueAt(textField_year.getText()+textField_month.getText()+textField_day.getText(), i, 1);
						           table_billsOfPayment.setValueAt(textField_money.getText(), i, 2);
						           table_billsOfPayment.setValueAt(textField_payer.getText(), i, 3);
						           table_billsOfPayment.setValueAt(comboBox_1.getSelectedItem(), i, 4);
						           table_billsOfPayment.setValueAt(textField_entry.getText(), i, 5);
						           table_billsOfPayment.setValueAt(textField_remarks.getText(), i, 6);
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
				
				table_billsOfPayment = new JTable();
				table_billsOfPayment.setModel(new DefaultTableModel(
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
				scrollPane.setViewportView(table_billsOfPayment);
				
				//撤消付款单table中一行的事件监听
				JButton button_1 = new JButton("撤消");
				button_1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						for(int i =table_billsOfPayment.getRowCount()-1;i>=0;i--){
							if(table_billsOfPayment.getValueAt(i, 0)!=null||table_billsOfPayment.getValueAt(i, 1)!=null||table_billsOfPayment.getValueAt(i, 2)!=null||table_billsOfPayment.getValueAt(i, 3)!=null||
									table_billsOfPayment.getValueAt(i, 4)!=null||table_billsOfPayment.getValueAt(i, 5)!=null||table_billsOfPayment.getValueAt(i, 6)!=null){
								table_billsOfPayment.setValueAt(null, i, 0);
								table_billsOfPayment.setValueAt(null, i, 1);
								table_billsOfPayment.setValueAt(null, i, 2);
								table_billsOfPayment.setValueAt(null, i, 3);
								table_billsOfPayment.setValueAt(null, i, 4);
								table_billsOfPayment.setValueAt(null, i, 5);
								table_billsOfPayment.setValueAt(null, i, 6);
								break;
							}
						}
					}
				});
				button_1.setBounds(173, 549, 93, 23);
				this.add(button_1);
				
				//提交付款单的事件监听
				JButton button_2 = new JButton("提交");
				button_2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						PaymentBill[] paymentBill;
							String[] time={(String) table_billsOfPayment.getValueAt(0, 1)};
						for(int i=0;i<table_billsOfPayment.getRowCount();i++){
							paymentBill = new PaymentBill[table_billsOfPayment.getRowCount()];
							paymentBill[i].ID=(String) table_billsOfPayment.getValueAt(i, 0);
							paymentBill[i].date=(String[]) table_billsOfPayment.getValueAt(i, 1);
							paymentBill[i].money=(double) table_billsOfPayment.getValueAt(i, 2);
							paymentBill[i].payer=(String) table_billsOfPayment.getValueAt(i, 3);
							paymentBill[i].type=(String) table_billsOfPayment.getValueAt(i, 5);
							paymentBill[i].remarks=(String) table_billsOfPayment.getValueAt(i, 6);
						}
						PayBLService pay=new PayController();
						ArrayList<PaymentBill> payment = pay.getPaymentBill(time);
						if(payment==null){
							textPane_1.setText("提交失败！");
						}else{
							for(int n=0;n<table_billsOfPayment.getRowCount();n++){
								table_billsOfPayment.setValueAt(null, n, 0);
								table_billsOfPayment.setValueAt(null, n, 1);
								table_billsOfPayment.setValueAt(null, n, 2);
								table_billsOfPayment.setValueAt(null, n, 3);
								table_billsOfPayment.setValueAt(null, n, 4);
								table_billsOfPayment.setValueAt(null, n, 5);
								table_billsOfPayment.setValueAt(null, n, 6);
							}
						}
					}
				});
				button_2.setBounds(705, 549, 93, 23);
				this.add(button_2);
				
				textField_month = new JTextField();
				textField_month.setBounds(333, 31, 31, 21);
				this.add(textField_month);
				textField_month.setColumns(10);
				
				textField_day = new JTextField();
				textField_day.setBounds(374, 31, 31, 21);
				this.add(textField_day);
				textField_day.setColumns(10);
	}

}
