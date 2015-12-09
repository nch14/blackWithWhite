package bl.shipment.Service;

import po.bills.TransportBill_Train;

/**
 * 飞机装运管理
 * @author 倪辰皓
 *
 */
public interface TrainTransportBLService {
	/**
	 * 
	 * @param Train 中转单-火车
	 * @return 该单据所列货物总运费（如果返回值为-1，即输入有误或网络连接错误——即发生了异常）
	 */
	public double submitBills(TransportBill_Train Train);
}
