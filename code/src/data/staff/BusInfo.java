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
		
			try {
				BusInfoHelper x=(BusInfoHelper) Naming.lookup(getURL());
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return false;
	}

	@Override
	public boolean change(TruckPO po) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TruckPO get(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean init() throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<TruckPO> getAll(String str) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
