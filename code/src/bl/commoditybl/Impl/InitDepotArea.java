package bl.commoditybl.Impl;

import java.rmi.RemoteException;

import bill.StockBlockInfo;
import data.commodity.Commodity;
import tools.DepartmentHelper;

public class InitDepotArea {
	Commodity co;
	public InitDepotArea(){
		co=new Commodity();
	}
	
	public boolean init(int[] motorTransport, int[] trainTransport, int[] airTransport, int[] balnkSpace) {
		// TODO Auto-generated method stub
		boolean result=false;
		try {
			result=co.initialCommodity(motorTransport, trainTransport, airTransport, balnkSpace);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
