package shipmentdata;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import Iphelper.Iphelper;
import bill.ArrivementBill_Center;


public class Arrive_Center implements Arrive_CenterHelper{
	ArrivementBill_Center a;
	boolean result;
	
	private String getURL() throws FileNotFoundException, ClassNotFoundException, IOException{
		String s="rmi://"+Iphelper.getIP()+":37001/arrivecenter";
		return s;
	}
	
	public boolean insert(ArrivementBill_Center bill){
		try {
			  Arrive_CenterHelper x=(Arrive_CenterHelper) Naming.lookup(getURL());
				result=x.insert(bill);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;
	}
	
	public boolean delete(String id){
		try {
			Arrive_CenterHelper x=(Arrive_CenterHelper) Naming.lookup(getURL());
				result=x.delete(id);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;
	}
	
	public boolean change(ArrivementBill_Center bill){
		try {
			Arrive_CenterHelper x=(Arrive_CenterHelper) Naming.lookup(getURL());
				result=x.change(bill);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;
	}
	
	public ArrivementBill_Center get(String id){
		try {
			Arrive_CenterHelper x=(Arrive_CenterHelper) Naming.lookup(getURL());
				a=x.get(id);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return a;
	}
	
	public boolean init(){
		try {
			Arrive_CenterHelper x=(Arrive_CenterHelper) Naming.lookup(getURL());
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
