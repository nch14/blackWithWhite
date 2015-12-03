package informationdata;

import java.rmi.RemoteException;
import java.util.ArrayList;

import bill.TransMesgPO;
import remoteInterface.Client_Helper;

public interface ShipmentInfoHelper extends Client_Helper {
	public ArrayList<TransMesgPO> getTransMesg(String id) throws RemoteException;
	public boolean refreshTransMesg(TransMesgPO po) throws RemoteException;
	public boolean init() throws RemoteException;
}
