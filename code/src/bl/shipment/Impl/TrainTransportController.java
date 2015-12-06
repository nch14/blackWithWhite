package bl.shipment.Impl;

import bill.TransportBill_Train;
import bl.shipment.Service.TrainTransportBLService;

public class TrainTransportController implements TrainTransportBLService{
	TrainTransport trainTransport;
	
	public TrainTransportController(){
		trainTransport=new TrainTransport();
	}
	public boolean submitills(TransportBill_Train Train) {
		
		return false;
	}

}
