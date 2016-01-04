package bl.shipment.Impl;

import bill.TransportBill;
import bl.shipment.Service.TransportBLService;

public class TransportController implements TransportBLService {
	Transport airTransport;
	public TransportController(){
		airTransport=new Transport();
	}
	@Override
	public double submitBills(TransportBill planeBill) {
		// TODO Auto-generated method stub
		return airTransport.submitBills(planeBill);
	}

	
}
