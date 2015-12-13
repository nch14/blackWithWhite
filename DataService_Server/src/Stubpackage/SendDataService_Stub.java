package Stubpackage;

import dataservice.SendDataService;
import vo.OrderBillVO;

public class SendDataService_Stub implements SendDataService {

	@Override
	public OrderBillVO getSendMesg(String id) {
		// TODO Auto-generated method stub
		return new OrderBillVO();
	}

	@Override
	public String input(OrderBillVO odVO) {
		// TODO Auto-generated method stub
		return "input success";
	}

}
