package bill;

public class TransportBill_Train extends TransportBill {
	public TransportBill_Train(String[] date, String transBillID, String placeOfDeparture, String destination,
			String observer, double money) {
		super(date, transBillID, placeOfDeparture, destination, observer, money);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 3265866550050660034L;
	String trainID;
	String carriageID;
}
