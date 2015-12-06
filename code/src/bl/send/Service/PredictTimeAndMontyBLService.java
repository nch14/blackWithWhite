package bl.send.Service;
/**
 * 报价和时间管理
 * @author 倪辰皓
 *
 */
public interface PredictTimeAndMontyBLService {

	/**
	 * 时间与报价管理
	 * @param ID 寄件单号
	 * @return String[] 位置0：价格，位置1：预计日期
	 */
	public String[] moneyAndTime(String ID);
}
