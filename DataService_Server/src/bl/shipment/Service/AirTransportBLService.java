package bl.shipment.Service;

import bill.TransportBill_Plane;

/**
 * 状态：已完成
 * 飞机装运管理
 * @author 倪辰皓
 *
 */
public interface AirTransportBLService {
	/**
	 * 
	 * @param planeBill 中转单-飞机
	 * @return 该单据所列货物总运费（如果返回值为-1，即输入有误或网络连接错误——即发生了异常）
	 */
	public double submitBills(TransportBill_Plane planeBill);
}
