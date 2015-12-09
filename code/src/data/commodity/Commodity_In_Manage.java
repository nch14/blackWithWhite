package data.commodity;


import remoteInterface.Client_Helper;

import java.rmi.RemoteException;
import java.util.ArrayList;

import bill.StockBill_In;
public interface Commodity_In_Manage extends Client_Helper {
	/**
	 * 插入入库单,ID为中转中心编号
	 * @param bill
	 * @return 若空间不够，返回null
	 * @throws RemoteException
	 */
	public StockBill_In insert(StockBill_In bill,String ID) throws RemoteException;
	
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
	 * 初始化数据库
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
	public ArrayList<StockBill_In> getUnjudged() throws RemoteException;
}
