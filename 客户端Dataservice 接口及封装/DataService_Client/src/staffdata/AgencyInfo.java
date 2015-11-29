package staffdata;

import java.io.FileNotFoundException;
import java.io.IOException;

import Iphelper.Iphelper;

public class AgencyInfo {
	
	private String getURL() throws FileNotFoundException, ClassNotFoundException, IOException{
		String s="rmi://"+Iphelper.getIP()+":38000/agencyinfohelper";
		return s;
	}
	
	
}
