package vo;

import java.util.ArrayList;

/**
 * ¿â´æ¿ìÕÕ£¬VO
 * @author Äß³½ð©
 *
 */
public class StockSnapShotVO {
	ArrayList<Info> list;
	
	class Info{
		String ID;
		String[] date;
		String destination;
		String zoneID;
		String rowID;
		String frameID;
		String positionID;
	}
}