package bl.money.Impl;

import bill.ReceiveMoneyBill;
import moneydata.PaidBill;
import tools.TimeHelper;

/**
 * 结算管理的领域对象
 * @author 倪辰皓
 *
 */
public class BillingManagement {
	ReceiveMoneyBill[] bills;
	
	
	public ReceiveMoneyBill[] getBills(String[] Date, String businessHall) {
		//检查时间格式
		if(!TimeHelper.isValidTime(Date))
			return null;
		//获取收款单
		PaidBill paid=new PaidBill();

		
		
		return null;
	}


	public double getTotalMoney() {
		// TODO Auto-generated method stub
		if(bills==null)
			return -1;
		double sum=0;
		for(int i=0;i<bills.length;i++){
			sum+=bills[i].money;
		}
		return sum;
	}
}
