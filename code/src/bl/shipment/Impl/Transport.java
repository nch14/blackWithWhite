package bl.shipment.Impl;

import bill.TransportBill;
import data.shipment.ShipmentCenter;
import tools.MoneyHelper;

public class Transport {
	ShipmentCenter planeInfo;
	public Transport(){
		planeInfo=new ShipmentCenter();
	}
	public double submitBills(TransportBill planeBill) {
		// TODO Auto-generated method stub
		try {
			boolean success=planeInfo.insert(planeBill);
			if(!success)
				return -1;
			return MoneyHelper.getFreight(planeBill.list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	}
	
}
