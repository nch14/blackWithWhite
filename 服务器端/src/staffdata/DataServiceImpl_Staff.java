package staffdata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import data.staff.*;
public class DataServiceImpl_Staff {
	public static void initialService() throws FileNotFoundException, ClassNotFoundException, IOException{
		try {
			AgencyInfoHelper agen=new AgencyImpl();
			BusInfoHelper businfo=new BusInfoImpl();
			DriverInfoHelper driver=new DriverInfoImpl();
			MemberInfoHelper mem=new MemberInfoImpl();
			
			Registry Re_agen=LocateRegistry.createRegistry(38000);
			Registry Re_businfo=LocateRegistry.createRegistry(38001);
			Registry Re_driver=LocateRegistry.createRegistry(38002);
			Registry Re_mem=LocateRegistry.createRegistry(38003);
			
			Re_agen.rebind("agencyinfohelper", agen);
			Re_businfo.rebind("businfohelper", businfo);
			Re_driver.rebind("driverinfohelper", driver);
			Re_mem.rebind("memberinfohelper", mem);
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
