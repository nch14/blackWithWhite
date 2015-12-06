package data.staff;
import java.rmi.RemoteException;
import java.util.ArrayList;

import bill.TruckPO;
import remoteInterface.Client_Helper;

public interface BusInfoHelper extends Client_Helper {
	public boolean insert(TruckPO po) throws RemoteException;
	
	public boolean change(TruckPO po) throws RemoteException;
	
	public boolean delete(String id) throws RemoteException;
	
	public TruckPO get(String id) throws RemoteException;
	
	public boolean init() throws RemoteException;
	
	public ArrayList<TruckPO> getAll(String str) throws RemoteException;//Ä£ºýËÑË÷
}