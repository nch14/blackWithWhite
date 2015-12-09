package bl.shipment.Impl;

import bill.BusShipmentBill_Center;
import bill.TransportBill_Truck;
import data.shipment.BusShipment;
import data.shipment.BusTransBill_Center;
import tools.MoneyHelper;

public class TruckTransportManage {
	BusTransBill_Center busTransBill_Center;
	BusShipment busShipment;
	public TruckTransportManage(){
		busTransBill_Center=new BusTransBill_Center();
		busShipment=new BusShipment();
	}
	public double submitBills(TransportBill_Truck truckBill) {
		try {
			boolean success=busShipment.insert(truckBill);
			if(!success)
				return -1;
			return MoneyHelper.getFreight(truckBill.list);
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	public double submitBills(BusShipmentBill_Center truckBill) {
		try {
			boolean success=busTransBill_Center.insert(truckBill);
			if(!success)
				return -1;
			return MoneyHelper.getFreight(truckBill.idCollection);
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
}
