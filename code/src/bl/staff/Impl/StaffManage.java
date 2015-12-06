package bl.staff.Impl;

import java.rmi.RemoteException;

import bill.StaffPO;
import data.staff.MemberInfo;
import vo.StaffVO;

public class StaffManage {
	MemberInfo member;
	public StaffManage(){
		member=new MemberInfo();
	}
	public boolean addNewStaff(StaffVO[] staffs) {
		// TODO Auto-generated method stub
		/*member.insert(po)
*/		return false;
	}


	public boolean deleteStaff(String[] ID) {
		// TODO Auto-generated method stub
		if(ID.length<=0)
			return false;
		
		boolean result=true;
		for(int i=0;i<ID.length;i++){
			try {
				result=result&&member.delete(ID[i]);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		}
		return result;
	}

	
	public boolean changePosition(String[] ID, String[] newPosition, String[] newDepartment) {
		// TODO Auto-generated method stub
		if(ID.length!=newPosition.length||ID.length!=newDepartment.length)
			return false;
		if(ID.length<=0)
			return false;
		
		StaffVO thisStaff;
		StaffPO thatStaff;
		boolean result=true;
		try {
			for(int i=0;i<ID.length;i++){
				thisStaff=this.getStaff(ID[i]);
				thatStaff=new StaffPO(thisStaff);
				thatStaff.changePosition(newPosition[i], newDepartment[i]);
				result=result&&member.change(thatStaff);
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return result;
	}

	public boolean changesalarymodel(String[] ID, String[] salaryModel) {
		// TODO Auto-generated method stub
		if(ID.length!=salaryModel.length)
			return false;
		if(ID.length<=0)
			return false;
		
		StaffVO thisStaff;
		StaffPO thatStaff;
		boolean result=true;
		try {
			for(int i=0;i<ID.length;i++){
				thisStaff=this.getStaff(ID[i]);
				thatStaff=new StaffPO(thisStaff);
				thatStaff.SalaryModel=salaryModel[i];
				result=result&&member.change(thatStaff);
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return result;
	}

	public boolean changeStaffInfo(String name, int age, String authority, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public StaffVO getStaff(String ID) {
		// TODO Auto-generated method stub
		return null;
	}


	public StaffVO[] getStaff() {
		// TODO Auto-generated method stub
		return null;
	}
}
