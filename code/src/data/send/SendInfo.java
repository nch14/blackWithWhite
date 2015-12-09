package data.send;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import data.Iphelper.Iphelper;
import po.bills.OrderBillPO;

public class SendInfo implements SendInfoHelper{
	OrderBillPO a;
	boolean result;
	
	private String getURL() throws FileNotFoundException, ClassNotFoundException, IOException{
		String s="rmi://"+Iphelper.getIP()+":36000/sendinfohelper";
		return s;
	}
	
	public OrderBillPO getSendMesg(String id){
		try {
		      SendInfoHelper x=(SendInfoHelper) Naming.lookup(getURL());
				a=x.getSendMesg(id);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return a;
	}
	
	public boolean getInput(OrderBillPO bill){
		try {
		      SendInfoHelper x=(SendInfoHelper) Naming.lookup(getURL());
				result=x.getInput(bill);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;
	}
	
	public boolean init(){
		try {
		      SendInfoHelper x=(SendInfoHelper) Naming.lookup(getURL());
				result=x.init();
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;
	}

	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<OrderBillPO> getUnjudged() throws RemoteException {
		// TODO Auto-generated method stub
		ArrayList<OrderBillPO> array=new ArrayList<OrderBillPO>();
		try {
		      SendInfoHelper x=(SendInfoHelper) Naming.lookup(getURL());
				array=x.getUnjudged();
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return array;
	}
}
