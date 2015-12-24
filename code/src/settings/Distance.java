package settings;

import java.io.Serializable;

public class Distance implements Serializable{
	private City city1;
	private City city2;
	private int distance;
	public Distance(City city1,City city2,int distance){
		
	}
	public City getCity1() {
		return city1;
	}
	public City getCity2() {
		return city2;
	}
	public int getDistance(){
		return distance;
	}
}
