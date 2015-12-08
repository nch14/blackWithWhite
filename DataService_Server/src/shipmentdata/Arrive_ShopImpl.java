package shipmentdata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Dataservice.FileHelper;
import bill.ArrivementBill_Shop;
import data.shipment.Arrive_ShopHelper;
import database.Database_ArrivementBill_Shop;

public class Arrive_ShopImpl extends UnicastRemoteObject implements Arrive_ShopHelper {

	public static Database_ArrivementBill_Shop database;
	final static String dir="ser/ArrivementBill_Shop.ser";
	public static boolean ready=false;
	
	protected Arrive_ShopImpl() throws FileNotFoundException, ClassNotFoundException, IOException {
		super();
		if(!ready){
			ready=true;
			database=(Database_ArrivementBill_Shop) FileHelper.read(dir);
		}
	}

	
	public static void save() throws FileNotFoundException, IOException{
		FileHelper.write(dir, database);
	}
	
	@Override
	public boolean insert(ArrivementBill_Shop bill) {
		// TODO Auto-generated method stub
		return database.add(bill);
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return database.delete(id);
	}

	@Override
	public boolean change(ArrivementBill_Shop bill) {
		// TODO Auto-generated method stub
		return database.change(bill);
	}

	@Override
	public ArrivementBill_Shop get(String id) {
		// TODO Auto-generated method stub
		return database.get(id);
	}

	@Override
	public boolean init() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public ArrayList<ArrivementBill_Shop> getUnjudged() throws RemoteException {
		// TODO Auto-generated method stub
		return database.getUnjudged();
	}

}
