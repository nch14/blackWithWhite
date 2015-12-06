package bl.shipment.Impl;

import bill.BusShipmentBill_Center;
import bill.TransportBill_Truck;
import data.shipment.BusShipment;
import data.shipment.BusTransBill_Center;

public class TruckTransportManage {
	BusTransBill_Center busTransBill_Center;
	BusShipment busShipment;
	public TruckTransportManage(){
		busTransBill_Center=new BusTransBill_Center();
		busShipment=new BusShipment();
	}
	public boolean submitBills(TransportBill_Truck truckBill) {
		try {
			return busShipment.insert(truckBill);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean submitBills(BusShipmentBill_Center truckBill) {
		try {
			return busTransBill_Center.insert(truckBill);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
