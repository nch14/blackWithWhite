package bl.commoditybl.Impl;

import bl.commoditybl.Service.InventoryBLService;
import vo.StockSnapShotVO;

public class InventoryController implements InventoryBLService {
	Inventory inventory;
	
	public InventoryController(){
		inventory=new Inventory();
	}
	@Override
	public StockSnapShotVO getStockSnapShot() {
		// TODO Auto-generated method stub
		return inventory.getStockSnapShot();
	}

	@Override
	public boolean export() {
		// TODO Auto-generated method stub
		return inventory.export();
	}

}
