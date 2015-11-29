package commoditydata;

import java.rmi.RemoteException;

import bill.StockBlockInfo;
import bill.StockFillmentInfo;
import remoteInterface.Client_Helper;

public interface CommodityManage extends Client_Helper{
	public boolean adjustCommodity(StockBlockInfo info) throws RemoteException;
	public boolean init() throws RemoteException;
	public StockFillmentInfo checkCommodity() throws RemoteException;
}
