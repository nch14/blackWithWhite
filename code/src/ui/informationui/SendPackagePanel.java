package ui.informationui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SendPackagePanel extends JPanel {
	StartFrame belongsTO;	
	public SendPackagePanel(StartFrame belongsTO){
		this.belongsTO=belongsTO;
		this.setBounds(200,60,1000,615);
		this.setLayout(null);
		
		JLabel labelofsenderinfo = new JLabel();
		labelofsenderinfo.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofsenderinfo.setText("寄件人信息");
		labelofsenderinfo.setBounds(60, 65, 100, 30);
		this.add(labelofsenderinfo);
		labelofsenderinfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,138,255)));
		
		JLabel labelofordernumber = new JLabel();
		labelofordernumber.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofordernumber.setText("订单条形码号");
		labelofordernumber.setBounds(700, 70, 180, 30);
		this.add(labelofordernumber);
		labelofordernumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,138,255)));
		
		JTextField textFieldofordernumber = new JTextField();
		textFieldofordernumber.setColumns(10);
		textFieldofordernumber.setBounds(700, 120, 180, 30);
		this.add(textFieldofordernumber);
		
		JLabel labelofsendername = new JLabel();
		labelofsendername.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofsendername.setText("姓名");
		labelofsendername.setBounds(162, 100, 40, 30);
		this.add(labelofsendername);
		labelofsendername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,138,255)));
		
		JTextField textFieldofsendername = new JTextField();
		textFieldofsendername.setBounds(220, 100, 60, 30);
		this.add(textFieldofsendername);
		/*textFieldofsendername.setColumns(10);*/

		JLabel labelofsenderphone = new JLabel();
		labelofsenderphone.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofsenderphone.setText("电话");
		labelofsenderphone.setBounds(300, 100, 40, 30);
		this.add(labelofsenderphone);
		labelofsenderphone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,138,255)));
		
		JTextField textFieldofsenderphone = new JTextField();
		textFieldofsenderphone.setBounds(361, 100, 90, 30);
		this.add(textFieldofsenderphone);
		textFieldofsenderphone.setColumns(10);
		
		JLabel labelofsendermobile = new JLabel();
		labelofsendermobile.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofsendermobile.setText("手机");
		labelofsendermobile.setBounds(458, 100, 40, 30);
		this.add(labelofsendermobile);
		labelofsendermobile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,138,255)));
		
		JTextField textFieldofsendermobile = new JTextField();
		textFieldofsendermobile.setBounds(513, 100, 90, 30);
		this.add(textFieldofsendermobile);
		textFieldofsendermobile.setColumns(10);
		
		JLabel labelofsenderunit = new JLabel();
		labelofsenderunit.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofsenderunit.setText("单位");
		labelofsenderunit.setBounds(162, 140, 40, 30);
		this.add(labelofsenderunit);
		labelofsenderunit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,138,255)));
		
		JTextField textFieldofsenderunit = new JTextField();
		textFieldofsenderunit.setBounds(220, 140, 383, 30);
		this.add(textFieldofsenderunit);
		textFieldofsenderunit.setColumns(10);
		
		JLabel labelofsenderaddress = new JLabel();
		labelofsenderaddress.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofsenderaddress.setText("地址");
		labelofsenderaddress.setBounds(162, 183, 40, 30);
		this.add(labelofsenderaddress);
		labelofsenderaddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,138,255)));
		
		JTextField textFieldofsenderaddress = new JTextField();
		textFieldofsenderaddress.setBounds(220, 183, 383, 30);
		this.add(textFieldofsenderaddress);
		textFieldofsenderaddress.setColumns(10);
		
		JLabel labelofconsigneeinfo = new JLabel();
		labelofconsigneeinfo.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofconsigneeinfo.setText("收件人信息");
		labelofconsigneeinfo.setBounds(60, 214, 100, 30);
		this.add(labelofconsigneeinfo);
		labelofconsigneeinfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,138,255)));
		
		JLabel labelofconsigneename = new JLabel();
		labelofconsigneename.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofconsigneename.setText("姓名");
		labelofconsigneename.setBounds(162, 243, 40, 30);
		this.add(labelofconsigneename);
		labelofconsigneename.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,138,255)));
		
		JTextField textFieldofconsigneename = new JTextField();
		textFieldofconsigneename.setColumns(10);
		textFieldofconsigneename.setBounds(220, 243, 60, 30);
		this.add(textFieldofconsigneename);
		
		JLabel labelofconsigneephone = new JLabel();
		labelofconsigneephone.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofconsigneephone.setText("电话");
		labelofconsigneephone.setBounds(300, 243, 40, 30);
		this.add(labelofconsigneephone);
		labelofconsigneephone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,138,255)));
		
		JTextField textFieldofconsigneephone = new JTextField();
		textFieldofconsigneephone.setColumns(10);
		textFieldofconsigneephone.setBounds(361, 243, 92, 30);
		this.add(textFieldofconsigneephone);
		
		JLabel labelofconsigneemobile = new JLabel();
		labelofconsigneemobile.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofconsigneemobile.setText("手机");
		labelofconsigneemobile.setBounds(458, 243, 40, 30);
		this.add(labelofconsigneemobile);
		labelofconsigneemobile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,138,255)));
		
		JTextField textFieldofconsigneemobile = new JTextField();
		textFieldofconsigneemobile.setColumns(10);
		textFieldofconsigneemobile.setBounds(513, 243, 90, 30);
		this.add(textFieldofconsigneemobile);
		
		JLabel labelofconsigneeunit = new JLabel();
		labelofconsigneeunit.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofconsigneeunit.setText("单位");
		labelofconsigneeunit.setBounds(162, 278, 40, 30);
		this.add(labelofconsigneeunit);
		labelofconsigneeunit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,138,255)));
		
		JTextField textFieldofconsigneeunit = new JTextField();
		textFieldofconsigneeunit.setColumns(10);
		textFieldofconsigneeunit.setBounds(220, 278, 383, 30);
		this.add(textFieldofconsigneeunit);
		
		JTextField textFieldofconsigneeaddress = new JTextField();
		textFieldofconsigneeaddress.setColumns(10);
		textFieldofconsigneeaddress.setBounds(220, 321, 383, 30);
		this.add(textFieldofconsigneeaddress);
		
		JLabel labelofconsigneeaddress = new JLabel();
		labelofconsigneeaddress.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofconsigneeaddress.setText("地址");
		labelofconsigneeaddress.setBounds(162, 321, 40, 30);
		this.add(labelofconsigneeaddress);
		labelofconsigneeaddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,138,255)));
		
		JLabel labelofcargoinfo = new JLabel();
		labelofcargoinfo.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofcargoinfo.setText("货物信息");
		labelofcargoinfo.setBounds(60, 355, 100, 30);
		this.add(labelofcargoinfo);
		labelofcargoinfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,138,255)));
		
		JLabel labelofnumber = new JLabel();
		labelofnumber.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofnumber.setText("原件数（个）");
		labelofnumber.setBounds(162, 384, 100, 30);
		this.add(labelofnumber);
		labelofnumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,138,255)));
		
		JTextField textFieldofnumber = new JTextField();
		textFieldofnumber.setBounds(280, 384, 60, 30);
		this.add(textFieldofnumber);
		textFieldofnumber.setColumns(10);
		
		JLabel labelofweight = new JLabel();
		labelofweight.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofweight.setText("实际重量（kg）");
		labelofweight.setBounds(389, 384, 120, 30);
		this.add(labelofweight);
		labelofweight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,138,255)));
		
		JTextField textFieldofweight = new JTextField();
		textFieldofweight.setBounds(543, 384, 60, 30);
		this.add(textFieldofweight);
		textFieldofweight.setColumns(10);
		
		JLabel labelofsize = new JLabel();
		labelofsize.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofsize.setText("尺寸（长*宽*高）");
		labelofsize.setBounds(162, 417, 140, 30);
		this.add(labelofsize);
		labelofsize.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,138,255)));
		
		JTextField textFieldoflength = new JTextField();
		textFieldoflength.setBounds(316, 417, 34, 30);
		this.add(textFieldoflength);
		textFieldoflength.setColumns(10);
		
		JTextField textFieldofwidth = new JTextField();
		textFieldofwidth.setColumns(10);
		textFieldofwidth.setBounds(360, 417, 34, 30);
		this.add(textFieldofwidth);
		
		JTextField textFieldofheight = new JTextField();
		textFieldofheight.setColumns(10);
		textFieldofheight.setBounds(405, 417, 34, 30);
		this.add(textFieldofheight);
		
		JLabel labelofcargoname = new JLabel();
		labelofcargoname.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofcargoname.setText("内件品名");
		labelofcargoname.setBounds(162, 450, 80, 30);
		this.add(labelofcargoname);
		labelofcargoname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,138,255)));
		
		JTextField textFieldofcargoname = new JTextField();
		textFieldofcargoname.setBounds(280, 450, 60, 30);
		this.add(textFieldofcargoname);
		textFieldofcargoname.setColumns(10);
		
		JLabel labelofvolume = new JLabel();
		labelofvolume.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofvolume.setText("体积（L）");
		labelofvolume.setBounds(389, 450, 80, 30);
		this.add(labelofvolume);
		labelofvolume.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,138,255)));
		
		JTextField textFieldofvolume = new JTextField();
		textFieldofvolume.setBounds(543, 450, 60, 30);
		this.add(textFieldofvolume);
		textFieldofvolume.setColumns(10);
		
		JLabel labeloforderinfo = new JLabel();
		labeloforderinfo .setFont(new Font("微软雅黑",Font.BOLD,16));
		labeloforderinfo .setText("快递信息");
		labeloforderinfo.setBounds(60, 486, 100, 30);
		this.add(labeloforderinfo);
		labeloforderinfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,138,255)));
		
		JLabel labelofpackingexpense = new JLabel();
		labelofpackingexpense .setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofpackingexpense.setText("包装费");
		labelofpackingexpense.setBounds(162, 515, 60, 30);
		this.add(labelofpackingexpense);
		labelofpackingexpense.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,138,255)));
		
		JComboBox comboBoxofpackingexpense = new JComboBox();
		comboBoxofpackingexpense.setModel(new DefaultComboBoxModel(new String[] {"5", "10", "15"}));
		comboBoxofpackingexpense.setBounds(280, 515, 60, 30);
		this.add(comboBoxofpackingexpense);
		
		JLabel labelofordertype = new JLabel();
		labelofordertype.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofordertype.setText("快递类型");
		labelofordertype.setBounds(389, 515, 80, 30);
		this.add(labelofordertype);
		labelofordertype.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,138,255)));
		
		JComboBox comboBoxofordertype = new JComboBox();
		comboBoxofordertype.setModel(new DefaultComboBoxModel(new String[] {"\u5FEB", "\u7279\u5FEB"}));
		comboBoxofordertype.setToolTipText("\u5FEB");
		comboBoxofordertype.setBounds(543, 515, 60, 30);
		this.add(comboBoxofordertype);
		
		JLabel labelofkind = new JLabel();
		 labelofkind.setFont(new Font("微软雅黑",Font.BOLD,16));
		 labelofkind.setText("种类");
		labelofkind.setBounds(162, 550, 40, 30);
		this.add(labelofkind);
		labelofkind.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,138,255)));
		
		JTextField textFieldofkind = new JTextField();
		textFieldofkind.setBounds(220, 550, 60, 30);
		this.add(textFieldofkind);
		textFieldofkind.setColumns(10);
		
		JLabel labelofexpense = new JLabel();
		labelofexpense.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofexpense.setText("费用合计：");
		labelofexpense.setBounds(700, 486, 100, 30);
		this.add(labelofexpense);
		labelofexpense.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,138,255)));
		
		JLabel labeloftotalexpense = new JLabel("");
		labeloftotalexpense.setBounds(816, 486, 40, 30);
		this.add(labeloftotalexpense);
		labeloftotalexpense.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,138,255)));
		
		JButton buttonofack = new JButton("确认");
		buttonofack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				labeloftotalexpense.setText("100");
			}
		});
		buttonofack.setBounds(700, 530, 68, 30);
		this.add(buttonofack);
	}
}
