package data.staff;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import bill.TruckPO;
import data.Iphelper.Iphelper;

public class BusInfo implements BusInfoHelper {
	TruckPO a;
	boolean result;
	
	private String getURL() throws FileNotFoundException, ClassNotFoundException, IOException{
		String s="rmi://"+Iphelper.getIP()+":38001/businfohelper";
		return s;
	}
	
	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean insert(TruckPO po) {
		// TODO Auto-generated method stub
		boolean result=false;
			try {
				BusInfoHelper x=(BusInfoHelper) Naming.lookup(getURL());
				result=x.insert(po);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return result;
	}

	@Override
	public boolean change(TruckPO po) throws RemoteException {
		// TODO Auto-generated method stub
		boolean result=false;
		try {
			BusInfoHelper x=(BusInfoHelper) Naming.lookup(getURL());
			result=x.change(po);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean delete(String id) throws RemoteException {
		// TODO Auto-generated method stub
		boolean result=false;
		try {
			BusInfoHelper x=(BusInfoHelper) Naming.lookup(getURL());
			result=x.delete(id);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public TruckPO get(String id) throws RemoteException {
		// TODO Auto-generated method stub
		TruckPO po=null;
		try {
			BusInfoHelper x=(BusInfoHelper) Naming.lookup(getURL());
			po=x.get(id);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return po;
	}

	@Override
	public boolean init() throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<TruckPO> getAll() throws RemoteException {
		// TODO Auto-generated method stub
		ArrayList<TruckPO> array=null;
		try {
			BusInfoHelper x=(BusInfoHelper) Naming.lookup(getURL());
			array=x.getAll();
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
