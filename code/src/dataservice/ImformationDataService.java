package dataservice;

import vo.TransMesgVO;

public interface ImformationDataService {
	
	/*
	 * refresh the transport mesg
	 */
	public String refreshTransMesg(String id,String position,String time);
	
	/*
	 * return the transport message
	 * in the form of transVO
	 */
	public TransMesgVO getTransMesg(String id);

}
