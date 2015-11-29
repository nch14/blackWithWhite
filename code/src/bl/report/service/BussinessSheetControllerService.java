package bl.report.service;

import bl.report.impl.BussinessSheetVO;

public interface BussinessSheetControllerService {
	
	/**
	 * 创建一个BSReport对象
	 * @return 是否成功
	 */
	public boolean creatBSReport();
	
	/**
	 * 设置经营情况表的开始和结束时间
	 * @param 开始时间
	 * @param 结束时间
	 * @return 是否成功
	 */
	public boolean SetDate(String start,String end);
	
	
	/**
	 * 返回经营情况表VO
	 * @return 经营情况表VO
	 */
	public BussinessSheetVO show ();
	
	
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
