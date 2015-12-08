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
	public boolean insert(TransportBill_Plane bill) {
		// TODO Auto-generated method stub
		return database.add(bill);
	}

	@Override
	public TransportBill_Plane get(String id) {
		// TODO Auto-generated method stub
		return (TransportBill_Plane) database.get(id);
	}

	@Override
	public boolean change(TransportBill_Plane bill) {
		// TODO Auto-generated method stub
		return database.change(bill);
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return database.delete(id);
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
