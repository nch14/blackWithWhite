package shipmentdata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import data.shipment.*;
public class DataServiceImpl_Ship {
	public static void initialService() throws FileNotFoundException, ClassNotFoundException, IOException{
		try {
			ShipmentImpl ship=new ShipmentImpl();
			AllocateHelper allo=new AllocateImpl();
			Arrive_CenterHelper arrc=new Arrive_CenterImpl();
			Arrive_ShopHelper arrs=new Arrive_ShopImpl();
			
			BusTransBill_CenterHelper bc=new BusTransBill_Centerimpl();
			BusTransBill_ShopHelper bs=new BusTransBill_ShopImpl();
			
		
			
			Registry Re_allo=LocateRegistry.createRegistry(37000);
			Registry Re_arrc=LocateRegistry.createRegistry(37001);
			Registry Re_arrs=LocateRegistry.createRegistry(37002);
			//Registry Re_bus=LocateRegistry.createRegistry(37003);
			Registry Re_bc=LocateRegistry.createRegistry(37004);
			Registry Re_bs=LocateRegistry.createRegistry(37005);
			//Registry Re_plane=LocateRegistry.createRegistry(37006);
			//Registry Re_train=LocateRegistry.createRegistry(37007);
			Registry Re_ship=LocateRegistry.createRegistry(37008);
			
			Re_allo.rebind("allocate", allo);
			Re_arrc.rebind("arrivecenter",arrc);
			Re_arrs.rebind("arriveshop", arrs);
			//Re_bus.rebind("busshipment", bus);
			Re_bc.rebind("bustransbillcenter", bc);
			Re_bs.rebind("bustransbillshop", bs);
			//Re_plane.rebind("planeshipment", plane);
			//Re_train.rebind("trainshipment", train);
			Re_ship.rebind("shipment", ship);
			
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
