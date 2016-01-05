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
	
	private JTable tableofinventory;
	public inventoryui() {
		initialize();
	}
	
	private void initialize() {
		Inventory inventory = new Inventory() ;
		
		this.setBackground(Color.WHITE);
		
		JLabel labelofdate = new JLabel();
		labelofdate.setBounds(282, 0, 436, 21);
		this.add(labelofdate);
		
		
		
		/*
		 * 库存盘点查询
		 */
		JButton buttonofquery = new JButton("查询");
		buttonofquery.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				StockSnapShotVO stocksnapshot=inventory.getStockSnapShot();
				if(stocksnapshot.equals(null)){
					
				}else{
				    for(int i=0;i<tableofinventory.getRowCount();i++){
					    tableofinventory.setValueAt(stocksnapshot.list.get(i).ID, i, 0);
					    tableofinventory.setValueAt(stocksnapshot.list.get(i).date[0]+stocksnapshot.list.get(i).date[2]+stocksnapshot.list.get(i).date[3], i, 1);
					    tableofinventory.setValueAt(stocksnapshot.list.get(i).destination, i, 2);
					    tableofinventory.setValueAt(stocksnapshot.list.get(i).zoneID, i, 3);
					    tableofinventory.setValueAt(stocksnapshot.list.get(i).rowID, i, 4);
					    tableofinventory.setValueAt(stocksnapshot.list.get(i).frameID, i, 5);
					    tableofinventory.setValueAt(stocksnapshot.list.get(i).positionID, i, 6);
				    }
				}
			}
		});
		buttonofquery.setBounds(416, 117, 93, 23);
		this.add(buttonofquery);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(172, 231, 652, 280);
		this.add(scrollPane_2);
		
		tableofinventory = new JTable();
		tableofinventory.setModel(new DefaultTableModel(
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
				"快递编号", "入库日期", "目的地", "区号", "排号", "架号", "位号"
			}
		));
		scrollPane_2.setViewportView(tableofinventory);
		
		/*
		 * 库存盘点导出
		 */
		JButton buttonofexport = new JButton("导出");
		buttonofexport.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InventoryBLService inventory= new InventoryController();
				boolean istrue=inventory.export();
				if(istrue==false){
					
				}else{
					for(int i=0; i<tableofinventory.getRowCount();i++){
						tableofinventory.setValueAt(null, i, 0);
						tableofinventory.setValueAt(null, i, 1);
						tableofinventory.setValueAt(null, i, 2);
						tableofinventory.setValueAt(null, i, 3);
						tableofinventory.setValueAt(null, i, 4);
						tableofinventory.setValueAt(null, i, 5);
						tableofinventory.setValueAt(null, i, 6);
					}
				}
			}
		});
		buttonofexport.setBounds(795, 536, 93, 23);
		this.add(buttonofexport);
		
		new Thread() {        
			public void run() {            
				try {                
					while (true) {                    
						
						SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
						labelofdate.setText(df.format(new Date()));//显示当前时间
						Thread.sleep(1000);//暂停一秒                
						}            
					} catch (Exception e) {            
						
					}        
				}    
			}.start();
	}

}
