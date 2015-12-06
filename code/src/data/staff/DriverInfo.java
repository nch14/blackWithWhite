package data.staff;

import java.rmi.RemoteException;
import java.util.ArrayList;

import bill.DriverPO;

public class DriverInfo implements DriverInfoHelper{

	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean insert(DriverPO po) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean change(DriverPO po) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DriverPO get(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean init() throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<DriverPO> getAll(String str) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
