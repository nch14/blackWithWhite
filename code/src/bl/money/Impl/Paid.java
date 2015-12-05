package bl.money.Impl;

import bill.ReceiveMoneyBill;
import data.money.PaidBill;
/**
 * 填写收款单的领域对象
 * @author 倪辰皓
 *
 */
public class Paid {
	PaidBill paid;
	
	public Paid(){
		paid=new PaidBill();
	}
	public boolean addPaidmentBill(ReceiveMoneyBill[] bills) {
		if(bills==null)
			return false;
		try {
			for(int i=0;i<bills.length;i++){
				paid.insert(bills[i]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("收款单创建失败");
			return false;
		}
		return true;
	}
}
