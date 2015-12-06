package bl.staff.Impl;

import java.rmi.RemoteException;

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
	public boolean changeStaff(String competence, String passwords, String age, String name) {
		// TODO Auto-generated method stub
		if(name==null||age==null||competence==null||passwords==null)
			return false;
		
		boolean result=true;
		try {
			staff.changeStaffInfo(name,Integer.parseInt(age),competence, passwords);
			result=result&&member.change(staff);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return result;
	}
}
