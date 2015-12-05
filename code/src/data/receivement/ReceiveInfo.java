package data.receivement;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import bill.ReceiveBill;
import data.Iphelper.Iphelper;
import data.information.ShipmentInfoHelper;

public class ReceiveInfo implements ReceiceInfoHelper{
	boolean result;
	ReceiveBill a;
	
	private String getURL() throws FileNotFoundException, ClassNotFoundException, IOException{
		String s="rmi://"+Iphelper.getIP()+":35000/receiceinfohelper";
		return s;
	}
	
	public ReceiveBill get(String id){
		try {
		      ReceiceInfoHelper x=(ReceiceInfoHelper) Naming.lookup(getURL());
				a=x.get(id);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return a;
	}
	
	public boolean insert(ReceiveBill bill){
		try {
		      ReceiceInfoHelper x=(ReceiceInfoHelper) Naming.lookup(getURL());
				result=x.insert(bill);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;
	}
	
	public boolean delete(String id){
		try {
		      ReceiceInfoHelper x=(ReceiceInfoHelper) Naming.lookup(getURL());
				result=x.delete(id);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;
	}
	
	public boolean update(String id){
		try {
		      ReceiceInfoHelper x=(ReceiceInfoHelper) Naming.lookup(getURL());
				result=x.update(id);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;
	}
	
	public boolean init(){
		try {
		      ReceiceInfoHelper x=(ReceiceInfoHelper) Naming.lookup(getURL());
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
