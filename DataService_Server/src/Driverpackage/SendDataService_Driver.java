package Driverpackage;

import dataservice.SendDataService;
import vo.OrderBillVO;

public class SendDataService_Driver {
	public void drive(SendDataService sendDataService){
		OrderBillVO orderBillVO=sendDataService.getSendMesg("0000000001");
		if(!orderBillVO.equals(null))
			System.out.println("get send message success");
		else
			System.out.println("get send message failure");
		
		String resultmessage=sendDataService.input(orderBillVO);
		if(resultmessage.equals("input success"))
			System.out.println(resultmessage);
		else
			System.out.println("Fail in SenddataService");
	}

}
