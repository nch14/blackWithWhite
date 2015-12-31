package ui.NSwing;

import javax.swing.table.DefaultTableModel;

public class NTableModel extends DefaultTableModel {
	private static final long serialVersionUID = 1L; 
	public NTableModel(Object[][] data,Object[] columns) {
		super(data,columns); 
	}  
	    
	public boolean isCellEditable(int row,int column){ //设置Table单元格是否可编辑 
	        if(column==0)return true;         
	        return false;  
	}  
	public Class<?> getColumnClass(int columnIndex){  
		if(columnIndex==0){ 
			return Boolean.class;  
	    }  
	        return Object.class;  
	}  
} 


