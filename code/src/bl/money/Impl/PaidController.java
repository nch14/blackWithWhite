package bl.money.Impl;

import bill.ReceiveMoneyBill;
import bl.money.Service.PaidBLService;

public class PaidController implements PaidBLService {
	Paid paid;
	public PaidController(){
		paid=new Paid();
	} 
	@Override
	public boolean addPaidmentBill(ReceiveMoneyBill[] bills) {
		// TODO Auto-generated method stub
		return paid.addPaidmentBill(bills);
	}

	@Override
	public boolean getPaidmentBill() {
		// TODO Auto-generated method stub
		return false;
	}

}
