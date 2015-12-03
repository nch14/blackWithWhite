package bl.send.Impl;

import bl.send.Service.SendService;
import bill.OrderBillPO;
import senddata.SendInfo;

public class Send implements SendService{

	public boolean push(OrderBillPO order) {
		//1.推送到服务器
		//2.更新物流动态
		SendInfo si;
		try {
			si = new SendInfo();
			return si.getInput(order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	public OrderBillPO inquireSendMesg(String id) {
		// TODO Auto-generated method stub
		SendInfo si;
		try {
			si = new SendInfo();
			return si.getSendMesg(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}



}
