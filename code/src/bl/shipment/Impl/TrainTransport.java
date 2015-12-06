package bl.shipment.Impl;

import bill.TransportBill_Train;
import data.shipment.TrainShipment;

public class TrainTransport {
	TrainShipment trainShipment;
	public TrainTransport(){
		trainShipment=new TrainShipment();
	}
	public boolean submitills(TransportBill_Train Train) {
		
		try {
			return trainShipment.insert(Train);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
