package ui.informationui;
import java.awt.Cursor;
import java.awt.Frame;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

import ui.NSwing.FunctionPanel;

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
	
	public void mini(){
		this.setState(Frame.ICONIFIED);
	}
	public void addToolBar(FunctionPanel tools){
		toolBar=tools;
		this.add(toolBar);
		repaint();
	}
	public void removeToolBar(){
		this.remove(toolBar);
		repaint();
	}
	public void addTimePanel(){
		info=new TimePanel(this);
		MouseEventListener mouseListener = new MouseEventListener(this);
		info.addMouseListener(mouseListener);
		info.addMouseMotionListener(mouseListener);
		this.add(info);
		repaint();
	}
	public void removeTimePanel(){
		this.remove(info);
		repaint();
	}
	public void changePanel(JPanel panel){
		lastPanel.push(contentPanel);
		this.remove(contentPanel);
		contentPanel=panel;
		this.add(contentPanel);
		repaint();		
	}
	
	public void changePanelInner(JPanel panel){
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
	
	
	 class MouseEventListener implements MouseInputListener {
         
         Point origin;
		 //鼠标拖拽想要移动的目标组件
         StartFrame frame;
		          
		 public MouseEventListener(StartFrame frame) {
		      this.frame = frame;
		      origin = new Point();
		 }
	        
		        
		 public void mouseClicked(MouseEvent e) {}
		 
		         /**
		          * 记录鼠标按下时的点
		          */
		          @Override
		      public void mousePressed(MouseEvent e) {
		               origin.x = e.getX();  
		               origin.y = e.getY();
		         }
		 
		          @Override
		      public void mouseReleased(MouseEvent e) {}
		 
		          /**
		           * 鼠标移进标题栏时，设置鼠标图标为移动图标
		           */
		          @Override
		          public void mouseEntered(MouseEvent e) {
		              this.frame.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
		          }
		          
		          /**
		           * 鼠标移出标题栏时，设置鼠标图标为默认指针
		           */
		          @Override
		          public void mouseExited(MouseEvent e) {
		              this.frame.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		          }
		 
		          /**
		          * 鼠标在标题栏拖拽时，设置窗口的坐标位置
		           * 窗口新的坐标位置  = 移动前坐标位置+（鼠标指针当前坐标-鼠标按下时指针的位置）
		           */
		         @Override
		         public void mouseDragged(MouseEvent e) {
		             Point p = this.frame.getLocation();
		             this.frame.setLocation(
		                  p.x + (e.getX() - origin.x), 
		                  p.y + (e.getY() - origin.y));  
		          }
		 
		         @Override
		         public void mouseMoved(MouseEvent e){
		        	 
		         }
 
		     }
		  
		
		
}
