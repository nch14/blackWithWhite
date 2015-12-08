package receivementdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import bill.ReceiveBill;
import data.receivement.ReceiceInfoHelper;
import vo.ReceiveInformationVO;

public class ReceiveInfoImpl extends UnicastRemoteObject implements ReceiceInfoHelper {
	
	protected ReceiveInfoImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean init() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ReceiveInformationVO get(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(ReceiveInformationVO bill) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

}
