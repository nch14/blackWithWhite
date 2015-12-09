package po.bills;

import java.util.ArrayList;

public class StockBill_Out {
	public static String billtype="StockBill_Out";
	public boolean judged;
	class Info{
		String ID;
		String[] date;
		String destination;
		String form;
		String ListID;
	}
	ArrayList<Info> list;
	public String ID;
}
