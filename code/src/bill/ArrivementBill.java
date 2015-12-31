package bill;

import java.io.Serializable;
import java.util.ArrayList;
public class ArrivementBill implements Serializable{
	
	public String ID;//µ¥¾ÝµÄID
	public boolean judged;
	public String[] date;
	public String placeOfDeparture;
	public ArrayList<struct> bill=new  ArrayList<struct>();
	
	public ArrivementBill(){
		judged=false;
	}
	public ArrayList<String> showAllState(){
		ArrayList<String> back=new ArrayList<String>();
		for(int i=0;i<bill.size();i++){
			back.add(bill.get(i).state);
		}	
		return back;	
	}
	public ArrayList<String> showAllID(){
		ArrayList<String> back=new ArrayList<String>();
		for(int i=0;i<bill.size();i++){
			back.add(bill.get(i).id);
		}	
		return back;	
	}
	
	public void addID(String s,String t){
		bill.add(new struct(s,t));
	}
	public class struct{
		public String id;
		String state;
		public struct(String s,String t){
			id=s;
			state=t;
		}
	}
}
