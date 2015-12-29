package ui.sendui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import bl.information.Impl.InformationController;
import bl.information.Service.InformationBLService;
import ui.old.transportfinishedui;
import vo.PackageVO;

public class getsendui {

	private JFrame frame;
	private JTable table;
	private JLabel label;
	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					getsendui window = new getsendui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public getsendui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("\u7269\u6D41\u4FE1\u606F\u7BA1\u7406\u7CFB\u7EDF");
		frame.setBounds(100, 100, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		tabbedPane.addTab("订单信息查询", null, desktopPane, null);
		
		JLabel label_29 = new JLabel();
		label_29.setBounds(282, 0, 436, 21);
		desktopPane.add(label_29);
		
		
		
		JTextField textFieldofordernumber = new JTextField();
		textFieldofordernumber.setBounds(307, 163, 211, 21);
		desktopPane.add(textFieldofordernumber);
		textFieldofordernumber.setColumns(10);
		
		/*
		 * 订单查询
		 */
		JButton buttonofquery = new JButton("查询");
		buttonofquery.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		buttonofquery.setBounds(576, 162, 93, 23);
		desktopPane.add(buttonofquery);
		
		predicttimeandmoneyui t = new predicttimeandmoneyui();
		tabbedPane.addTab("报价和时间管理", null, t, null);
		
		transportfinishedui t1 = new transportfinishedui();
		tabbedPane.addTab("收件信息输入", null, t1, null);
		
		sendui t2 = new sendui();
		tabbedPane.addTab("寄件信息输入", null, t2, null);
		
		new Thread() {        
			public void run() {            
				try {                
					while (true) {       
						SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
						label_29.setText(df.format(new Date()));//显示当前时间      
						Thread.sleep(1000);//暂停一秒                
						}            
					} catch (Exception e) {            
						
					}        
				}    
			}.start();
	}

}
