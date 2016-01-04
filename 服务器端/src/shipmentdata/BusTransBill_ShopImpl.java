package shipmentdata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Dataservice.FileHelper;
import bill.BusShipmentBill_Shop;
import data.shipment.BusTransBill_ShopHelper;
import database.Database_BusShipmentBill_Shop;

public class BusTransBill_ShopImpl extends UnicastRemoteObject implements BusTransBill_ShopHelper {

	public static Database_BusShipmentBill_Shop database;
	final static String dir="ser/BusShipmentBill_Shop.ser";
	public static boolean ready=false;
	
	protected BusTransBill_ShopImpl() throws FileNotFoundException, ClassNotFoundException, IOException {
		super();
		if(!ready){
			ready=true;
			database=(Database_BusShipmentBill_Shop) FileHelper.read(dir);
		}
	}
	
	public static void save() throws FileNotFoundException, IOException{
		FileHelper.write(dir, database);
	}

	@Override
	public synchronized boolean insert(BusShipmentBill_Shop bill) {
		// TODO Auto-generated method stub
		boolean bool=database.add(bill);
		try {
			save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bool;
	}

	@Override
	public BusShipmentBill_Shop get(String id) {
		// TODO Auto-generated method stub
		return database.get(id);
	}

	@Override
	public synchronized boolean change(BusShipmentBill_Shop bill) {
		// TODO Auto-generated method stub
		boolean bool=database.change(bill);
		try {
			save();
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
			save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bool;
	}

	@Override
	public boolean init() {
		// TODO Auto-generated method stub
		database=new Database_BusShipmentBill_Shop();
		return true;
	}

	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<BusShipmentBill_Shop> getUnjudged() throws RemoteException {
		// TODO Auto-generated method stub
		return database.getUnjudged();
	}

}
