package bl.staff.service;
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
	 * @return
	 */
	public boolean validUser(String ID,String passwords);

}
