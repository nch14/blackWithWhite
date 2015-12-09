package bl.shipment.Impl;

import data.shipment.BusTransBill_Shop;
import po.bills.BusShipmentBill_Shop;
import tools.MoneyHelper;

public class TruckLoadingManage {
	BusTransBill_Shop busTransBill_shop;
	

	public TruckLoadingManage(){
		busTransBill_shop=new BusTransBill_Shop();
	}

	public double submitBills(BusShipmentBill_Shop shop) {
		// TODO Auto-generated method stub
		try {
			boolean success=busTransBill_shop.insert(shop);
			if(!success)
				return -1;
			return MoneyHelper.getFreight(shop.idCollection);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	}
}
