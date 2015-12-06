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
	 * @return 该单据所列货物总运费（如果返回值为-1，即输入有误或网络连接错误——即发生了异常）
	 */
	public double submitBills(BusShipmentBill_Shop shop);
}
