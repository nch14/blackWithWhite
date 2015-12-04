package bl.staff.service;

import bill.TruckPO;

public interface TruckManageBLService {
	
	/**
	 * 增加货车
	 * @param trucks
	 * @return
	 */
	public boolean addNewTruck (TruckPO[] trucks);
	/**
	 * 删除货车
	 * @param ID
	 * @return
	 */
	public boolean deleteTruck(String ID[]);
	/**
	 * 更改货车信息
	 * @param truckID
	 * @param licensePlate
	 * @param inTime
	 * @return
	 */
	public boolean ChangeTruckInfo(String truckID[],String licensePlate [],String inTime[]);
	/**
	 * 查找货车
	 * @param ID
	 * @return
	 */
	public TruckPO getTruck (String ID);
	/**
	 * 显示所有货车
	 * @return
	 */
	public TruckPO[] getTruck ();

}
