package po.bills;

import java.util.ArrayList;

public class BusShipmentBill {
	String[] date;//日期
	public String busshipID;//汽运编号
	public boolean judged;
	String destination;
	String busID;//汽车编号
	String Observer;//监装员
	String guard;//押运员
	public ArrayList<String> idCollection=new ArrayList<String>();
	double money;
}
