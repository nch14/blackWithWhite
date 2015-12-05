package bl.money.Service;

import bill.ReceiveMoneyBill;

/**
 * 收款单填写
 * @author 倪辰皓
 *
 */
public interface PaidBLService {

	/**
	 * 提交收款单
	 * @param bills
	 * @return
	 */
	public boolean addPaidmentBill(ReceiveMoneyBill[] bills);
	
	
	public boolean getPaidmentBill();
	
}
