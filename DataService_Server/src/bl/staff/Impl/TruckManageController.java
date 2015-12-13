package bl.staff.Impl;

import java.util.ArrayList;

import bill.TruckPO;
import bl.staff.service.TruckManageBLService;

public class TruckManageController implements TruckManageBLService {
	TruckManage truckManage;
	public TruckManageController(){
		truckManage=new TruckManage();
	}
	@Override
	public boolean addNewTruck(TruckPO[] trucks) {
		// TODO Auto-generated method stub
		return truckManage.addNewTruck(trucks);
	}

	@Override
	public boolean deleteTruck(String[] ID) {
		// TODO Auto-generated method stub
		return truckManage.deleteTruck(ID);
	}

	@Override
	public boolean ChangeTruckInfo(String[] truckID, String[] licensePlate, String[] inTime) {
		// TODO Auto-generated method stub
		return truckManage.ChangeTruckInfo(truckID, licensePlate, inTime);
	}

	@Override
	public TruckPO getTruck(String ID) {
		// TODO Auto-generated method stub
		return truckManage.getTruck(ID);
	}

	@Override
	public ArrayList<TruckPO> getTruck() {
		// TODO Auto-generated method stub
		return truckManage.getTruck();
	}

}
