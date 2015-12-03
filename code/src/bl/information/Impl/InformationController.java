package bl.information.Impl;

import bl.information.Service.InformationBLService;

public class InformationController implements InformationBLService{
	Information inf;

	public InformationController(){
		inf=new Information();
	}
	@Override
	public boolean inquireTransMesg(String id) {
		// TODO Auto-generated method stub
		return inf.inquireTransMesg(id);
	}

	@Override
	public boolean refreshMesg(String id, String position, String time) {
		// TODO Auto-generated method stub
		return inf.refreshMesg(id, position, time);
	}

}
