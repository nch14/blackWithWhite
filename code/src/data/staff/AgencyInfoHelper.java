package data.staff;

import java.rmi.Remote;
import java.rmi.RemoteException;

import remoteInterface.Client_Helper;
import settings.company;
public interface AgencyInfoHelper extends Client_Helper{
	public boolean push(company c) throws RemoteException;
	public company pull() throws RemoteException;
}
