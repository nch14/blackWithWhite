package ui.sendui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

import bill.OrderBillPO;
import bl.send.Impl.SendController;
import bl.send.Service.SendBLService;

public class sendui extends JDesktopPane{
	
	public sendui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		this.setBackground(Color.WHITE);
		
		
		JLabel label_32 = new JLabel();
		label_32.setBounds(282, 0, 436, 21);
		this.add(label_32);
		
		
		JLabel label_3 = new JLabel("\u5BC4\u4EF6\u4EBA\u4FE1\u606F");
		label_3.setBounds(99, 73, 68, 15);
		this.add(label_3);
		
		JLabel label_4 = new JLabel("\u8BA2\u5355\u6761\u5F62\u7801\u53F7");
		label_4.setBounds(672, 73, 83, 15);
		this.add(label_4);
		
		JTextField textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(654, 98, 121, 21);
		this.add(textField_8);
		
		JLabel lblNewLabel = new JLabel("\u59D3\u540D");
		lblNewLabel.setBounds(162, 243, 54, 15);
		this.add(lblNewLabel);
		
		JTextField textField_9 = new JTextField();
		textField_9.setBounds(200, 98, 66, 21);
		this.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel label_5 = new JLabel("\u7535\u8BDD");
		label_5.setBounds(300, 101, 54, 15);
		this.add(label_5);
		
		JTextField textField_10 = new JTextField();
		textField_10.setBounds(341, 98, 92, 21);
		this.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel label_6 = new JLabel("\u624B\u673A");
		label_6.setBounds(458, 101, 54, 15);
		this.add(label_6);
		
		JTextField textField_11 = new JTextField();
		textField_11.setBounds(493, 98, 83, 21);
		this.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel label_7 = new JLabel("\u6536\u4EF6\u4EBA\u4FE1\u606F");
		label_7.setBounds(99, 214, 68, 15);
		this.add(label_7);
		
		JLabel label_8 = new JLabel("\u5355\u4F4D");
		label_8.setBounds(162, 140, 54, 15);
		this.add(label_8);
		
		JTextField textField_12 = new JTextField();
		textField_12.setBounds(200, 137, 376, 21);
		this.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u5730\u5740");
		lblNewLabel_1.setBounds(162, 183, 54, 15);
		this.add(lblNewLabel_1);
		
		JTextField textField_13 = new JTextField();
		textField_13.setBounds(200, 180, 376, 21);
		this.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel label_9 = new JLabel("\u59D3\u540D");
		label_9.setBounds(162, 101, 54, 15);
		this.add(label_9);
		
		JTextField textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(200, 240, 66, 21);
		this.add(textField_14);
		
		JLabel label_10 = new JLabel("\u7535\u8BDD");
		label_10.setBounds(300, 243, 54, 15);
		this.add(label_10);
		
		JTextField textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(341, 240, 92, 21);
		this.add(textField_15);
		
		JLabel label_11 = new JLabel("\u624B\u673A");
		label_11.setBounds(458, 243, 54, 15);
		this.add(label_11);
		
		JTextField textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(493, 240, 83, 21);
		this.add(textField_16);
		
		JLabel label_12 = new JLabel("\u5355\u4F4D");
		label_12.setBounds(162, 278, 54, 15);
		this.add(label_12);
		
		JTextField textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(200, 275, 376, 21);
		this.add(textField_17);
		
		JTextField textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(200, 318, 376, 21);
		this.add(textField_18);
		
		JLabel label_13 = new JLabel("\u5730\u5740");
		label_13.setBounds(162, 321, 54, 15);
		this.add(label_13);
		
		JLabel label_14 = new JLabel("\u8D27\u7269\u4FE1\u606F");
		label_14.setBounds(113, 355, 54, 15);
		this.add(label_14);
		
		JLabel label_15 = new JLabel("\u539F\u4EF6\u6570\uFF08\u4E2A\uFF09");
		label_15.setBounds(162, 380, 83, 15);
		this.add(label_15);
		
		JTextField textField_19 = new JTextField();
		textField_19.setBounds(246, 377, 66, 21);
		this.add(textField_19);
		textField_19.setColumns(10);
		
		JLabel lblkg = new JLabel("\u5B9E\u9645\u91CD\u91CF\uFF08kg\uFF09");
		lblkg.setBounds(379, 380, 92, 15);
		this.add(lblkg);
		
		JTextField textField_20 = new JTextField();
		textField_20.setBounds(493, 377, 66, 21);
		this.add(textField_20);
		textField_20.setColumns(10);
		
