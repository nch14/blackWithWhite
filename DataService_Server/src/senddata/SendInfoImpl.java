package senddata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Dataservice.FileHelper;
import bill.OrderBillPO;
import data.send.SendInfoHelper;
import database.Database_OrderBillPO;

public class SendInfoImpl extends UnicastRemoteObject implements SendInfoHelper {
	public static Database_OrderBillPO database;
	public static boolean ready=false;
	final static String dir="ser/OrderBill.ser";
	
	protected SendInfoImpl() throws FileNotFoundException, ClassNotFoundException, IOException {
		super();
		if(!ready){
			ready=true;
			database=(Database_OrderBillPO) FileHelper.read(dir);
		}
	}
	
	public static void save() throws FileNotFoundException, IOException{
		FileHelper.write(dir, database);
	}
	
	@Override
	public OrderBillPO getSendMesg(String id) {
		// TODO Auto-generated method stub
		return database.get(id);
	}

	@Override
	public boolean getInput(OrderBillPO bill) {
		// TODO Auto-generated method stub
		return database.add(bill);
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

	@Override
	public ArrayList<OrderBillPO> getUnjudged() throws RemoteException {
		// TODO Auto-generated method stub
		return database.getUnjuedged();
	}

}
