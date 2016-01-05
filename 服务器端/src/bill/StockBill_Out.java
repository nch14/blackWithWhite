package bill;

import java.io.Serializable;
import java.util.ArrayList;

public class StockBill_Out implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5561537289245015410L;
	/**
	 * 
	 */
	
	public static String billtype="StockBill_Out";
	public boolean judged;
	public class Info implements Serializable{
		/**
		 * 
		 */
		private static final long serialVersionUID = 7951805291872797302L;
		public String ID;
		public String date;
		public String destination;
		public String form;
		public String ListID;
		
		public Info(String ID1, String date1, String destination1,String form1, String ListID1){
			this.ID=ID1;
			this.date=date1;
			this.destination=destination1;
			this.form=form1;
			this.ListID=ListID1;
		}
	}
	public ArrayList<Info> list = new ArrayList<Info>();
	public String ID;
	
	public StockBill_Out(){}
	
	public void add( String billID, String ID, String date, String destination,String form, String ListID){
		this.ID=billID;
		list.add(new Info(ID, date, destination, form, ListID));
	}
	
	public StockBill_Out(String ID){
		this.ID=ID;
		this.list=new ArrayList<Info>();
	}
}
