package shipmentdata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Dataservice.FileHelper;
import bill.AllocateBill;
import data.shipment.AllocateHelper;
import database.Database_AllocateBill;

public class AllocateImpl extends UnicastRemoteObject implements AllocateHelper {
	public static Database_AllocateBill database;
	public static boolean ready=false;
	final static String dir="ser/AllocateBill.ser";
	
	protected AllocateImpl() throws FileNotFoundException, ClassNotFoundException, IOException {
		super();
		if(!ready){
			ready=true;
			database=(Database_AllocateBill) FileHelper.read(dir);
		}
	}
	
	public static void save() throws FileNotFoundException, IOException{
		FileHelper.write(dir, database);
	}

	@Override
	public boolean insert(AllocateBill bill) {
		// TODO Auto-generated method stub
		return database.add(bill);
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return database.delete(id);
	}

	@Override
	public boolean change(AllocateBill bill) {
		// TODO Auto-generated method stub
		return database.change(bill);
	}

	@Override
	public AllocateBill get(String id) {
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
	public ArrayList<AllocateBill> getUnjudged() throws RemoteException {
		// TODO Auto-generated method stub
		return database.getUnjudged();
	}

}
