package ui.judgementui;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import ui.NSwing.NTable;
import vo.StaffVO;

public class PassBillPanel extends JPanel{
	NTable table;
	JScrollPane scrollPane;
	public PassBillPanel(){
		this.setBounds(200, 60, 1000, 615);
		this.setLayout(null);
		
		
	}
	
	
	public void buildTable(ArrayList<Snap> bills){
		int size=bills.size();
		
		Object[][] tableData=new Object[size][2];
		for(int i=0;i<size;i++){
			Snap mess=bills.get(i);
			tableData[i]=new Object[]{mess.type,mess.id,mess.state};
		}
		Object[] columnTitle = {"单据类型","单号"};  
		TableModel tableModel=new DefaultTableModel(tableData,columnTitle);
		table=new NTable(tableModel);
		int height=table.getRowHeight()*(size+1)+13;
		int ValidMaxHeight=250;
		if(height>=400)
			height=ValidMaxHeight;
		
		table.setOpaque(false); 
		table.setRowSelectionAllowed(true);
		scrollPane = new JScrollPane();
		scrollPane.setBounds(140, 50, 400, height);
		scrollPane.setOpaque(false);
		this.add(scrollPane);
		scrollPane.setViewportView(table);
	}
	
	class Snap{
		String type;
		String id;
		String state;
		public Snap(String type,String id,boolean pass){
			this.type=type;
			this.id=id;
			if(pass){
				state="审批通过";		
			}else{
				state="待审批";
			}
		}
	}
}
