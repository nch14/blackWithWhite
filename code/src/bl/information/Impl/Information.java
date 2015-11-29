package bl.information.Impl;

import bl.information.Service.InformationService;
import informationdata.ShipmentInfo;

public class Information implements InformationService{

	@Override
	public boolean inquireTransMesg(String id) {
		// TODO Auto-generated method stub
		ShipmentInfo ship=new ShipmentInfo();
		ship.getTransMesg(id);
		return false;
	}

	@Override
	public boolean refreshMesg(String id, String position, String time) {
		// TODO Auto-generated method stub
		return false;
	}

}
