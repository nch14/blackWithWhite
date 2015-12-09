package bl.shipment.Impl;

import data.shipment.Arrive_Center;
import po.bills.ArrivementBill_Center;

public class TransportAndReceive {
	Arrive_Center arrive_center;
	
	public TransportAndReceive(){
		arrive_center=new Arrive_Center();
	}
	
	public boolean submitBills(ArrivementBill_Center bill) {
		// TODO Auto-generated method stub
		try {
			return arrive_center.insert(bill);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
