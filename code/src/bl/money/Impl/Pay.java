package bl.money.Impl;

import bill.PaymentBill;
import bill.ReceiveMoneyBill;
import moneydata.PaidBill;
import moneydata.PayBill;

/**
 * 填写付款单的领域对象
 * @author 倪辰皓
 *
 */
public class Pay {
	PayBill pay;
	
	public Pay(){
		pay=new PayBill();
	}
	public boolean addPaymentBill(PaymentBill[] bills) {
		if(bills==null)
			return false;
		try {
			for(int i=0;i<bills.length;i++){
				pay.insert(bills[i]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("付款单创建失败");
			return false;
		}
		return true;
	}
}
