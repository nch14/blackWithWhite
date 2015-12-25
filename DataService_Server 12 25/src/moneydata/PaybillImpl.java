package moneydata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Dataservice.FileHelper;
import bill.PaymentBill;
import data.money.PayBillHelper;
import database.Database_Payment;

public class PaybillImpl extends UnicastRemoteObject implements PayBillHelper {

	public static Database_Payment database;
	public static boolean ready=false;
	final static String dir="ser/Payment.ser";
	
	protected PaybillImpl() throws FileNotFoundException, ClassNotFoundException, IOException {
		super();
		if(!ready){
			ready=true;
			database=(Database_Payment) FileHelper.read(dir);
		}
	}
	
	public static void save() throws FileNotFoundException, IOException{
		FileHelper.write(dir, database);
	}

	@Override
	public boolean init() {
		// TODO Auto-generated method stub
		database=new Database_Payment();
		return true;
	}

	@Override
	public synchronized boolean insert(PaymentBill bill) {
		// TODO Auto-generated method stub
		boolean bool=database.insert(bill);
		try {
			save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bool;
	}

	@Override
	public synchronized boolean delete(String id) {
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
	public synchronized boolean change(PaymentBill bill) {
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
	public PaymentBill get(String id) {
		// TODO Auto-generated method stub
		return database.get(id);
	}

	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<PaymentBill> getall(String[] time) throws RemoteException {
		// TODO Auto-generated method stub
		return database.getall(time);
	}

	@Override
	public ArrayList<PaymentBill> getall(String[] time1, String[] time2) throws RemoteException {
		// TODO Auto-generated method stub
		return database.getall(time1, time2);
	}

	@Override
	public ArrayList<PaymentBill> getUnjudged() throws RemoteException {
		// TODO Auto-generated method stub
		return database.getUnjudged();
	}

}
