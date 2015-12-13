package bl.report.impl;

import bl.report.service.*;
import vo.BussinessSheetVO;
/**
 * 提供了查询经营情况表的功能
 * @author 倪辰皓
 *
 */
public class BussinessSheetController implements BussinessSheetBLService{
	BussinessSheetImpl bs;
	
	public BussinessSheetController() {
		// TODO Auto-generated method stub
		bs=new BussinessSheetImpl();
	}
	
	public BussinessSheetVO show(String start, String end) {
		// TODO Auto-generated method stub
		return bs.show(start,end);
	}

	public boolean export() {
		// TODO Auto-generated method stub
		return bs.export();
	}
}
