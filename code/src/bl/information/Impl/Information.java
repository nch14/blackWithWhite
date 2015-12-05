package bl.information.Impl;

import informationdata.ShipmentInfo;

public class Information {
	ShipmentInfo ship;
	
	public Information(){
		ship=new ShipmentInfo();
	}

	public Package inquireTransMesg(String id) {
		// TODO Auto-generated method stub
		try {
			ship.getTransMesg(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	public boolean refreshMesg(String id, String position, String time) {
		// TODO Auto-generated method stub
		return false;
	}

}
