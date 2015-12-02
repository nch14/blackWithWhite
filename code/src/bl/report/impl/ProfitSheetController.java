package bl.report.Impl;

import bl.report.service.ProfitSheetBLService;

public class ProfitSheetController implements ProfitSheetBLService {
	ProfitSheetImpl ps;
	
	public ProfitSheetController(){
		ps=new ProfitSheetImpl();
	}
	@Override
	public ProfitSheetVO show() {
		// TODO Auto-generated method stub
		return ps.show();
	}

	@Override
	public boolean export() {
		// TODO Auto-generated method stub
		return ps.export();
	}



}
