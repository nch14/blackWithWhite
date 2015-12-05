package data.money;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import bill.PaymentBill;
import data.Iphelper.Iphelper;

public class PayBill implements PayBillHelper{
	boolean result;
	PaymentBill a;
	ArrayList<PaymentBill> array;
	
	private String getURL() throws FileNotFoundException, ClassNotFoundException, IOException{
		String s="rmi://"+Iphelper.getIP()+":34003/paybillhelper";
		return s;
	}
	
	public boolean init(){
		try {
			PayBillHelper x=(PayBillHelper) Naming.lookup(getURL());
			result=x.init();
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean insert(PaymentBill bill){
		try {
			PayBillHelper x=(PayBillHelper) Naming.lookup(getURL());
			result=x.insert(bill);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean delete(String id){
		try {
			PayBillHelper x=(PayBillHelper) Naming.lookup(getURL());
			result=x.delete(id);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public PaymentBill get(String id){
		try {
			PayBillHelper x=(PayBillHelper) Naming.lookup(getURL());
			a=x.get(id);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
	
	public ArrayList<PaymentBill> getall(String[] time){
		try {
			PayBillHelper x=(PayBillHelper) Naming.lookup(getURL());
			array=x.getall(time);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return array;
	}

	

	@Override
	public boolean change(PaymentBill bill) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<PaymentBill> getall(String[] time1, String[] time2) throws RemoteException {
		// TODO Auto-generated method stub
		try {
			PayBillHelper x=(PayBillHelper) Naming.lookup(getURL());
			array=x.getall(time1,time2);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return array;
		
	}

	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}
}
