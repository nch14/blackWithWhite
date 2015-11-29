package bl.report.service;

import bl.report.impl.*;

public interface ProfitSheetControllerService {
	
	/**
	 * 创建一个PSReport对象
	 * @return 是否成功
	 */
	public boolean creatPSReport();
	
	/**
	 * 设置经营情况表的开始和结束时间
	 * @param time 开始时间
	 * @return 是否成功
	 */
	public boolean SetDate(String time);
	
	
	/**
	 * 返回成本收益表VO
	 * @return 成本收益表VO
	 */
	public ProfitSheetVO show ();
	
	
	/**
	 * 导出为excel文件
	 * @return 是否成功
	 */
	public boolean export();
	
	/**
	 * 退出任务，销毁对应对象
	 * @return 是否成功
	 */
	public boolean exit();
}
