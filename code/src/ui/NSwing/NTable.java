package ui.NSwing;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

public class NTable extends JTable{
	public NTable(TableModel t){
		super(t);
		DefaultTableCellRenderer r=new DefaultTableCellRenderer();   
	  	r.setHorizontalAlignment(JLabel.CENTER); 
	  	this.setDefaultRenderer(Object.class,r);
	  //	this.getColumnModel().getColumn(0).setMinWidth(40);
	  //	this.getColumnModel().getColumn(0).setMaxWidth(40);
	  	this.setFont(new Font("Î¢ÈíÑÅºÚ Light",Font.PLAIN,14));
	  	this.getTableHeader().setFont(new Font("Î¢ÈíÑÅºÚ Light",Font.PLAIN,16));
	  	//this.getTableHeader().getColumnModel().getColumn(2).setHeaderRenderer(this.getDefaultRenderer(JComboBox.class));
	}

	public NTable(Object[][] tableData, Object[] columnTitle) {
		// TODO Auto-generated constructor stub
		super(tableData,columnTitle);
		DefaultTableCellRenderer r=new DefaultTableCellRenderer();   
	  	r.setHorizontalAlignment(JLabel.CENTER); 
	  	this.setDefaultRenderer(Object.class,r);
	  //	this.getColumnModel().getColumn(0).setMinWidth(40);
	  //	this.getColumnModel().getColumn(0).setMaxWidth(40);
	  	this.setFont(new Font("Î¢ÈíÑÅºÚ Light",Font.PLAIN,14));
	  	this.getTableHeader().setFont(new Font("Î¢ÈíÑÅºÚ Light",Font.PLAIN,16));
	}
}

