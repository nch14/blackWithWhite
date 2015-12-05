package bl.send.Impl;

import bl.send.Service.SendService;
import bill.OrderBillPO;
import senddata.SendInfo;

public class Send implements SendService{
	SendInfo si;
	public Send(){
		si=new SendInfo();
	}
	public boolean push(OrderBillPO order) {
		//1.推送到服务器
		try {
			si = new SendInfo();
			return si.getInput(order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		//2.更新物流动态
	}

	public OrderBillPO inquireSendMesg(String id) {
		// TODO Auto-generated method stub
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
