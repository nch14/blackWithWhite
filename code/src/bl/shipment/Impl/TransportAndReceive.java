package bl.shipment.Impl;

import java.util.ArrayList;

import bill.ArrivementBill_Center;
import bl.information.Impl.InformationController;
import data.shipment.Arrive_Center;
import tools.DepartmentHelper;
import tools.TimeHelper;

public class TransportAndReceive {
	Arrive_Center arrive_center;
	
	public TransportAndReceive(){
		arrive_center=new Arrive_Center();
	}
	
	public boolean submitBills(ArrivementBill_Center bill) {
		// TODO Auto-generated method stub
		boolean result=true;
		try {
			result=result&&arrive_center.insert(bill);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		//更新物流动态
		InformationController IC=new InformationController();
		ArrayList<String> ids=bill.showAllID();
		for(int i=0;i<ids.size();i++){
			result=result&&IC.refreshMesg(ids.get(i),"货物已到达"+DepartmentHelper.getDepartment(), TimeHelper.getTime());
		}
		return result;
	}
}
