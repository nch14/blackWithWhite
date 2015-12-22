package bl.information.Service;

import vo.PackageVO;

public interface InformationBLService {
	
	/**
	 * 根据ID查询物流信息
	 * @param id 订单条形码号
	 * @return
	 */
	public PackageVO inquireTransMesg(String id);
	
	
	/**
	 * 更新物流信息
	 * @param id 订单条形码号
	 * @param position 位置
	 * @param time 时间
	 * @return
	 */
	public boolean refreshMesg(String id,String position,String time);
}
