package commoditydata;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Dataservice.FileHelper;
import bill.StockBill_Out;
import data.commodity.Commodity_Out_Manage;
import database.Database_StockBill_Out;

public class Commodity_OutImpl extends UnicastRemoteObject implements Commodity_Out_Manage {

	public static Database_StockBill_Out database;
	public static boolean ready=false;
	final static String dir="ser/StockBill_Out.ser";
	
	protected Commodity_OutImpl() throws FileNotFoundException, IOException, ClassNotFoundException {
		super();
		if(!ready){
			ready=true;
			database=(Database_StockBill_Out) FileHelper.read(dir);
		}
		// TODO Auto-generated constructor stub
	}

	public static void save() throws FileNotFoundException, IOException{
		FileHelper.write(dir, database);
	}
	@Override
	public synchronized boolean insert(StockBill_Out bill,String id) {
		// TODO Auto-generated method stub
		CommodityManageImpl.freePosition(bill, id);
		boolean bool=database.add(bill);
		try {
			this.save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bool;
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
	public synchronized boolean change(StockBill_Out bill) {
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
	public StockBill_Out get(String id) {
		// TODO Auto-generated method stub
		return database.get(id);
	}

	@Override
	public boolean init() {
		// TODO Auto-generated method stub
		database=new Database_StockBill_Out();
		return true;
	}

	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public synchronized ArrayList<StockBill_Out> getUnjudged() throws RemoteException {
		// TODO Auto-generated method stub
		return database.getUnjudged();
	}

}
