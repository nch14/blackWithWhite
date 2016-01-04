package bill;

public class ArrivementBill_Shop extends ArrivementBill{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3547285606822781011L;
	String transBillID;
	
	public ArrivementBill_Shop(String[] time,String ID,String chufadi){
		super();
		this.date=time;
		this.ID=ID;
		this.placeOfDeparture=chufadi;
	}
}
