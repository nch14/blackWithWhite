package remoteInterface;
import java.rmi.*;

public interface Client_Helper extends Remote{
	 public void ping() throws RemoteException;
}
