package bl.money.Impl;

import java.util.ArrayList;

import bill.Account;
import bl.money.Service.AccountManageBLService;

public class AccountManageController implements AccountManageBLService {
	AccountManagement accoutManagement;
	
	public AccountManageController(){
		accoutManagement=new AccountManagement();
	}
	public boolean adddAccount(ArrayList<Account> accounts) {
		// TODO Auto-generated method stub
		int length=accounts.size();
		Account[] account=(Account[])accounts.toArray(new Account[length]);
		return accoutManagement.adddAccount(account);
	}

	@Override
	public boolean delateAccount(ArrayList<String> ID) {
		// TODO Auto-generated method stub
		int length=ID.size();
		String[] IDS=(String[])ID.toArray(new String[length]);
		return accoutManagement.delateAccount(IDS);
	}

	@Override
	public boolean changeAccountInfo(ArrayList<String> ID, ArrayList<String> name) {
		// TODO Auto-generated method stub
		int length=ID.size();
		String[] IDs=(String[])ID.toArray(new String[length]);
		length=name.size();
		String[] names=(String[])name.toArray(new String[length]);
		return accoutManagement.changeAccountInfo(IDs, names);
	}

	@Override
	public ArrayList<Account> getAccount(String KeyWord_ID) {
		// TODO Auto-generated method stub
		return accoutManagement.getAccount(KeyWord_ID);
	}


}
