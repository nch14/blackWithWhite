package dataservice;

import po.OrderBillPO;

public interface JudgementDataService {
	
/*
 * g根据ID查找订单
 */
	public OrderBillPO find(long id) throws RemoteException;
	
/*
 * 更新一个订单
 */
	public void update(OrderBillPO po) throws RemoteException;
	
/*
 * 结束持久化数据库的使用
 */
	public void finish() throws RemoteException;
	
/*
 * 得到订单ID
 */
	public string getID();
	
/*
 * 返回所有库存单据的数据
 */
	public ArrayList<OrderBillPO> show();

}
