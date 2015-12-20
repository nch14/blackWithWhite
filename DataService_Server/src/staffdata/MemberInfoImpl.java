package staffdata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Dataservice.FileHelper;
import bill.StaffPO;
import data.staff.MemberInfoHelper;
import database.Database_MemberInfo;

public class MemberInfoImpl extends UnicastRemoteObject implements MemberInfoHelper {
	public static Database_MemberInfo database;
	public static boolean ready=false;
	private static String dir="ser/MemberInfo.ser";
	
	public MemberInfoImpl() throws FileNotFoundException, ClassNotFoundException, IOException {
		super();
		if(!ready){
			ready=true;
			database=(Database_MemberInfo) FileHelper.read(dir);
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
	public synchronized boolean insert(StaffPO po) throws RemoteException {
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
	public synchronized boolean change(StaffPO po) throws RemoteException {
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
	public StaffPO get(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return database.get(id);
	}

	@Override
	public boolean init() throws RemoteException {
		// TODO Auto-generated method stub
		database=new Database_MemberInfo();
		return true;
	}

	@Override
	public ArrayList<StaffPO> getAll(String str) throws RemoteException {
		// TODO Auto-generated method stub
		return database.getAll(str);
	}

}
