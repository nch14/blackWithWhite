package bl.shipment.Service;

import bill.ArrivementBill_Center;

/**
 * 中转接受
 * @author 倪辰皓
 *
 */
public interface TransportAndReceiveBLService {

	/**
	 * 中转中心业务员填写中转中心到达单
	 * @param bill
	 * @return
	 */
	public boolean submitBills(	ArrivementBill_Center bill);
	
}
