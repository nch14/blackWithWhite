package data.information;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import bill.TransMesgPO;
import data.Iphelper.Iphelper;

public class ShipmentInfo implements ShipmentInfoHelper{
	ArrayList<TransMesgPO> bill;
	boolean result;
	
	private String getURL() throws FileNotFoundException, ClassNotFoundException, IOException{
		String s="rmi://"+Iphelper.getIP()+":33000/shipmentinfohelper";
		return s;
	}
	
	public ArrayList<TransMesgPO> getTransMesg(String id){
		try {
	      ShipmentInfoHelper x=(ShipmentInfoHelper) Naming.lookup(getURL());
			bill=x.getTransMesg(id);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bill;
	}
	
	public boolean refreshTransMesg(TransMesgPO po){
		try {
		      ShipmentInfoHelper x=(ShipmentInfoHelper) Naming.lookup(getURL());
				result=x.refreshTransMesg(po);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;
	}
	
	public boolean init(){
		try {
			ShipmentInfoHelper x=(ShipmentInfoHelper) Naming.lookup(getURL());
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
