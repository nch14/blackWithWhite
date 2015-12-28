package ui.informationui;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import bill.OrderBillPO;
import bl.send.Impl.SendController;
import bl.send.Service.SendBLService;
import tools.VaildHelper;

public class GetOrderBillPanel extends JPanel{
	public GetOrderBillPanel(){
		this.setBounds(200,60,1000,615);
		this.setLayout(null);
		
		JLabel labelofsenderinfo = new JLabel();
		labelofsenderinfo.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofsenderinfo.setText("寄件人信息");
		labelofsenderinfo.setBounds(60, 65, 100, 30);
		this.add(labelofsenderinfo);
		
		
		JLabel labelofordernumber = new JLabel();
		labelofordernumber.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofordernumber.setText("订单条形码号");
		labelofordernumber.setBounds(730, 70, 180, 30);
		this.add(labelofordernumber);
		
		
		JTextField textFieldofordernumber = new JTextField();
		textFieldofordernumber.setBounds(730, 120, 180, 30);
		this.add(textFieldofordernumber);
		textFieldofordernumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofsendername = new JLabel();
		labelofsendername.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofsendername.setText("姓名");
		labelofsendername.setBounds(162, 100, 40, 30);
		this.add(labelofsendername);
		
		
		NLabel textFieldofsendername = new NLabel();
		textFieldofsendername.setBounds(220, 100, 60, 30);
		this.add(textFieldofsendername);
		textFieldofsendername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));

		JLabel labelofsenderphone = new JLabel();
		labelofsenderphone.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofsenderphone.setText("电话");
		labelofsenderphone.setBounds(300, 100, 40, 30);
		this.add(labelofsenderphone);
		
		
		NLabel textFieldofsenderphone = new NLabel();
		textFieldofsenderphone.setBounds(361, 100, 90, 30);
		this.add(textFieldofsenderphone);
		textFieldofsenderphone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofsendermobile = new JLabel();
		labelofsendermobile.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofsendermobile.setText("手机");
		labelofsendermobile.setBounds(475, 100, 40, 30);
		this.add(labelofsendermobile);
		
		
		NLabel textFieldofsendermobile = new NLabel();
		textFieldofsendermobile.setBounds(530, 100, 140, 30);
		this.add(textFieldofsendermobile);
		textFieldofsendermobile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofsenderunit = new JLabel();
		labelofsenderunit.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofsenderunit.setText("单位");
		labelofsenderunit.setBounds(162, 140, 40, 30);
		this.add(labelofsenderunit);
	
		
		NLabel textFieldofsenderunit = new NLabel();
		textFieldofsenderunit.setBounds(220, 140, 450, 30);
		this.add(textFieldofsenderunit);
		textFieldofsenderunit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofsenderaddress = new JLabel();
		labelofsenderaddress.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofsenderaddress.setText("地址");
		labelofsenderaddress.setBounds(162, 180, 40, 30);
		this.add(labelofsenderaddress);
		
		
		NLabel textFieldofsenderaddress = new NLabel();
		textFieldofsenderaddress.setBounds(220, 180, 450, 30);
		this.add(textFieldofsenderaddress);
		textFieldofsenderaddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofconsigneeinfo = new JLabel();
		labelofconsigneeinfo.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofconsigneeinfo.setText("收件人信息");
		labelofconsigneeinfo.setBounds(60, 220, 100, 30);
		this.add(labelofconsigneeinfo);

		
		JLabel labelofconsigneename = new JLabel();
		labelofconsigneename.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofconsigneename.setText("姓名");
		labelofconsigneename.setBounds(162, 260, 40, 30);
		this.add(labelofconsigneename);
		
		
		NLabel textFieldofconsigneename = new NLabel();
		textFieldofconsigneename.setBounds(220, 260, 60, 30);
		this.add(textFieldofconsigneename);
		textFieldofconsigneename.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofconsigneephone = new JLabel();
		labelofconsigneephone.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofconsigneephone.setText("电话");
		labelofconsigneephone.setBounds(300, 260, 40, 30);
		this.add(labelofconsigneephone);
	
		
		NLabel textFieldofconsigneephone = new NLabel();
		textFieldofconsigneephone.setBounds(361, 260, 92, 30);
		this.add(textFieldofconsigneephone);
		textFieldofconsigneephone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofconsigneemobile = new JLabel();
		labelofconsigneemobile.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofconsigneemobile.setText("手机");
		labelofconsigneemobile.setBounds(475, 260, 40, 30);
		this.add(labelofconsigneemobile);
		
		
		NLabel textFieldofconsigneemobile = new NLabel();
		textFieldofconsigneemobile.setBounds(530, 260, 140, 30);
		this.add(textFieldofconsigneemobile);
		textFieldofconsigneemobile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofconsigneeunit = new JLabel();
		labelofconsigneeunit.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofconsigneeunit.setText("单位");
		labelofconsigneeunit.setBounds(162, 300, 40, 30);
		this.add(labelofconsigneeunit);
	
		
		NLabel textFieldofconsigneeunit = new NLabel();
		textFieldofconsigneeunit.setBounds(220, 300, 450, 30);
		this.add(textFieldofconsigneeunit);
		textFieldofconsigneeunit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		NLabel textFieldofconsigneeaddress = new NLabel();
		textFieldofconsigneeaddress.setBounds(220, 340, 450, 30);
		this.add(textFieldofconsigneeaddress);
		textFieldofconsigneeaddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofconsigneeaddress = new JLabel();
		labelofconsigneeaddress.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofconsigneeaddress.setText("地址");
		labelofconsigneeaddress.setBounds(162, 340, 40, 30);
		this.add(labelofconsigneeaddress);
		
		
		JLabel labelofcargoinfo = new JLabel();
		labelofcargoinfo.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofcargoinfo.setText("货物信息");
		labelofcargoinfo.setBounds(60, 380, 100, 30);
		this.add(labelofcargoinfo);
		
		
		JLabel labelofnumber = new JLabel();
		labelofnumber.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofnumber.setText("件数");
		labelofnumber.setBounds(162, 420, 60, 30);
		this.add(labelofnumber);
		
		
		NLabel textFieldofnumber = new NLabel();
		textFieldofnumber.setBounds(220, 420, 60, 30);
		this.add(textFieldofnumber);
		textFieldofnumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofweight = new JLabel();
		labelofweight.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofweight.setText("实际重量（kg）");
		labelofweight.setBounds(300, 420, 120, 30);
		this.add(labelofweight);
	
		
		NLabel textFieldofweight = new NLabel();
		textFieldofweight.setBounds(430, 420, 60, 30);
		this.add(textFieldofweight);
		textFieldofweight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofvolume = new JLabel();
		labelofvolume.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofvolume.setText("体积（L）");
		labelofvolume.setBounds(520, 420, 80, 30);
		this.add(labelofvolume);
		

		NLabel textFieldofvolume = new NLabel();
		textFieldofvolume.setBounds(610, 420, 60, 30);
		this.add(textFieldofvolume);
		textFieldofvolume.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofsize = new JLabel();
		labelofsize.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofsize.setText("尺寸（长*宽*高）");
		labelofsize.setBounds(162, 460, 140, 30);
		this.add(labelofsize);
		
		
		NLabel textFieldoflength = new NLabel();
		textFieldoflength.setBounds(316, 460, 34, 30);
		this.add(textFieldoflength);
		textFieldoflength.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		
		NLabel textFieldofwidth = new NLabel();
		textFieldofwidth.setBounds(360, 460, 34, 30);
		this.add(textFieldofwidth);
		textFieldofwidth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		NLabel textFieldofheight = new NLabel();
		textFieldofheight.setBounds(405, 460, 34, 30);
		this.add(textFieldofheight);
		textFieldofheight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofcargoname = new JLabel();
		labelofcargoname.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofcargoname.setText("内件品名");
		labelofcargoname.setBounds(520, 460, 75, 30);
		this.add(labelofcargoname);
		
		
		NLabel textFieldofcargoname = new NLabel();
		textFieldofcargoname.setBounds(610,460, 60, 30);
		this.add(textFieldofcargoname);
		
		
		
		JLabel labeloforderinfo = new JLabel();
		labeloforderinfo .setFont(new Font("微软雅黑",Font.BOLD,16));
		labeloforderinfo.setBounds(60, 500, 100, 30);
		this.add(labeloforderinfo);
		
		
		JLabel labelofpackingexpense = new JLabel();
		labelofpackingexpense .setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofpackingexpense.setText("包装费");
		labelofpackingexpense.setBounds(162, 540, 60, 30);
		this.add(labelofpackingexpense);
		
		
		NLabel comboBoxofpackingexpense = new NLabel();
		comboBoxofpackingexpense.setBounds(220, 540, 60, 30);
		comboBoxofpackingexpense.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		this.add(comboBoxofpackingexpense);
		
		JLabel labelofordertype = new JLabel();
		labelofordertype.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofordertype.setText("快递类型");
		labelofordertype.setBounds(330, 540, 80, 30);
		this.add(labelofordertype);
	
		
		NLabel comboBoxofordertype = new NLabel();
		comboBoxofordertype.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		comboBoxofordertype.setBounds(420, 540, 80, 30);
		this.add(comboBoxofordertype);
		
		JLabel labelofkind = new JLabel();
		labelofkind.setFont(new Font("微软雅黑",Font.BOLD,16));
		 labelofkind.setText("种类");
		labelofkind.setBounds(540, 540, 40, 30);
		this.add(labelofkind);
	
		NLabel textFieldofkind = new NLabel();
		textFieldofkind.setBounds(610, 540, 80, 30);
		this.add(textFieldofkind);
		textFieldofkind.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		
		JLabel labelofexpense = new JLabel();
		labelofexpense.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofexpense.setText("费用合计：");
		labelofexpense.setBounds(730, 540, 100, 30);
		this.add(labelofexpense);
		
		
		JLabel labeloftotalexpense = new JLabel("");
		labeloftotalexpense.setFont(new Font("微软雅黑",Font.BOLD,16));
		labeloftotalexpense.setBounds(816, 540, 80, 30);
		labeloftotalexpense.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		this.add(labeloftotalexpense);		
		
		JButton buttonofsubmit = new JButton("查询");
		buttonofsubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String text=textFieldofordernumber.getText();
				boolean result=VaildHelper.checkIsValidID(text, 10);
				
			//	boolean result=true;
				if(result){
					System.out.println("梦醒煞笔");
					SendController send=new SendController();
					OrderBillPO bill=send.inquireSendMesg(text);
					//OrderBillPO bill=new OrderBillPO();
					if(bill==null){
						TimePanel.change=true;
						TimePanel.text="查询失败！可能不存在该订单，也可能网络连接发生异常。请检查您的输入后重试。";
					}else{
						textFieldofsendername.setText(bill.nameOfSender);
						textFieldofsenderphone.setText(bill.phoneOfSender);
						textFieldofsendermobile.setText(bill.mobileOfSender);
						textFieldofsenderunit.setText(bill.workplaceOfSender);
						textFieldofsenderaddress.setText(bill.addressOfSender);
						textFieldofconsigneename.setText(bill.nameOfReceiver);
						textFieldofconsigneephone.setText(bill.phoneOfReceiver);
						textFieldofconsigneemobile.setText(bill.mobileOfReceiver);
						textFieldofconsigneeunit.setText(bill.workplaceOfReceiver);
						textFieldofconsigneeaddress.setText(bill.addressOfReceiver);
						textFieldofnumber.setText(""+bill.numOfItem);
						textFieldofweight.setText(bill.weight+"");
						textFieldofvolume.setText(bill.volume);
						textFieldoflength.setText(""+bill.size[0]);
						textFieldofwidth.setText(""+bill.size[1]);
						textFieldofheight.setText(""+bill.size[2]);
						textFieldofcargoname.setText(bill.nameOfOrder);
						comboBoxofpackingexpense.setText(""+bill.moneyForCover);
						comboBoxofordertype.setText(bill.speedLevel);;
						textFieldofkind.setText(bill.kindOfSend);
						labeloftotalexpense.setText(bill.money+"");
					}
				}
			}
		});
		buttonofsubmit.setBounds(770, 170, 100, 30);
		this.add(buttonofsubmit);
	}
}
