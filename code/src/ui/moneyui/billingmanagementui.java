package ui.moneyui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
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
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import bill.ReceiveMoneyBill;
import bl.money.Impl.BillingManagementController;
import settings.BussinessHall;
import ui.reportui.profitsheetui;

public class billingmanagementui {

	private JFrame frame;
	private JTextField textField_8;
	private JTable table_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					billingmanagementui window = new billingmanagementui();
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
	public billingmanagementui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(200, 80, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		//结算管理的界面
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		tabbedPane.addTab("结算管理", null, desktopPane, null);
		
		final JLabel label_3 = new JLabel();
		label_3.setText("财务人员：");
		label_3.setBounds(280, 0, 700, 21);
		desktopPane.add(label_3);
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		label_3.setText(df.format(new Date()));
		
		JLabel textPane_9 = new JLabel();
		textPane_9.setText("查看日期（年/月/日）");
		textPane_9.setBounds(150, 43, 126, 21);
		desktopPane.add(textPane_9);
		
		textField_8 = new JTextField();
		textField_8.setBounds(286, 43, 40, 21);
		desktopPane.add(textField_8);
		textField_8.setColumns(10);
		
/*		BussinessHall bussinessHall = new BussinessHall();*/
		
		final JComboBox comboBox = new JComboBox();
		//comboBox.setModel(new DefaultComboBoxModel(new String[] {bussinessHall.name}));
		comboBox.setBounds(534, 43, 183, 21);
		desktopPane.add(comboBox);
		
		//查询收款单的事件监听
		JButton button_3 = new JButton("查询");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] time={textField_8.getText(),textField_2.getText(),textField_3.getText()};
				BillingManagementController bmc=new BillingManagementController();
				ReceiveMoneyBill[] bills=bmc.getBills(time,(String) comboBox.getSelectedItem());
				if(bills==null){
					label_3.setText("未查找到收款单信息！");
				}else{
					for(int i=0;i<bills.length;i++){
						ReceiveMoneyBill bill=bills[i];
					    table_1.setValueAt(bill.date[0]+bill.date[1]+bill.date[2], i, 0);
					    table_1.setValueAt(bill.ID, i, 1);
					    table_1.setValueAt(bill.transactor, i, 2);
					    table_1.setValueAt(bill.transactor, i, 3);
					    table_1.setValueAt(bill.list, i, 4);
					    table_1.setValueAt(bill.money, i, 5);
					    table_1.setValueAt(bill.bussinessHallCode, i, 6);
					}
				}
					
			}
		});
		button_3.setBounds(649, 93, 93, 23);
		desktopPane.add(button_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(150, 155, 700, 375);
		desktopPane.add(scrollPane_1);
		
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
				"收款日期", "收款单位", "收款人", "收款方", "收款金额", "收款地点"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(336, 43, 30, 21);
		desktopPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(376, 43, 30, 21);
		desktopPane.add(textField_3);
		textField_3.setColumns(10);
		
		payui t = new payui();
		tabbedPane.addTab("财务支出", null, t, null);
		
		profitsheetui t1 = new profitsheetui();
		tabbedPane.addTab("报表查询", null, t1, null);
		
		accountmanageui t2 = new accountmanageui();
		tabbedPane.addTab("账户管理", null, t2, null);
	}

}
