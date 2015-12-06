package bl.shipment.Impl;

import bill.BusShipmentBill_Shop;
import data.shipment.BusTransBill_Shop;

public class TruckLoadingManage {
	BusTransBill_Shop busTransBill_shop;
	

	public TruckLoadingManage(){
		busTransBill_shop=new BusTransBill_Shop();
	}

	public boolean submitBills(BusShipmentBill_Shop shop) {
		// TODO Auto-generated method stub
		try {
			return busTransBill_shop.insert(shop);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
