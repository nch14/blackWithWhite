package bl.receivement.Impl;

import bill.ArrivementBill;
import bl.receivement.Service.DistributionBLService;

public class DistributionController implements DistributionBLService{
	Distribution distribution;

	public DistributionController(){
		distribution=new Distribution();
	}
	
	public boolean distribution(String[][] time, String[] deliveryMan, String[] ID) {
		// TODO Auto-generated method stub
		return distribution.distribution(time, deliveryMan, ID);
	}

	@Override
	public boolean receive(ArrivementBill arrive) {
		// TODO Auto-generated method stub
		return distribution.receive(arrive);
	}

}
