package bill;

import java.io.Serializable;
import java.util.ArrayList;

public class StockBill_Out implements Serializable{
	/**
	 * ³ö¿âµ¥
	 */
	private static final long serialVersionUID = -5561537289245015410L;
	public static String billtype="StockBill_Out";
	public boolean judged;
	public class Info{
		public String ID;
		public String[] date;
		public String destination;
		public String form;
		public String ListID;
	}
	public ArrayList<Info> list;
	public String ID;
	
	public StockBill_Out(){}
	
	public StockBill_Out(String ID){
		this.ID=ID;
		this.list=new ArrayList<Info>();
	}
}
