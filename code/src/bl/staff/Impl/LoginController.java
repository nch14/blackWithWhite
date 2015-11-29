package bl.staff.Impl;

import java.rmi.Naming;

import po.StaffPO;
import vo.StaffVO;

public class LoginController {
	StaffPO thisStaff;
	
	public StaffVO checkLogin(String ID,String password){
		try{
			thisStaff=(StaffPO)Naming.lookup("rmi://localhost:1099/thisStaff");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("登录界面，获取对象失败");
		}
		String passwordFromCloud=thisStaff.passwords;
		if(password==passwordFromCloud){
			return new StaffVO(thisStaff); //如果验证成功，返回该对象的VO，界面层可以读取该用户信息
		}else{
			return new StaffVO();//如果无法验证身份，返回一个空的StaffVO对象
		}
	}
}
