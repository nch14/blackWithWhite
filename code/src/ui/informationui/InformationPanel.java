package ui.informationui;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

import bill.TransMesgPO;
import bl.information.Impl.InformationController;
import ui.signui.SignPanel;
import vo.PackageVO;

public class InformationPanel extends JPanel{
	StartFrame belongsTO;
	JButton okButton;
	JButton sign; 
	JButton shut;
	JTextField getTransID;
	JLabel LOGO;
	JLabel bussinessMess2;
	JLabel wrongMess;
	JLabel bussinessMess;
	JLabel[] labels;//用来显示位置
	JTable table;
	public InformationPanel(StartFrame frame){
		belongsTO=frame;
		this.setLayout(null);
		this.setBounds(0, 0,1200, 675);
		
		
		getTransID=new JTextField();
		getTransID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 138, 255)));
		getTransID.setForeground(Color.gray);
		getTransID.setFont(new Font("微软雅黑 ",Font.BOLD,12));
		getTransID.setText("请在此处输入您的订单号……");
		getTransID.setBounds(450, 200, 260, 40);
		
		LOGO=new JLabel();
		LOGO.setForeground(Color.WHITE);
		LOGO.setText("POWERED BY BALCK&&WHITE");
		LOGO.setBounds(1000, 635, 200, 20);
		
		/*bussinessMess2=new JLabel();
		bussinessMess2.setForeground(Color.WHITE);
		bussinessMess2.setFont(new Font("微软雅黑 Light",Font.PLAIN,14));
		bussinessMess2.setText("海德薇");
		bussinessMess2.setBounds(1060, 615,60,20);*/
		
		bussinessMess=new JLabel();
		bussinessMess.setForeground(Color.GRAY);
		bussinessMess.setFont(new Font("微软雅黑 Light",Font.PLAIN,12));
		bussinessMess.setText("- - - - - - - - - - - - - - - - - CopyRight(C) 2015-2016, 海德薇快递公司 - - - - - - - - - - - - - - - - - ");
		bussinessMess.setBounds(280, 610,640,30);
		
		okButton=new JButton();
		okButton.setIcon(new ImageIcon("pic/搜索按钮.png"));
		okButton.setBounds(730,200, 40, 40);
		okButton.addActionListener(new SearchListener());
		
		shut=new JButton();
		shut.setIcon(new ImageIcon("pic/关闭按钮3.png"));
		shut.setBounds(1060,0, 54, 40);
		shut.addActionListener(new SearchListener());
		shut.setBorder(null);
		shut.setFocusPainted(false);
		shut.setBorderPainted(false);
		shut.setContentAreaFilled(false);
		
		sign=new JButton();
		sign.setIcon(new ImageIcon("pic/sign80%.png"));
		sign.setBounds(1131, 0, 69, 34);
		sign.addActionListener(new SignListener());
		
		
		
		this.add(okButton);
		this.add(getTransID);
		this.add(LOGO);
		this.add(sign);
		this.add(bussinessMess);
		this.add(shut);
		/*this.add(bussinessMess2);*/
		this.setVisible(true);
	}
	
	protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image image;
        Image icon;
        Image beiban;
        try {
            image = ImageIO.read(new File("pic/背景1.png"));
            g.drawImage(image, 0, 0, this);
            icon = ImageIO.read(new File("pic/logo60%小.png"));
            g.drawImage(icon, 1005, 450, this);
/*            beiban = ImageIO.read(new File("pic/背板.png"));
            g.drawImage(beiban, 1000, 0, this);*/
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
       
    }
	
	protected void buildTable(PackageVO pack){
		ArrayList<TransMesgPO> messages=pack.getState();
		int size=messages.size();
		labels=new JLabel[size];
		int x=400;
		int y=250;
		int length=150;
		int wight=100;
		for(int i=0;i<size;i++){
			TransMesgPO mess=messages.get(i);
			labels[i]=new JLabel();
			labels[i].setText(mess.time+"        "+mess.location);
			labels[i].setBounds(x,y,length,wight);
			this.add(labels[i]);
			y+=25;
		}
		repaint();
		
		
		
/*		Object[][] tableData=new Object[size][2];
		for(int i=0;i<size;i++){
			TransMesgPO mess=messages.get(i);
			tableData[i]=new Object[]{mess.time,mess.location};
		}
		Object[] columnTitle = {"时间" , "动态"};  
		table=new JTable(tableData,columnTitle);
		table.setBounds(500, 300, 150, 100);
		*/
/*		JTextArea area=new JTextArea(size,2);
		area.setOpaque(false);
		area.setBounds(500, 300, 150, 100);
		*/
		/*table.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);   
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   
		table.setIntercellSpacing(new Dimension(0, 0)); 
		table.setRowHeight(20);
		table.setOpaque(false);  
	    DefaultTableCellRenderer render = new DefaultTableCellRenderer();   
	    render.setOpaque(false); //将渲染器设置为透明   
	        //将这个渲染器设置到fileTable里。  
	        //这个设置在没有另外专门对column设置的情况下有效  
	        //若你对某个column特殊指定了渲染器，则对于这个column，它将不调用render渲染器  
	        //因此为了保证透明，如果你对column额外指定了渲染器，那么在额外的渲染器里也应该设置透明  
	    table.setDefaultRenderer(Object.class,render);  
	        //设置显示范围  
	    Dimension viewSize = new Dimension();   
	    viewSize.width = table.getColumnModel().getTotalColumnWidth(); ;   
	    viewSize.height = 10 * table.getRowHeight();   
	    table.setPreferredScrollableViewportSize(viewSize);   
	        //设置头部透明  
	        //头部实际上也是一个JTABLE，只有一行而已。  
	    JTableHeader header = table.getTableHeader();//获取头部   
	    header.setPreferredSize(new Dimension(30, 26));   
	    header.setOpaque(false);//设置头部为透明  
	    header.getTable().setOpaque(false);//设置头部里面的表格透明  
	          
	         
	         * 头部的表格也像前面的表格设置一样，还需要将里面的单元项设置为透明 
	         * 因此同样需要对头部单元项进行透明度设置，这里还是用渲染器。 
	           
	        header.setDefaultRenderer(render);  
	        TableCellRenderer headerRenderer = header.getDefaultRenderer();   
	        if (headerRenderer instanceof JLabel)   
	        {  
	            ((JLabel) headerRenderer).setHorizontalAlignment(JLabel.CENTER);   
	            ((JLabel) headerRenderer).setOpaque(false);   
	        }  
	    }  
		
		
		JScrollPane scrollPane = new JScrollPane();  
		scrollPane.getViewport().setOpaque(false);//将JScrollPane设置为透明  
        scrollPane.setOpaque(false);//将中间的viewport设置为透明  
        scrollPane.setViewportView(table);//装载表格  
        scrollPane.setColumnHeaderView(table.getTableHeader());//设置头部（HeaderView部分）  
        scrollPane.getColumnHeader().setOpaque(false);//再取出头部，并设置为透明  
        scrollPane.setBounds(x, y, width, height);
       add(scrollPane);  
		
		
		this.add(table);  
		this.repaint();
		*/
		
	}
	class SearchListener implements ActionListener{

		
		public void actionPerformed(ActionEvent arg0) {
			String TransID=getTransID.getText();
			
			InformationController infomation=new InformationController();
			PackageVO pack=infomation.inquireTransMesg(TransID);
			
/*			ArrayList<TransMesgPO> messages=new ArrayList<TransMesgPO>();
			TransMesgPO E=new TransMesgPO("12345","2015","北京");
			TransMesgPO F=new TransMesgPO("12345","2015","上海");
			TransMesgPO G=new TransMesgPO("12345","2015","南京");
			messages.add(E);
			messages.add(F);
			messages.add(G);
			PackageVO pack=new PackageVO("12345",messages);*/
			if(pack==null){
				
			}else{
				buildTable(pack);	
			}
			
		}
		
	}
	
	class SignListener implements ActionListener{

		
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			SignPanel signPanel=new SignPanel(belongsTO);
			belongsTO.changePanel(signPanel);
		}
		
	}
}
