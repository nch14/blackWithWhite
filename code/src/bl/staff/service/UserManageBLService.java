package bl.staff.service;

import java.util.ArrayList;

import vo.StaffVO;

/**
 * 管理员的用户管理
 * @author 倪辰皓
 *
 */
public interface UserManageBLService {

	/**
	 * 根据ID返回该对象
	 * @return
	 */
	public StaffVO getStaff(String ID);
	
	
	
	/**
	 * 更改用户的信息
	 */
	public boolean changeStaffInfo(String competence, String passwords, String age, String name,String ID,String power);
	
	/**
	 * 显示所有员工或者模糊搜索所有员工
	 * src=""时，显示所有员工
	 * @return
	 */
	public ArrayList<StaffVO> getAllStaff (String src);
}
