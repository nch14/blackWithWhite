package data.shipment;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.bills.TransportBill_Plane;
import remoteInterface.Client_Helper;

public interface PlaneShipmentHelper extends Client_Helper{
	public boolean insert(TransportBill_Plane bill) throws RemoteException;
	
	public TransportBill_Plane get(String id) throws RemoteException;
	
	public boolean change(TransportBill_Plane bill) throws RemoteException;
	
	public boolean delete(String id) throws RemoteException;
	
	public boolean init() throws RemoteException;
	
	public ArrayList<TransportBill_Plane> getUnjudged() throws RemoteException;
}
