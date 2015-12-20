package settings;

import java.io.Serializable;

public class BussinessHall implements Serializable {

	public String name;//营业厅名称
	String ID;//营业厅编号
	
	public BussinessHall(String name, String ID) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.ID=ID;
	}
}
