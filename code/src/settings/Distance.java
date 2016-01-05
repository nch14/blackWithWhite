package settings;

import java.io.Serializable;

public class Distance extends Department implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2572201682771903410L;
	private City city1;
	private City city2;
	private int distance;
	public Distance(City city1,City city2,int distance){
		this.city1=city1;
		this.city2=city2;
		this.distance=distance;
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
