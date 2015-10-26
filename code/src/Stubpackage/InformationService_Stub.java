package Stubpackage;

import bl.blservice.InformationService;
import vo.TransMesgVO;

public class InformationService_Stub implements InformationService{

	@Override
	public TransMesgVO inquireTransMesg(String id) {
		// TODO Auto-generated method stub
		return new TransMesgVO();
	}

	@Override
	public String refershTransMesg(String id, String location, String time) {
		// TODO Auto-generated method stub
		return "success refresh the TransMesg";
	}

}
