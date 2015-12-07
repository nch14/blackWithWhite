package data.shipment;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import bill.BusShipmentBill_Center;
import data.Iphelper.Iphelper;

public class BusTransBill_Center implements BusTransBill_CenterHelper{
	BusShipmentBill_Center a;
	boolean result;
	
	private String getURL() throws FileNotFoundException, ClassNotFoundException, IOException{
		String s="rmi://"+Iphelper.getIP()+":37004/bustransbillcenter";
		return s;
	}
	
	public boolean insert(BusShipmentBill_Center bill){
		try {
			BusTransBill_CenterHelper x=(BusTransBill_CenterHelper) Naming.lookup(getURL());
			 result=x.insert(bill);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
					// TODO Auto-generated catch block
			  e.printStackTrace();
		}
		return result;
	}
	
	public BusShipmentBill_Center get(String id){
		try {
			BusTransBill_CenterHelper x=(BusTransBill_CenterHelper) Naming.lookup(getURL());
			 a=x.get(id);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
					// TODO Auto-generated catch block
			  e.printStackTrace();
		}
		return a;
	}
	
	public boolean change(BusShipmentBill_Center bill){
		try {
			BusTransBill_CenterHelper x=(BusTransBill_CenterHelper) Naming.lookup(getURL());
			 result=x.change(bill);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
					// TODO Auto-generated catch block
			  e.printStackTrace();
		}
		return result;
	}
	
	public boolean delete(String id){
		try {
			BusTransBill_CenterHelper x=(BusTransBill_CenterHelper) Naming.lookup(getURL());
			 result=x.delete(id);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
					// TODO Auto-generated catch block
			  e.printStackTrace();
		}
		return result;
	}
	
	public boolean init(){
		try {
			BusTransBill_CenterHelper x=(BusTransBill_CenterHelper) Naming.lookup(getURL());
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

	@Override
	public ArrayList<BusShipmentBill_Center> getUnjudged() throws RemoteException {
		// TODO Auto-generated method stub
		ArrayList<BusShipmentBill_Center> array=new ArrayList<BusShipmentBill_Center>();
		try {
			BusTransBill_CenterHelper x=(BusTransBill_CenterHelper) Naming.lookup(getURL());
			 array=x.getUnjudged();
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
					// TODO Auto-generated catch block
			  e.printStackTrace();
		}
		return array;
	}
}
