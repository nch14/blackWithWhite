package bl.shipment.Impl;

import bill.ArrivementBill_Center;
import bl.shipment.Service.TransportAndReceiveBLService;

public class TransportAndReceiveController implements TransportAndReceiveBLService {
	TransportAndReceive transportAndReceive;
	
	public TransportAndReceiveController(){
		transportAndReceive=new TransportAndReceive();
	}
	
	public boolean submitBills(ArrivementBill_Center bill) {
		// TODO Auto-generated method stub
		return transportAndReceive.submitBills(bill);
	}

}
