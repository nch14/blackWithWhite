package data.money;

import remoteInterface.Client_Helper;

import java.rmi.RemoteException;

import bill.Account;

public interface AccountManageHelper extends Client_Helper {
	public boolean init() throws RemoteException;
	
	public boolean insert(Account account) throws RemoteException;
	
	public boolean delete(String id) throws RemoteException;
	
	public boolean change(Account account) throws RemoteException;
	
	public Account get(String id) throws RemoteException;
}
