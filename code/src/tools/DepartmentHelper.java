package tools;

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
	public static StaffVO thisStaff;//存放当前登录的人的信息
	public static String pos;
	
	public DepartmentHelper(StaffVO staff){
		this.thisStaff=staff;
		thisDepartment=staff.department;
		pos=staff.pos;
		
	}
	
	public static StaffVO getStaff(){
		return thisStaff;
	}
	
	public static String getDepartment(){
		return thisDepartment;
	}


}
