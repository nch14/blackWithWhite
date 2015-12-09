package bl.money.Impl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import data.money.PayBill;
import po.bills.PaymentBill;
import po.bills.ReceiveMoneyBill;

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

	public ArrayList<PaymentBill> getPaymentBill(String[] start, String[] end) {
		ArrayList<PaymentBill> paymentBill;
		try {
			paymentBill=pay.getall(start,end);		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("获取付款单失败");
			return null;
		}
		return paymentBill;
	}
	
	public ArrayList<PaymentBill> getPaymentBill(String[] time) {
		ArrayList<PaymentBill> paymentBill;
		try {
			paymentBill=pay.getall(time);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("获取付款单失败");
			return null;
		}
		return paymentBill;
	}
	
	public ArrayList<PaymentBill> getUnmarkingBills() {
		// TODO Auto-generated method stub
		ArrayList<PaymentBill> result=new ArrayList<PaymentBill>();	
		try {
			result=pay.getUnjudged();
			return result;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	

}
