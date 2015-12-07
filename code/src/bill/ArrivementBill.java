package bill;

import java.util.ArrayList;

public class ArrivementBill {
	
	public String ID;//µ¥¾ÝµÄID
	String[] date;
	String placeOfDeparture;
	public ArrayList<struct> bill=new  ArrayList<struct>();
	
	public ArrivementBill(){}
	
	public ArrayList<String> showAllID(){
		ArrayList<String> back=new ArrayList<String>();
		for(int i=0;i<bill.size();i++){
			back.add(bill.get(i).id);
		}	
		return back;	
	}

	
	
	class struct{
		public String id;
		State st;
		struct(String s,State t){
			id=s;
			st=t;
		}
	}
}
