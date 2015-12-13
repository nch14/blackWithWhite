package bl.staff.service;

import java.util.ArrayList;

import bill.DriverPO;
import bill.TruckPO;

public interface DriverManageBLService {
	/**
	 * 增加司机
	 * @param trucks
	 * @return
	 */
	public boolean addNewDiver (DriverPO[] drivers);
	/**
	 * 删除司机
	 * @param ID
	 * @return
	 */
	public boolean deleteDriver(String ID[]);
	/**
	 * 更改司机信息
	 * @param name
	 * @param ID
	 * @param IDCardNumber
	 * @param birthday
	 * @param isBoy
	 * @param TelNumber
	 * @param validate
	 * @return
	 */
	public boolean ChangeDriverInfo(String name[],String ID[],String IDCardNumber[],
			String birthday[],boolean isBoy[],String TelNumber[],String validate[]);
	/**
	 * 查找司机
	 * @param ID
	 * @return
	 */
	public DriverPO getDriver (String ID);
	/**
	 * 显示所有司机或模糊搜索
	 * @return
	 */
	public ArrayList<DriverPO> getAllDriver (String str);
}
