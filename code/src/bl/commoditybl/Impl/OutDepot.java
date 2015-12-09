package bl.commoditybl.Impl;

import java.util.ArrayList;

import data.commodity.Commodity_Out;
import po.bills.StockBill_Out;
import tools.DepartmentHelper;

public class OutDepot {
	Commodity_Out commodity=new Commodity_Out();

	public boolean outDepot(StockBill_Out stock_out) {
		// TODO Auto-generated method stub
		boolean result=true;
		try {
			result=result&&commodity.insert(stock_out, DepartmentHelper.getDepartment());
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	public ArrayList<StockBill_Out> getUnmarkingBills() {
		// TODO Auto-generated method stub
		ArrayList<StockBill_Out> result;
		try {
			result=commodity.getUnjudged();
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
