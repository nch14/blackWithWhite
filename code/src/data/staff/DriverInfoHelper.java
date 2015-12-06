package data.staff;

import java.rmi.RemoteException;
import java.util.ArrayList;

import bill.DriverPO;
import remoteInterface.Client_Helper;

public interface DriverInfoHelper extends Client_Helper{
	public boolean insert(DriverPO po) throws RemoteException;
	
	public boolean delete(String id) throws RemoteException;
	
	public boolean change(DriverPO po) throws RemoteException;
	
	public DriverPO get(String id) throws RemoteException;
	
	public boolean init() throws RemoteException;
	
	public ArrayList<DriverPO> getAll(String str) throws RemoteException;
}
