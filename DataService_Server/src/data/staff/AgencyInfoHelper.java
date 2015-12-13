package data.staff;

import java.rmi.Remote;
import java.rmi.RemoteException;

import remoteInterface.Client_Helper;
import settings.Company;
public interface AgencyInfoHelper extends Client_Helper{
	public boolean push(Company c) throws RemoteException;
	public Company pull() throws RemoteException;
}
