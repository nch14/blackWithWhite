package bl.shipment.Service;

import bill.BusShipmentBill_Shop;

/**
 * 车辆装车管理(从营业厅出发
 * @author 倪辰皓
 *
 */
public interface TruckLoadingManageBLService {
	
	/**
	 * 
	 * @param shop 装车单
	 * @return
	 */
	public boolean submitBills(BusShipmentBill_Shop shop);
}
