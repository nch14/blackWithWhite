package bl.staff.service;

import po.StaffPO;
import vo.StaffVO;

public interface UserManageService {
	
	
	
	/**
	 * 根据ID返回该对象
	 * @return
	 */
	public StaffVO getStaff(String ID);
	
	
	
	/**
	 * 更改用户的信息
	 */
	public boolean changeStaff(String competence,String passwords,String age,String name);
}
