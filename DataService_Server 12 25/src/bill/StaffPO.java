package bill;
import java.io.Serializable;

import tools.TimeHelper;
import vo.StaffVO;
public class StaffPO implements Serializable{
	/**
	 * 员工信息
	 */
	private static final long serialVersionUID = 3264604823154715722L;
	public String name;
	public String passwords;
	public String department;
	public String pos;
	public String ID;
	public int birthyear;
	public boolean sex;
	public String SalaryModel;
	public String authority;
 
	public StaffPO(StaffVO staff){
		this.name=staff.name;
		this.passwords=staff.passwords;
		this.department=staff.department;
		this.pos=staff.pos;
		this.ID=staff.ID;
		this.birthyear=Integer.parseInt(TimeHelper.getTime().substring(0, 4))-staff.age;
		this.sex=staff.isBoy;
	}
	
	public void changePosition(String newPosition,String newDepartment){
		this.pos=newPosition;
		this.department=newDepartment;
	}
	
	public void changeStaffInfo(String name, int age, String authority, String password){
		this.name=name;
		this.birthyear=Integer.parseInt(TimeHelper.getTime().substring(0, 4))-age;
		this.authority=authority;
	}
	
	public StaffPO(){}
}
