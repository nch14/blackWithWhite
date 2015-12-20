package database;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import HelperClass.CompareDate;
import bill.PaymentBill;

public class Database_Payment extends Database<PaymentBill> implements data.money.PayBillHelper {

	@Override
	public PaymentBill get(String id) {
		// TODO Auto-generated method stub
		return database.get(id);
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		if(database.remove(id)!=null){
			return true;
		}
		else
			return false;
	}

	@Override
	public boolean insert(PaymentBill t) {
		// TODO Auto-generated method stub
		database.put(t.ID, t);
		return true;
	}

	@Override
	public boolean change(PaymentBill t) {
		// TODO Auto-generated method stub
		if(database.put(t.ID,t)!=null){
			return true;
		}
		else
			return false;
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
	public ArrayList<PaymentBill> getall(String[] time) throws RemoteException {
		ArrayList<PaymentBill> array=new ArrayList<PaymentBill>();
		Iterator iter=database.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry=(Map.Entry)iter.next();
			PaymentBill a=(PaymentBill) entry.getValue();
			if(CompareDate.larger(a.date, time)){
				array.add(a);
			}
		}
		return array;
	}

	@Override
	public ArrayList<PaymentBill> getall(String[] time1, String[] time2) throws RemoteException {
		ArrayList<PaymentBill> array=new ArrayList<PaymentBill>();
		Iterator iter=database.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry=(Map.Entry)iter.next();
			PaymentBill a=(PaymentBill) entry.getValue();
			if(CompareDate.larger(a.date, time2)&&CompareDate.larger(time1, a.date)){
				array.add(a);
			}
		}
		return array;
	}

	@Override
	public ArrayList<PaymentBill> getUnjudged() throws RemoteException {
		// TODO Auto-generated method stub
		ArrayList<PaymentBill> array=new ArrayList<PaymentBill>();
		Iterator iter=database.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry=(Map.Entry)iter.next();
			PaymentBill a=(PaymentBill) entry.getValue();
			if(!a.judged){
				array.add(a);
			}
		}
		return array;
	}

}
