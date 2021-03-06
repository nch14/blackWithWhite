package data.commodity;
 import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import bill.*;
import data.Iphelper.Iphelper;
 
public class Commodity_Out implements Commodity_Out_Manage{
	boolean result;
	StockBill_Out bill;
	
	private String getURL() throws FileNotFoundException, ClassNotFoundException, IOException{
		String s="rmi://"+Iphelper.getIP()+":32001/commodity_out_manage";
		return s;
	}
	
	public boolean insert(StockBill_Out a,String ID){
		try {
			Commodity_Out_Manage x=(Commodity_Out_Manage) Naming.lookup(getURL());
			System.out.println(ID);
			result=x.insert(a,"010");
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean delete(String id){
		try {
			Commodity_Out_Manage x=(Commodity_Out_Manage) Naming.lookup(getURL());
			result=x.delete(id);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean change(StockBill_Out a){
		try {
			Commodity_Out_Manage x=(Commodity_Out_Manage) Naming.lookup(getURL());
			result=x.change(a);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public StockBill_Out get(String id){
		try {
			Commodity_Out_Manage x=(Commodity_Out_Manage) Naming.lookup(getURL());
			bill=x.get(id);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bill;
	}
	
	public boolean init(){
		try {
			Commodity_Out_Manage x=(Commodity_Out_Manage) Naming.lookup(getURL());
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
	public ArrayList<StockBill_Out> getUnjudged() throws RemoteException {
		// TODO Auto-generated method stub
		ArrayList<StockBill_Out> array=new ArrayList<StockBill_Out>();
		try {
			Commodity_Out_Manage x=(Commodity_Out_Manage) Naming.lookup(getURL());
			array=x.getUnjudged();
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return array;
	}
}
