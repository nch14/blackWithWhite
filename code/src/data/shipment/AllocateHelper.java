package data.shipment;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.bills.AllocateBill;
import remoteInterface.Client_Helper;

public interface AllocateHelper extends Client_Helper {
	public boolean insert(AllocateBill bill) throws RemoteException;
	public boolean delete(String id) throws RemoteException;
	public boolean change(AllocateBill bill) throws RemoteException;
	public AllocateBill get(String id) throws RemoteException;
	public boolean init() throws RemoteException;
	public ArrayList<AllocateBill> getUnjudged() throws RemoteException;
}
