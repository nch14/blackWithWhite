package bl.shipment.Impl;

import bill.BusShipmentBill_Shop;
import bl.shipment.Service.TruckLoadingManageBLService;

public class TruckLoadingManageController implements TruckLoadingManageBLService {
	TruckLoadingManage truckLoadingManage;
	public TruckLoadingManageController(){
		truckLoadingManage=new TruckLoadingManage();
	}
	@Override
	public double submitBills(BusShipmentBill_Shop shop) {
		// TODO Auto-generated method stub
		return truckLoadingManage.submitBills(shop);
	}

}
