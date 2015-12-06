package tools;

import java.util.ArrayList;

import bill.StaffPO;
import vo.StaffVO;

/**
 * 该类用于标记当前登陆对象的一些信息
 * @author 倪辰皓
 *
 */
public class DepartmentHelper {
	private static String thisDepartment;//存放当前操作的部门
	private static StaffVO staff;//存放当前登录的人的信息
	ArrayList<String> departments;//存放当前系统中的部门设置
	
	public DepartmentHelper(StaffVO staff){
		this.staff=staff;
	}
	
	public static StaffVO getStaff(){
		return staff;
	}
	
	public static String getDepartment(){
		return thisDepartment;
	}
}
