package bl.report.Impl;


import bl.report.service.*;

public class BussinessSheetController implements BussinessSheetBLService{
	BussinessSheetImpl bs;
	
	public BussinessSheetController() {
		// TODO Auto-generated method stub
		bs=new BussinessSheetImpl();
	}

	@Override
	public boolean export() {
		// TODO Auto-generated method stub
		return bs.export();
	}




	@Override
	public BussinessSheetVO show(String start, String end) {
		// TODO Auto-generated method stub
		return bs.show(start,end);
	}

}
