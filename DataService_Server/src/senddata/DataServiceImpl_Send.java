package senddata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import data.send.SendInfoHelper;

public class DataServiceImpl_Send {
	public static void initialService() throws FileNotFoundException, ClassNotFoundException, IOException{
		try {
			SendInfoHelper helper=new SendInfoImpl();
			Registry registry=LocateRegistry.createRegistry(36000);
			registry.rebind("sendinfohelper", helper);
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
