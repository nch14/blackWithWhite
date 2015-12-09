package bl.shipment.Impl;

import bl.shipment.Service.TrainTransportBLService;
import po.bills.TransportBill_Train;
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
