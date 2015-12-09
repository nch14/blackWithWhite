package bl.staff.Impl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import data.staff.DriverInfo;
import po.DriverPO;

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
		} catch (Exception e) {
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
		if(name.length!=ID.length||name.length!=IDCardNumber.length||name.length!=birthday.length||
				name.length!=isBoy.length||name.length!=TelNumber.length||name.length!=validate.length)
			return false;
		if(name.length<=0)
			return false;
		boolean result=true;
		try {
			for(int i=0;i<name.length;i++){
				DriverPO driver=driverInfo.get(ID[i]);
				driver.ChangeDriverInfo(name[i], IDCardNumber[i], birthday[i], isBoy[i], TelNumber[i], validate[i]);
				result=result&&driverInfo.change(driver);
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return result;
	}


	public DriverPO getDriver(String ID) {
		// TODO Auto-generated method stub
		try {
			DriverPO driver=driverInfo.get(ID);
			return driver;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public ArrayList<DriverPO> getAllDriver(String str) {
		// TODO Auto-generated method stub
		try {
			return driverInfo.getAll(str);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}


}
