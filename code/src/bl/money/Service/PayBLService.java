package bl.money.Service;

import bill.PaymentBill;

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
}
