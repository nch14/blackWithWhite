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
	/**
	 * 本方法仅供系统初始化调用。任何人不得调用。
	 * @param names 名称
	 * @return
	 */
	public void addBussinessHall(String[] names){
		
		for(int i=0;i<names.length;i++){
			if(i<10){
				this.bussinessHall.add(new BussinessHall(names[i],this.ID+"0"+i));
			}else{
				this.bussinessHall.add(new BussinessHall(names[i],this.ID+i));
			}
		}
		
	}
}
