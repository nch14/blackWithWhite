package ui.moneyui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
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
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import bill.ReceiveMoneyBill;
import bl.money.Impl.BillingManagementController;
import settings.BussinessHall;
import settings.City;
import settings.TransportCenter;
import ui.reportui.profitsheetui;

public class billingmanagementui {

	private JFrame frame_money;
	private JTextField textField_year;
	private JTable table_receive_voucher;
	private JTextField textField_month;
	private JTextField textField_day;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					billingmanagementui window = new billingmanagementui();
					window.frame_money.setVisible(true);
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
		frame_money = new JFrame();
		frame_money.setResizable(false);
		frame_money.setBounds(200, 80, 1000, 650);
		frame_money.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame_money.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
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
		
		textField_year = new JTextField();
		textField_year.setBounds(286, 43, 40, 21);
		desktopPane.add(textField_year);
		textField_year.setColumns(10);
		
		//TransportCenter transport=new TransportCenter(null, null);
		ArrayList<City> city = new ArrayList<City>();
		ArrayList<TransportCenter> transportCenter = null;
		ArrayList<BussinessHall> bussinessHall = null;
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {" "}));
		comboBox.setBounds(534, 43, 183, 21);
		desktopPane.add(comboBox);
		
		//查询收款单的事件监听
		JButton button_3 = new JButton("查询");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] time={textField_year.getText(),textField_month.getText(),textField_day.getText()};
				BillingManagementController bmc=new BillingManagementController();
				ReceiveMoneyBill[] bills=bmc.getBills(time,(String) comboBox.getSelectedItem());
				if(bills==null){
					label_3.setText("未查找到收款单信息！");
				}else{
					for(int i=0;i<bills.length;i++){
						ReceiveMoneyBill bill=bills[i];
					    table_receive_voucher.setValueAt(bill.date[0]+bill.date[1]+bill.date[2], i, 0);
					    table_receive_voucher.setValueAt(bill.ID, i, 1);
					    table_receive_voucher.setValueAt(bill.transactor, i, 2);
					    table_receive_voucher.setValueAt(bill.transactor, i, 3);
					    table_receive_voucher.setValueAt(bill.list, i, 4);
					    table_receive_voucher.setValueAt(bill.money, i, 5);
					    table_receive_voucher.setValueAt(bill.bussinessHallCode, i, 6);
					}
				}
					
			}
		});
		button_3.setBounds(649, 93, 93, 23);
		desktopPane.add(button_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(150, 155, 700, 375);
		desktopPane.add(scrollPane_1);
		
		table_receive_voucher = new JTable();
		table_receive_voucher.setModel(new DefaultTableModel(
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
		scrollPane_1.setViewportView(table_receive_voucher);
		
		textField_month = new JTextField();
		textField_month.setBounds(336, 43, 30, 21);
		desktopPane.add(textField_month);
		textField_month.setColumns(10);
		
		textField_day = new JTextField();
		textField_day.setBounds(376, 43, 30, 21);
		desktopPane.add(textField_day);
		textField_day.setColumns(10);
		
		payui t = new payui();
		tabbedPane.addTab("财务支出", null, t, null);
		
		profitsheetui t1 = new profitsheetui();
		tabbedPane.addTab("报表查询", null, t1, null);
		
		accountmanageui t2 = new accountmanageui();
		tabbedPane.addTab("账户管理", null, t2, null);
	}

}
