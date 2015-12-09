
package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import bill.StockBill_In;
import bill.StockBill_In.Info;
import bill.StockBill_Out;
import bl.commoditybl.Impl.AreaAdjustController;
import bl.commoditybl.Impl.InDepotController;
import bl.commoditybl.Impl.InitDepotAreaController;
import bl.commoditybl.Impl.InventoryController;
import bl.commoditybl.Impl.OutDepotController;
import bl.commoditybl.Service.AreaAdjustBLService;
import bl.commoditybl.Service.InDepotBLService;
import bl.commoditybl.Service.InitDepotAreaBLService;
import bl.commoditybl.Service.InventoryBLService;
import bl.commoditybl.Service.OutDepotBLService;
import vo.StockSnapShotVO;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JCheckBox;

public class commodity {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table_1;
	private JTable table_2;
	private JTextField textField_13;
	private JTable table_3;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTable table_4;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	 
	InventoryBLService inventory= new InventoryController();
	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					commodity window = new commodity();
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
	public commodity() {
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
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		tabbedPane.addTab("入库", null, desktopPane, null);
		
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
		
		JDesktopPane desktopPane_4 = new JDesktopPane();
		desktopPane_4.setBackground(Color.WHITE);
		tabbedPane.addTab("出库", null, desktopPane_4, null);
		
		JLabel label_11 = new JLabel("\u8BA2\u5355\u53F7");
		label_11.setBounds(172, 56, 54, 15);
		desktopPane_4.add(label_11);
		
		textField_3 = new JTextField();
		textField_3.setBounds(236, 53, 93, 21);
		desktopPane_4.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_4 = new JLabel("\u51FA\u5E93\u65E5\u671F");
		label_4.setBounds(370, 56, 54, 15);
		desktopPane_4.add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(434, 53, 34, 21);
		desktopPane_4.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_5 = new JLabel("\u76EE\u7684\u5730");
		label_5.setBounds(538, 101, 54, 15);
		desktopPane_4.add(label_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(603, 98, 221, 21);
		desktopPane_4.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel label_6 = new JLabel("\u88C5\u8FD0\u5F62\u5F0F");
		label_6.setBounds(172, 101, 54, 15);
		desktopPane_4.add(label_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u98DE\u673A", "\u706B\u8F66", "\u6C7D\u8F66"}));
		comboBox.setBounds(236, 98, 59, 21);
		desktopPane_4.add(comboBox);
		
		JLabel label_7 = new JLabel("\u8D27\u8FD0\u7F16\u53F7");
		label_7.setBounds(370, 101, 54, 15);
		desktopPane_4.add(label_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(434, 98, 66, 21);
		desktopPane_4.add(textField_6);
		textField_6.setColumns(10);
		
		/*
		 * 出库确认
		 */
		JButton button_2 = new JButton("\u786E\u8BA4");
		button_2.setBounds(731, 149, 93, 23);
		desktopPane_4.add(button_2);
		button_2.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				for(int i=0;i<table_1.getRowCount();i++){
					
					if(table_1.getValueAt(i, 0)==null&&table_1.getValueAt(i, 1)==null&&table_1.getValueAt(i, 2)==null&&table_1.getValueAt(i, 3)==null){
								String month=textField_26.getText();
								String day=textField_27.getText();
								if(month.length()==1){
									month="0"+month;
								}
								if(day.length()==1){
									day="0"+day;
								}
								String date=textField_4.getText()+month+day;
						table_1.setValueAt(textField_3.getText(), i, 0);
						table_1.setValueAt(date, i, 1);
						table_1.setValueAt(comboBox.getSelectedItem(), i, 2);
						table_1.setValueAt(textField_6.getText(), i, 3);
						table_1.setValueAt(textField_5.getText(), i, 4);
						textField_4.setText(null);
						textField_26.setText(null);
						textField_27.setText(null);
						textField_3.setText(null);
						comboBox.setSelectedIndex(0);
						textField_6.setText(null);
						textField_5.setText(null);
						break;
					}
				}
			}
		});
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(172, 231, 652, 280);
		desktopPane_4.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
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
			},
			new String[] {
				"\u8BA2\u5355\u53F7", "\u51FA\u5E93\u65E5\u671F", "\u88C5\u8FD0\u5F62\u5F0F", "\u8D27\u8FD0\u7F16\u53F7", "\u76EE\u7684\u5730"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JLabel label_8 = new JLabel();
		label_8.setBounds(282, 0, 436, 21);
		desktopPane_4.add(label_8);
		
		
		/*
		 * 出库提交
		 */
		JButton button_3 = new JButton("\u63D0\u4EA4");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StockBill_Out stock_out= new StockBill_Out();
				OutDepotBLService outdepot= new OutDepotController();
				for(int i=0;i<table_1.getRowCount();i++){
					StockBill_Out.Info element =stock_out.new Info();
					element.ID=(String) table_1.getValueAt(i, 0);
					element.date[0]= table_1.getValueAt(i, 1).toString().substring(0, 3);
					element.date[1]= table_1.getValueAt(i, 1).toString().substring(4, 5);
					element.date[2]= table_1.getValueAt(i, 1).toString().substring(6, 7);
					element.form= table_1.getValueAt(i, 2).toString();
				    element.ListID=table_1.getValueAt(i, 3).toString();
				    element.destination=table_1.getValueAt(i, 4).toString();
					stock_out.list.set(i, element);
				}
				outdepot.outDepot(stock_out);
				if(outdepot.outDepot(stock_out)==false){
					
				}else{
					for(int i=table_1.getRowCount()-1;i>=0;i--){	
							table_1.setValueAt(null, i, 0);
							table_1.setValueAt(null, i, 1);
							table_1.setValueAt(null, i, 2);
							table_1.setValueAt(null, i, 3);
							table_1.setValueAt(null, i, 4);
					}
				}
			}
		});
		button_3.setBounds(816, 537, 93, 23);
		desktopPane_4.add(button_3);
		
		JLabel label_24 = new JLabel("\u5E74");
		label_24.setBounds(478, 56, 54, 15);
		desktopPane_4.add(label_24);
		
		textField_26 = new JTextField();
		textField_26.setBounds(499, 53, 34, 21);
		desktopPane_4.add(textField_26);
		textField_26.setColumns(10);
		
		JLabel label_25 = new JLabel("\u6708");
		label_25.setBounds(542, 56, 54, 15);
		desktopPane_4.add(label_25);
		
		textField_27 = new JTextField();
		textField_27.setBounds(565, 53, 34, 21);
		desktopPane_4.add(textField_27);
		textField_27.setColumns(10);
		
		JLabel label_26 = new JLabel("\u65E5");
		label_26.setBounds(609, 56, 54, 15);
		desktopPane_4.add(label_26);
		
		/*
		 * 出库撤销
		 */
		JButton button_10 = new JButton("\u64A4\u9500");
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_1.getRowCount()-1;i>=0;i--){
					if(table_1.getValueAt(i, 0)!=null&&table_1.getValueAt(i, 1)!=null&&table_1.getValueAt(i, 2)!=null&&table_1.getValueAt(i, 3)!=null){
						table_1.setValueAt(null, i, 0);
						table_1.setValueAt(null, i, 1);
						table_1.setValueAt(null, i, 2);
						table_1.setValueAt(null, i, 3);
						table_1.setValueAt(null, i, 4);
						break;
					}
				}
			}
		});
		button_10.setBounds(172, 537, 93, 23);
		desktopPane_4.add(button_10);df.format(new Date());
		
		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBackground(Color.WHITE);
		tabbedPane.addTab("库存盘点", null, desktopPane_2, null);
		
		JLabel label_9 = new JLabel();
		label_9.setBounds(282, 0, 436, 21);
		desktopPane_2.add(label_9);
		
		
		/*
		 * 库存盘点查询
		 */
		JButton button_4 = new JButton("\u67E5\u8BE2");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				StockSnapShotVO stocksnapshot=inventory.getStockSnapShot();
				if(stocksnapshot==null){
					
				}else{
				    for(int i=0;i<table_2.getRowCount();i++){
					    table_2.setValueAt(stocksnapshot.list.get(i).ID, i, 0);
					    table_2.setValueAt(stocksnapshot.list.get(i).date[0]+stocksnapshot.list.get(i).date[2]+stocksnapshot.list.get(i).date[3], i, 1);
					    table_2.setValueAt(stocksnapshot.list.get(i).destination, i, 2);
					    table_2.setValueAt(stocksnapshot.list.get(i).zoneID, i, 3);
					    table_2.setValueAt(stocksnapshot.list.get(i).rowID, i, 4);
					    table_2.setValueAt(stocksnapshot.list.get(i).frameID, i, 5);
					    table_2.setValueAt(stocksnapshot.list.get(i).positionID, i, 6);
				    }
				}
			}
		});
		button_4.setBounds(416, 117, 93, 23);
		desktopPane_2.add(button_4);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(172, 231, 652, 280);
		desktopPane_2.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"\u5FEB\u9012\u7F16\u53F7", "\u5165\u5E93\u65E5\u671F", "\u76EE\u7684\u5730", "\u533A\u53F7", "\u6392\u53F7", "\u67B6\u53F7", "\u4F4D\u53F7"
			}
		));
		scrollPane_2.setViewportView(table_2);
		
		/*
		 * 库存盘点导出
		 */
		JButton button_5 = new JButton("\u5BFC\u51FA");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InventoryBLService inventory= new InventoryController();
				boolean istrue=inventory.export();
				if(istrue==false){
					
				}else{
					for(int i=0; i<table_2.getRowCount();i++){
						table_2.setValueAt(null, i, 0);
						table_2.setValueAt(null, i, 1);
						table_2.setValueAt(null, i, 2);
						table_2.setValueAt(null, i, 3);
						table_2.setValueAt(null, i, 4);
						table_2.setValueAt(null, i, 5);
						table_2.setValueAt(null, i, 6);
					}
				}
			}
		});
		button_5.setBounds(795, 536, 93, 23);
		desktopPane_2.add(button_5);
		
		JDesktopPane desktopPane_3 = new JDesktopPane();
		desktopPane_3.setBackground(Color.WHITE);
		tabbedPane.addTab("库区调整", null, desktopPane_3, null);
		
		JLabel label_33 = new JLabel();
		label_33.setBounds(282, 0, 436, 21);
		desktopPane_3.add(label_33);
		
		
		JLabel label_12 = new JLabel("\u6392\u53F7");
		label_12.setBounds(328, 88, 54, 15);
		desktopPane_3.add(label_12);
		
		textField_13 = new JTextField();
		textField_13.setBounds(383, 85, 66, 21);
		desktopPane_3.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel label_13 = new JLabel("\u539F\u5206\u533A");
		label_13.setBounds(328, 122, 54, 15);
		desktopPane_3.add(label_13);
		
		JLabel label_14 = new JLabel("\u73B0\u5206\u533A");
		label_14.setBounds(328, 159, 54, 15);
		desktopPane_3.add(label_14);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(236, 230, 467, 212);
		desktopPane_3.add(scrollPane_3);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
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
			},
			new String[] {
				"\u6392\u53F7", "\u539F\u5206\u533A", "\u73B0\u5206\u533A"
			}
		));
		scrollPane_3.setViewportView(table_3);
		
		/*
		 * 库区调整提交
		 */
		JButton button_6 = new JButton("\u63D0\u4EA4");
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int[] rows= new int[table_3.getRowCount()];
				for(int i=0;i<table_3.getRowCount();i++){
					rows[i]=(int) table_3.getValueAt(i, 0);
					
				}
				String type=(String) table_3.getValueAt(0, 1);
				AreaAdjustBLService areaadjust = new AreaAdjustController();
				areaadjust.areaAdjust(rows, type);
				if(areaadjust.areaAdjust(rows, type)==false){
					
				}else{
					for(int i=0; i<table_3.getRowCount();i++){
						table_3.setValueAt(null, i, 0);
						table_3.setValueAt(null, i, 1);
						table_3.setValueAt(null, i, 2);
					}
				}
			}
		});
		button_6.setBounds(631, 493, 93, 23);
		desktopPane_3.add(button_6);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u673A\u52A8\u533A", "\u822A\u8FD0\u533A", "\u94C1\u8FD0\u533A", "\u6C7D\u8FD0\u533A"}));
		comboBox_1.setBounds(383, 119, 66, 21);
		desktopPane_3.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"\u673A\u52A8\u533A", "\u822A\u8FD0\u533A", "\u94C1\u8FD0\u533A", "\u6C7D\u8FD0\u533A"}));
		comboBox_2.setBounds(383, 156, 66, 21);
		desktopPane_3.add(comboBox_2);
		
		/*
		 * 库区调整添加
		 */
		JButton btnNewButton = new JButton("\u786E\u8BA4");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				for(int i=0;i<table_1.getRowCount();i++){
					if(table_3.getValueAt(i, 1)==null&&table_3.getValueAt(i, 2)==null&&table_3.getValueAt(i, 3)==null){
						table_3.setValueAt(textField_13.getText(), i, 1);
						table_3.setValueAt(comboBox_1.getSelectedItem(), i, 2);
						table_3.setValueAt(comboBox_2.getSelectedItem(), i, 3);
						textField_13.setText(null);
						comboBox_1.setSelectedIndex(0);
						comboBox_2.setSelectedIndex(0);
						break;
					}
				}
			}
		});
		btnNewButton.setBounds(524, 186, 93, 23);
		desktopPane_3.add(btnNewButton);
		
		/*
		 * 库区调整撤销
		 */
		JButton button_9 = new JButton("\u64A4\u9500");
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=table_3.getRowCount()-1;i>=0;i--){
					if(table_3.getValueAt(i, 0)!=null&&table_3.getValueAt(i, 1)!=null
							&&table_3.getValueAt(i, 2)!=null){
						table_3.setValueAt(null, i, 0);
						table_3.setValueAt(null, i, 1);
						table_3.setValueAt(null, i, 2);
					}
				}
			}
		});
		button_9.setBounds(236, 493, 93, 23);
		desktopPane_3.add(button_9);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(Color.WHITE);
		tabbedPane.addTab("库存信息初始化", null, desktopPane_1, null);
		
		JLabel label_34 = new JLabel();
		label_34.setBounds(282, 0, 436, 21);
		desktopPane_1.add(label_34);
	
		
		JLabel lblNewLabel = new JLabel("\u822A\u8FD0\u533A");
		lblNewLabel.setBounds(327, 90, 54, 15);
		desktopPane_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u94C1\u8FD0\u533A");
		lblNewLabel_1.setBounds(327, 115, 54, 15);
		desktopPane_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u6C7D\u8FD0\u533A");
		lblNewLabel_2.setBounds(327, 140, 54, 15);
		desktopPane_1.add(lblNewLabel_2);
		
		JLabel label_15 = new JLabel("\u673A\u52A8\u533A");
		label_15.setBounds(327, 165, 54, 15);
		desktopPane_1.add(label_15);
		
		textField_16 = new JTextField();
		textField_16.setBounds(385, 87, 66, 21);
		desktopPane_1.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(385, 112, 66, 21);
		desktopPane_1.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(385, 137, 66, 21);
		desktopPane_1.add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setBounds(385, 162, 66, 21);
		desktopPane_1.add(textField_19);
		textField_19.setColumns(10);
		
		JLabel label_30 = new JLabel("\u6392 \u5230");
		label_30.setBounds(461, 90, 54, 15);
		desktopPane_1.add(label_30);
		
		JLabel label_31 = new JLabel("\u6392 \u5230");
		label_31.setBounds(461, 115, 54, 15);
		desktopPane_1.add(label_31);
		
		JLabel label_32 = new JLabel("\u6392 \u5230");
		label_32.setBounds(461, 140, 54, 15);
		desktopPane_1.add(label_32);
		
		JLabel label_16 = new JLabel("\u6392 \u5230");
		label_16.setBounds(461, 165, 54, 15);
		desktopPane_1.add(label_16);
		
		textField_20 = new JTextField();
		textField_20.setBounds(503, 87, 66, 21);
		desktopPane_1.add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(503, 112, 66, 21);
		desktopPane_1.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(503, 137, 66, 21);
		desktopPane_1.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(503, 162, 66, 21);
		desktopPane_1.add(textField_23);
		
		JLabel label_17 = new JLabel("\u6392");
		label_17.setBounds(579, 90, 54, 15);
		desktopPane_1.add(label_17);
		
		JLabel label_18 = new JLabel("\u6392");
		label_18.setBounds(579, 115, 54, 15);
		desktopPane_1.add(label_18);
		
		JLabel label_19 = new JLabel("\u6392");
		label_19.setBounds(579, 140, 54, 15);
		desktopPane_1.add(label_19);
		
		JLabel label_20 = new JLabel("\u6392");
		label_20.setBounds(579, 165, 54, 15);
		desktopPane_1.add(label_20);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(236, 230, 467, 212);
		desktopPane_1.add(scrollPane_4);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"\u6392\u53F7", "\u5206\u533A"
			}
		));
		scrollPane_4.setViewportView(table_4);
		
		/*
		 * 将库区初始化信息提交
		 */
		JButton button_7 = new JButton("\u63D0\u4EA4");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int[] motorTransport=null;
				int[] trainTransport=null;
				int[] airTransport=null;
				int[] balnkSpace=null;
				for(int i=0;i<table_4.getRowCount();i++){
					if(table_4.getValueAt(i, 1)=="航运区"){
						airTransport[i]=(int)table_4.getValueAt(i, 0);
					}else if(table_4.getValueAt(i, 1)=="铁运区"){
						trainTransport[i]=(int)table_4.getValueAt(i, 0);
					}else if(table_4.getValueAt(i, 1)=="汽运区"){
						motorTransport[i]=(int)table_4.getValueAt(i, 0);
					}else if(table_4.getValueAt(i, 1)=="机动区"){
						balnkSpace[i]=(int)table_4.getValueAt(i, 0);
					}
				}
				InitDepotAreaBLService initdepotarea = new InitDepotAreaController();
				 boolean istrue=initdepotarea.init(motorTransport, trainTransport, airTransport, balnkSpace);
				if(istrue==false){
					
				}else{
					for(int i=0;i<table_4.getRowCount();i++){
						table.setValueAt(null, i, 0);
						table.setValueAt(null, i, 0);
					}
				}
			}
		});
		button_7.setBounds(714, 479, 93, 23);
		desktopPane_1.add(button_7);
	
		/*
		 * 将库区初始化信息加入table
		 */
		JButton button_8 = new JButton("\u786E\u8BA4");
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				for(int i =Integer.parseInt(textField_16.getText())-1;i<Integer.parseInt(textField_20.getText());i++){
					table_4.setValueAt(i+1, i, 0);
					table_4.setValueAt("航运区", i,1);
				}
				for(int i =Integer.parseInt(textField_17.getText())-1;i<Integer.parseInt(textField_21.getText());i++){
					table_4.setValueAt(i+1, i, 0);
					table_4.setValueAt("铁运区", i,1);
				}
				for(int i =Integer.parseInt(textField_18.getText())-1;i<Integer.parseInt(textField_22.getText());i++){
					table_4.setValueAt(i+1, i, 0);
					table_4.setValueAt("汽运区", i,1);
				}
				for(int i =Integer.parseInt(textField_19.getText())-1;i<Integer.parseInt(textField_23.getText());i++){
					table_4.setValueAt(i+1, i, 0);
					table_4.setValueAt("机动区", i,1);
				}
				
			}
		});
		button_8.setBounds(617, 186, 93, 23);
		desktopPane_1.add(button_8);
		
		new Thread() {        
			public void run() {            
				try {                
					while (true) {                    
						label_3.setText(df.format(new Date()));//显示当前时间      
						label_8.setText(df.format(new Date()));//显示当前时间
						label_9.setText(df.format(new Date()));//显示当前时间
						label_33.setText(df.format(new Date()));//显示当前时间
						label_34.setText(df.format(new Date()));//显示当前时间
						Thread.sleep(1000);//暂停一秒                
						}            
					} catch (Exception e) {            
						
					}        
				}    
			}.start();
	}
	
}
