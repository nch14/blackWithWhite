package bl.staff.Impl;

import bl.staff.service.StaffManageBLService;
import vo.StaffVO;

public class StaffManageController implements StaffManageBLService {
	StaffManage staffManage;
	public StaffManageController(){
		staffManage=new StaffManage();
	}
	@Override
	public boolean addNewStaff(StaffVO[] staffs) {
		// TODO Auto-generated method stub
		return staffManage.addNewStaff(staffs);
	}

	@Override
	public boolean deleteStaff(String[] ID) {
		// TODO Auto-generated method stub
		return staffManage.deleteStaff(ID);
	}

	@Override
	public boolean changePosition(String[] ID, String[] newPosition, String[] newDepartment) {
		// TODO Auto-generated method stub
		return staffManage.changePosition(ID, newPosition, newDepartment);
	}

	@Override
	public boolean changesalarymodel(String[] ID, String[] salaryModel) {
		// TODO Auto-generated method stub
		return staffManage.changesalarymodel(ID, salaryModel);
	}

	@Override
	public boolean changeStaffInfo(String ID,String name, int age, String authority, String password) {
		// TODO Auto-generated method stub
		return staffManage.changeStaffInfo(ID,name, age, authority, password);
	}

	@Override
	public StaffVO getStaff(String ID) {
		// TODO Auto-generated method stub
		return staffManage.getStaff(ID);
	}

	@Override
	public StaffVO[] getStaff() {
		// TODO Auto-generated method stub
		return staffManage.getStaff();
	}

}
