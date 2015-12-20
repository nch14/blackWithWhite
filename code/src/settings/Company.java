package settings;

import java.io.Serializable;
import java.util.ArrayList;

public class Company implements Serializable {
	public static ArrayList<City> citys;
	public static ArrayList<Distance> distance;
	
	/**
	 * 该方法不得调用！
	 */
	public Company(){
		citys=new ArrayList<City>();
		distance=new ArrayList<Distance>();
	}
	public int getDistance(City city1,City city2){
		Distance findDistance;
		for(int i=0;i<distance.size();i++){
			findDistance=distance.get(i);
			if(findDistance.getCity1().equals(city1)&&findDistance.getCity2().equals(city2))
				return findDistance.getDistance();
			if(findDistance.getCity1().equals(city2)&&findDistance.getCity2().equals(city1))
				return findDistance.getDistance();
		}
		return 0;
	}	
	public boolean addCity(City city,ArrayList<Integer> distances){
		Distance thisdistance;
		for(int i=0;i<citys.size();i++){
			thisdistance=new Distance(city,citys.get(i),distances.get(i));
			distance.add(thisdistance);
		}
		citys.add(city);
		//下面还要调用一次同步方法
		return CompanySettingsController.push();
	}
	public boolean deleteCity(City city){
		Distance findDistance;
		ArrayList<Distance> distanceToDelete=new ArrayList<Distance>();
		for(int i=0;i<distance.size();i++){
			findDistance=distance.get(i);
			if(findDistance.getCity1().equals(city)||findDistance.getCity2().equals(city))
				distanceToDelete.add(findDistance);
		}
		while(!distanceToDelete.isEmpty()){
			Distance dis=distanceToDelete.get(0);
			distance.remove(dis);
			distanceToDelete.remove(dis);
		}
		citys.remove(city);
		//下面还要调用一次同步方法
		return CompanySettingsController.push();
	}
	

}
