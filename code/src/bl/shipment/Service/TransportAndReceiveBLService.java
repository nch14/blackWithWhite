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
	 * @return 该单据所列货物总运费（如果返回值为-1，即输入有误或网络连接错误——即发生了异常）
	 */
	public boolean submitBills(	ArrivementBill_Center bill);
	
}
