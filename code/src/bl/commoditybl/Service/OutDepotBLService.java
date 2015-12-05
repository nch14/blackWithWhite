package bl.commoditybl.Service;

import bill.StockBill_Out;
/**
 * 出库
 * @author 倪辰皓
 *
 */
public interface OutDepotBLService {

	/**
	 * 出库
	 * @param stock_out 出库信息
	 * @return 是否创建成功
	 */
	public boolean outDepot(StockBill_Out stock_out);
}
