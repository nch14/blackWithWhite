package bl.report.service;

import vo.ProfitSheetVO;

public interface ProfitSheetBLService {
	
	/**
	 * 查看成本收益表
	 * @return
	 */
	public ProfitSheetVO show ();
	
	
	/**
	 * 导出为excel文件
	 * @return 是否成功
	 */
	public boolean export();
	

}
