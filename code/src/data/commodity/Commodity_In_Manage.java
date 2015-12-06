package data.commodity;
import java.rmi.*;

import remoteInterface.Client_Helper;
import bill.StockBill_In;
public interface Commodity_In_Manage extends Client_Helper {
	/**
	 * 插入一个入库单
	 * @param bill
	 * @return 
	 * @throws RemoteException
	 */
	public boolean insert(StockBill_In bill) throws RemoteException;
	
	/**
	 * 删除一个入库单
	 * @param bill
	 * @return 
	 * @throws RemoteException
	 */
	public boolean delete(String id) throws RemoteException;
	
	/**
	 * 修改一个入库单
	 * @param bill
	 * @return 
	 * @throws RemoteException
	 */
	public boolean change(StockBill_In bill) throws RemoteException;
	
	/**
	 * 取得一个入库单
	 * @param bill
	 * @return 
	 * @throws RemoteException
	 */
	public StockBill_In get(String id) throws RemoteException;
	
	/**
	 * 初始化库区
	 * @param bill
	 * @return 
	 * @throws RemoteException
	 */
	public boolean init() throws RemoteException;
	
	/**
	 * 分配库存位置，输入为货物运输类型，飞机，火车，汽车，分别为"plane","train","bus"
	 * @param bill
	 * @return 
	 * @throws RemoteException
	 */
	public String[] getPosition(String str) throws RemoteException;
}
