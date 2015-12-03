package bl.send.Service;

import bill.OrderBillPO;


public interface SendService {
	
	public boolean push(OrderBillPO order);
	
	public OrderBillPO inquireSendMesg(String id);
	
}
