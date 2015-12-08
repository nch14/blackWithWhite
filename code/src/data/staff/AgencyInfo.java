package data.staff;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import data.Iphelper.Iphelper;
import settings.Company;

public class AgencyInfo implements AgencyInfoHelper{
	
	private String getURL() throws FileNotFoundException, ClassNotFoundException, IOException{
		String s="rmi://"+Iphelper.getIP()+":38000/agencyinfohelper";
		return s;
	}

	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean push(Company c) throws RemoteException {
		// TODO Auto-generated method stub
		boolean result=false;
		try {
			AgencyInfoHelper x=(AgencyInfoHelper)Naming.lookup(getURL());
			result=x.push(c);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Company pull() throws RemoteException {
		// TODO Auto-generated method stub
		Company c = null;
		try {
			AgencyInfoHelper x=(AgencyInfoHelper)Naming.lookup(getURL());
			c=x.pull();
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
	
	
}
