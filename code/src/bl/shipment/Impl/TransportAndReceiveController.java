package bl.shipment.Impl;

import bl.shipment.Service.TransportAndReceiveBLService;
import po.bills.ArrivementBill_Center;

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
