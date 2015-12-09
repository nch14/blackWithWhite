package vo;

import bill.StaffPO;
import tools.TimeHelper;

public class StaffVO {
	public String name;
	public String department;//部门
	public String position;//职位
	public int age;
	public boolean isBoy;
	
	public String ID;
	public String passwords;
	public String SalaryModel;
	/**
	 * 是否拥有root权限，该属性仅对财务人员有意义，对于其他系统用户，没有root权限概念
	 * 拥有root权限的财务人员才可以进行账户管理
	 */
	public boolean root;
	/**
	 * 界面生成VO的构造方法
	 * @param name 
	 * @param age
	 * @param pos
	 * @param department
	 * @param isBoy
	 */
	public StaffVO(String name,String age,String pos,String department,boolean isBoy){
		this.name=name;
		this.age=Integer.parseInt(age);
		this.position=pos;
		this.department=department;
		this.isBoy=isBoy;
	}
	
	public StaffVO(StaffPO staffPO){
		name=staffPO.name;
		passwords=staffPO.passwords;
		department=staffPO.department;
		position=staffPO.pos;
		ID=staffPO.ID;
		isBoy=staffPO.sex;
		age=Integer.parseInt(TimeHelper.getTime().substring(0, 4))-staffPO.birthyear;
	}	
}
