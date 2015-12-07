package data.money;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import bill.Account;
import data.Iphelper.Iphelper;

public class AccountManage implements AccountManageHelper{
	boolean result;
	Account acc;
	
	private String getURL() throws FileNotFoundException, ClassNotFoundException, IOException{
		String s="rmi://"+Iphelper.getIP()+":34000/accountmanagehelper";
		return s;
	}
	
	public boolean init(){
		try {
			AccountManageHelper x=(AccountManageHelper) Naming.lookup(getURL());
			result=x.init();
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean insert(Account account){
		try {
			AccountManageHelper x=(AccountManageHelper) Naming.lookup(getURL());
			result=x.insert(account);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean delete(String id){
		try {
			AccountManageHelper x=(AccountManageHelper) Naming.lookup(getURL());
			result=x.delete(id);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean change(Account account){
		try {
			AccountManageHelper x=(AccountManageHelper) Naming.lookup(getURL());
			result=x.change(account);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public Account get(String id){
		try {
			AccountManageHelper x=(AccountManageHelper) Naming.lookup(getURL());
			acc=x.get(id);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return acc;
	}

	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Account> getAll(String id) throws RemoteException {
		// TODO Auto-generated method stub
		ArrayList<Account> array = null;
		try {
			AccountManageHelper x=(AccountManageHelper) Naming.lookup(getURL());
			array=x.getAll(id);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return array;
	}

	
}
