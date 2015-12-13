package Driverpackage;

import bl.send.Service.SendService;
import vo.OrderBillVO;

public class SendService_Driver {
	public void drive(SendService sendService){
		OrderBillVO orderBill=sendService.inquireSendMesg("0000000001");
		if(!orderBill.equals(null))
			System.out.println("inquire success");
		else
			System.out.println("inquire failure");
		
		OrderBillVO orderbill=sendService.input("jack", "nju", "nju_soft", "12345", "123456", 
				"mike", "tsu", "tsu_soft", "23456", 
				"234567", 4, 10.0, "apple", new Double[3], 10.0,
				"fast", "vip");
		if(!orderbill.equals(null))
			System.out.println("input success");
		else
			System.out.println("input failure");
	}

}
