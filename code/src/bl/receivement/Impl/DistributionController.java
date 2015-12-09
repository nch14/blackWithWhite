package bl.receivement.Impl;

import bl.receivement.Service.DistributionBLService;
import po.bills.AllocateBill;
import po.bills.ArrivementBill;
import po.bills.ArrivementBill_Shop;

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
