package bill;

import java.io.Serializable;
import java.util.ArrayList;

public class BusShipmentBill implements Serializable{
	String[] date;//日期
	public String busshipID;//汽运编号
	public boolean judged;
	String destination;
	String busID;//汽车编号
	String Observer;//监装员
	String guard;//押运员
	public ArrayList<String> idCollection=new ArrayList<String>();
	double money;
	
	public BusShipmentBill(){}
	public BusShipmentBill(String[] time,String busshipID,String destination,String busID
			,String Observer,String guard,double money){
		this.date=time;
		this.busshipID=busshipID;
		this.destination=destination;
		this.busID=busID;
		this.Observer=Observer;
		this.guard=guard;
		this.money=money;
	}
}
