package moneydata;

import java.rmi.RemoteException;

import bill.PaymentBill;
import remoteInterface.Client_Helper;

public interface PayBillHelper extends Client_Helper {
	public boolean init() throws RemoteException;
	
	public boolean insert(PaymentBill bill) throws RemoteException;
	
	public boolean delete(String id) throws RemoteException;
	
	public boolean change(PaymentBill bill) throws RemoteException;
	
	public PaymentBill get(String id) throws RemoteException;
}
