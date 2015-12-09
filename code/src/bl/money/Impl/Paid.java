package bl.money.Impl;

import java.rmi.RemoteException;
import java.util.ArrayList;

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
	public ArrayList<ReceiveMoneyBill> getPaidmentBill(String[] start, String[] end) {
		ArrayList<ReceiveMoneyBill> receiveMoneyBill;
		try {
			receiveMoneyBill=paid.getall(start,end);		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("获取收款单失败");
			return null;
		}
		return receiveMoneyBill;
	}
	
	public ArrayList<ReceiveMoneyBill> getPaidmentBill(String[] time) {
		ArrayList<ReceiveMoneyBill> receiveMoneyBill;
		try {
			receiveMoneyBill=paid.getall(time);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("获取收款单失败");
			return null;
		}
		return receiveMoneyBill;
	}
	
	public ArrayList<ReceiveMoneyBill> getUnmarkingBills() {
		// TODO Auto-generated method stub
		ArrayList<ReceiveMoneyBill> result;
		try {
			result=paid.getUnjudged();
			return result;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
}
