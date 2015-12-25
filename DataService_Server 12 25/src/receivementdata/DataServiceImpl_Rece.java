package receivementdata;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import data.receivement.ReceiceInfoHelper;

public class DataServiceImpl_Rece {
	public static void initialService(){
		try {
			ReceiceInfoHelper helper=new ReceiveInfoImpl();
			Registry registry=LocateRegistry.createRegistry(35000);
			registry.rebind("receiceinfohelper", helper);
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
