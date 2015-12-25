package staffdata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Dataservice.FileHelper;
import bill.DriverPO;
import data.staff.DriverInfoHelper;
import database.Database_DriverInfo;

public class DriverInfoImpl extends UnicastRemoteObject implements DriverInfoHelper {
	
	public static Database_DriverInfo database;
	public static boolean ready=false;
	private static String dir="ser/DriverInfo.ser";
	
	protected DriverInfoImpl() throws FileNotFoundException, ClassNotFoundException, IOException {
		super();
		if(!ready){
			ready=true;
			database=(Database_DriverInfo) FileHelper.read(dir);
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
	public synchronized boolean insert(DriverPO po) throws RemoteException {
		// TODO Auto-generated method stub
		boolean bool=database.add(po);
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
	public boolean change(DriverPO po) throws RemoteException {
		// TODO Auto-generated method stub
		boolean bool=database.change(po);
		try {
			save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bool;
	}

	@Override
	public DriverPO get(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return database.get(id);
	}

	@Override
	public boolean init() throws RemoteException {
		// TODO Auto-generated method stub
		database=new Database_DriverInfo();
		return true;
	}

	@Override
	public ArrayList<DriverPO> getAll(String str) throws RemoteException {
		// TODO Auto-generated method stub
		return database.getAll(str);
	}

}
