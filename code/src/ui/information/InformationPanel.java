package ui.information;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import bill.TransMesgPO;
import bl.information.Impl.InformationController;
import main.StartFrame;
import tools.VaildHelper;
import ui.sign.SignPanel;
import vo.PackageVO;

public class InformationPanel extends JPanel{
	StartFrame belongsTO;
	JButton okButton;
	JButton sign; 
	JButton shut;
	JButton mini;
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
		getTransID.setFont(new Font("微软雅黑 Light ",Font.PLAIN,16));
		getTransID.setText("请在此处输入您的订单号……");
		getTransID.addFocusListener(new DeleteListener());
		getTransID.setBounds(450, 200, 260, 40);
		
		LOGO=new JLabel();
		LOGO.setForeground(Color.WHITE);
		LOGO.setText("POWERED BY BALCK&&WHITE");
		LOGO.setBounds(1000, 635, 200, 20);
		
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
		shut.setIcon(new ImageIcon("pic/关闭按钮3D.png"));
		shut.setBounds(35,10, 20, 20);
		shut.addActionListener(new ExitListener());
		//shut.addFocusListener(new ShutListener());
		shut.setBorder(null);
		shut.setFocusPainted(false);
		shut.setBorderPainted(false);
		shut.setContentAreaFilled(false);
		
		mini=new JButton();
		mini.setIcon(new ImageIcon("pic/关闭按钮3D.png"));
		mini.setBounds(10,10, 20, 20);
		mini.addActionListener(new MiniListener());
		mini.setBorder(null);
		mini.setFocusPainted(false);
		mini.setBorderPainted(false);
		mini.setContentAreaFilled(false);
		
		sign=new JButton();
		sign.setIcon(new ImageIcon("pic/sign80%.png"));
		sign.setBounds(1131, 0, 69, 34);
		sign.addActionListener(new SignListener());
		
		//okButton.requestFocus();
		
		wrongMess =new JLabel();
		wrongMess.setBounds(420, 250, 400, 30);
		wrongMess.setFont(new Font("微软雅黑 Light",Font.PLAIN,12));
		wrongMess.setForeground(Color.YELLOW);
		
		this.add(mini);
		this.add(wrongMess);
		this.add(okButton);
		this.add(getTransID);
		this.add(LOGO);
		this.add(sign);
		this.add(bussinessMess);
		this.add(shut);
		/*this.add(bussinessMess2);*/
		this.setVisible(true);
		

	}
	class MiniListener implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			belongsTO.mini();
		}
		
	}
	protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image image;
        Image icon;
        try {
            image = ImageIO.read(new File("pic/背景1.png"));
            g.drawImage(image, 0, 0, this);
            icon = ImageIO.read(new File("pic/logo60%小.png"));
            g.drawImage(icon, 1005, 450, this);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
       
    }
	protected void removeTable(){
		if(labels!=null){
			for(int i=0;i<labels.length;i++){
				remove(labels[i]);
			}
			repaint();
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
	}
	class ShutListener implements FocusListener{

		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub
			shut.setIcon(new ImageIcon("pic/关闭按钮3B.png"));
			repaint();
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			// TODO Auto-generated method stub
			shut.setIcon(new ImageIcon("pic/关闭按钮3A.png"));
			repaint();
		}
		
	}
	class ExitListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			belongsTO.dispose();
		}
		
	}
	class SearchListener implements ActionListener{

		
		public void actionPerformed(ActionEvent arg0) {
			String TransID=getTransID.getText();
			
			InformationController infomation=new InformationController();
			PackageVO pack=infomation.inquireTransMesg(TransID);
			if(pack==null){
				wrongMess.setText("您输入的订单号不存在，请重新输入。如有问题，请联系您的快递员！谢谢");
				repaint();
			}else{
				removeTable();
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
	
	class DeleteListener implements FocusListener{

		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub
			getTransID.setText("");
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			// TODO Auto-generated method stub
			String id=getTransID.getText();
			boolean sucess=VaildHelper.checkIsValidID(id, 10);
			if(!sucess){
				getTransID.setText("订单号为10位有效数字");
				repaint();
			}
		}
		
	}
}
