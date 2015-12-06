package bl.money.Impl;

import bill.Account;
import data.money.AccountManage;
/**
 * 公司银行账户的账户管理领域对象
 * @author 倪辰皓
 *
 */
public class AccountManagement {
	/*ArrayList<Account> accounts;*/
	AccountManage accountManage;
	
	public AccountManagement(){
		accountManage=new AccountManage();
	}
	public boolean adddAccount(Account[] accounts) {
		try {
			for(int i=0;i<accounts.length;i++){
				accountManage.insert(accounts[i]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("增加账户出错");
			return false;
		}
		return true;
	}

	public boolean delateAccount(String[] ID) {
		try {
			for(int i=0;i<ID.length;i++){
				accountManage.delete(ID[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("删除账户出错");
			return false;
		}
		return true;
	}


	public boolean changeAccountInfo(String[] ID, String[] name) {
		// TODO Auto-generated method stub
		try {
			Account account;
			for(int i=0;i<ID.length;i++){
				account=accountManage.get(ID[i]);
				account.name=name[i];
				accountManage.delete(ID[i]);
				accountManage.insert(account);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("修改账户出错");
			return false;
		}
		return true;
	}


	public Account[] getAccount(String KeyWord_ID) {
		
		return null;
	}
}