package ui.commodityui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import bl.commoditybl.Impl.InitDepotAreaController;
import bl.commoditybl.Service.InitDepotAreaBLService;
import tools.DepartmentHelper;
import ui.NSwing.NButton;
import ui.NSwing.NLabel;
import ui.NSwing.NTable;
import ui.NSwing.NTextField;
import ui.NSwing.TimePanel;

public class InitDepotPanel extends JPanel{
	NLabel labelofairarea;
	NLabel labeloftrainarea;
	NLabel labeloftruckarea;
	NLabel labelofmanoeuveringarea;
	private NTextField textFieldofairrownumber_1;
	private NTextField textFieldoftrainrownumber_1;
	private NTextField textFieldoftruckrownumber_1;
	private NTextField textFieldofmanoeuveringrownumber_1;
	private NTextField textFieldofairrownumber_2;
	private NTextField textFieldoftrainrownumber_2;
	private NTextField textFieldoftrucknumber_2;
	private NTextField textFieldofmanoeuveringrownumber_2;
	
	public InitDepotPanel(){
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
		
		NLabel labelofairarea = new NLabel("航运区");
		labelofairarea.setBounds(300, 90, 60, 30);
		this.add(labelofairarea);
		
		NLabel labeloftrainarea = new NLabel("铁运区");
		labeloftrainarea.setBounds(300, 140, 60, 30);
		this.add(labeloftrainarea);
		
		NLabel labeloftruckarea = new NLabel("汽运区");
		labeloftruckarea.setBounds(300, 190, 60, 30);
		this.add(labeloftruckarea);
		
		labelofmanoeuveringarea = new NLabel("机动区");
		labelofmanoeuveringarea.setBounds(300, 240, 60, 30);
		this.add(labelofmanoeuveringarea);
		
		textFieldofairrownumber_1 = new NTextField();
		textFieldofairrownumber_1.setBounds(380, 90, 60, 30);
		this.add(textFieldofairrownumber_1);
		textFieldofairrownumber_1.setColumns(10);
		
		textFieldoftrainrownumber_1 = new NTextField();
		textFieldoftrainrownumber_1.setBounds(380, 140, 60, 30);
		this.add(textFieldoftrainrownumber_1);
		textFieldoftrainrownumber_1.setColumns(10);
		
		textFieldoftruckrownumber_1 = new NTextField();
		textFieldoftruckrownumber_1.setBounds(380, 190, 60, 30);
		this.add(textFieldoftruckrownumber_1);
		textFieldoftruckrownumber_1.setColumns(10);
		
		textFieldofmanoeuveringrownumber_1 = new NTextField();
		textFieldofmanoeuveringrownumber_1.setBounds(380, 240, 60, 30);
		this.add(textFieldofmanoeuveringrownumber_1);
		textFieldofmanoeuveringrownumber_1.setColumns(10);

		NLabel labelofairrownumber_1 = new NLabel("排 到");
		labelofairrownumber_1.setBounds(460, 90, 60, 30);
		this.add(labelofairrownumber_1);
		
		NLabel labeloftrainrownumber_1 = new NLabel("排 到");
		labeloftrainrownumber_1.setBounds(460, 140, 60, 30);
		this.add(labeloftrainrownumber_1);
		
		NLabel labeloftruckrownumber_1 = new NLabel("排 到");
		labeloftruckrownumber_1.setBounds(460, 190, 60, 30);
		this.add(labeloftruckrownumber_1);
		
		NLabel labelofmanoeuveringrownumber_1 = new NLabel("排 到");
		labelofmanoeuveringrownumber_1.setBounds(460, 240, 60, 30);
		this.add(labelofmanoeuveringrownumber_1);
		
		textFieldofairrownumber_2 = new NTextField();
		textFieldofairrownumber_2.setBounds(540, 90, 60, 30);
		this.add(textFieldofairrownumber_2);
		textFieldofairrownumber_2.setColumns(10);
		
		textFieldoftrainrownumber_2 = new NTextField();
		textFieldoftrainrownumber_2.setColumns(10);
		textFieldoftrainrownumber_2.setBounds(540, 140, 60, 30);
		this.add(textFieldoftrainrownumber_2);
		
		textFieldoftrucknumber_2 = new NTextField();
		textFieldoftrucknumber_2.setColumns(10);
		textFieldoftrucknumber_2.setBounds(540, 190, 60, 30);
		this.add(textFieldoftrucknumber_2);
		
		textFieldofmanoeuveringrownumber_2 = new NTextField();
		textFieldofmanoeuveringrownumber_2.setColumns(10);
		textFieldofmanoeuveringrownumber_2.setBounds(540, 240, 60, 30);
		this.add(textFieldofmanoeuveringrownumber_2);
		
		NLabel labelofairrownumber_2 = new NLabel("排");
		labelofairrownumber_2.setBounds(620, 90, 60, 30);
		this.add(labelofairrownumber_2);
		
		NLabel labeloftrainrownumber_2 = new NLabel("排");
		labeloftrainrownumber_2.setBounds(620, 140, 60, 30);
		this.add(labeloftrainrownumber_2);
		
		NLabel labeloftruckrownumber_2 = new NLabel("排");
		labeloftruckrownumber_2.setBounds(620, 190, 60, 30);
		this.add(labeloftruckrownumber_2);
		
		NLabel labelofmanoeuveringrownumber_2 = new NLabel("排");
		labelofmanoeuveringrownumber_2.setBounds(620, 240, 60, 30);
		this.add(labelofmanoeuveringrownumber_2);
		
		NButton buttonofsubmit = new NButton("ok");
		buttonofsubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				InitDepotAreaBLService initdepotarea = new InitDepotAreaController();
				int n1=Integer.parseInt(textFieldofairrownumber_1.getText());
				int n2=Integer.parseInt(textFieldofairrownumber_2.getText());
				int n3=Integer.parseInt(textFieldoftrainrownumber_1.getText());
				int n4=Integer.parseInt(textFieldoftrainrownumber_2.getText());
				int n5=Integer.parseInt(textFieldoftruckrownumber_1.getText());
				int n6=Integer.parseInt(textFieldoftrucknumber_2.getText());
				int n7=Integer.parseInt(textFieldofmanoeuveringrownumber_1.getText());
				int n8=Integer.parseInt(textFieldofmanoeuveringrownumber_2.getText());
				int[] a1=new int[n2-n1+1];
				for(int i=0;i<a1.length;i++){
					a1[i]=n1+i;
				}
				int[] a2=new int[n4-n3+1];
				for(int i=0;i<a2.length;i++){
					a2[i]=n3+i;
				}
				int[] a3=new int[n6-n5+1];
				for(int i=0;i<a3.length;i++){
					a3[i]=n5+i;
				}
				int[] a4=new int[n8-n7+1];
				for(int i=0;i<a4.length;i++){
					a4[i]=n7+i;
				}
				 boolean istrue=initdepotarea.init(DepartmentHelper.getDepartment(),a3, a2, a1, a4);
				if(istrue==false){
					TimePanel.makeWords("提交失败！");
				}else{
					TimePanel.makeWords("提交成功！");
				}
			}
		});
		buttonofsubmit.setBounds(640, 450, 40, 40);
		this.add(buttonofsubmit);
		
		repaint();
	}
	
	

}
