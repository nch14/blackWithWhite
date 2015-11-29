package bl.staff.Impl;



import bl.staff.service.UserManageService;
import po.StaffPO;
import vo.StaffVO;

public class UserManageController implements UserManageService {
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
	public boolean changeStaff(String competence, String passwords, String age, String name) {
		// TODO Auto-generated method stub
		boolean isComplete=userManage.changeStaff(competence, passwords, age, name);
		return isComplete;
	}
	
	

}
