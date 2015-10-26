package bl.blservice;
import vo.*;

public interface ImformationService {
	/*
	 * inquire transMesg
	 */
	public TransMesgVO inquireTransMesg(String id);
	
	/*
	 * provide an interface to refresh the transmesg
	 */
	public String refershTransMesg(String id,String location,String time);

}
