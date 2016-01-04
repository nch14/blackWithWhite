package bl.commoditybl.Impl;

import bl.commoditybl.Service.InitDepotAreaBLService;
import tools.DepartmentHelper;

public class InitDepotAreaController implements InitDepotAreaBLService{
	InitDepotArea init;
	
	public InitDepotAreaController(){
		init=new InitDepotArea();
	}

	@Override
	public boolean init(String id, int[] motorTransport, int[] trainTransport, int[] airTransport, int[] balnkSpace) {
		// TODO Auto-generated method stub
		return init.init(id,motorTransport, trainTransport, airTransport, balnkSpace);
	}

}
