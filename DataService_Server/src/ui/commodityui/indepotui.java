package ui.commodityui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.apache.poi.ss.formula.functions.T;

import bill.StockBill_In;
import bl.commoditybl.Impl.InDepotController;
import bl.commoditybl.Service.InDepotBLService;


public class indepotui {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTextField textField_28;
	private JTextField textField_29;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					indepotui window = new indepotui();
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
	public indepotui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u7269\u6D41\u4FE1\u606F\u7BA1\u7406\u7CFB\u7EDF");
		frame.setResizable(false);
		frame.setBounds(100, 100, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		tabbedPane.addTab("\u5165\u5E93", null, desktopPane, null);
		
		
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
		textField_1.setBounds(419, 119, 35, 21);
		desktopPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("\u76EE\u7684\u5730");
		label_2.setBounds(331, 165, 54, 15);
		desktopPane.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(419, 162, 206, 21);
		desktopPane.add(textField_2);
		textField_2.setColumns(10);

		/*
		 * 入库添加
		 */
		JButton button = new JButton("\u6DFB\u52A0");
		button.setBounds(670, 197, 93, 23);
		desktopPane.add(button);
		button.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			for(int i=0;i<table.getRowCount();i++){
				if(table.getValueAt(i, 0)==null&&table.getValueAt(i, 1)==null&&table.getValueAt(i, 2)==null){
					table.setValueAt(textField.getText(), i, 0);
					table.setValueAt(textField_1.getText()+"/"+textField_28.getText()+"/"+textField_29.getText(), i, 1);
					table.setValueAt(textField_2.getText(), i, 2);
					textField.setText(null);
					textField_1.setText(null);
					textField_2.setText(null);
					break;
				}
			}
			
		    }	 
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(172, 231, 652, 280);
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
		/*
		 * 入库提交
		 */
		JButton button_1 = new JButton("\u63D0\u4EA4");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] ID = new String[table.getRowCount()];
				String[][] date =new String[table.getRowCount()][];
				String[] destination= new String[table.getRowCount()] ;
				for(int i=0;i<table.getRowCount();i++){
					ID[i]=(String) table.getValueAt(i, 1);
					date[i]=(String[]) table.getValueAt(i, 2);
				//二维数组
					destination[i]=(String) table.getValueAt(i, 3);
				}
				StockBill_In stock_in=new StockBill_In(ID,date,destination);
				InDepotBLService indepot= new InDepotController();
				indepot.inDepot(stock_in);
			}
		});
		button_1.setBounds(780, 549, 93, 23);
		desktopPane.add(button_1);
		
		JLabel label_3 = new JLabel();
		label_3.setBounds(282, 0, 436, 21);
		desktopPane.add(label_3);
		
		
		JLabel label_27 = new JLabel("\u5E74");
		label_27.setBounds(464, 122, 54, 15);
		desktopPane.add(label_27);
		
		textField_28 = new JTextField();
		textField_28.setBounds(486, 119, 35, 21);
		desktopPane.add(textField_28);
		textField_28.setColumns(10);
		
		JLabel label_28 = new JLabel("\u6708");
		label_28.setBounds(531, 122, 54, 15);
		desktopPane.add(label_28);
		
		textField_29 = new JTextField();
		textField_29.setBounds(556, 119, 35, 21);
		desktopPane.add(textField_29);
		textField_29.setColumns(10);
		
		JLabel label_29 = new JLabel("\u65E5");
		label_29.setBounds(601, 122, 54, 15);
		desktopPane.add(label_29);
		
		/*
		 * 入库撤销
		 */
		JButton button_11 = new JButton("\u64A4\u9500");
		button_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table.getRowCount()-1;i>=0;i--){
					if(table.getValueAt(i, 0)!=null&&table.getValueAt(i, 1)!=null&&table.getValueAt(i, 2)!=null){
						table.setValueAt(null, i, 0);
						table.setValueAt(null, i, 1);
						table.setValueAt(null, i, 2);
						break;
					}
				}
			}
		});
		button_11.setBounds(172, 521, 93, 23);
		desktopPane.add(button_11);
		JButton button_12 = new JButton("\u6E05\u7A7A");
		button_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table.getRowCount();i++){
					table.setValueAt(null, i, 0);
					table.setValueAt(null, i, 1);
					table.setValueAt(null, i, 2);
					table.setValueAt(null, i, 3);
					table.setValueAt(null, i, 4);
					table.setValueAt(null, i, 5);
					table.setValueAt(null, i, 6);
					table.setValueAt(null, i, 7);
				}
			}
		});
		button_12.setBounds(886, 549, 93, 23);
		desktopPane.add(button_12);
		
		outdepotui t1 = new outdepotui();
		tabbedPane.addTab("出库", null, t1, null);
		
		inventoryui t2 = new inventoryui();
		tabbedPane.addTab("库存盘点", null, t2, null);
		
		areaadjustui t3 = new areaadjustui();
		tabbedPane.addTab("库区调整", null, t3, null);
		
		initdepotui t4 = new initdepotui();
		tabbedPane.addTab("库存信息初始化", null, t3, null);
		
		new Thread() {        
			public void run() {            
				try {                
					while (true) {    
						SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
						label_3.setText(df.format(new Date()));//显示当前时间      
						Thread.sleep(1000);//暂停一秒                
						}            
					} catch (Exception e) {            
						
					}        
				}    
			}.start();
	
	}

}
