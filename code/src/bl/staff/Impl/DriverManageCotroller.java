package bl.staff.Impl;

import java.util.ArrayList;

import bill.DriverPO;
import bl.staff.service.DriverManageBLService;

public class DriverManageCotroller implements DriverManageBLService {
	DriverManage driverManage;
	
	public DriverManageCotroller(){
		driverManage=new DriverManage();
	}
	@Override
	public boolean addNewDiver(DriverPO[] drivers) {
		// TODO Auto-generated method stub
		return driverManage.addNewDiver(drivers);
	}

	@Override
	public boolean deleteDriver(String[] ID) {
		// TODO Auto-generated method stub
		return driverManage.deleteDriver(ID);
	}

	@Override
	public boolean ChangeDriverInfo(String[] name, String[] ID, String[] IDCardNumber, String[] birthday,
			boolean[] isBoy, String[] TelNumber, String[] validate) {
		// TODO Auto-generated method stub
		return driverManage.ChangeDriverInfo(name, ID, IDCardNumber, birthday, isBoy, TelNumber, validate);
	}

	public DriverPO getDriver(String ID) {
		// TODO Auto-generated method stub
		return driverManage.getDriver(ID);
	}

	@Override
	public ArrayList<DriverPO> getAllDriver(String str) {
		// TODO Auto-generated method stub
		return driverManage.getAllDriver(str);
	}

}
