package data.shipment;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import bill.TransportBill;
import data.Iphelper.Iphelper;

public class ShipmentCenter implements ShipmentCenterHelper {
	TransportBill a;
	boolean result;
	
	private String getURL() throws FileNotFoundException, ClassNotFoundException, IOException{
		String s="rmi://"+Iphelper.getIP()+":37008/shipment";
		return s;
	}
	
	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean insert(TransportBill bill) throws RemoteException {
		// TODO Auto-generated method stub
		try {
			ShipmentCenterHelper x=(ShipmentCenterHelper) Naming.lookup(getURL());
			result=x.insert(bill);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public TransportBill get(String id) throws RemoteException {
		// TODO Auto-generated method stub
		try {
			ShipmentCenterHelper x=(ShipmentCenterHelper) Naming.lookup(getURL());
			a=x.get(id);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}

	@Override
	public boolean change(TransportBill bill) throws RemoteException {
		// TODO Auto-generated method stub
		try {
			ShipmentCenterHelper x=(ShipmentCenterHelper) Naming.lookup(getURL());
			result=x.change(bill);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean delete(String id) throws RemoteException {
		// TODO Auto-generated method stub
		try {
			ShipmentCenterHelper x=(ShipmentCenterHelper) Naming.lookup(getURL());
			result=x.delete(id);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean init() throws RemoteException {
		// TODO Auto-generated method stub
		try {
			ShipmentCenterHelper x=(ShipmentCenterHelper) Naming.lookup(getURL());
			result=x.init();
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public ArrayList<TransportBill> getUnjudged() throws RemoteException {
		// TODO Auto-generated method stub
		ArrayList<TransportBill> array=new ArrayList<TransportBill>();
		try {
			ShipmentCenterHelper x=(ShipmentCenterHelper) Naming.lookup(getURL());
			array=x.getUnjudged();
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return array;
	}

}
