package data.staff;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import data.Iphelper.Iphelper;
import po.DriverPO;

public class DriverInfo implements DriverInfoHelper{

	boolean result;
	ArrayList<DriverPO> array;
	DriverPO a;
	private String getURL() throws FileNotFoundException, ClassNotFoundException, IOException{
		String s="rmi://"+Iphelper.getIP()+":38002/driverinfohelper";
		return s;
	}
	
	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		try {
			DriverInfoHelper x=(DriverInfoHelper)Naming.lookup(getURL());
			x.ping();
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean insert(DriverPO po) throws RemoteException {
		// TODO Auto-generated method stub
		try {
			DriverInfoHelper x=(DriverInfoHelper)Naming.lookup(getURL());
			result=x.insert(po);
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
			DriverInfoHelper x=(DriverInfoHelper)Naming.lookup(getURL());
			result=x.delete(id);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean change(DriverPO po) throws RemoteException {
		// TODO Auto-generated method stub
		try {
			DriverInfoHelper x=(DriverInfoHelper)Naming.lookup(getURL());
			result=x.change(po);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public DriverPO get(String id) throws RemoteException {
		// TODO Auto-generated method stub
		try {
			DriverInfoHelper x=(DriverInfoHelper)Naming.lookup(getURL());
			a=x.get(id);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}

	@Override
	public boolean init() throws RemoteException {
		// TODO Auto-generated method stub
		try {
			DriverInfoHelper x=(DriverInfoHelper)Naming.lookup(getURL());
			result=x.init();
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public ArrayList<DriverPO> getAll(String str) throws RemoteException {
		// TODO Auto-generated method stub
		try {
			DriverInfoHelper x=(DriverInfoHelper)Naming.lookup(getURL());
			array=x.getAll(str);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return array;
	}

}
