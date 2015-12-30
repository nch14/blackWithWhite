package ui.NSwing;

import java.awt.Component;

import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class NTable extends JTable{

	public NTable(){
		this.setModel(new DefaultTableModel(){
		    @Override
		    public Class getColumnClass(int c)  {
		        Object value = getValueAt(0, c);
		        if(value!=null)
		            return value.getClass();
		        else return super.getClass();
		    }
		});
	}
	
	class MyCheckBoxRenderer extends JCheckBox implements TableCellRenderer{
		 
	    public MyCheckBoxRenderer () {
	        this.setBorderPainted(true);
	    }
	    @Override
	    public Component getTableCellRendererComponent(JTable table, Object value,
	            boolean isSelected, boolean hasFocus, int row, int column) {
	        // TODO Auto-generated method stub      
	        return this;
	    }   
	}
}
