package bl.commoditybl.Impl;

import bl.commoditybl.Service.InitDepotAreaBLService;

public class InitDepotAreaController implements InitDepotAreaBLService{
	InitDepotArea init;
	
	public InitDepotAreaController(){
		init=new InitDepotArea();
	}
	@Override
	public boolean init(int[] motorTransport, int[] trainTransport, int[] airTransport, int[] balnkSpace) {
		// TODO Auto-generated method stub
		return init.init(motorTransport, trainTransport, airTransport, balnkSpace);
	}

}
