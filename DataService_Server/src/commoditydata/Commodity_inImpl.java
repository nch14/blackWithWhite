package commoditydata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Dataservice.FileHelper;
import bill.StockBill_In;
import data.commodity.Commodity_In_Manage;
import database.Database_StockBill_In;
import java.io.*;

public class Commodity_inImpl extends UnicastRemoteObject implements Commodity_In_Manage {
	public static Database_StockBill_In database;
	public static boolean ready=false;
	final static String dir="ser/StockBill_In.ser";
	
	protected Commodity_inImpl() throws FileNotFoundException, ClassNotFoundException, IOException {
		super();
		//FileHelper.write(dir, new Database_StockBill_In());
		if(!ready){
			ready=true;
			database=(Database_StockBill_In) FileHelper.read(dir);
		}
		// TODO Auto-generated constructor stub
	}
	
	public static void save() throws FileNotFoundException, IOException{
		FileHelper.write(dir, database);
	}


	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return database.delete(id);
	}

	@Override
	public synchronized boolean change(StockBill_In bill) {
		// TODO Auto-generated method stub
		return database.change(bill);
	}

	@Override
	public StockBill_In get(String id) {
		// TODO Auto-generated method stub
		return database.get(id);
	}

	@Override
	public boolean init() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public synchronized StockBill_In insert(StockBill_In bill, String ID) throws RemoteException {
		// TODO Auto-generated method stub
		StockBill_In temp=CommodityManageImpl.addPosition(bill, ID);
		database.add(temp);
		return temp;
	}

	@Override
	public ArrayList<StockBill_In> getUnjudged() throws RemoteException {
		// TODO Auto-generated method stub
		return database.getUnjudged();
	}
}
