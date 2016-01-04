package moneydata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Dataservice.FileHelper;
import bill.Account;
import data.money.AccountManageHelper;

public class AccountManageImpl extends UnicastRemoteObject implements AccountManageHelper {
	public static ArrayList<Account> array;
	public static boolean ready=false;
	public static String dir="ser/Account.ser";
	protected AccountManageImpl() throws FileNotFoundException, ClassNotFoundException, IOException {
		super();
		if(!ready){
			ready=true;
			array=(ArrayList<Account>) FileHelper.read(dir);
		}
	}
	
	public static void save() throws FileNotFoundException, IOException{
		FileHelper.write(dir, array);
	}

	@Override
	public boolean init() {
		// TODO Auto-generated method stub
		array=new ArrayList<Account>();
		return true;
	}

	@Override
	public synchronized boolean insert(Account account) {
		// TODO Auto-generated method stub
		boolean bool=array.add(account);
		try {
			save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bool;
	}

	@Override
	public synchronized boolean delete(String id) {
		// TODO Auto-generated method stub
		boolean bool=false;
		for(Account a:array){
			if(a.getID().equals(id)){
				array.remove(a);
				bool=true;
				break;
			}			
		}
		try {
			save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bool;
	}

	@Override
	public synchronized boolean change(Account account) {
		// TODO Auto-generated method stub
		boolean bool=false;
		for(Account a:array){
			if(a.getID().equals(account.getID())){
				array.remove(a);
				array.add(account);
				bool=true;
				break;
			}
		}
		try {
			save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bool;
	}

	@Override
	public Account get(String id) {
		// TODO Auto-generated method stub
		for(Account a:array){
			if(a.getID().equals(id)){
				return a;
			}
		}
		return null;
	}

	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public ArrayList<Account> getAll(String id) throws RemoteException {
		// TODO Auto-generated method stub
		ArrayList<Account> temp=new ArrayList<Account>();
		for(Account a:array){
			if(a.name.contains(id))
				temp.add(a);
		}
		return temp;
	}

}
