package bl.commoditybl.Impl;

import bill.StockBlockInfo;
import data.commodity.Commodity;
import tools.DepartmentHelper;

public class InitDepotArea {
	Commodity commodity=new Commodity();
	
	public boolean init(int[] motorTransport, int[] trainTransport, int[] airTransport, int[] balnkSpace) {
		// TODO Auto-generated method stub
		StockBlockInfo stock=new StockBlockInfo();
		stock.ID=DepartmentHelper.getDepartment();
		return false;
	}
}
