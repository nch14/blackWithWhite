package Driverpackage;

import bl.blservice.InformationService;
import vo.TransMesgVO;

public class InformationService_Driver {
	public void drive(InformationService informationService){
		TransMesgVO transMesg=informationService.inquireTransMesg("0000000001");
		if(!transMesg.equals(null))
			System.out.println("inquire transMesg successfully");
		else
			System.out.println("inquire transMesg fail");
		
		String result=informationService.refershTransMesg("0000000001", "nju", "2015 3 4");
		if(result.equals("success"))
			System.out.println("refresh successfully");
		else
			System.out.println("refresh fail");
	}

}
