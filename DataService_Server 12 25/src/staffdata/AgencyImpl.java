package staffdata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Dataservice.FileHelper;
import data.staff.AgencyInfoHelper;
import settings.Company;

public class AgencyImpl  extends UnicastRemoteObject implements AgencyInfoHelper{
	public static ArrayList<Company> array;
	public static String dir="ser/Agency.ser";
	public static boolean ready=false;
	
	public AgencyImpl() throws RemoteException{
		super();
		if(!ready){
			try {
				array=(ArrayList<Company>) FileHelper.read(dir);
				ready=true;
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void save() throws FileNotFoundException, IOException{
		FileHelper.write(dir, array);
	}

	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean push(Company c) throws RemoteException {
		// TODO Auto-generated method stub
		array.add(0,c);
		try {
			save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public Company pull() throws RemoteException {
		// TODO Auto-generated method stub
		return array.get(0);
	}

}
