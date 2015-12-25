package bl.staff.Impl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import bill.StaffPO;
import data.staff.MemberInfo;
import vo.StaffVO;

public class StaffManage {
	MemberInfo member;
	StaffPO staffPO;
	public StaffManage(){
		member=new MemberInfo();
	}
	public boolean addNewStaff(StaffVO[] staffs) {
		// TODO Auto-generated method stub
		boolean result=true;
		try {
			for(int i=0;i<staffs.length;i++){
//				System.out.println(i+" "+staffs[i].name+staffs.length);
				if(!(staffs[i]==null)){
					staffPO=new StaffPO(staffs[i]);
					result=result&&member.insert(staffPO);
				}
				
			}	
			return result;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
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

	
	public StaffVO getStaff(String ID) {
		try {
			staffPO=member.get(ID);
			StaffVO staffToshow=new StaffVO(staffPO);
			return staffToshow;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}


	public ArrayList<StaffVO> getAllStaff(String src) {
		// TODO Auto-generated method stub
		ArrayList<StaffPO> staffs;
		ArrayList<StaffVO> staffsToShow=new ArrayList<StaffVO>();
		try {
			staffs=member.getAll(src);
			for(int i=0;i<staffs.size();i++){
				StaffVO staffTemp=new StaffVO(staffs.get(i));
				staffsToShow.add(staffTemp);
			}
			return staffsToShow;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
