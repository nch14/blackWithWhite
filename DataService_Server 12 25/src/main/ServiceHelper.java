package main;

import java.io.FileNotFoundException;
import java.io.IOException;

import commoditydata.DataServiceImpl_Com;
import informationdata.DataServiceImpl_Info;
import moneydata.DataServiceImpl_Mony;
import receivementdata.DataServiceImpl_Rece;
import senddata.DataServiceImpl_Send;
import shipmentdata.DataServiceImpl_Ship;
import staffdata.DataServiceImpl_Staff;

public class ServiceHelper {
	
	public synchronized static void initialService() throws Exception{
			DataServiceImpl_Com.initialService();
			DataServiceImpl_Info.initialService();
			DataServiceImpl_Mony.initialService();
			DataServiceImpl_Rece.initialService();
			DataServiceImpl_Send.initialService();
			DataServiceImpl_Ship.initialService();
			DataServiceImpl_Staff.initialService();
			
			//System.out.println("success");

	}
}
