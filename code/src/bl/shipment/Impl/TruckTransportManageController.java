package bl.shipment.Impl;

import bl.shipment.Service.TruckTransportManageBLService;
import po.bills.BusShipmentBill_Center;
import po.bills.TransportBill_Truck;

public class TruckTransportManageController implements TruckTransportManageBLService {
	TruckTransportManage truckTransportManage;
	public TruckTransportManageController(){
		truckTransportManage=new TruckTransportManage();
	}
	@Override
	public double submitBills(TransportBill_Truck truckBill) {
		// TODO Auto-generated method stub
		return truckTransportManage.submitBills(truckBill);
	}
	@Override
	public double submitBills(BusShipmentBill_Center truckBill) {
		// TODO Auto-generated method stub
		return truckTransportManage.submitBills(truckBill);
	}

}
