package bl.shipment.Impl;

import bl.shipment.Service.AirTransportBLService;
import po.bills.TransportBill_Plane;

public class AirTransportController implements AirTransportBLService {
	AirTransport airTransport;
	public AirTransportController(){
		airTransport=new AirTransport();
	}
	@Override
	public double submitBills(TransportBill_Plane planeBill) {
		// TODO Auto-generated method stub
		return airTransport.submitBills(planeBill);
	}
	
}
