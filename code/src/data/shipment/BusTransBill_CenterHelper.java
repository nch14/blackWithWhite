package data.shipment;

import java.rmi.RemoteException;

import bill.BusShipmentBill_Center;
import remoteInterface.Client_Helper;

public interface BusTransBill_CenterHelper extends Client_Helper {
	
	public boolean insert(BusShipmentBill_Center bill) throws RemoteException;
	
	public BusShipmentBill_Center get(String id) throws RemoteException;
	
	public boolean change(BusShipmentBill_Center bill) throws RemoteException;
	
	public boolean delete(String id) throws RemoteException;
	
	public boolean init() throws RemoteException;
}
