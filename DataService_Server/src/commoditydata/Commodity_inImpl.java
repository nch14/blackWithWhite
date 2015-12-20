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
	public synchronized boolean delete(String id) {
		// TODO Auto-generated method stub
		boolean bool=database.delete(id);
		try {
			this.save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bool;
	}

	@Override
	public synchronized boolean change(StockBill_In bill) {
		// TODO Auto-generated method stub
		boolean bool=database.change(bill);
		try {
			this.save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bool;
	}

	@Override
	public StockBill_In get(String id) {
		// TODO Auto-generated method stub
		return database.get(id);
	}

	@Override
	public boolean init() {
		// TODO Auto-generated method stub
		database=new Database_StockBill_In();
		return true;
	}

	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public synchronized StockBill_In insert(StockBill_In bill, String ID) {
		// TODO Auto-generated method stub
		StockBill_In temp=CommodityManageImpl.addPosition(bill, ID);
		database.add(temp);
		try {
			this.save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	@Override
	public synchronized ArrayList<StockBill_In> getUnjudged() throws RemoteException {
		// TODO Auto-generated method stub
		return database.getUnjudged();
	}
}
