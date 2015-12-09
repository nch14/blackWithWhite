package bl.money.Impl;

import java.util.ArrayList;

import bl.money.Service.PayBLService;
import po.bills.PaymentBill;

public class PayController implements PayBLService {
	Pay pay;
	public PayController(){
		pay=new Pay();
	}
	@Override
	public boolean addPaymentBill(PaymentBill[] bills) {
		// TODO Auto-generated method stub
		return pay.addPaymentBill(bills);
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
