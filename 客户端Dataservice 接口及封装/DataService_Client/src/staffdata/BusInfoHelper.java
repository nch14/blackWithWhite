package staffdata;
import java.rmi.RemoteException;

import bill.TrunkPO;
import remoteInterface.Client_Helper;

public interface BusInfoHelper extends Client_Helper {
	public boolean insert(TrunkPO po) throws RemoteException;
	
	public boolean change(TrunkPO po) throws RemoteException;
	
	public boolean delete(String id) throws RemoteException;
	
	public TrunkPO get(String id) throws RemoteException;
	
	public boolean init() throws RemoteException;
}
