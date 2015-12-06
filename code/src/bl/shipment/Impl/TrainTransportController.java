package bl.shipment.Impl;

import bill.TransportBill_Train;
import bl.shipment.Service.TrainTransportBLService;

public class TrainTransportController implements TrainTransportBLService{
	TrainTransport trainTransport;
	
	public TrainTransportController(){
		trainTransport=new TrainTransport();
	}
	
	@Override
	public boolean submitBills(TransportBill_Train Train) {
		// TODO Auto-generated method stub
		return trainTransport.submitills(Train);
	}

}
