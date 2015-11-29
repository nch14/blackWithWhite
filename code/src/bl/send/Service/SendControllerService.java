package bl.send.Service;

import po.OrderBillPO;

public interface SendControllerService {
	
	public boolean push(OrderBillPO order);
	
	public OrderBillPO inquireSendMesg(String id);
	
}
