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
<<<<<<< HEAD
	public String authority;
	public StaffVO(String ID1,String name1,String age1,String pos1,String department1){
		this.ID=ID1;
		this.name=name1;
		this.age=Integer.parseInt(age1);
		this.pos=pos1;
		this.department=department1;
=======
	public StaffVO(String name,String age,String pos,String department,boolean isBoy){
		this.name=name;
		this.age=Integer.parseInt(age);
		this.pos=pos;
		this.department=department;
		this.isBoy=isBoy;
>>>>>>> origin/master
	}
	
	public StaffVO(StaffPO staffPO){
		name=staffPO.name;
		passwords=staffPO.passwords;
		department=staffPO.department;
		pos=staffPO.pos;
		ID=staffPO.ID;
		isBoy=staffPO.sex;
		age=Integer.parseInt(TimeHelper.getTime().substring(0, 4))-staffPO.birthyear;
		authority=staffPO.authority;
/*		String year=staffPO.birthday.substring(0,4);
		String month=staffPO.birthday.substring(4,6);
		String day=staffPO.birthday.substring(6,8);
		
		Calendar cal=Calendar.getInstance();
		age=(int)(cal.get(Calendar.YEAR))-Integer.parseInt(year);
		//精确年龄
		if((cal.get(Calendar.MONTH)+1)<Integer.parseInt(month)){
			age-=1;
		}
		if(cal.get(Calendar.MONTH)==Integer.parseInt(month)&&
				cal.get(Calendar.DATE)<Integer.parseInt(day)){
			age-=1;
		}*/
	}
	
	public StaffVO(){
		
	}
	
	public void allocateID(){
		String time=TimeHelper.getTime();//年月日时分秒，共14位
		time=time.substring(2);
		
	}
}
