package bl.send.Impl;

import data.send.SendInfo;
import bill.OrderBillPO;
import bl.information.Impl.InformationController;

public class Send {
	SendInfo si;
	public Send(){
		si=new SendInfo();
	}
	public boolean push(OrderBillPO order) {
		//1.推送到服务器
		boolean result=false;
		try {
			result =si.getInput(order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		//2.更新物流动态
		InformationController IC=new InformationController();
		boolean success=IC.refreshMesg(order.ID, order.workplaceOfSender,order.time);
		if(!success)
			return false;
		return result;
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
