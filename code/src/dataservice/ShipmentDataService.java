package dataservice;

public interface ShipmentDataService {

/*
 * 根据ID查找装车单
 */
	public ShipmentBillPO findTruck(long id) throws RemoteException;
	
/*
 * 在数据库中增加一个装车单
 */
	public void insertTruck(ShipmentBillPO po) throws RemoteException;
	
/*
 * 在数据库中删除一个装车单
 */
	public void deleteTruck(ShipmentBillPO po) throws RemoteException;
	
/*
 * 在数据库中更新一个装车单
 */
	public void updateTruck(ShipmentBillPO po) throws RemoteException;
	
/*
 * 结束对数据库的使用
 */
	public void finishTruck() throws RemoteException;
	
/*
 * 根据ID查找中转单
 */
	public ShipmentBillPO findFreight(long id) throws RemoteException;
	
/*
 * 在数据库中增加一个中转单
 */
	public void insertFreight(ShipmentBillPO po) throws RemoteException;
	
/*
 * 在数据库中删除一个中转单
 */
	public void deleteFreight(ShipmentBillPO po) throws RemoteException;
	
/*
 * 在数据库中更新一个中转单
 */
	public void updateFreight(ShipmentBillPO po) throws RemoteException;
	
/*
 * 结束对数据库的使用
 */
	ublic void finishFreight() throws RemoteException;
	
/*
 * 根据ID查找中转接受单
 */
	public ShipmentBillPO findReceive(long id) throws RemoteException;
	
/*
 * 在数据库中增加一个中转接受单
 */
	public void insertReceive(ShipmentBillPO po) throws RemoteException;
	
/*
 * 在数据库中删除一个中转接受单
 */
	public void deleteReceive(ShipmentBillPO po) throws RemoteException;
	
/*
 * 在数据库中更新一个中转接受单
 */
	public void updateReceive(ShipmentBillPO po) throws RemoteException;
	
/*
 * 结束对数据库的使用
 */
	public void finishReceive() throws RemoteException;
	
/*
 * 得到单据ID
 */
	public String getID();
	
/*
 * 返回所有库存单据的数据
 */
	public ArrayList<ShipmentBillPO> show();


}
