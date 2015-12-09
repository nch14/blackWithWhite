package bl.shipment.Impl;

import bill.TransportBill_Train;
import data.shipment.TrainShipment;
import tools.MoneyHelper;

public class TrainTransport {
	TrainShipment trainShipment;
	public TrainTransport(){
		trainShipment=new TrainShipment();
	}
	public double submitBills(TransportBill_Train Train) {
		
		try {
			boolean success=trainShipment.insert(Train);
			if(!success)
				return -1;
			return MoneyHelper.getFreight(Train.list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	}
}
