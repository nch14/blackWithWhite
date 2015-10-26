package ui;

import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ShowOrderList extends JPanel{
	private static final String[] TABLE_HEADER = new String[] {
            "Order ID", "Sender", "Receiver", "Commodity", "Type", "Pakcaging Fee", "Price","Login"};
	Object[][] orders;

    private JTable orderListTable;
    private DefaultTableModel defaultTableModel;
    private JButton addButton;
    
    public ShowOrderList(){
    	defaultTableModel=new DefaultTableModel(null,TABLE_HEADER);
    	orderListTable = new JTable(defaultTableModel);
        addButton = new JButton("add");
        
        this.setLayout(new BorderLayout());
        this.add(new JScrollPane(orderListTable), BorderLayout.CENTER);
        this.add(addButton, BorderLayout.SOUTH);
    }

}
