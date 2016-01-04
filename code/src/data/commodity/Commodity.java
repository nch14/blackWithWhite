package data.commodity;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import bill.*;
import data.Iphelper.Iphelper;

public class Commodity implements CommodityManage{
	StockBlockInfo info;
	boolean result;
	
	private String getURL() throws FileNotFoundException, ClassNotFoundException, IOException{
		String s="rmi://"+Iphelper.getIP()+":32002/commoditymanage";
		return s;
	}
	
	public boolean adjustCommodity(String ID,String num,String block){
		try {
			CommodityManage x=(CommodityManage) Naming.lookup(getURL());
			result=x.adjustCommodity(ID,num,block);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean init(String id){
		try {
			CommodityManage x=(CommodityManage) Naming.lookup(getURL());
			result=x.init(id);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public StockBlockInfo checkCommodity(String id){
		try {
			CommodityManage x=(CommodityManage) Naming.lookup(getURL());
			info=x.checkCommodity(id);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return info;
	}

	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean initialCommodity(String id,int[] bus,int[] train,int[] plane,int[] blank) throws RemoteException {
		// TODO Auto-generated method stub
		try {
			CommodityManage x=(CommodityManage) Naming.lookup(getURL());
			result=x.initialCommodity(id,bus,train,plane,blank);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
