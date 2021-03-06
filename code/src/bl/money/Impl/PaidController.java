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
	public boolean addPaidmentBill(ArrayList<ReceiveMoneyBill> bills) {
		// TODO Auto-generated method stub
		int length=bills.size();
		ReceiveMoneyBill[] bill=(ReceiveMoneyBill[])bills.toArray(new ReceiveMoneyBill[length]);
		return paid.addPaidmentBill(bill);
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
	@Override
	public ArrayList<ReceiveMoneyBill> getUnmarkingBills() {
		// TODO Auto-generated method stub
		return paid.getUnmarkingBills();
	}

}
