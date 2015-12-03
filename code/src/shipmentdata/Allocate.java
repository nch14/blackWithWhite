package shipmentdata;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import Iphelper.Iphelper;
import bill.AllocateBill;

public class Allocate implements AllocateHelper{
	AllocateBill a;
	boolean result;
	
	private String getURL() throws FileNotFoundException, ClassNotFoundException, IOException{
		String s="rmi://"+Iphelper.getIP()+":37000/allocate";
		return s;
	}
	
	public boolean insert(AllocateBill bill){
		try {
		      AllocateHelper x=(AllocateHelper) Naming.lookup(getURL());
				result=x.insert(bill);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;
	}
	
	public boolean delete(String id){
		try {
			  AllocateHelper x=(AllocateHelper) Naming.lookup(getURL());
				result=x.delete(id);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;
	}
	
	public boolean change(AllocateBill bill){
		try {
			  AllocateHelper x=(AllocateHelper) Naming.lookup(getURL());
				result=x.change(bill);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;
	}
	
	public AllocateBill get(String id){
		try {
			  AllocateHelper x=(AllocateHelper) Naming.lookup(getURL());
				a=x.get(id);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return a;
	}
	
	public boolean init(){
		try {
			  AllocateHelper x=(AllocateHelper) Naming.lookup(getURL());
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
