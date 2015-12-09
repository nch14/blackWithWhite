package data.shipment;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.bills.BusShipmentBill_Shop;
import remoteInterface.Client_Helper;

public interface BusTransBill_ShopHelper extends Client_Helper{
	public boolean insert(BusShipmentBill_Shop bill) throws RemoteException;
	
	public BusShipmentBill_Shop get(String id) throws RemoteException;
	
	public boolean change(BusShipmentBill_Shop bill) throws RemoteException;
	
	public boolean delete(String id) throws RemoteException;
	
	public boolean init() throws RemoteException;
	
	public ArrayList<BusShipmentBill_Shop> getUnjudged() throws RemoteException;
}

