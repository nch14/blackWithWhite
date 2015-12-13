package bl.shipment.Impl;

import bill.TransportBill_Train;
import bl.shipment.Service.TrainTransportBLService;
import tools.MoneyHelper;

public class TrainTransportController implements TrainTransportBLService{
	TrainTransport trainTransport;
	
	public TrainTransportController(){
		trainTransport=new TrainTransport();
	}
	
	@Override
	public double submitBills(TransportBill_Train Train) {
		return trainTransport.submitBills(Train);
	}

}
