package bill;

import java.io.Serializable;
import java.util.ArrayList;

public class AllocateBill implements Serializable{
	
	/**
	 * 派件单
	 */
	private static final long serialVersionUID = 4864493447844671634L;
	public String ID;//单据的ID
	public boolean judged;
	public String[] date;
	public String name;//快递员的名字
	public ArrayList<String> list;//单据的寄件单号
	
	public AllocateBill(String ID,String numID,String[] date){
		this.ID=ID;
		this.name=numID;
		this.date=date;
		list=new ArrayList<String>();
	}
	


}