		JLabel label_16 = new JLabel("\u5C3A\u5BF8\uFF08\u957F*\u5BBD*\u9AD8\uFF09");
		label_16.setBounds(162, 413, 104, 15);
		this.add(label_16);
		
		JTextField textField_21 = new JTextField();
		textField_21.setBounds(256, 410, 34, 21);
		this.add(textField_21);
		textField_21.setColumns(10);
		
		JTextField textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(300, 410, 34, 21);
		this.add(textField_22);
		
		JTextField textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(345, 410, 34, 21);
		this.add(textField_23);
		
		JLabel label_17 = new JLabel("\u5185\u4EF6\u54C1\u540D");
		label_17.setBounds(162, 447, 54, 15);
		this.add(label_17);
		
		JTextField textField_24 = new JTextField();
		textField_24.setBounds(226, 444, 66, 21);
		this.add(textField_24);
		textField_24.setColumns(10);
		
		JLabel lbll = new JLabel("\u4F53\u79EF\uFF08L\uFF09");
		lbll.setBounds(379, 447, 68, 15);
		this.add(lbll);
		
		JTextField textField_25 = new JTextField();
		textField_25.setBounds(493, 444, 66, 21);
		this.add(textField_25);
		textField_25.setColumns(10);
		
		JLabel label_18 = new JLabel("\u5FEB\u9012\u4FE1\u606F");
		label_18.setBounds(113, 486, 54, 15);
		this.add(label_18);
		
		JLabel label_19 = new JLabel("\u5305\u88C5\u8D39");
		label_19.setBounds(162, 511, 54, 15);
		this.add(label_19);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u7EB8\u7BB1\uFF085\u5143\uFF09"}));
		comboBox.setBounds(226, 508, 108, 21);
		this.add(comboBox);
		
		JLabel label_20 = new JLabel("\u5FEB\u9012\u7C7B\u578B");
		label_20.setBounds(379, 511, 54, 15);
		this.add(label_20);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(493, 508, 66, 21);
		this.add(comboBox_1);
		
		JLabel label_21 = new JLabel("\u79CD\u7C7B");
		label_21.setBounds(162, 546, 54, 15);
		this.add(label_21);
		
		JTextField textField_26 = new JTextField();
		textField_26.setBounds(226, 543, 66, 21);
		this.add(textField_26);
		textField_26.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u8D39\u7528\u5408\u8BA1\uFF1A");
		lblNewLabel_2.setBounds(654, 486, 68, 15);
		this.add(lblNewLabel_2);
		
		JButton button_4 = new JButton("\u786E\u8BA4");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		button_4.setBounds(654, 507, 68, 23);
		this.add(button_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(738, 486, 54, 15);
		this.add(lblNewLabel_3);
		
		JButton button_5 = new JButton("\u63D0\u4EA4");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//设置日期格式
				OrderBillPO order = new OrderBillPO(textField_9.getText(),textField_10.getText(),textField_11.getText(),
						textField_12.getText(),textField_13.getText(),textField_14.getText(),textField_15.getText(),
						textField_16.getText(),textField_17.getText(),textField_18.getText(),textField_19.getText(),
						textField_20.getText(),textField_21.getText(),textField_22.getText(),textField_23.getText(),
						textField_24.getText(),textField_25.getText(),comboBox.getSelectedItem().toString(),
						comboBox_1.getSelectedItem().toString(),textField_26.getText(),df.format(new Date()),
					    Double.parseDouble(lblNewLabel_3.getText()));
				SendBLService send = new SendController();
				send.push(order);
				if(send.push(order)==false){
					
				}else{
					textField_9.setText(null);
					textField_10.setText(null);
					textField_11.setText(null);
					textField_12.setText(null);
					textField_13.setText(null);
					textField_14.setText(null);
					textField_15.setText(null);
					textField_16.setText(null);
					textField_17.setText(null);
					textField_18.setText(null);
					textField_19.setText(null);
					textField_20.setText(null);
					textField_21.setText(null);
					textField_22.setText(null);
					textField_23.setText(null);
					textField_24.setText(null);
					textField_25.setText(null);
					comboBox.setSelectedIndex(0);
					comboBox_1.setSelectedIndex(0);
					textField_26.setText(null);
				}
			}
		});
		button_5.setBounds(740, 507, 68, 23);
		this.add(button_5);
		
		new Thread() {        
			public void run() {            
				try {                
					while (true) {                    
						SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
						label_32.setText(df.format(new Date()));//显示当前时间
						Thread.sleep(1000);//暂停一秒                
						}            
					} catch (Exception e) {            
						
					}        
				}    
			}.start();
	}
}
