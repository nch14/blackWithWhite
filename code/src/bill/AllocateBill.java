package bill;

import java.util.ArrayList;

public class AllocateBill {
	public String ID;//单据的ID
	boolean judged;
	String[] date;
	String numID;//快递员的ID
	ArrayList<String> list;
	
	public AllocateBill(){}
	public AllocateBill(String a,String[] b){
		numID=a;
		date=b;
		list=new ArrayList<String>();
	}

}
