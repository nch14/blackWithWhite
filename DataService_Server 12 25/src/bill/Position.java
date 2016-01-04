package bill;

import java.io.Serializable;

public class Position implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1594989676954128362L;
	public String id;
	public String[] date;
	public String destination;
	public boolean empty;
}