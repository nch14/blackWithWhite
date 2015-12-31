package shipmentdata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Dataservice.FileHelper;
import bill.TransportBill;
import data.shipment.ShipmentCenterHelper;
import database.Database_TransportBill;

public class ShipmentImpl extends UnicastRemoteObject implements ShipmentCenterHelper {
	protected ShipmentImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
		if(!ready){
			ready=true;
			try {
				database=(Database_TransportBill) FileHelper.read(dir);
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void save() throws FileNotFoundException, IOException{
		FileHelper.write(dir, database);
	}

	public static Database_TransportBill database;
	static boolean ready=false;
	final static String dir="ser/TransportBill.ser";
	
	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean insert(TransportBill bill) throws RemoteException {
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
	public TransportBill get(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return database.get(id);
	}

	@Override
	public boolean change(TransportBill bill) throws RemoteException {
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
	public boolean delete(String id) throws RemoteException {
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
	public ArrayList<TransportBill> getUnjudged() throws RemoteException {
		// TODO Auto-generated method stub
		ArrayList<TransportBill> array=new ArrayList<TransportBill>();
		ArrayList<TransportBill> temp=database.getUnjudged();
		for(TransportBill i:temp){
			array.add(i);
		}
		return array;
	}

}
