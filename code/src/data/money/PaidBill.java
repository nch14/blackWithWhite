package data.money;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import bill.ReceiveMoneyBill;
import data.Iphelper.Iphelper;

public class PaidBill implements PaidBillHelper{
	boolean result;
	ReceiveMoneyBill a;
	ArrayList<ReceiveMoneyBill> array;
	
	private String getURL() throws FileNotFoundException, ClassNotFoundException, IOException{
		String s="rmi://"+Iphelper.getIP()+":34002/paidbillhelper";
		return s;
	}
	
	public boolean init(){
		try {
			PaidBillHelper x=(PaidBillHelper) Naming.lookup(getURL());
			result=x.init();
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean insert(ReceiveMoneyBill bill){
		try {
			PaidBillHelper x=(PaidBillHelper) Naming.lookup(getURL());
			result=x.insert(bill);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean delete(String id){
		try {
			PaidBillHelper x=(PaidBillHelper) Naming.lookup(getURL());
			result=x.delete(id);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public ReceiveMoneyBill get(String id){
		try {
			PaidBillHelper x=(PaidBillHelper) Naming.lookup(getURL());
			a=x.get(id);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
	
	public ArrayList<ReceiveMoneyBill> getall(String[] time){
		try {
			PaidBillHelper x=(PaidBillHelper) Naming.lookup(getURL());
			array=x.getall(time);
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

	@Override
	public ArrayList<ReceiveMoneyBill> getall(String[] time1, String[] time2) throws RemoteException {
		try {
			PaidBillHelper x=(PaidBillHelper) Naming.lookup(getURL());
			array=x.getall(time1,time2);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return array;
	}
}
