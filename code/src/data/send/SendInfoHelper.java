package data.send;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.bills.OrderBillPO;
import remoteInterface.Client_Helper;

public interface SendInfoHelper extends Client_Helper {
	public OrderBillPO getSendMesg(String id) throws RemoteException;
	
	public boolean getInput(OrderBillPO bill) throws RemoteException;
	
	public boolean init() throws RemoteException;
	
	public ArrayList<OrderBillPO> getUnjudged() throws RemoteException;
}
