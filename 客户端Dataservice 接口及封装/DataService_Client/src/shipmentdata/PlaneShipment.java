package shipmentdata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import Iphelper.Iphelper;
import bill.TransportBill_Plane;

public class PlaneShipment implements PlaneShipmentHelper{
	TransportBill_Plane a;
	boolean result;
	
	private String getURL() throws FileNotFoundException, ClassNotFoundException, IOException{
		String s="rmi://"+Iphelper.getIP()+":37006/planeshipment";
		return s;
	}
	
	public boolean insert(TransportBill_Plane bill){
		try {
			 PlaneShipmentHelper x=(PlaneShipmentHelper) Naming.lookup(getURL());
			 result=x.insert(bill);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
					// TODO Auto-generated catch block
			  e.printStackTrace();
		}
		return result;
	}
	
	public TransportBill_Plane get(String id){
		try {
			PlaneShipmentHelper x=(PlaneShipmentHelper) Naming.lookup(getURL());
			 a=x.get(id);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
					// TODO Auto-generated catch block
			  e.printStackTrace();
		}
		return a;
	}
	
	public boolean change(TransportBill_Plane bill){
		try {
			PlaneShipmentHelper x=(PlaneShipmentHelper) Naming.lookup(getURL());
			 result=x.change(bill);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
					// TODO Auto-generated catch block
			  e.printStackTrace();
		}
		return result;
	}
	
	public boolean delete(String id){
		try {
			PlaneShipmentHelper x=(PlaneShipmentHelper) Naming.lookup(getURL());
			 result=x.delete(id);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
					// TODO Auto-generated catch block
			  e.printStackTrace();
		}
		return result;
	}
	
	public boolean init(){
		try {
			PlaneShipmentHelper x=(PlaneShipmentHelper) Naming.lookup(getURL());
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
