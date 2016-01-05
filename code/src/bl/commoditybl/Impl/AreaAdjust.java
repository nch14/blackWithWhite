package bl.commoditybl.Impl;

import data.commodity.Commodity;
import tools.DepartmentHelper;

public class AreaAdjust {
	Commodity commodity=new Commodity();
	public boolean areaAdjust(int[] rows, String type) {
		// TODO Auto-generated method stub

		try {
			boolean result = true;
			boolean result2= true;
			for(int i=0;i<rows.length;i++){
			result=commodity.adjustCommodity(DepartmentHelper.getDepartment(),
					""+rows[i], type);
			if(result==false){
				result2 = false;
			}
			}
			return result2;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	
	}
}
