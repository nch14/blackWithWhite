package data.receivement;

import java.rmi.RemoteException;

import remoteInterface.Client_Helper;
import vo.ReceiveInformationVO;

public interface ReceiceInfoHelper extends Client_Helper {
	public ReceiveInformationVO get(String id) throws RemoteException;
	public boolean insert(ReceiveInformationVO bill) throws RemoteException;
	public boolean delete(String id) throws RemoteException;
	public boolean update(String id) throws RemoteException;
	public boolean init() throws RemoteException;
}
