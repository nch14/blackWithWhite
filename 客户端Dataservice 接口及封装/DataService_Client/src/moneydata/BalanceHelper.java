package moneydata;

import java.rmi.RemoteException;

import remoteInterface.Client_Helper;

public interface BalanceHelper extends Client_Helper {
	public int getSumMoney() throws RemoteException;
}
