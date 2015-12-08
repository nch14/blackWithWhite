package shipmentdata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Dataservice.FileHelper;
import bill.TransportBill;
import bill.TransportBill_Train;
import data.shipment.TrainShipmentHelper;
import database.Database_TransportBill;

public class TrainShipmentImpl extends UnicastRemoteObject implements TrainShipmentHelper {

	public static Database_TransportBill database;
	final static String dir="ser/TransportBill_Train.ser";
	public static boolean ready=false;
	
	protected TrainShipmentImpl() throws FileNotFoundException, ClassNotFoundException, IOException {
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
	public boolean insert(TransportBill_Train bill) {
		// TODO Auto-generated method stub
		return database.add(bill);
	}

	@Override
	public TransportBill_Train get(String id) {
		// TODO Auto-generated method stub
		return (TransportBill_Train) database.get(id);
	}

	@Override
	public boolean change(TransportBill_Train bill) {
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
	
	public ArrayList<TransportBill_Train> getUnjudged() throws RemoteException {
		// TODO Auto-generated method stub
		ArrayList<TransportBill_Train> array=new ArrayList<TransportBill_Train>();
		ArrayList<TransportBill> temp=database.getUnjudged();
		for(TransportBill i:temp){
			array.add((TransportBill_Train) i);
		}
		return array;
	}

}
