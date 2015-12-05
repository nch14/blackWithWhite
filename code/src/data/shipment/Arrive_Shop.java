package data.shipment;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import bill.ArrivementBill_Shop;
import data.Iphelper.Iphelper;

public class Arrive_Shop implements Arrive_ShopHelper{
	ArrivementBill_Shop a;
	boolean result;
	
	private String getURL() throws FileNotFoundException, ClassNotFoundException, IOException{
		String s="rmi://"+Iphelper.getIP()+":37002/arriveshop";
		return s;
	}
	
	public boolean insert(ArrivementBill_Shop bill){
		try {
			 Arrive_ShopHelper x=(Arrive_ShopHelper) Naming.lookup(getURL());
			 result=x.insert(bill);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
					// TODO Auto-generated catch block
			  e.printStackTrace();
		}
		return result;
	}
	
	public boolean delete(String id){
		try {
			 Arrive_ShopHelper x=(Arrive_ShopHelper) Naming.lookup(getURL());
			 result=x.delete(id);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
					// TODO Auto-generated catch block
			  e.printStackTrace();
		}
		return result;
	}
	
	public boolean change(ArrivementBill_Shop bill){
		try {
			 Arrive_ShopHelper x=(Arrive_ShopHelper) Naming.lookup(getURL());
			 result=x.change(bill);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
					// TODO Auto-generated catch block
			  e.printStackTrace();
		}
		return result;
	}
	
	public ArrivementBill_Shop get(String id){
		try {
			 Arrive_ShopHelper x=(Arrive_ShopHelper) Naming.lookup(getURL());
			 a=x.get(id);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
					// TODO Auto-generated catch block
			  e.printStackTrace();
		}
		return a;
	}
	
	public boolean init(){
		try {
			 Arrive_ShopHelper x=(Arrive_ShopHelper) Naming.lookup(getURL());
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
