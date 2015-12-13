package bl.commoditybl.Impl;

import data.commodity.Commodity;
import tools.DepartmentHelper;

public class AreaAdjust {
	Commodity commodity=new Commodity();
	public boolean areaAdjust(int rows, String type) {
		// TODO Auto-generated method stub

		try {
			boolean result=commodity.adjustCommodity(DepartmentHelper.getDepartment(),
					""+rows, type);
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	
	}
}
