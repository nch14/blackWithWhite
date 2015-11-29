package shipmentdata;
import java.rmi.RemoteException;

import bill.TransportBill_Bus;
import remoteInterface.Client_Helper;

public interface BusShipmentHelper extends Client_Helper {
	public boolean insert(TransportBill_Bus bill) throws RemoteException;
	
	public TransportBill_Bus get(String id) throws RemoteException;
	
	public boolean change(TransportBill_Bus bill) throws RemoteException;
	
	public boolean delete(String id) throws RemoteException;
	
	public boolean init() throws RemoteException;
}
