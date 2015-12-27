package bl.staff.Impl;

import java.rmi.Naming;
import java.rmi.RemoteException;

import bill.StaffPO;
import bl.staff.service.LoginService;
import data.staff.MemberInfo;
import tools.DepartmentHelper;
import vo.StaffVO;

public class LoginController implements LoginService{
	MemberInfo member;
	public LoginController(){
		member=new MemberInfo();
	}
	
	public StaffVO validUser(String ID, String passwords) {
		// TODO Auto-generated method stub
		StaffPO staff;
		try {
			staff=member.get(ID);
			if(staff==null)
				return null;
//			if(!passwords.equals(staff.passwords))
//				return null;
			StaffVO thisUser=new StaffVO(staff);
			DepartmentHelper helper=new DepartmentHelper(thisUser);
			return thisUser;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	

}
