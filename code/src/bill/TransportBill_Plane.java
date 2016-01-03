package bill;

public class TransportBill_Plane extends TransportBill {
	public TransportBill_Plane(String[] date, String transBillID, String placeOfDeparture, String destination,
			String observer, double money) {
		super(date, transBillID, placeOfDeparture, destination, observer, money);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String planeID;
	String blockID;

}
