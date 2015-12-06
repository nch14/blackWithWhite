package bl.commoditybl.Impl;

import bl.commoditybl.Service.AreaAdjustBLService;

public class AreaAdjustController implements AreaAdjustBLService {
	AreaAdjust adjust;
	public AreaAdjustController(){
		adjust=new AreaAdjust();
	}
	@Override
	public boolean areaAdjust(int[] rows, String type) {
		// TODO Auto-generated method stub
		return adjust.areaAdjust(rows, type);
	}

}
