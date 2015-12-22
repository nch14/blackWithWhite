package bl.money.Impl;

import java.util.ArrayList;

import bill.PaymentBill;
import bill.ReceiveMoneyBill;
import bl.money.Service.PayBLService;

public class PayController implements PayBLService {
	Pay pay;
	public PayController(){
		pay=new Pay();
	}
	@Override
	public boolean addPaymentBill(ArrayList<PaymentBill> bills) {
		// TODO Auto-generated method stub
		int length=bills.size();
		PaymentBill[] bill=(PaymentBill[])bills.toArray(new PaymentBill[length]);
		return pay.addPaymentBill(bill);
	}
	@Override
	public ArrayList<PaymentBill> getPaymentBill(String[] start, String[] end) {
		// TODO Auto-generated method stub
		return pay.getPaymentBill(start, end);
	}
	@Override
	public ArrayList<PaymentBill> getPaymentBill(String[] endTime) {
		// TODO Auto-generated method stub
		return pay.getPaymentBill(endTime);
	}
	@Override
	public ArrayList<PaymentBill> getUnmarkingBills() {
		// TODO Auto-generated method stub
		return pay.getUnmarkingBills();
	}

}
