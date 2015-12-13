package settings;

import java.io.Serializable;
import java.util.ArrayList;

public class City implements Serializable{

	public String name;//城市名称
	String ID;//城市编号
	ArrayList<TransportCenter> transportCenter;//下辖中转中心
	
	
	
}
