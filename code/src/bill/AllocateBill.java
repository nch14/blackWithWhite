package bill;

import java.util.ArrayList;

public class AllocateBill {
	
	boolean judged;
	String[] date;
	String numID;
	ArrayList<String> list;
	public String identifier;
	
	public AllocateBill(){}
	public AllocateBill(String a,String[] b){
		numID=a;
		date=b;
		list=new ArrayList<String>();
	}

}
