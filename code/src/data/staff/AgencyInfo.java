package data.staff;

import java.io.FileNotFoundException;
import java.io.IOException;

import data.Iphelper.Iphelper;

public class AgencyInfo {
	
	private String getURL() throws FileNotFoundException, ClassNotFoundException, IOException{
		String s="rmi://"+Iphelper.getIP()+":38000/agencyinfohelper";
		return s;
	}
	
	
}
