package bl.receivement.Service;

import vo.ReceiveInformationVO;

/**
 * 收件信息填写
 * @author 倪辰皓
 *
 */
public interface TransportFinishedBLService {
	
	/**
	 * 收件信息输入
	 * @param ID 寄件单号
	 * @param nameOfReceiver 收件人姓名
	 * @param date 收件日期
	 * @return 
	 */
	public boolean billFilled(ReceiveInformationVO[] info);
}
