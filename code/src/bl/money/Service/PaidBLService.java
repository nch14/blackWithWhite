package bl.money.Service;

import java.util.ArrayList;

import bill.PaymentBill;
import bill.ReceiveMoneyBill;

/**
 * 收款单填写
 * @author 倪辰皓
 *
 */
public interface PaidBLService {

	/**
	 * 提交收款单
	 * @param bills
	 * @return
	 */
	public boolean addPaidmentBill(ArrayList<ReceiveMoneyBill> bills);
	
	
	/**
	 * 获得指定时间区间内的收款单
	 * @param start
	 * @param end
	 * @return
	 */
	public ArrayList<ReceiveMoneyBill> getPaidmentBill(String[] start,String[] end);
	
	/**
	 * 获得截至到endTime的收款单
	 * @param endTime
	 * @return
	 */
	public ArrayList<ReceiveMoneyBill> getPaidmentBill(String[] endTime);
	/**
	 * 获得未审批的单据
	 * @return
	 */
	public ArrayList<ReceiveMoneyBill> getUnmarkingBills();
}
