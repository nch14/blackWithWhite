package vo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import bill.StaffPO;
import tools.TimeHelper;

public class StaffVO {
	public String name;
	public String passwords;
	public String department;
	public String pos;
	public String ID;
	public int age;
	public String sex;
	public String SalaryModel;
	public StaffVO(StaffPO staffPO){
		name=staffPO.name;
		passwords=staffPO.passwords;
		department=staffPO.department;
		pos=staffPO.pos;
		ID=staffPO.ID;
		sex=staffPO.sex;
		age=Integer.parseInt(TimeHelper.getTime().substring(0, 4))-staffPO.birthyear;
/*		String year=staffPO.birthday.substring(0,4);
		String month=staffPO.birthday.substring(4,6);
		String day=staffPO.birthday.substring(6,8);
		
		Calendar cal=Calendar.getInstance();
		age=(int)(cal.get(Calendar.YEAR))-Integer.parseInt(year);
		//¾«È·ÄêÁä
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
}
