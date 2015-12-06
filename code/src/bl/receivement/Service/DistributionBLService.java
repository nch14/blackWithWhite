package bl.receivement.Service;

import bill.ArrivementBill;

/**
 * 接收与派件
 * @author 倪辰皓
 *
 */
public interface DistributionBLService {

	/**
	 * 接收
	 * @param arrive 营业厅到达单
	 * @return
	 */
	public boolean receive(ArrivementBill arrive);
	
	/**
	 * 派件
	 * @param time 时间
	 * @param deliveryMan 快递员
	 * @param ID  IDs
	 * @return
	 */
	public boolean distribution(String[][] time,String[] deliveryMan,String[] ID);
}
