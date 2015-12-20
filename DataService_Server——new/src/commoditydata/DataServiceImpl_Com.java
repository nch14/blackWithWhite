package commoditydata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import data.commodity.*;

public class DataServiceImpl_Com {
	public static void initialService() throws FileNotFoundException, ClassNotFoundException, IOException{
		try {
			Commodity_In_Manage comIn=new Commodity_inImpl();
			Commodity_Out_Manage comOut=new Commodity_OutImpl();
			CommodityManage comMan=new CommodityManageImpl();
			
			Registry Re_comin=LocateRegistry.createRegistry(32000);
			Registry Re_comOut=LocateRegistry.createRegistry(32001);
			Registry Re_comMan=LocateRegistry.createRegistry(32002);
			
			Re_comin.rebind("commodity_in_manage", comIn);
			Re_comOut.rebind("commodity_out_manage", comOut);
			Re_comMan.rebind("commoditymanage", comMan);
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
