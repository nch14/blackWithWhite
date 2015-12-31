package bl.money.Service;

import java.util.ArrayList;

import bill.Account;

/**
 * 账户管理——对公司账户的增删改查
 * @author 倪辰皓
 *
 */
public interface AccountManageBLService {

	/**
	 * 增加账户
	 * @param accounts 账户
	 * @return
	 */
	public boolean adddAccount(ArrayList<Account> accounts);
	/**
	 * 删除账户
	 * @return
	 */
	public boolean delateAccount(String[] ID);
	
	/**
	 * @param name 账户名称
	 * @return
	 */
	public boolean changeAccountInfo(String[] ID, String[] name);
	
	/**
	 * 查找账户
	 * @param KeyWord_ID 账号或者账户关键字
	 * @return
	 */
	public ArrayList<Account> getAccount(String KeyWord_ID);
}
