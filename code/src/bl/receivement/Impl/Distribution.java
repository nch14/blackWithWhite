package bl.receivement.Impl;

import bill.AllocateBill;
import bill.ArrivementBill_Shop;
import bl.information.Impl.InformationController;
import data.shipment.Allocate;
import data.shipment.Arrive_Shop;
import tools.DepartmentHelper;
import tools.TimeHelper;

public class Distribution {
	public boolean distribution(AllocateBill[] bills) {
		// TODO Auto-generated method stub
		Allocate allocate=new Allocate();
		boolean result=true;
		try {
			for(int i=0;i<bills.length;i++){
				result=result&&allocate.insert(bills[i]);
			}
			
			InformationController IC=new InformationController();
			for(int j=0;j<bills.length;j++)	{
				for(int i=0;i<bills[j].list.size();i++){
					result=result&&IC.refreshMesg(bills[j].list.get(i),bills[j].numID, TimeHelper.getTime());
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return result;	
	}
	
	public boolean receive(ArrivementBill_Shop arrive) {
		// TODO Auto-generated method stub
		Arrive_Shop arriveHelper=new Arrive_Shop();
		boolean result=true;
		result=result&&arriveHelper.insert(arrive);
		//更新物流动态
		InformationController IC=new InformationController();
		for(int i=0;i<arrive.showAllID().size();i++){
			result=result&&IC.refreshMesg(arrive.showAllID().get(i), DepartmentHelper.getDepartment(), TimeHelper.getTime());
		}
		return result;
	}
}
