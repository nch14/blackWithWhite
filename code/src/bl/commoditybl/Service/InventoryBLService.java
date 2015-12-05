package bl.commoditybl.Service;

import vo.StockSnapShotVO;

/**
 * 库存盘点
 * @author 倪辰皓
 *
 */
public interface InventoryBLService {

	/**
	 * 库区盘点
	 * @return 返回当天的库存快照
	 */
	public StockSnapShotVO getStockSnapShot();
	
	/**
	 * 导出为excel
	 * @return 是否导出成功
	 */
	public boolean export();
}
