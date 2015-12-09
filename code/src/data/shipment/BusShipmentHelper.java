package data.shipment;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.bills.TransportBill_Truck;
import remoteInterface.Client_Helper;

public interface BusShipmentHelper extends Client_Helper {
	public boolean insert(TransportBill_Truck bill) throws RemoteException;
	
	public TransportBill_Truck get(String id) throws RemoteException;
	
	public boolean change(TransportBill_Truck bill) throws RemoteException;
	
	public boolean delete(String id) throws RemoteException;
	
	public boolean init() throws RemoteException;
	
	public ArrayList<TransportBill_Truck> getUnjudged() throws RemoteException;
}
