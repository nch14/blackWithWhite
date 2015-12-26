package tools;

import settings.CompanySettingsController;
import vo.StaffVO;

/**
 * 该类用于标记当前登陆对象的一些信息
 * @author 倪辰皓
 *
 */
public class DepartmentHelper {
	/**
	 * 当前登录的用户所隶属的部门
	 */
	public static String thisDepartment;
	/**
	 * 当前登陆的用户所隶属的部门代号
	 */
 	public static String thisDepartmentID;
	public static StaffVO thisStaff;//存放当前登录的人的信息
	public static String pos;
	
	public DepartmentHelper(StaffVO staff){
		this.thisStaff=staff;
		thisDepartment=staff.department;
		pos=staff.pos;
		//this.thisDepartmentID=CompanySettingsController.DeapartmentSearch(thisDepartment);
		if(this.thisDepartmentID.equals("fail")){
			System.out.println("在登记此用户的部门信息时出错！！！该部门可能不存在");
		}
			
	}
	
	public static StaffVO getStaff(){
		return thisStaff;
	}
	
	public static String getDepartment(){
		return thisDepartment;
	}


}
