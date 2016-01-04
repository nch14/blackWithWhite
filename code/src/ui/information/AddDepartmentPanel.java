package ui.information;

import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JPanel;

import settings.City;
import settings.CompanySettingsController;
import ui.NSwing.NLabel;
import ui.NSwing.NTextField;

public class AddDepartmentPanel extends JPanel{
	NLabel chooseType;
	JComboBox<String> chooseType1;
	NLabel addCityName;
	NTextField addCityName1;
	NLabel addCityCode;
	NTextField addCityCode1;
	NLabel[] addCityDistance;
	NTextField[] addCityDistance1;
	public AddDepartmentPanel(){
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
		
		chooseType=new NLabel("请选择新增类型");
		chooseType.setBounds(120, 50, 140, 30);
		this.add(chooseType);
		
		chooseType1=new JComboBox<String>();
		chooseType1.addItem("城市");
		chooseType1.addItem("中转中心");
		chooseType1.addItem("营业厅");
		chooseType1.setBounds(300, 50, 100, 30);
		this.add(chooseType1);
		
		addCityName=new NLabel("城市名称");
		addCityName.setBounds(120, 110, 140, 30);
		this.add(addCityName);
		
		addCityName1=new NTextField();
		addCityName1.setBounds(300, 110, 100, 30);
		this.add(addCityName1);
		
		addCityCode=new NLabel("城市代号");
		addCityCode.setBounds(500, 110, 140, 30);
		this.add(addCityCode);
		
		addCityCode1=new NTextField();
		addCityCode1.setBounds(660, 110, 100, 30);
		this.add(addCityCode1);
		
		CompanySettingsController csc=new CompanySettingsController();
		ArrayList<City> citys=csc.ourCompany.citys;
		int size=citys.size();
		
		int a1=120;
		int a2=170;
		int b1=60;
		int b2=30;
		int c1=40;
		int c2=30;
		
		int d1=10;
		int d2=50;
		addCityDistance=new NLabel[size];
		addCityDistance1=new NTextField[size];
		for(int i=0;i<size;i++){
			addCityDistance[i]=new NLabel(citys.get(i).name);
			addCityDistance[i].setBounds(a1, a2, b1, b2);
			this.add(addCityDistance[i]);
			a1+=b1+d1;
			
			addCityDistance1[i]=new NTextField();
			addCityDistance1[i].setBounds(a1, a2, d2, b2);
			this.add(addCityDistance1[i]);
			a1+=c1+d2;
			
			if(a1>800){
				a1=120;
				a2=a2+c2;
			}
		}
	}
}
