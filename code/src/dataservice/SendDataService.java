package dataservice;

import po.OrderBillPO;
import vo.OrderBillVO;

public interface SendDataService {
	/*
	 * return send message
	 */
	public OrderBillVO getSendMesg(String id);
	
	
	
	/*
	 * input and store the bill message
	 */
	public String input(OrderBillVO odVO);

}
