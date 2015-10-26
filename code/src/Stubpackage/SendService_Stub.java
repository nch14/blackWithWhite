package Stubpackage;

import bl.blservice.SendService;
import vo.OrderBillVO;

public class SendService_Stub implements SendService{

	@Override
	public OrderBillVO inquireSendMesg(String id) {
		// TODO Auto-generated method stub
		return new OrderBillVO();
	}


	@Override
	public OrderBillVO input(String nameOfSender, String addressOfSender, String workplaceOfSender,
			String phoneOfSender, String mobileOfSender, String nameOfReceiver, String addressOfReceiver,
			String workplaceOfReceiver, String phoneOfReceiver, String mobileOfReceiver, int numOfItem, double weight,
			String nameOfItemInside, Double[] size, double moneyForCover, String speedLevel, String kindOfSend) {
		// TODO Auto-generated method stub
		return new OrderBillVO();
	}

}
