package reportdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import data.report.ReportData_Client;

public class ReportDataImpl extends UnicastRemoteObject implements ReportData_Client {

	protected ReportDataImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
