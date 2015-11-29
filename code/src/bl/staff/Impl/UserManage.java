package bl.staff.Impl;

import java.rmi.Naming;

import po.StaffPO;
import vo.StaffVO;

public class UserManage {
	StaffPO staff;

	public StaffVO getStaff(String ID) {
		// TODO Auto-generated method stub
		try{
			staff=(StaffPO)Naming.lookup("rmi://localhost:1099/Staff");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("用户管理界面，获取对象失败");
		}
		StaffVO staffVO=new StaffVO(staff);
		return staffVO;
	}

	
	public boolean changeStaff(String competence, String passwords, String age, String name) {
		// TODO Auto-generated method stub
		
		return false;
	}
}
