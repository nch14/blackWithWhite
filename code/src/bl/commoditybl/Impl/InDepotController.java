package bl.commoditybl.Impl;

import bill.StockBill_In;
import bl.commoditybl.Service.InDepotBLService;

public class InDepotController implements InDepotBLService {
	InDepot inDepot;
	
	public InDepotController(){
		inDepot=new InDepot();
	}
	@Override
	public StockBill_In inDepot(StockBill_In stock_in) {
		// TODO Auto-generated method stub
		return inDepot.inDepot(stock_in);
	}

}
