package commoditydata;
import java.rmi.*;

import remoteInterface.Client_Helper;
import bill.StockBill_In;
public interface Commodity_In_Manage extends Client_Helper {
	public boolean insert(StockBill_In bill) throws RemoteException;
	public boolean delete(String id) throws RemoteException;
	public boolean change(StockBill_In bill) throws RemoteException;
	public StockBill_In get(String id) throws RemoteException;
	public boolean init() throws RemoteException;
}
