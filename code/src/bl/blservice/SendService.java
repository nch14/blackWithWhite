package bl.blservice;

import vo.OrderBillVO;

public interface SendService {
	
	/*
	 * ask the system to return the send message
	 * according to the id(String)
	 */
	public OrderBillVO inquireSendMesg(String id);
	
	
	/*
	 * input the transport bill
	 * and the components of it
	 * here the speed level and kindofsend 
	 * why not use enum
	 */
	public OrderBillVO input(String nameOfSender,String addressOfSender,
			String workplaceOfSender,String phoneOfSender,String mobileOfSender,
			String nameOfReceiver,String addressOfReceiver,String workplaceOfReceiver,
			String phoneOfReceiver,String mobileOfReceiver,int numOfItem,double weight,
			String nameOfItemInside,Double[] size,double moneyForCover,String speedLevel,
			String kindOfSend );
	
}
