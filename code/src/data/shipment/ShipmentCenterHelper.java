package data.shipment;

import java.rmi.RemoteException;
import java.util.ArrayList;

import bill.TransportBill;
import remoteInterface.Client_Helper;

public interface ShipmentCenterHelper extends Client_Helper{
public boolean insert(TransportBill bill) throws RemoteException;
	
	public TransportBill get(String id) throws RemoteException;
	
	public boolean change(TransportBill bill) throws RemoteException;
	
	public boolean delete(String id) throws RemoteException;
	
	public boolean init() throws RemoteException;
	
	public ArrayList<TransportBill> getUnjudged() throws RemoteException;
}
