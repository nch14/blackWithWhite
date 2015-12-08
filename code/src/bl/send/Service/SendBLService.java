package bl.send.Service;

import java.util.ArrayList;

import bill.OrderBillPO;

public interface SendBLService {
	
	/**
	 * 创建寄件单,并且更新物流信息
	 * @param order
	 * @return
	 */
	public boolean push(OrderBillPO order);
	
	/**
	 * 查看寄件单信息
	 * @param id
	 * @return
	 */
	public OrderBillPO inquireSendMesg(String id);
	/**
	 * 获得未审批订单
	 * @return
	 */
	public ArrayList<OrderBillPO> getUnmarkingBills();
	
}
