package ui.informationui;

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
		labelofsenderinfo.setBounds(100, 70, 100, 30);
		this.add(labelofsenderinfo);
		
		JLabel labelofordernumber = new JLabel();
		labelofordernumber.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofordernumber.setText("订单条形码号");
		labelofordernumber.setBounds(675, 70, 180, 30);
		this.add(labelofordernumber);
		
		JTextField textFieldofordernumber = new JTextField();
		textFieldofordernumber.setColumns(10);
		textFieldofordernumber.setBounds(675, 100, 180, 30);
		this.add(textFieldofordernumber);
		
		JLabel labelofsendername = new JLabel();
		labelofsendername.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofsendername.setText("姓名");
		labelofsendername.setBounds(160, 240, 40, 30);
		this.add(labelofsendername);
		
		JTextField textFieldofsendername = new JTextField();
		textFieldofsendername.setBounds(200, 240, 60, 30);
		this.add(textFieldofsendername);
		/*textFieldofsendername.setColumns(10);*/

		JLabel labelofsenderphone = new JLabel();
		labelofsenderphone.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofsenderphone.setText("电话");
		labelofsenderphone.setBounds(300, 240, 54, 30);
		this.add(labelofsenderphone);
		
		JTextField textFieldofsenderphone = new JTextField();
		textFieldofsenderphone.setBounds(341, 98, 92, 21);
		this.add(textFieldofsenderphone);
		textFieldofsenderphone.setColumns(10);
		
		JLabel labelofsendermobile = new JLabel();
		labelofsendermobile.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofsendermobile.setText("手机");
		labelofsendermobile.setBounds(458, 101, 54, 15);
		this.add(labelofsendermobile);
		
		JTextField textFieldofsendermobile = new JTextField();
		textFieldofsendermobile.setBounds(493, 98, 83, 21);
		this.add(textFieldofsendermobile);
		textFieldofsendermobile.setColumns(10);
		
		JLabel labelofsenderunit = new JLabel();
		labelofsenderunit.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofsenderunit.setText("单位");
		labelofsenderunit.setBounds(162, 140, 54, 15);
		this.add(labelofsenderunit);
		
		JTextField textFieldofsenderunit = new JTextField();
		textFieldofsenderunit.setBounds(200, 137, 376, 21);
		this.add(textFieldofsenderunit);
		textFieldofsenderunit.setColumns(10);
		
		JLabel labelofsenderaddress = new JLabel();
		labelofsenderaddress.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofsenderaddress.setText("地址");
		labelofsenderaddress.setBounds(162, 183, 54, 15);
		this.add(labelofsenderaddress);
		
		JTextField textFieldofsenderaddress = new JTextField();
		textFieldofsenderaddress.setBounds(200, 180, 376, 21);
		this.add(textFieldofsenderaddress);
		textFieldofsenderaddress.setColumns(10);
		
		JLabel labelofconsigneeinfo = new JLabel();
		labelofconsigneeinfo.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofconsigneeinfo.setText("收件人信息");
		labelofconsigneeinfo.setBounds(99, 214, 68, 15);
		this.add(labelofconsigneeinfo);
		
		JLabel labelofconsigneename = new JLabel();
		labelofconsigneename.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofconsigneename.setText("姓名");
		labelofconsigneename.setBounds(162, 101, 54, 15);
		this.add(labelofconsigneename);
		
		JTextField textFieldofconsigneename = new JTextField();
		textFieldofconsigneename.setColumns(10);
		textFieldofconsigneename.setBounds(200, 240, 66, 21);
		this.add(textFieldofconsigneename);
		
		JLabel labelofconsigneephone = new JLabel();
		labelofconsigneephone.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofconsigneephone.setText("电话");
		labelofconsigneephone.setBounds(300, 243, 54, 15);
		this.add(labelofconsigneephone);
		
		JTextField textFieldofconsigneephone = new JTextField();
		textFieldofconsigneephone.setColumns(10);
		textFieldofconsigneephone.setBounds(341, 240, 92, 21);
		this.add(textFieldofconsigneephone);
		
		JLabel labelofconsigneemobile = new JLabel();
		labelofconsigneemobile.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofconsigneemobile.setText("手机");
		labelofconsigneemobile.setBounds(458, 243, 54, 15);
		this.add(labelofconsigneemobile);
		
		JTextField textFieldofconsigneemobile = new JTextField();
		textFieldofconsigneemobile.setColumns(10);
		textFieldofconsigneemobile.setBounds(493, 240, 83, 21);
		this.add(textFieldofconsigneemobile);
		
		JLabel labelofconsigneeunit = new JLabel();
		labelofconsigneeunit.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofconsigneeunit.setText("单位");
		labelofconsigneeunit.setBounds(162, 278, 54, 15);
		this.add(labelofconsigneeunit);
		
		JTextField textFieldofconsigneeunit = new JTextField();
		textFieldofconsigneeunit.setColumns(10);
		textFieldofconsigneeunit.setBounds(200, 275, 376, 21);
		this.add(textFieldofconsigneeunit);
		
		JTextField textFieldofconsigneeaddress = new JTextField();
		textFieldofconsigneeaddress.setColumns(10);
		textFieldofconsigneeaddress.setBounds(200, 318, 376, 21);
		this.add(textFieldofconsigneeaddress);
		
		JLabel labelofconsigneeaddress = new JLabel();
		labelofconsigneeaddress.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofconsigneeaddress.setText("地址");
		labelofconsigneeaddress.setBounds(162, 321, 54, 15);
		this.add(labelofconsigneeaddress);
		
		JLabel labelofcargoinfo = new JLabel();
		labelofcargoinfo.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofcargoinfo.setText("货物信息");
		labelofcargoinfo.setBounds(113, 355, 54, 15);
		this.add(labelofcargoinfo);
		
		JLabel labelofnumber = new JLabel();
		labelofnumber.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofnumber.setText("原件数（个）");
		labelofnumber.setBounds(162, 380, 83, 15);
		this.add(labelofnumber);
		
		JTextField textFieldofnumber = new JTextField();
		textFieldofnumber.setBounds(246, 377, 66, 21);
		this.add(textFieldofnumber);
		textFieldofnumber.setColumns(10);
		
		JLabel labelofweight = new JLabel();
		labelofweight.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofweight.setText("实际重量（kg）");
		labelofweight.setBounds(379, 380, 92, 15);
		this.add(labelofweight);
		
		JTextField textFieldofweight = new JTextField();
		textFieldofweight.setBounds(493, 377, 66, 21);
		this.add(textFieldofweight);
		textFieldofweight.setColumns(10);
		
		JLabel labelofsize = new JLabel();
		labelofsize.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofsize.setText("尺寸（长*宽*高）");
		labelofsize.setBounds(162, 413, 104, 15);
		this.add(labelofsize);
		
		JTextField textFieldoflength = new JTextField();
		textFieldoflength.setBounds(256, 410, 34, 21);
		this.add(textFieldoflength);
		textFieldoflength.setColumns(10);
		
		JTextField textFieldofwidth = new JTextField();
		textFieldofwidth.setColumns(10);
		textFieldofwidth.setBounds(300, 410, 34, 21);
		this.add(textFieldofwidth);
		
		JTextField textFieldofheight = new JTextField();
		textFieldofheight.setColumns(10);
		textFieldofheight.setBounds(345, 410, 34, 21);
		this.add(textFieldofheight);
		
		JLabel labelofcargoname = new JLabel();
		labelofcargoname.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofcargoname.setText("内件品名");
		labelofcargoname.setBounds(162, 447, 54, 15);
		this.add(labelofcargoname);
		
		JTextField textFieldofcargoname = new JTextField();
		textFieldofcargoname.setBounds(226, 444, 66, 21);
		this.add(textFieldofcargoname);
		textFieldofcargoname.setColumns(10);
		
		JLabel labelofvolume = new JLabel();
		labelofvolume.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofvolume.setText("体积（L）");
		labelofvolume.setBounds(379, 447, 68, 15);
		this.add(labelofvolume);
		
		JTextField textFieldofvolume = new JTextField();
		textFieldofvolume.setBounds(493, 444, 66, 21);
		this.add(textFieldofvolume);
		textFieldofvolume.setColumns(10);
		
		JLabel labeloforderinfo = new JLabel();
		labeloforderinfo .setFont(new Font("微软雅黑",Font.BOLD,16));
		labeloforderinfo .setText("快递信息");
		labeloforderinfo.setBounds(113, 486, 54, 15);
		this.add(labeloforderinfo);
		
		JLabel labelofpackingexpense = new JLabel();
		labelofpackingexpense .setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofpackingexpense.setText("包装费");
		labelofpackingexpense.setBounds(162, 511, 54, 15);
		this.add(labelofpackingexpense);
		
		JComboBox comboBoxofpackingexpense = new JComboBox();
		comboBoxofpackingexpense.setModel(new DefaultComboBoxModel(new String[] {"5", "10", "15"}));
		comboBoxofpackingexpense.setBounds(226, 508, 108, 21);
		this.add(comboBoxofpackingexpense);
		
		JLabel labelofordertype = new JLabel();
		labelofordertype.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofordertype.setText("快递类型");
		labelofordertype.setBounds(379, 511, 54, 15);
		this.add(labelofordertype);
		
		JComboBox comboBoxofordertype = new JComboBox();
		comboBoxofordertype.setModel(new DefaultComboBoxModel(new String[] {"\u5FEB", "\u7279\u5FEB"}));
		comboBoxofordertype.setToolTipText("\u5FEB");
		comboBoxofordertype.setBounds(493, 508, 66, 21);
		this.add(comboBoxofordertype);
		
		JLabel labelofkind = new JLabel();
		 labelofkind.setFont(new Font("微软雅黑",Font.BOLD,16));
		 labelofkind.setText("种类");
		labelofkind.setBounds(162, 546, 54, 15);
		this.add(labelofkind);
		
		JTextField textFieldofkind = new JTextField();
		textFieldofkind.setBounds(226, 543, 66, 21);
		this.add(textFieldofkind);
		textFieldofkind.setColumns(10);
		
		JLabel labelofexpense = new JLabel();
		labelofexpense.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofexpense.setText("费用合计：");
		labelofexpense.setBounds(654, 486, 68, 15);
		this.add(labelofexpense);
		
		JLabel labeloftotalexpense = new JLabel("");
		labeloftotalexpense.setBounds(738, 486, 54, 15);
		this.add(labeloftotalexpense);
		
		JButton buttonofack = new JButton("确认");
		buttonofack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				labeloftotalexpense.setText("100");
			}
		});
		buttonofack.setBounds(654, 507, 68, 23);
		this.add(buttonofack);
	}
}
