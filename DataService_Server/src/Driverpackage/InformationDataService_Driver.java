package Driverpackage;

import dataservice.InformationDataService;
import vo.TransMesgVO;

public class InformationDataService_Driver {
	public void drive(InformationDataService infomationdataservice){
		String result=infomationdataservice.refreshTransMesg("0000000001","nju","2015 3 4");
		if(result.equals("success"))
			System.out.println("refresh success");
		else
			System.out.println("refresh fail");
		
		TransMesgVO trans=infomationdataservice.getTransMesg("0000000001");
		if(!trans.equals(null))
			System.out.println("get message successfully");
		else
			System.out.println("get message fail");
	}

}
