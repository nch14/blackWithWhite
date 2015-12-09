package bl.receivement.Impl;

import bill.AllocateBill;
import bill.ArrivementBill;
import bill.ArrivementBill_Shop;
import bl.receivement.Service.DistributionBLService;

public class DistributionController implements DistributionBLService{
	Distribution distribution;

	public DistributionController(){
		distribution=new Distribution();
	}
	
	public boolean distribution(AllocateBill[] bills) {
		// TODO Auto-generated method stub
		return distribution.distribution(bills);
	}

	@Override
	public boolean receive(ArrivementBill_Shop arrive) {
		// TODO Auto-generated method stub
		return distribution.receive(arrive);
	}



}
