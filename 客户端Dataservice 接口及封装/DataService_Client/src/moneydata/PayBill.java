package moneydata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;

import Iphelper.Iphelper;
import bill.PaymentBill;

public class PayBill {
	boolean result;
	PaymentBill a;
	
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
}
