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
		return false;
	}

	@Override
	public boolean insert(PaymentBill bill) {
		// TODO Auto-generated method stub
		return database.insert(bill);
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return database.delete(id);
	}

	@Override
	public boolean change(PaymentBill bill) {
		// TODO Auto-generated method stub
		return database.change(bill);
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
