package ui;

/*
 * 快递员界面
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;

import bill.OrderBillPO;
import bl.send.Impl.PredictTimeAndMonthController;
import bl.send.Impl.Send;
import bl.send.Impl.SendController;
import bl.send.Service.PredictTimeAndMontyBLService;
import bl.send.Service.SendBLService;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class courier {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table;
	private JTable table_1;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					courier window = new courier();
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
	public courier() {
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
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		tabbedPane.addTab("订单信息查询", null, desktopPane, null);
		
		JLabel label_29 = new JLabel();
		label_29.setBounds(282, 0, 436, 21);
		desktopPane.add(label_29);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		label_29.setText(df.format(new Date()));df.format(new Date());// new Date()为获取当前系统时间
		
		textField_27 = new JTextField();
		textField_27.setBounds(307, 163, 211, 21);
		desktopPane.add(textField_27);
		textField_27.setColumns(10);
		
		JButton button_6 = new JButton("\u67E5\u8BE2");
		button_6.setBounds(576, 162, 93, 23);
		desktopPane.add(button_6);
		
		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBackground(Color.WHITE);
		tabbedPane.addTab("报价和时间管理", null, desktopPane_2, null);
		
		JLabel label_30 = new JLabel();
		label_30.setBounds(282, 0, 436, 21);
		desktopPane_2.add(label_30);
		label_30.setText(df.format(new Date()));df.format(new Date());
		
		textField_7 = new JTextField();
		textField_7.setBounds(212, 135, 307, 22);
		desktopPane_2.add(textField_7);
		textField_7.setColumns(10);
		
		JButton button_3 = new JButton("\u786E\u8BA4");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PredictTimeAndMontyBLService predictTimeAndMonthController=new PredictTimeAndMonthController();
				predictTimeAndMonthController.moneyAndTime(textField_7.getText());
			}
		});
		button_3.setBounds(580, 134, 93, 23);
		desktopPane_2.add(button_3);
		
		JLabel label_22 = new JLabel("\u4EF7\u683C\uFF1A");
		label_22.setBounds(212, 223, 54, 15);
		desktopPane_2.add(label_22);
		
		JLabel label_23 = new JLabel("\u9884\u8BA1\u65F6\u95F4\uFF1A");
		label_23.setBounds(212, 266, 72, 15);
		desktopPane_2.add(label_23);
		
		JLabel label_24 = new JLabel("");
		label_24.setBounds(310, 223, 54, 15);
		desktopPane_2.add(label_24);
		
		JLabel label_25 = new JLabel("");
		label_25.setBounds(310, 266, 54, 15);
		desktopPane_2.add(label_25);
		
		JLabel label_33 = new JLabel("");
		label_33.setBounds(310, 223, 54, 15);
		desktopPane_2.add(label_33);
		
		JLabel label_34 = new JLabel("");
		label_34.setBounds(310, 266, 54, 15);
		desktopPane_2.add(label_34);
		
		JDesktopPane desktopPane_3 = new JDesktopPane();
		desktopPane_3.setBackground(Color.WHITE);
		tabbedPane.addTab("收件信息输入", null, desktopPane_3, null);
		
		JLabel label_31 = new JLabel();
		label_31.setBounds(282, 0, 436, 21);
		desktopPane_3.add(label_31);
		label_31.setText(df.format(new Date()));df.format(new Date());
		
		JLabel label = new JLabel("\u8BA2\u5355\u7F16\u53F7\uFF1A");
		label.setBounds(157, 87, 66, 15);
		desktopPane_3.add(label);
		
		textField_4 = new JTextField();
		textField_4.setBounds(223, 84, 66, 21);
		desktopPane_3.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_1 = new JLabel("\u6536\u4EF6\u4EBA\uFF1A");
		label_1.setBounds(353, 87, 54, 15);
		desktopPane_3.add(label_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(404, 84, 66, 21);
		desktopPane_3.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel label_2 = new JLabel("\u6536\u4EF6\u65E5\u671F\uFF1A");
		label_2.setBounds(519, 87, 74, 15);
		desktopPane_3.add(label_2);
		
		textField_6 = new JTextField();
		textField_6.setBounds(594, 82, 34, 21);
		desktopPane_3.add(textField_6);
		textField_6.setColumns(10);
		
		JButton button = new JButton("\u6DFB\u52A0");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				for(int i=0;i<table_1.getRowCount();i++){
					if(table_1.getValueAt(i, 1)==null&&table_1.getValueAt(i, 2)==null&&table_1.getValueAt(i, 3)==null){
						table_1.setValueAt(textField_4.getText(), i, 1);
						table_1.setValueAt(textField_5.getText(), i, 2);
						table_1.setValueAt(textField_6.getText(), i, 3);
						break;
					}
				}
			}
		});
		button.setBounds(755, 122, 93, 23);
		desktopPane_3.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(157, 174, 668, 347);
		desktopPane_3.add(scrollPane);
		
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
			},
			new String[] {
				"New column", "\u8BA2\u5355\u7F16\u53F7", "\u6536\u4EF6\u4EBA", "\u6536\u4EF6\u65E5\u671F"
			}
		));
		scrollPane.setViewportView(table_1);
		
		
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(157, 536, 22, 23);
		desktopPane_3.add(checkBox);
		
		JButton button_1 = new JButton("\u64A4\u9500");
		button_1.setBounds(186, 536, 93, 23);
		desktopPane_3.add(button_1);
		
		JButton button_2 = new JButton("\u63D0\u4EA4");
		button_2.setBounds(732, 536, 93, 23);
		desktopPane_3.add(button_2);
		
		JLabel label_26 = new JLabel("\u5E74");
		label_26.setBounds(638, 87, 54, 15);
		desktopPane_3.add(label_26);
		
		textField_28 = new JTextField();
		textField_28.setBounds(658, 84, 34, 21);
		desktopPane_3.add(textField_28);
		textField_28.setColumns(10);
		
		JLabel label_27 = new JLabel("\u6708");
		label_27.setBounds(699, 87, 54, 15);
		desktopPane_3.add(label_27);
		
		textField_29 = new JTextField();
		textField_29.setBounds(718, 84, 66, 21);
		desktopPane_3.add(textField_29);
		textField_29.setColumns(10);
		
		JLabel label_28 = new JLabel("\u65E5");
		label_28.setBounds(794, 87, 54, 15);
		desktopPane_3.add(label_28);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(Color.WHITE);
		tabbedPane.addTab("寄件信息输入", null, desktopPane_1, null);
		
		JLabel label_32 = new JLabel();
		label_32.setBounds(282, 0, 436, 21);
		desktopPane_1.add(label_32);
		label_32.setText(df.format(new Date()));
		
		JLabel label_3 = new JLabel("\u5BC4\u4EF6\u4EBA\u4FE1\u606F");
		label_3.setBounds(99, 73, 68, 15);
		desktopPane_1.add(label_3);
		
		JLabel label_4 = new JLabel("\u8BA2\u5355\u6761\u5F62\u7801\u53F7");
		label_4.setBounds(672, 73, 83, 15);
		desktopPane_1.add(label_4);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(654, 98, 121, 21);
		desktopPane_1.add(textField_8);
		
		JLabel lblNewLabel = new JLabel("\u59D3\u540D");
		lblNewLabel.setBounds(162, 243, 54, 15);
		desktopPane_1.add(lblNewLabel);
		
		textField_9 = new JTextField();
		textField_9.setBounds(200, 98, 66, 21);
		desktopPane_1.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel label_5 = new JLabel("\u7535\u8BDD");
		label_5.setBounds(300, 101, 54, 15);
		desktopPane_1.add(label_5);
		
		textField_10 = new JTextField();
		textField_10.setBounds(341, 98, 92, 21);
		desktopPane_1.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel label_6 = new JLabel("\u624B\u673A");
		label_6.setBounds(458, 101, 54, 15);
		desktopPane_1.add(label_6);
		
		textField_11 = new JTextField();
		textField_11.setBounds(493, 98, 83, 21);
		desktopPane_1.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel label_7 = new JLabel("\u6536\u4EF6\u4EBA\u4FE1\u606F");
		label_7.setBounds(99, 214, 68, 15);
		desktopPane_1.add(label_7);
		
		JLabel label_8 = new JLabel("\u5355\u4F4D");
		label_8.setBounds(162, 140, 54, 15);
		desktopPane_1.add(label_8);
		
		textField_12 = new JTextField();
		textField_12.setBounds(200, 137, 376, 21);
		desktopPane_1.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u5730\u5740");
		lblNewLabel_1.setBounds(162, 183, 54, 15);
		desktopPane_1.add(lblNewLabel_1);
		
		textField_13 = new JTextField();
		textField_13.setBounds(200, 180, 376, 21);
		desktopPane_1.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel label_9 = new JLabel("\u59D3\u540D");
		label_9.setBounds(162, 101, 54, 15);
		desktopPane_1.add(label_9);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(200, 240, 66, 21);
		desktopPane_1.add(textField_14);
		
		JLabel label_10 = new JLabel("\u7535\u8BDD");
		label_10.setBounds(300, 243, 54, 15);
		desktopPane_1.add(label_10);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(341, 240, 92, 21);
		desktopPane_1.add(textField_15);
		
		JLabel label_11 = new JLabel("\u624B\u673A");
		label_11.setBounds(458, 243, 54, 15);
		desktopPane_1.add(label_11);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(493, 240, 83, 21);
		desktopPane_1.add(textField_16);
		
		JLabel label_12 = new JLabel("\u5355\u4F4D");
		label_12.setBounds(162, 278, 54, 15);
		desktopPane_1.add(label_12);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(200, 275, 376, 21);
		desktopPane_1.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(200, 318, 376, 21);
		desktopPane_1.add(textField_18);
		
		JLabel label_13 = new JLabel("\u5730\u5740");
		label_13.setBounds(162, 321, 54, 15);
		desktopPane_1.add(label_13);
		
		JLabel label_14 = new JLabel("\u8D27\u7269\u4FE1\u606F");
		label_14.setBounds(113, 355, 54, 15);
		desktopPane_1.add(label_14);
		
		JLabel label_15 = new JLabel("\u539F\u4EF6\u6570\uFF08\u4E2A\uFF09");
		label_15.setBounds(162, 380, 83, 15);
		desktopPane_1.add(label_15);
		
		textField_19 = new JTextField();
		textField_19.setBounds(246, 377, 66, 21);
		desktopPane_1.add(textField_19);
		textField_19.setColumns(10);
		
		JLabel lblkg = new JLabel("\u5B9E\u9645\u91CD\u91CF\uFF08kg\uFF09");
		lblkg.setBounds(379, 380, 92, 15);
		desktopPane_1.add(lblkg);
		
		textField_20 = new JTextField();
		textField_20.setBounds(493, 377, 66, 21);
		desktopPane_1.add(textField_20);
		textField_20.setColumns(10);
		
		JLabel label_16 = new JLabel("\u5C3A\u5BF8\uFF08\u957F*\u5BBD*\u9AD8\uFF09");
		label_16.setBounds(162, 413, 104, 15);
		desktopPane_1.add(label_16);
		
		textField_21 = new JTextField();
		textField_21.setBounds(256, 410, 34, 21);
		desktopPane_1.add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(300, 410, 34, 21);
		desktopPane_1.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(345, 410, 34, 21);
		desktopPane_1.add(textField_23);
		
		JLabel label_17 = new JLabel("\u5185\u4EF6\u54C1\u540D");
		label_17.setBounds(162, 447, 54, 15);
		desktopPane_1.add(label_17);
		
		textField_24 = new JTextField();
		textField_24.setBounds(226, 444, 66, 21);
		desktopPane_1.add(textField_24);
		textField_24.setColumns(10);
		
		JLabel lbll = new JLabel("\u4F53\u79EF\uFF08L\uFF09");
		lbll.setBounds(379, 447, 68, 15);
		desktopPane_1.add(lbll);
		
		textField_25 = new JTextField();
		textField_25.setBounds(493, 444, 66, 21);
		desktopPane_1.add(textField_25);
		textField_25.setColumns(10);
		
		JLabel label_18 = new JLabel("\u5FEB\u9012\u4FE1\u606F");
		label_18.setBounds(113, 486, 54, 15);
		desktopPane_1.add(label_18);
		
		JLabel label_19 = new JLabel("\u5305\u88C5\u8D39");
		label_19.setBounds(162, 511, 54, 15);
		desktopPane_1.add(label_19);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u7EB8\u7BB1\uFF085\u5143\uFF09"}));
		comboBox.setBounds(226, 508, 108, 21);
		desktopPane_1.add(comboBox);
		
		JLabel label_20 = new JLabel("\u5FEB\u9012\u7C7B\u578B");
		label_20.setBounds(379, 511, 54, 15);
		desktopPane_1.add(label_20);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(493, 508, 66, 21);
		desktopPane_1.add(comboBox_1);
		
		JLabel label_21 = new JLabel("\u79CD\u7C7B");
		label_21.setBounds(162, 546, 54, 15);
		desktopPane_1.add(label_21);
		
		textField_26 = new JTextField();
		textField_26.setBounds(226, 543, 66, 21);
		desktopPane_1.add(textField_26);
		textField_26.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u8D39\u7528\u5408\u8BA1\uFF1A");
		lblNewLabel_2.setBounds(654, 486, 68, 15);
		desktopPane_1.add(lblNewLabel_2);
		
		JButton button_4 = new JButton("\u786E\u8BA4");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		button_4.setBounds(654, 507, 68, 23);
		desktopPane_1.add(button_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(738, 486, 54, 15);
		desktopPane_1.add(lblNewLabel_3);
		
		JButton button_5 = new JButton("\u63D0\u4EA4");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OrderBillPO order = new OrderBillPO(textField_9.getText(),textField_10.getText(),textField_11.getText(),
						textField_12.getText(),textField_13.getText(),textField_14.getText(),textField_15.getText(),
						textField_16.getText(),textField_17.getText(),textField_18.getText(),textField_19.getText(),
						textField_20.getText(),textField_21.getText(),textField_22.getText(),textField_23.getText(),
						textField_24.getText(),textField_25.getText(),comboBox.getSelectedItem().toString(),
						comboBox_1.getSelectedItem().toString(),textField_26.getText(),df.format(new Date()),
					    Double.parseDouble(lblNewLabel_3.getText()));
				SendBLService send = new SendController();
				send.push(order);
				
			}
		});
		button_5.setBounds(740, 507, 68, 23);
		desktopPane_1.add(button_5);
		
		
	}
}
