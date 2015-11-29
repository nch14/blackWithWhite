package receivementdata;

import java.rmi.RemoteException;

import bill.ReceiveBill;
import remoteInterface.Client_Helper;

public interface ReceiceInfoHelper extends Client_Helper {
	public ReceiveBill get(String id) throws RemoteException;
	public boolean insert(ReceiveBill bill) throws RemoteException;
	public boolean delete(String id) throws RemoteException;
	public boolean update(String id) throws RemoteException;
	public boolean init() throws RemoteException;
}
