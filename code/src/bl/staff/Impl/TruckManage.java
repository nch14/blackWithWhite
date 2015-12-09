package bl.staff.Impl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import bill.DriverPO;
import bill.TruckPO;
import data.staff.BusInfo;

public class TruckManage {
	BusInfo truckInfo;
	public TruckManage(){
		truckInfo=new BusInfo();
	}
	public boolean addNewTruck(TruckPO[] trucks) {
		// TODO Auto-generated method stub
		boolean result=true;
		try {
			for(int i=0;i<trucks.length;i++){
				result=result&&truckInfo.insert(trucks[i]);
			}	
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteTruck(String[] ID) {
		if(ID.length<=0)
			return false;
		
		boolean result=true;
		for(int i=0;i<ID.length;i++){
			try {
				result=result&&truckInfo.delete(ID[i]);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		}
		return result;
	}

	
	public boolean ChangeTruckInfo(String[] truckID, String[] licensePlate, String[] inTime) {
		// TODO Auto-generated method stub
		if(truckID.length!=licensePlate.length||truckID.length!=inTime.length)
			return false;
		if(truckID.length<=0)
			return false;
		boolean result=true;
		try {
			for(int i=0;i<truckID.length;i++){
				TruckPO truck=truckInfo.get(truckID[i]);
				truck.ChangeTruckInfo(licensePlate[i], inTime[i]);
				result=result&&truckInfo.change(truck);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return result;
	}


	public TruckPO getTruck(String ID) {
		// TODO Auto-generated method stub
		try {
			TruckPO truck=truckInfo.get(ID);
			return truck;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public ArrayList<TruckPO> getTruck() {
		// TODO Auto-generated method stub
		ArrayList<TruckPO> allTrucks;
		try {
			allTrucks=truckInfo.getAll();
			return allTrucks;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
