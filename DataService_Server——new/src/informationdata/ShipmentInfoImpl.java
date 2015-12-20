package informationdata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Dataservice.FileHelper;
import bill.TransMesgPO;
import data.information.ShipmentInfoHelper;
import database.Database_imformation;

public class ShipmentInfoImpl extends UnicastRemoteObject implements ShipmentInfoHelper {
	
	public static Database_imformation database;
	public static boolean ready=false;
	final static String dir="ser/imformation.ser";
	
	protected ShipmentInfoImpl() throws FileNotFoundException, ClassNotFoundException, IOException {
		super();
		if(!ready){
			ready=true;
			database=(Database_imformation) FileHelper.read(dir);
		}
		// TODO Auto-generated constructor stub
	}
	
	public static void save() throws FileNotFoundException, IOException{
		FileHelper.write(dir, database);
	}

	@Override
	public ArrayList<TransMesgPO> getTransMesg(String id) {
		// TODO Auto-generated method stub
		return database.getArray(id);
	}

	@Override
	public boolean refreshTransMesg(TransMesgPO po) {
		// TODO Auto-generated method stub
		boolean result=database.refresh(po);
		try {
			save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean init() {
		// TODO Auto-generated method stub
		database=new Database_imformation();
		return true;
	}

	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
