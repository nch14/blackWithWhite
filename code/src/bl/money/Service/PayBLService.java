package bl.money.Service;

import java.util.ArrayList;

import bill.PaymentBill;
import bill.ReceiveMoneyBill;

/**
 * 填写付款单（付款单的创建）
 * @author 倪辰皓
 *
 */
public interface PayBLService {
	/**
	 * 提交付款单
	 * @param bills
	 * @return
	 */
	public boolean addPaymentBill(PaymentBill[] bills);
	
	/**
	 * 获得指定时间区间内的付款单
	 * @param start
	 * @param end
	 * @return
	 */
	public ArrayList<PaymentBill> getPaymentBill(String[] start,String[] end);
	
	/**
	 * 获得截至到endTime的付款单
	 * @param endTime
	 * @return
	 */
	public ArrayList<PaymentBill> getPaymentBill(String[] endTime);
	
}
