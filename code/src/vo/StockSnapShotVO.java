package vo;

import java.util.ArrayList;

/**
 * ¿â´æ¿ìÕÕ£¬VO
 * @author Äß³½ð©
 *
 */
public class StockSnapShotVO {
	public ArrayList<Info> list;
	
	public class Info{
		public String ID;
		public String[] date;
		public String destination;
		public String zoneID;
		public String rowID;
		public String frameID;
		public String positionID;
	}
}