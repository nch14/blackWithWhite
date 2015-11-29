package bl.send.Impl;

import bl.send.Service.SendService;
import po.OrderBillPO;
import senddata.SendInfo;

public class Send implements SendService{

	@Override
	public boolean push(OrderBillPO order) {
		// TODO Auto-generated method stub
		SendInfo si=new SendInfo();
		return si.getInput(order);
	}

	@Override
	public OrderBillPO inquireSendMesg(String id) {
		// TODO Auto-generated method stub
		SendInfo si=new SendInfo();
		return si.getSendMesg(id);
	}



}
