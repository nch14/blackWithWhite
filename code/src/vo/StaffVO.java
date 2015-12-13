package vo;

import bill.StaffPO;
import tools.TimeHelper;

public class StaffVO {
	public String name;
	public String passwords;
	public String department;//部门
	public String pos;//职位
	public String ID;
	public int age;
	public boolean isBoy;
	public String SalaryModel;
	boolean topAuthority;

	public StaffVO(String name,String age,String pos,String department,boolean isBoy){
		this.name=name;
		this.age=Integer.parseInt(age);
		this.pos=pos;
		this.department=department;
		this.isBoy=isBoy;

	}
	
	public StaffVO(StaffPO staffPO){
		name=staffPO.name;
		passwords=staffPO.passwords;
		department=staffPO.department;
		pos=staffPO.pos;
		ID=staffPO.ID;
		isBoy=staffPO.sex;
		age=Integer.parseInt(TimeHelper.getTime().substring(0, 4))-staffPO.birthyear;
		topAuthority=staffPO.authority;

	}
	
	public StaffVO(){
		
	}
	
	public void allocateID(){
		String time=TimeHelper.getTime();//年月日时分秒，共14位
		time=time.substring(2);
		
	}
}
