package data.shipment;

import remoteInterface.Client_Helper;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.bills.ArrivementBill_Center;

public interface Arrive_CenterHelper extends Client_Helper {
	public boolean insert(ArrivementBill_Center bill) throws RemoteException;
	
	public boolean delete(String id) throws RemoteException;
	
	public boolean change(ArrivementBill_Center bill) throws RemoteException;
	
	public ArrivementBill_Center get(String id) throws RemoteException;
	
	public boolean init() throws RemoteException;
	
	public ArrayList<ArrivementBill_Center> getUnjudged() throws RemoteException;
}
