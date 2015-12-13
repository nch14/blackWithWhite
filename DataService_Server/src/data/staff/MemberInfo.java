package data.staff;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import bill.StaffPO;
import data.Iphelper.Iphelper;

public class MemberInfo implements MemberInfoHelper{

	StaffPO a;
	boolean result;
	ArrayList<StaffPO> t;
	
	private String getURL() throws FileNotFoundException, ClassNotFoundException, IOException{
		String s="rmi://"+Iphelper.getIP()+":38003/memberinfohelper";
		return s;
	}
	
	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		try {
			MemberInfoHelper x=(MemberInfoHelper)Naming.lookup(getURL());
			x.ping();
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean insert(StaffPO po) throws RemoteException {
		// TODO Auto-generated method stub
		try {
			MemberInfoHelper x=(MemberInfoHelper)Naming.lookup(getURL());
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
			MemberInfoHelper x=(MemberInfoHelper)Naming.lookup(getURL());
			result=x.delete(id);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean change(StaffPO po) throws RemoteException {
		// TODO Auto-generated method stub
		try {
			MemberInfoHelper x=(MemberInfoHelper)Naming.lookup(getURL());
			result=x.change(po);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public StaffPO get(String id) throws RemoteException {
		// TODO Auto-generated method stub
		try {
			MemberInfoHelper x=(MemberInfoHelper)Naming.lookup(getURL());
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
			MemberInfoHelper x=(MemberInfoHelper)Naming.lookup(getURL());
			result=x.init();
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public ArrayList<StaffPO> getAll(String str) throws RemoteException {
		// TODO Auto-generated method stub
		try {
			MemberInfoHelper x=(MemberInfoHelper)Naming.lookup(getURL());
			t=x.getAll(str);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}
	
	

}
