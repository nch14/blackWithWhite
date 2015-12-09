package bl.money.Impl;

import bl.money.Service.BillingManagementBLService;
import po.bills.ReceiveMoneyBill;

public class BillingManagementController implements BillingManagementBLService {
	BillingManagement billingManagement;
	
	public BillingManagementController(){
		billingManagement=new BillingManagement();
	}
	public ReceiveMoneyBill[] getBills(String[] Date, String businessHall) {

		return billingManagement.getBills(Date, businessHall);
	}

	@Override
	public double getTotalMoney() {
		// TODO Auto-generated method stub
		return billingManagement.getTotalMoney();
	}

}
