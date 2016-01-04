package bl.commoditybl.Impl;

import bill.StockBlockInfo;
import data.commodity.Commodity;
import tools.DepartmentHelper;
import tools.ExcelHelper;
import vo.StockSnapShotVO;

public class Inventory {
	Commodity commodity;
	StockSnapShotVO snap;
	public StockSnapShotVO getStockSnapShot() {
		// TODO Auto-generated method stub
		commodity=new Commodity();
		StockBlockInfo info=commodity.checkCommodity(DepartmentHelper.getDepartment());
		snap=new StockSnapShotVO(info);
		return snap;
	}


	public boolean export() {
		// TODO Auto-generated method stub
		if(snap==null)
			return false;
		boolean result=ExcelHelper.export(snap);
		return result;
	}
}
