package data.staff;

import java.rmi.RemoteException;
import java.util.ArrayList;

import bill.StaffPO;

public class MemberInfo implements MemberInfoHelper{

	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean insert(StaffPO po) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean change(StaffPO po) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public StaffPO get(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean init() throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<StaffPO> getAll(String str) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
