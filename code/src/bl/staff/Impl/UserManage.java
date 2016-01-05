package bl.staff.Impl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import bill.StaffPO;
import data.staff.MemberInfo;
import vo.StaffVO;

public class UserManage {
	StaffPO staff;
	MemberInfo member;
	
	public UserManage(){
		member=new MemberInfo();
	}
	public StaffVO getStaff(String ID) {
		try {
			staff=member.get(ID);
			StaffVO staffToshow=new StaffVO(staff);
			return staffToshow;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public boolean changeStaff(String ID,String competence, String passwords, String age, String name,String power) {
		// TODO Auto-generated method stub
		if(ID==null||name==null||age==null||competence==null||passwords==null)
			return false;	
		boolean result=true;
		
		try {
			staff=member.get(ID);
		} catch (RemoteException e1) {
			return false;
		}
		
		try {
			staff.changeStaffInfo(name,Integer.parseInt(age),competence, passwords);
			if(power!=null){
				staff.authority=power;
			}
			result=result&&member.change(staff);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return result;
	}
	public ArrayList<StaffVO> getAllStaff(String src) {
		StaffManageController staff=new StaffManageController();
		// TODO Auto-generated method stub
		return staff.getAllStaff(src);
	}
}
