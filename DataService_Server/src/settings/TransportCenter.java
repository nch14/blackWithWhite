package settings;

import java.io.Serializable;
import java.util.ArrayList;

public class TransportCenter implements Serializable{
	private String name;//中转中心名称
	private String ID;//中转中心编号
	private ArrayList<BussinessHall> bussinessHall;//下辖营业厅
	
	public TransportCenter(String name,String ID){
		this.name=name;
		this.ID=ID;
		bussinessHall=new ArrayList<BussinessHall>();
	}
	
	public String getID(){
		return ID;
	}
	
	public String getName(){
		return name;
	}
	
	public boolean addBussinessHall(){
		return false;
		
	}
	
	public boolean deleteBussinessHall(){
		return false;
		
	}
	
	public ArrayList<BussinessHall> getBussinessHall(){
		return bussinessHall;
	}
}
