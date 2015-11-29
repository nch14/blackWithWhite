package informationdata;

import java.rmi.RemoteException;

import bill.TransMesgPO;
import remoteInterface.Client_Helper;

public interface ShipmentInfoHelper extends Client_Helper {
	public TransMesgPO getTransMesg(String id) throws RemoteException;
	public boolean refreshTransMesg(String id,String position,String time) throws RemoteException;
	public boolean init() throws RemoteException;
}
