package bill;

public class ArrivementBill_Center extends ArrivementBill{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5512259518031962786L;
	public String centerID;
	
	public ArrivementBill_Center(String[] time,String ID,String centerID){
		this.centerID=centerID;
		this.date=time;
		this.ID=ID;
	}
	public ArrivementBill_Center(){
		
	}

}
