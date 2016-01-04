package bill;

import java.io.Serializable;
import java.util.ArrayList;

public class TransportBill implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5236873291717999704L;
	public String[] date;
	public boolean judged;
	public String transBillID;
	public String placeOfDeparture;
	public String destination;
	public String observer;
	public double money;
	public String yaYun;
	public String cheCihao;
	public ArrayList<String> list=new ArrayList<String>();

	public TransportBill(String[] date,String transBillID,String placeOfDeparture,
			String destination,String observer,String yaYun,String cheCihao,double money){
		this.date=date;
		this.transBillID=transBillID;
		this.placeOfDeparture=placeOfDeparture;
		this.destination=destination;
		this.observer=observer;
		this.money=money;
		this.cheCihao=cheCihao;
		this.yaYun=yaYun;
	}
	
}
