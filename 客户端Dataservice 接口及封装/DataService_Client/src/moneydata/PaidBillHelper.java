package moneydata;

import java.rmi.RemoteException;

import bill.ReceiveMoneyBill;
import remoteInterface.Client_Helper;

public interface PaidBillHelper extends Client_Helper{
	public boolean init() throws RemoteException;
	
	public boolean insert(ReceiveMoneyBill bill) throws RemoteException;
	
	public boolean delete(String id) throws RemoteException;
	
	public ReceiveMoneyBill get(String id) throws RemoteException;
}
