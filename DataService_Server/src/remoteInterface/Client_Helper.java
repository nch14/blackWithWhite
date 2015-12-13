package remoteInterface;
import java.rmi.*;

public interface Client_Helper extends Remote{
	 void ping() throws RemoteException;
}
