package ui;
import javax.swing.*;

public class MineFrame extends JFrame{
	public MineFrame(){
		this.setSize(800, 600);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
        this.setTitle("Transport Management System");
        
        this.add(new ShowOrderList());

        this.setVisible(true);
	}

}
