package bl.staff.Impl;

import bl.staff.service.StaffManageBLService;
import vo.StaffVO;

public class StaffManageController implements StaffManageBLService {
	
	@Override
	public boolean addNewStaff(StaffVO[] staffs) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStaff(String[] ID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changePosition(String[] ID, String[] newPosition, String[] newDepartment) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changesalarymodel(String[] ID, String[] salaryModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changeStaffInfo(String name, int age, String authority, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public StaffVO getStaff(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StaffVO[] getStaff() {
		// TODO Auto-generated method stub
		return null;
	}

}
