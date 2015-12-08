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
	public boolean insert(TransportBill_Truck bill) throws RemoteException {
		// TODO Auto-generated method stub
		return database.add(bill);
	}

	@Override
	public TransportBill_Truck get(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return (TransportBill_Truck) database.get(id);
	}

	@Override
	public boolean change(TransportBill_Truck bill) throws RemoteException {
		// TODO Auto-generated method stub
		return database.change(bill);
	}

	@Override
	public boolean delete(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return database.delete(id);
	}

	@Override
	public boolean init() throws RemoteException {
		// TODO Auto-generated method stub
		return false;
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
