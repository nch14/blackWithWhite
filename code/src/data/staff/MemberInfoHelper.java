package data.staff;

import java.rmi.RemoteException;

import bill.StaffPO;
import remoteInterface.Client_Helper;

public interface MemberInfoHelper extends Client_Helper {
	
	public boolean insert(StaffPO po) throws RemoteException;
	
	public boolean delete(String id)throws RemoteException;
	
	public boolean change(StaffPO po) throws RemoteException;
	
	public StaffPO get(String id) throws RemoteException;
	
	public boolean init() throws RemoteException;
}
