package bl.money.Impl;

import bill.PaymentBill;
import bl.money.Service.PayBLService;

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

}
