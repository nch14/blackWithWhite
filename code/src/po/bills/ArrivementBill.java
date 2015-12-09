package po.bills;

import java.util.ArrayList;

import bill.State;

public class ArrivementBill {
	
	public String ID;//µ¥¾ÝµÄID
	public boolean judged;
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
