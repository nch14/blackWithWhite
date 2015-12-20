package shipmentdata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Dataservice.FileHelper;
import bill.TransportBill;
import bill.TransportBill_Plane;
import data.shipment.PlaneShipmentHelper;
import database.Database_TransportBill;

public class PlaneShipmentImpl extends UnicastRemoteObject implements PlaneShipmentHelper {

	public static Database_TransportBill database;
	final static String dir="ser/TransportBill_Plane.ser";
	public static boolean ready=false;
	
	protected PlaneShipmentImpl() throws FileNotFoundException, ClassNotFoundException, IOException {
		super();
		if(!ready){
			ready=true;
			database=(Database_TransportBill) FileHelper.read(dir);
		}
	}
	
	public static void save() throws FileNotFoundException, IOException{
		FileHelper.write(dir, database);
	}

	@Override
	public synchronized boolean insert(TransportBill_Plane bill) {
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
	public TransportBill_Plane get(String id) {
		// TODO Auto-generated method stub
		return (TransportBill_Plane) database.get(id);
	}

	@Override
	public synchronized boolean change(TransportBill_Plane bill) {
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
		database=new Database_TransportBill();
		return true;
	}

	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<TransportBill_Plane> getUnjudged() throws RemoteException {
		// TODO Auto-generated method stub
		ArrayList<TransportBill_Plane> array=new ArrayList<TransportBill_Plane>();
		ArrayList<TransportBill> temp=database.getUnjudged();
		for(TransportBill i:temp){
			array.add((TransportBill_Plane) i);
		}
		return array;
	}
}
