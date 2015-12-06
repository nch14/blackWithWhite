package bl.shipment.Service;

import bill.TransportBill_Plane;

/**
 * 飞机装运管理
 * @author 倪辰皓
 *
 */
public interface AirTransportBLService {
	/**
	 * 
	 * @param planeBill 中转单-飞机
	 * @return
	 */
	public boolean submitBills(TransportBill_Plane planeBill);
}
