package bill;

public class ArrivementBill_Shop extends ArrivementBill{
	String transBillID;
	
	public ArrivementBill_Shop(){}
	public ArrivementBill_Shop(String[] time,String ID,String transBillID){
		super();
		this.date=time;
		this.ID=ID;
		this.transBillID=transBillID;
	}
}
