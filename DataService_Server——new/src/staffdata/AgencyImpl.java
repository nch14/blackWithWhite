package staffdata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import Dataservice.FileHelper;
import data.staff.AgencyInfoHelper;
import settings.company;

public class AgencyImpl implements AgencyInfoHelper {

	public static ArrayList<company> array;
	public static boolean ready=false;
	public static String dir="ser/Agency.ser";
	
	public AgencyImpl() throws FileNotFoundException, ClassNotFoundException, IOException{
		if(!ready){
			ready=true;
			array=(ArrayList<company>) FileHelper.read(dir);
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
	public boolean push(company c) throws RemoteException {
		// TODO Auto-generated method stub
		array.add(c);
		try {
			save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public company pull() throws RemoteException {
		// TODO Auto-generated method stub
		return array.get(0);
	}

}
