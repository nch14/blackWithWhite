package bl.money.Impl;

import java.util.ArrayList;

import bill.Account;
import bl.money.Service.AccountManageBLService;

public class AccountManageController implements AccountManageBLService {
	AccountManagement accoutManagement;
	
	public AccountManageController(){
		accoutManagement=new AccountManagement();
	}
	public boolean adddAccount(Account[] accounts) {
		// TODO Auto-generated method stub
		return accoutManagement.adddAccount(accounts);
	}

	@Override
	public boolean delateAccount(String[] ID) {
		// TODO Auto-generated method stub
		return accoutManagement.delateAccount(ID);
	}

	@Override
	public boolean changeAccountInfo(String[] ID, String[] name) {
		// TODO Auto-generated method stub
		return accoutManagement.changeAccountInfo(ID, name);
	}

	@Override
	public ArrayList<Account> getAccount(String KeyWord_ID) {
		// TODO Auto-generated method stub
		return accoutManagement.getAccount(KeyWord_ID);
	}

}
