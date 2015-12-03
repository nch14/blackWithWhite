package shipmentdata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import Iphelper.Iphelper;
import bill.TransportBill_Bus;

public class BusShipment implements BusShipmentHelper{
	TransportBill_Bus a;
	boolean result;
	
	private String getURL() throws FileNotFoundException, ClassNotFoundException, IOException{
		String s="rmi://"+Iphelper.getIP()+":37003/busshipment";
		return s;
	}
	
	public boolean insert(TransportBill_Bus bill){
		try {
			 BusShipmentHelper x=(BusShipmentHelper) Naming.lookup(getURL());
			 result=x.insert(bill);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
					// TODO Auto-generated catch block
			  e.printStackTrace();
		}
		return result;
	}
	
	public TransportBill_Bus get(String id){
		try {
			 BusShipmentHelper x=(BusShipmentHelper) Naming.lookup(getURL());
			 a=x.get(id);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
					// TODO Auto-generated catch block
			  e.printStackTrace();
		}
		return a;
	}
	
	public boolean change(TransportBill_Bus bill){
		try {
			 BusShipmentHelper x=(BusShipmentHelper) Naming.lookup(getURL());
			 result=x.change(bill);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
					// TODO Auto-generated catch block
			  e.printStackTrace();
		}
		return result;
	}
	
	public boolean delete(String id){
		try {
			 BusShipmentHelper x=(BusShipmentHelper) Naming.lookup(getURL());
			 result=x.delete(id);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
					// TODO Auto-generated catch block
			  e.printStackTrace();
		}
		return result;
	}
	
	public boolean init(){
		try {
			 BusShipmentHelper x=(BusShipmentHelper) Naming.lookup(getURL());
			 result=x.init();
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
					// TODO Auto-generated catch block
			  e.printStackTrace();
		}
		return result;
	}

	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}
}
