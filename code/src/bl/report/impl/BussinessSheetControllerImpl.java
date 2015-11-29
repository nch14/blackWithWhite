package bl.report.Impl;

import bl.report.service.*;

public class BussinessSheetControllerImpl implements BussinessSheetControllerService{
	BussinessSheetImpl bs;
	@Override
	public boolean creatBSReport() {
		// TODO Auto-generated method stub
		bs=new BussinessSheetImpl();
		if(bs==null)
			return false;
		return true;
	}

	@Override
	public boolean SetDate(String start, String end) {
		// TODO Auto-generated method stub
		bs.setBussinessSheetVO(start, end);
		
		return false;
	}

	@Override
	public BussinessSheetVO show(BussinessSheetImpl bs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean export() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BussinessSheetVO show(bl.report.service.BussinessSheetService bs) {
		// TODO Auto-generated method stub
		return null;
	}

}
