package moneydata;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;

import Iphelper.Iphelper;
import bill.ReceiveMoneyBill;

public class PaidBill {
	boolean result;
	ReceiveMoneyBill a;
	
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
}
