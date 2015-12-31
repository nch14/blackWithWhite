package bill;

import java.io.Serializable;
import java.util.ArrayList;

public class ArrivementBill implements Serializable{
	/**
	 * 到达单父类
	 */
	
	public String ID;//单据的ID
	public boolean judged;
	public String[] date;
	public String placeOfDeparture;
	public ArrayList<struct> bill=new  ArrayList<struct>();
	
	public ArrivementBill(){
		judged=false;
	}
	
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
		public struct(String s,State t){
			id=s;
			st=t;
		}
	}
}
