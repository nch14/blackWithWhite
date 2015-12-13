package bl.report.service;

import vo.BussinessSheetVO;

public interface BussinessSheetBLService {

	/**
	 * 查看经营情况表
	 * @param start 开始时间
	 * @param end 结束时间
	 * @return
	 */
	public BussinessSheetVO show (String start,String end);
	
	
	/**
	 * 导出为excel文件
	 * @return 是否成功
	 */
	public boolean export();
	


}
