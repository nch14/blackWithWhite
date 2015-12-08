package moneydata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Dataservice.FileHelper;
import bill.ReceiveMoneyBill;
import data.money.PaidBillHelper;
import database.Database_ReceiveMoneyBill;

public class PaidBillImpl extends UnicastRemoteObject implements PaidBillHelper {
	public static Database_ReceiveMoneyBill database;
	public static boolean ready=false;
	final static String dir="ser/ReceiveMoneyBill.ser";
	
	protected PaidBillImpl() throws FileNotFoundException, ClassNotFoundException, IOException {
		super();
		if(!ready){
			ready=true;
			database=(Database_ReceiveMoneyBill) FileHelper.read(dir);
		}
	}
	
	public static void save() throws FileNotFoundException, IOException{
		FileHelper.write(dir, database);
	}

	@Override
	public boolean init() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insert(ReceiveMoneyBill bill) {
		// TODO Auto-generated method stub
		return database.add(bill);
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return database.delete(id);
	}

	@Override
	public ReceiveMoneyBill get(String id) {
		// TODO Auto-generated method stub
		return database.get(id);
	}

	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<ReceiveMoneyBill> getall(String[] time) {
		// TODO Auto-generated method stub
		return database.getAll(time);
	}

	@Override
	public ArrayList<ReceiveMoneyBill> getall(String[] time1, String[] time2) throws RemoteException {
		// TODO Auto-generated method stub
		return database.getAll(time1, time2);
	}

	@Override
	public ArrayList<ReceiveMoneyBill> getall_Oneday(String[] time) throws RemoteException {
		// TODO Auto-generated method stub
		return database.get_OneDay(time);
	}

	@Override
	public ArrayList<ReceiveMoneyBill> getall(String[] time, String ID_Of_Shop) throws RemoteException {
		// TODO Auto-generated method stub
		return database.getAll(time, ID_Of_Shop);
	}

	@Override
	public ArrayList<ReceiveMoneyBill> getUnjudged() throws RemoteException {
		// TODO Auto-generated method stub
		return database.getUnjudged();
	}

}
