package informationdata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import data.information.ShipmentInfoHelper;

public class DataServiceImpl_Info {
	public static void initialService() throws FileNotFoundException, ClassNotFoundException, IOException{
		try {
			ShipmentInfoHelper helper=new ShipmentInfoImpl();
			Registry Re_helper=LocateRegistry.createRegistry(33000);
			Re_helper.rebind("shipmentinfohelper", helper);
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
