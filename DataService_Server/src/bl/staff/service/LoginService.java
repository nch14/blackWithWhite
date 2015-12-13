package bl.staff.service;

import vo.StaffVO;

/**
 * 提供了登陆的功能
 * @author 倪辰皓
 *
 */
public interface LoginService {
	
	/**
	 * 检查用户输入的账号密码是否一致（有效）
	 * @param ID 账号
	 * @param passwords 密码
	 * @return 如果返回值为null，意味该用户不存在或密码错误。如果用户输入的ID和密码一致，将返回该人员的VO
	 */
	public StaffVO validUser(String ID,String passwords);

}
