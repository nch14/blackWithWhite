package bl.commoditybl.Service;

import java.rmi.RemoteException;
import java.util.ArrayList;

import bill.StockBill_In;

/**
 * 入库管理
 * @author 倪辰皓
 *
 */
public interface InDepotBLService {

	/**
	 * 入库
	 * @param stock_in 入库信息
	 * @return 分配好位置的入库信息（用于UI显示位置）
	 */
	public StockBill_In inDepot(StockBill_In stock_in);
	
	
	public ArrayList<StockBill_In> getUnmarkingBills();
		
		
	
}
