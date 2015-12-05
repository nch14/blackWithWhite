package data.commodity;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import bill.*;
import data.Iphelper.Iphelper;

public class Commodity implements CommodityManage{
	StockFillmentInfo info;
	boolean result;
	
	private String getURL() throws FileNotFoundException, ClassNotFoundException, IOException{
		String s="rmi://"+Iphelper.getIP()+":32002/commoditymanage";
		return s;
	}
	
	public boolean adjustCommodity(StockBlockInfo a){
		try {
			CommodityManage x=(CommodityManage) Naming.lookup(getURL());
			result=x.adjustCommodity(a);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean init(){
		try {
			CommodityManage x=(CommodityManage) Naming.lookup(getURL());
			result=x.init();
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public StockFillmentInfo checkCommodity(){
		try {
			CommodityManage x=(CommodityManage) Naming.lookup(getURL());
			info=x.checkCommodity();
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
}
