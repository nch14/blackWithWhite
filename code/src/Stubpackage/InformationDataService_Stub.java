package Stubpackage;

import dataservice.InformationDataService;
import vo.TransMesgVO;

public class InformationDataService_Stub implements InformationDataService{

	/*
	 * refresh the transport mesg
	 */
	@Override
	public String refreshTransMesg(String id, String position, String time) {
		// TODO Auto-generated method stub
		return "refresh transmesg successfully";
	}

	/*
	 * return the transport message
	 * in the form of transVO
	 */
	@Override
	public TransMesgVO getTransMesg(String id) {
		// TODO Auto-generated method stub
		return new TransMesgVO();
	}

}
