package shipmentdata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Dataservice.FileHelper;
import bill.TransportBill;
import bill.TransportBill_Truck;
import data.shipment.BusShipmentHelper;
import database.Database_TransportBill;

public class BusShipmentImpl extends UnicastRemoteObject implements BusShipmentHelper {

	public static Database_TransportBill database;
	final static String dir="ser/TransportBill_Bus.ser";
	public static boolean ready=false;
	
	protected BusShipmentImpl() throws FileNotFoundException, ClassNotFoundException, IOException {
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
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public synchronized boolean insert(TransportBill_Truck bill) throws RemoteException {
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
	public TransportBill_Truck get(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return (TransportBill_Truck) database.get(id);
	}

	@Override
	public synchronized boolean change(TransportBill_Truck bill) throws RemoteException {
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
	public synchronized boolean delete(String id) throws RemoteException {
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
	public boolean init() throws RemoteException {
		// TODO Auto-generated method stub
		database=new Database_TransportBill();
		return true;
	}

	@Override
	public ArrayList<TransportBill_Truck> getUnjudged() throws RemoteException {
		// TODO Auto-generated method stub
		ArrayList<TransportBill_Truck> array=new ArrayList<TransportBill_Truck>();
		ArrayList<TransportBill> temp=database.getUnjudged();
		for(TransportBill i:temp){
			array.add((TransportBill_Truck) i);
		}
		return array;
	}
	
}
