package bl.money.Impl;

import java.util.ArrayList;

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
	public ArrayList<ReceiveMoneyBill> getPaidmentBill(String[] start, String[] end) {
		// TODO Auto-generated method stub
		return paid.getPaidmentBill(start, end);
	}
	@Override
	public ArrayList<ReceiveMoneyBill> getPaidmentBill(String[] endTime) {
		// TODO Auto-generated method stub
		return paid.getPaidmentBill(endTime);
	}

}
