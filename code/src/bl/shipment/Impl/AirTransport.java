package bl.shipment.Impl;

import bill.TransportBill_Plane;
import data.shipment.PlaneShipment;

public class AirTransport {
	PlaneShipment planeInfo;
	public AirTransport(){
		planeInfo=new PlaneShipment();
	}
	public boolean submitills(TransportBill_Plane planeBill) {
		// TODO Auto-generated method stub
		try {
			return planeInfo.insert(planeBill);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
}
