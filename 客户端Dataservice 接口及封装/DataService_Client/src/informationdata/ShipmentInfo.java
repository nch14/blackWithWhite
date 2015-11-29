package informationdata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;

import Iphelper.Iphelper;
import bill.TransMesgPO;

public class ShipmentInfo {
	TransMesgPO bill;
	boolean result;
	
	private String getURL() throws FileNotFoundException, ClassNotFoundException, IOException{
		String s="rmi://"+Iphelper.getIP()+":33000/shipmentinfohelper";
		return s;
	}
	
	public TransMesgPO getTransMesg(String id){
		try {
	      ShipmentInfoHelper x=(ShipmentInfoHelper) Naming.lookup(getURL());
			bill=x.getTransMesg(id);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bill;
	}
	
	public boolean refreshTransMesg(String id,String position,String time){
		try {
		      ShipmentInfoHelper x=(ShipmentInfoHelper) Naming.lookup(getURL());
				result=x.refreshTransMesg(id, position, time);
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
}
