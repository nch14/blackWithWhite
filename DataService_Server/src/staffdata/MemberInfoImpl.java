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
	
	protected MemberInfoImpl() throws FileNotFoundException, ClassNotFoundException, IOException {
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
	public boolean insert(StaffPO po) throws RemoteException {
		// TODO Auto-generated method stub
		return database.add(po);
	}

	@Override
	public boolean delete(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return database.delete(id);
	}

	@Override
	public boolean change(StaffPO po) throws RemoteException {
		// TODO Auto-generated method stub
		return database.change(po);
	}

	@Override
	public StaffPO get(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return database.get(id);
	}

	@Override
	public boolean init() throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<StaffPO> getAll(String str) throws RemoteException {
		// TODO Auto-generated method stub
		return database.getAll(str);
	}

}
