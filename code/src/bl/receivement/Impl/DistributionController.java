package bl.receivement.Impl;

import java.util.ArrayList;

import bill.AllocateBill;
import bill.ArrivementBill_Shop;
import bl.receivement.Service.DistributionBLService;

public class DistributionController implements DistributionBLService{
	Distribution distribution;

	public DistributionController(){
		distribution=new Distribution();
	}
	
	public boolean distribution(ArrayList<AllocateBill> bills) {
		// TODO Auto-generated method stub
		return distribution.distribution(bills);
	}

	@Override
	public boolean receive(ArrivementBill_Shop arrive) {
		// TODO Auto-generated method stub
		return distribution.receive(arrive);
	}





}
