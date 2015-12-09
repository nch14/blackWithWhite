package bl.money.Impl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import data.money.PaidBill;
import po.bills.ReceiveMoneyBill;
import tools.TimeHelper;

/**
 * 结算管理的领域对象
 * @author 倪辰皓
 *
 */
public class BillingManagement {
	PaidBill paid;
	ReceiveMoneyBill[] bills;
	
	public BillingManagement(){
		paid=new PaidBill();
	}
	public ReceiveMoneyBill[] getBills(String[] Date, String businessHall) {
		//检查时间格式
		if(!TimeHelper.isValidTime(Date))
			return null;
		//获取收款单
		ArrayList<ReceiveMoneyBill> billsTemp;
		if(businessHall!=null&&businessHall!=""){
			try {
				billsTemp=paid.getall(Date, businessHall);
				bills=new ReceiveMoneyBill[billsTemp.size()];
				for(int i=0;i<billsTemp.size();i++){
					bills[i]=billsTemp.get(i);
				}
				return bills;
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
		if(businessHall==null||businessHall==""){
			try {
				billsTemp=paid.getall_Oneday(Date);
				bills=new ReceiveMoneyBill[billsTemp.size()];
				for(int i=0;i<billsTemp.size();i++){
					bills[i]=billsTemp.get(i);
				}
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
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
