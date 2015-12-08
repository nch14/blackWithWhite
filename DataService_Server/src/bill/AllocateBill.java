package bill;

import java.util.ArrayList;

public class AllocateBill {
	public String ID;//单据的ID
	public boolean judged;
	String[] date;
	public String numID;//快递员的ID
	public ArrayList<String> list;//单据的寄件单号
	
	public AllocateBill(){}
	public AllocateBill(String a,String[] b){
		numID=a;
		date=b;
		list=new ArrayList<String>();
	}
	


}
