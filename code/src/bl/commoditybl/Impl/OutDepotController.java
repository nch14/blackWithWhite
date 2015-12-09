package bl.commoditybl.Impl;

import java.util.ArrayList;

import bl.commoditybl.Service.OutDepotBLService;
import po.bills.StockBill_Out;

/**
 * Created by Äß³½ð© on 2015/12/5.
 */
public class OutDepotController implements OutDepotBLService {
	OutDepot outDepot;
	
	public OutDepotController(){
		outDepot=new OutDepot();
	}
	@Override
	public boolean outDepot(StockBill_Out stock_out) {
		// TODO Auto-generated method stub
		return outDepot.outDepot(stock_out);
	}
	@Override
	public ArrayList<StockBill_Out> getUnmarkingBills() {
		// TODO Auto-generated method stub
		return outDepot.getUnmarkingBills();
	}


}
