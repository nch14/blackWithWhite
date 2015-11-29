package shipmentdata;

import java.rmi.RemoteException;

import bill.TransportBill_Plane;
import bill.TransportBill_Train;
import remoteInterface.Client_Helper;

public interface TrainShipmentHelper extends Client_Helper{
	public boolean insert(TransportBill_Train bill) throws RemoteException;
	
	public TransportBill_Train get(String id) throws RemoteException;
	
	public boolean change(TransportBill_Train bill) throws RemoteException;
	
	public boolean delete(String id) throws RemoteException;
	
	public boolean init() throws RemoteException;
}
