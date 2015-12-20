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
	private static String thisDepartment;
	/**
	 * 当前登陆的用户所隶属的部门代号
	 */
	private static String thisDepartmentID;
	private static StaffVO staff;//存放当前登录的人的信息

	
	public DepartmentHelper(StaffVO staff){
		this.staff=staff;
		thisDepartment=staff.department;
	}
	
	public static StaffVO getStaff(){
		return staff;
	}
	
	public static String getDepartment(){
		return thisDepartment;
	}
}
