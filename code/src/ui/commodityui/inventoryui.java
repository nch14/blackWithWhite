package ui.commodityui;

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
import javax.swing.table.DefaultTableModel;

import bl.commoditybl.Impl.Inventory;
import bl.commoditybl.Impl.InventoryController;
import bl.commoditybl.Service.InventoryBLService;
import vo.StockSnapShotVO;


public class inventoryui extends JDesktopPane{
	
	private JTable table_2;
	public inventoryui() {
		initialize();
	}
	
	private void initialize() {
		Inventory inventory = new Inventory() ;
		
		this.setBackground(Color.WHITE);
		
		JLabel label_9 = new JLabel();
		label_9.setBounds(282, 0, 436, 21);
		this.add(label_9);
		
		
		
		/*
		 * 库存盘点查询
		 */
		JButton button_4 = new JButton("\u67E5\u8BE2");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				StockSnapShotVO stocksnapshot=inventory.getStockSnapShot();
				if(stocksnapshot.equals(null)){
					
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
		this.add(button_4);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(172, 231, 652, 280);
		this.add(scrollPane_2);
		
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
		this.add(button_5);
		
		new Thread() {        
			public void run() {            
				try {                
					while (true) {                    
						
						SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
						label_9.setText(df.format(new Date()));//显示当前时间
						Thread.sleep(1000);//暂停一秒                
						}            
					} catch (Exception e) {            
						
					}        
				}    
			}.start();
	}

}
