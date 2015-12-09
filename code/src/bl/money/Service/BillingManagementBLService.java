package bl.money.Service;

import po.bills.ReceiveMoneyBill;

/**
 * 结算管理
 * @author 倪辰皓
 *
 */
public interface BillingManagementBLService {
	
	/**
	 * 查看指定日期，指定营业厅当天的收款单信息
	 * 营业厅信息可以为null（此时将显示当天所有营业厅的收款单信息）
	 * @param Date 日期
	 * @param businessHall 营业厅名称
	 * @return 收款单
	 */
	public ReceiveMoneyBill[] getBills(String[] Date,String businessHall);
	
	/**
	 * 得到当前所查看的营业厅的收款单的合计金额（或者当天所有营业厅的收款总额）
	 * @return 合计
	 * 注：如果返回值为-1，说明有异常
	 */
	public double getTotalMoney();
}
