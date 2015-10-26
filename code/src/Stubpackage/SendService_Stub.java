package Stubpackage;

import bl.blservice.SendService;
import vo.OrderBillVO;

public class SendService_Stub implements SendService{

	@Override
	public String inquireTransMesg(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderBillVO input(String nameOfSender, String addressOfSender, String workplaceOfSender,
			String phoneOfSender, String mobileOfSender, String nameOfReceiver, String addressOfReceiver,
			String workplaceOfReceiver, String phoneOfReceiver, String mobileOfReceiver, int numOfItem, double weight,
			String nameOfItemInside, double[][][] size, double moneyForCover, String speedLevel, String kindOfSend) {
		// TODO Auto-generated method stub
		return null;
	}

}
