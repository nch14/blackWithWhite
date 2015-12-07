package bl.send.Impl;

import bl.send.Service.SendBLService;
import bill.OrderBillPO;
/**
 * ×´Ì¬£ºÒÑÍê³É
 * @author Äß³½ð©
 *
 */
public class SendController implements SendBLService {
	Send send;
	
	public SendController(){
		send=new Send();
	}
	@Override
	public boolean push(OrderBillPO order) {
		// TODO Auto-generated method stub		
		return send.push(order);
	}

	@Override
	public OrderBillPO inquireSendMesg(String id) {
		// TODO Auto-generated method stub
		return send.inquireSendMesg(id);
	}

}
