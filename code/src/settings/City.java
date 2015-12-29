package settings;

import java.io.Serializable;
import java.util.ArrayList;

public class City extends Department implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4090542931586899709L;
	public String name;//城市名称
	String ID;//城市编号
	public ArrayList<TransportCenter> transportCenter;//下辖中转中心
	
	
	public City(String name,String ID){
		this.name=name;
		this.ID=ID;
		this.transportCenter=new ArrayList<TransportCenter>();
		
		//如果增加自由增删中转中心功能，以下代码请修改
		TransportCenter aTransportCenter=new TransportCenter(this.name+"中转中心", ID+"1");
		this.transportCenter.add(aTransportCenter);
	}
	
	/**
	 * 增加中转中心。
	 * 该功能尚未添加
	 * @param aTransportCenter
	 * @return
	 */
	public boolean addTransportCenter(TransportCenter aTransportCenter){
		return false;
	}
	
	
}
