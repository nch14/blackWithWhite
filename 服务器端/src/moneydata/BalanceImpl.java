package moneydata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import data.money.BalanceHelper;

public class BalanceImpl extends UnicastRemoteObject implements BalanceHelper {

	protected BalanceImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getSumMoney() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
