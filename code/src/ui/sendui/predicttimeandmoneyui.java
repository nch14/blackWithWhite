package ui.sendui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

import bl.send.Impl.PredictTimeAndMonthController;
import bl.send.Service.PredictTimeAndMontyBLService;

public class predicttimeandmoneyui extends JDesktopPane{
	public predicttimeandmoneyui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBackground(Color.WHITE);
		
		
		JLabel label_30 = new JLabel();
		label_30.setBounds(282, 0, 436, 21);
		this.add(label_30);
		
		
		JLabel label_24 = new JLabel("");
		label_24.setBounds(310, 223, 54, 15);
		this.add(label_24);
		
		JLabel label_25 = new JLabel("");
		label_25.setBounds(310, 266, 54, 15);
		this.add(label_25);
		
		JTextField textField_7 = new JTextField();
		textField_7.setBounds(212, 135, 307, 22);
		this.add(textField_7);
		textField_7.setColumns(10);
		
		JButton button_3 = new JButton("\u786E\u8BA4");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PredictTimeAndMontyBLService predictTimeAndMonthController=new PredictTimeAndMonthController();
				String[] timeandmoney=predictTimeAndMonthController.moneyAndTime(textField_7.getText());
				if( timeandmoney.equals(null)){
					
				}else{
					label_24.setText(timeandmoney[0]);
					label_25.setText(timeandmoney[1]);
				}
			}
		});
		button_3.setBounds(580, 134, 93, 23);
		this.add(button_3);
		
		JLabel label_22 = new JLabel("\u4EF7\u683C\uFF1A");
		label_22.setBounds(212, 223, 54, 15);
		this.add(label_22);
		
		JLabel label_23 = new JLabel("\u9884\u8BA1\u65F6\u95F4\uFF1A");
		label_23.setBounds(212, 266, 72, 15);
		this.add(label_23);
		
		JLabel label_33 = new JLabel("");
		label_33.setBounds(310, 223, 54, 15);
		this.add(label_33);
		
		JLabel label_34 = new JLabel("");
		label_34.setBounds(310, 266, 54, 15);
		this.add(label_34);
		

		new Thread() {        
			public void run() {            
				try {                
					while (true) {                    
						SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式   
						label_30.setText(df.format(new Date()));//显示当前时间
						Thread.sleep(1000);//暂停一秒                
						}            
					} catch (Exception e) {            
						
					}        
				}    
			}.start();
	}

}
