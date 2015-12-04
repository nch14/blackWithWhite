package bl.staff.service;

import vo.StaffVO;

/**
 * 总经理的人员机构管理
 * @author 倪辰皓
 *
 */
public interface StaffManageBLService {

	/**
	 * 创建员工
	 * @param staffs 界面层传过来的staffVO对象
	 * @return 创建成功与否（有没有记录到服务器）
	 */
	public boolean addNewStaff (StaffVO[] staffs);

	/**
	 * 删除员工
	 * @param ID 界面层传过来的员工的ID
	 * @return
	 */
	public boolean deleteStaff (String[] ID);

	/**
	 * 更改员工的职位
	 * @param ID 员工的ID
	 * @param newPosition 员工新的职位
	 * @param newDepartment 员工新的部门
	 * @return
	 */
	public boolean changePosition (String ID[],String newPosition[],String newDepartment[]);
	
	/**
	 * 更改员工的薪水策略
	 * @param ID 员工的ID
	 * @param salaryModel 薪水策略
	 * @return
	 */
	public boolean changesalarymodel (String ID[],String salaryModel[]);
	
	/**
	 * 更改员工的信息
	 * @param name 名字
	 * @param age 年龄
	 * @param authority 权限
	 * @param password	密码
	 * @return
	 */
	public boolean changeStaffInfo (String name,int age,String authority,String password);
	
	/**
	 * 查找员工
	 * @param ID
	 * @return
	 */
	public StaffVO getStaff (String ID);
	
	/**
	 * 显示所有员工
	 * @return
	 */
	public StaffVO[] getStaff ();


}
