package bl.information.Impl;

import java.util.ArrayList;

import bill.PackageVO;
import bill.TransMesgPO;
import data.information.ShipmentInfo;

public class Information {
	ShipmentInfo ship;
	
	public Information(){
		ship=new ShipmentInfo();
	}

	public PackageVO  inquireTransMesg(String id) {
		// TODO Auto-generated method stub
		ArrayList<TransMesgPO> transMesg;
		PackageVO packageVO=new PackageVO(id); 
		try {
			transMesg=ship.getTransMesg(id);
			packageVO.refreshState(transMesg);
			return packageVO;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}


	public boolean refreshMesg(String id, String position, String time) {
		// TODO Auto-generated method stub
		TransMesgPO message=new TransMesgPO(id,time,position);
		try {
			return ship.refreshTransMesg(message);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

}
