package bill;

import java.io.Serializable;
import java.util.ArrayList;

public class TransportBill implements Serializable{
	/**
	 * 中转单父类
	 */
	private static final long serialVersionUID = 5236873291717999704L;
	String[] date;
	public boolean judged;
	public String transBillID;
	String placeOfDeparture;
	String destination;
	String observer;
	double money;
	public ArrayList<String> list=new ArrayList<String>();

	public TransportBill(){}
	
	public TransportBill(String[] date,String transBillID,String placeOfDeparture,
			String destination,String observer,double money){
		this.date=date;
		this.transBillID=transBillID;
		this.placeOfDeparture=placeOfDeparture;
		this.destination=destination;
		this.observer=observer;
		this.money=money;
	}
	
}
