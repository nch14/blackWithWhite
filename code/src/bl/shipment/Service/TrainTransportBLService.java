package bl.shipment.Service;

import bill.TransportBill_Train;

/**
 * 飞机装运管理
 * @author 倪辰皓
 *
 */
public interface TrainTransportBLService {
	/**
	 * 
	 * @param planeBill 中转单-火车
	 * @return
	 */
	public boolean submitills(TransportBill_Train Train);
}
