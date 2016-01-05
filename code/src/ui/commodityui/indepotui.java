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
	private JTextField textFieldofordernumber;
	private JTextField textFieldofyear;
	private JTextField textFieldofdestination;
	private JTable tableofindepot;
	private JTextField textFieldofmonth;
	private JTextField textFieldofday;

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
		frame.setTitle("物流信息管理系统");
		frame.setResizable(false);
		frame.setBounds(100, 100, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		tabbedPane.addTab("入库", null, desktopPane, null);
		
		
		JLabel labelofordernumber = new JLabel("订单号");
		labelofordernumber.setBounds(331, 79, 54, 15);
		desktopPane.add(labelofordernumber);
		
		textFieldofordernumber= new JTextField();
		textFieldofordernumber.setBounds(419, 76, 66, 21);
		desktopPane.add(textFieldofordernumber);
		textFieldofordernumber.setColumns(10);
		
		JLabel labelofindepotdate = new JLabel("入库日期");
		labelofindepotdate.setBounds(331, 122, 54, 15);
		desktopPane.add(labelofindepotdate);
		
		textFieldofyear = new JTextField();
		textFieldofyear.setBounds(419, 119, 35, 21);
		desktopPane.add(textFieldofyear);
		textFieldofyear.setColumns(10);
		
		JLabel labelofdestination = new JLabel("目的地");
		labelofdestination.setBounds(331, 165, 54, 15);
		desktopPane.add(labelofdestination);
		
		textFieldofdestination = new JTextField();
		textFieldofdestination.setBounds(419, 162, 206, 21);
		desktopPane.add(textFieldofdestination);
		textFieldofdestination.setColumns(10);

		/*
		 * 入库添加
		 */
		JButton buttonofadd = new JButton("添加");
		buttonofadd.setBounds(670, 197, 93, 23);
		desktopPane.add(buttonofadd);
		buttonofadd.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			for(int i=0;i<tableofindepot.getRowCount();i++){
				if(tableofindepot.getValueAt(i, 0)==null&&tableofindepot.getValueAt(i, 1)==null&&tableofindepot.getValueAt(i, 2)==null){
					tableofindepot.setValueAt(textFieldofordernumber.getText(), i, 0);
					tableofindepot.setValueAt(textFieldofyear.getText()+"/"+textFieldofmonth.getText()+"/"+textFieldofday.getText(), i, 1);
					tableofindepot.setValueAt(textFieldofdestination.getText(), i, 2);
					textFieldofordernumber.setText(null);
					textFieldofyear.setText(null);
					textFieldofdestination.setText(null);
					break;
				}
			}
			
		    }	 
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(172, 231, 652, 280);
		desktopPane.add(scrollPane);
		
		tableofindepot = new JTable();
		tableofindepot.setModel(new DefaultTableModel(
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
				"订单号", "入库日期", "目的地", "区号", "排号", "架号", "位号", "是否发生库存报警"
			}
		));
		tableofindepot.getColumnModel().getColumn(2).setPreferredWidth(78);
		tableofindepot.getColumnModel().getColumn(3).setPreferredWidth(70);
		tableofindepot.getColumnModel().getColumn(4).setPreferredWidth(70);
		tableofindepot.getColumnModel().getColumn(5).setPreferredWidth(70);
		tableofindepot.getColumnModel().getColumn(6).setPreferredWidth(70);
		tableofindepot.getColumnModel().getColumn(7).setPreferredWidth(106);
		scrollPane.setViewportView(tableofindepot);
		/*
		 * 入库提交
		 */
		JButton buttonofsubmit = new JButton("提交");
		buttonofsubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] ID = new String[tableofindepot.getRowCount()];
				String[][] date =new String[tableofindepot.getRowCount()][];
				String[] destination= new String[tableofindepot.getRowCount()] ;
				for(int i=0;i<tableofindepot.getRowCount();i++){
					ID[i]=(String) tableofindepot.getValueAt(i, 1);
					date[i]=(String[]) tableofindepot.getValueAt(i, 2);
				//二维数组
					destination[i]=(String) tableofindepot.getValueAt(i, 3);
				}
				StockBill_In stock_in=new StockBill_In(ID,date,destination);
				InDepotBLService indepot= new InDepotController();
				StockBill_In stock=indepot.inDepot(stock_in);
				if(stock.equals(null)){
					
				}else{
					
				}
			}
		});
		buttonofsubmit.setBounds(780, 549, 93, 23);
		desktopPane.add(buttonofsubmit);
		
		JLabel label_3 = new JLabel();
		label_3.setBounds(282, 0, 436, 21);
		desktopPane.add(label_3);
		
		
		JLabel labelofyear = new JLabel("年");
		labelofyear.setBounds(464, 122, 54, 15);
		desktopPane.add(labelofyear);
		
		textFieldofmonth = new JTextField();
		textFieldofmonth.setBounds(486, 119, 35, 21);
		desktopPane.add(textFieldofmonth);
		textFieldofmonth.setColumns(10);
		
		JLabel labelofmonth = new JLabel("月");
		labelofmonth.setBounds(531, 122, 54, 15);
		desktopPane.add(labelofmonth);
		
		textFieldofday = new JTextField();
		textFieldofday.setBounds(556, 119, 35, 21);
		desktopPane.add(textFieldofday);
		textFieldofday.setColumns(10);
		
		JLabel labelofday = new JLabel("日");
		labelofday.setBounds(601, 122, 54, 15);
		desktopPane.add(labelofday);
		
		/*
		 * 入库撤销
		 */
		JButton buttonofcancel = new JButton("撤销");
		buttonofcancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=tableofindepot.getRowCount()-1;i>=0;i--){
					if(tableofindepot.getValueAt(i, 0)!=null&&tableofindepot.getValueAt(i, 1)!=null&&tableofindepot.getValueAt(i, 2)!=null){
						tableofindepot.setValueAt(null, i, 0);
						tableofindepot.setValueAt(null, i, 1);
						tableofindepot.setValueAt(null, i, 2);
						break;
					}
				}
			}
		});
		buttonofcancel.setBounds(172, 521, 93, 23);
		desktopPane.add(buttonofcancel);
		
		JButton button_12 = new JButton("\u6E05\u7A7A");
		button_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<tableofindepot.getRowCount();i++){
					tableofindepot.setValueAt(null, i, 0);
					tableofindepot.setValueAt(null, i, 1);
					tableofindepot.setValueAt(null, i, 2);
					tableofindepot.setValueAt(null, i, 3);
					tableofindepot.setValueAt(null, i, 4);
					tableofindepot.setValueAt(null, i, 5);
					tableofindepot.setValueAt(null, i, 6);
					tableofindepot.setValueAt(null, i, 7);
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
