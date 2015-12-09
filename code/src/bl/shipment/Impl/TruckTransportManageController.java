package bl.shipment.Impl;

import bill.BusShipmentBill_Center;
import bill.TransportBill_Truck;
import bl.shipment.Service.TruckTransportManageBLService;

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
