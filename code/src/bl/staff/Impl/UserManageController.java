package bl.staff.Impl;



import java.util.ArrayList;

import bl.staff.service.UserManageBLService;
import vo.StaffVO;

public class UserManageController implements UserManageBLService {
	UserManage userManage;
	public UserManageController(){
		userManage=new UserManage();
	}
	
	
	@Override
	public StaffVO getStaff(String ID) {
		StaffVO staff=userManage.getStaff(ID);
		return staff;
	}

	@Override
	public boolean changeStaffInfo(String competence, String passwords, String age, String name,String ID,String power) {
		// TODO Auto-generated method stub
		boolean isComplete=userManage.changeStaff(ID,competence, passwords, age, name,  power);
		return isComplete;
	}


	
	public ArrayList<StaffVO> getAllStaff(String src) {
		// TODO Auto-generated method stub
		return userManage.getAllStaff(src);
	}
	
	

}
