package bill;

public class BusShipmentBill_Shop extends BusShipmentBill{
	String ID;
	
	public BusShipmentBill_Shop(String[] time,String busshipID,String destination,String busID
			,String Observer,String guard,double money,String ID){
		this.date=time;
		this.busshipID=busshipID;
		this.destination=destination;
		this.busID=busID;
		this.Observer=Observer;
		this.guard=guard;
		this.money=money;
		this.ID=ID;
	}
	
	public BusShipmentBill_Shop(){}
}
