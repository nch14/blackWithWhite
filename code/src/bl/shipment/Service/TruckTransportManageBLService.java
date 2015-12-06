package bl.shipment.Service;

import bill.BusShipmentBill_Center;
import bill.TransportBill_Truck;

/**
 * 汽车装运管理
 * @author 倪辰皓
 *
 */
public interface TruckTransportManageBLService {
	/**
	 * 
	 * @param truckBill 中转单-汽车(营业厅到营业厅
	 * @return
	 */
	public boolean submitBills(TransportBill_Truck truckBill);
	
	/**
	 * 
	 * @param planeBill 装车单（中转中心到营业厅
	 * @return
	 */
	public boolean submitBills(BusShipmentBill_Center truckBill);
}
