package bl.commoditybl.Impl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import bill.StockBill_In;
import data.commodity.Commodity_In;
import tools.DepartmentHelper;

public class InDepot {
	Commodity_In commodity=new Commodity_In();
	
	
	public StockBill_In inDepot(StockBill_In stock_in) {
		// TODO Auto-generated method stub
		StockBill_In result;
		try {
			result=commodity.insert(stock_in, DepartmentHelper.getDepartment());
			
			return result;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<StockBill_In> getUnmarkingBills(){
		ArrayList<StockBill_In> result;
		try {
			result=commodity.getUnjudged();
			return result;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
