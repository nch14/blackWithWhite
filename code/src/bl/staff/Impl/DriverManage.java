package bl.staff.Impl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import bill.DriverPO;
import bill.StaffPO;
import data.staff.DriverInfo;

public class DriverManage {
	DriverInfo driverInfo;
	
	
	public DriverManage(){
		driverInfo=new DriverInfo();
	}
	public boolean addNewDiver(DriverPO[] drivers) {
		boolean result=true;
		try {
			for(int i=0;i<drivers.length;i++){
				result=result&&driverInfo.insert(drivers[i]);
			}	
			return result;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}


	public boolean deleteDriver(String[] ID) {
		if(ID.length<=0)
			return false;
		
		boolean result=true;
		for(int i=0;i<ID.length;i++){
			try {
				result=result&&driverInfo.delete(ID[i]);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		}
		return result;
	}

	public boolean ChangeDriverInfo(String[] name, String[] ID, String[] IDCardNumber, String[] birthday,
			boolean[] isBoy, String[] TelNumber, String[] validate) {
		// TODO Auto-generated method stub
		return false;
	}


	public DriverPO getDriver(String ID) {
		// TODO Auto-generated method stub
		return null;
	}


	public ArrayList<DriverPO> getAllDriver(String str) {
		// TODO Auto-generated method stub
		return null;
	}


}
