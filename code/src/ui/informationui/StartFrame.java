package ui.informationui;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class StartFrame extends JFrame{
	public  TimePanel info;
	public  JPanel contentPanel;
	public  JPanel toolBar;
	public  Stack<JPanel> lastPanel ;
	
	public StartFrame(){
		this.setUndecorated(true); 
		//this.setTitle("海德薇快递公司");
		this.setBounds(50, 50, 1200,675);
		this.setLayout(null);
		this.setContentPane(new JPanel());
		this.setResizable(false);
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
	
		lastPanel=new Stack<JPanel>();
		JPanel myPanel=(JPanel) this.getContentPane();
		
		myPanel.setLayout(null);
		
		
		contentPanel=new InformationPanel(this);
		
		
		myPanel.add(contentPanel);
		repaint();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
		public void addToolBar(FunctionPanel tools){
		toolBar=tools;
		this.add(toolBar);
		repaint();
	}
	public void addTimePanel(){
		info=new TimePanel(this);
		this.add(info);
		repaint();
	}
	public void changePanel(JPanel panel){
		lastPanel.push(contentPanel);
		this.remove(contentPanel);
		contentPanel=panel;
		this.add(contentPanel);
		repaint();		
	}
	
	public void backLastPanel(){
		JPanel panel=lastPanel.pop();
		this.remove(contentPanel);
		contentPanel=panel;
		this.add(contentPanel);
		repaint();		
	}
	public static void main(String[] args){
		StartFrame a=new StartFrame();
		
	}
}
