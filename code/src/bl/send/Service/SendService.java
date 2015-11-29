package bl.send.Service;

import po.OrderBillPO;
import vo.OrderBillVO;

public interface SendService {
	
	public boolean push(OrderBillPO order);
	
	public OrderBillPO inquireSendMesg(String id);
	
}
