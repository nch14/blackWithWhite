package bl.staff.Impl;

import bill.DriverPO;
import bl.staff.service.DriverManageBLService;

public class DriverManageCotroller implements DriverManageBLService {

	@Override
	public boolean addNewDiver(DriverPO[] drivers) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteDriver(String[] ID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ChangeDriverInfo(String[] name, String[] ID, String[] IDCardNumber, String[] birthday,
			boolean[] isBoy, String[] TelNumber, String[] validate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DriverPO getDriver(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DriverPO[] getDriver() {
		// TODO Auto-generated method stub
		return null;
	}

}
