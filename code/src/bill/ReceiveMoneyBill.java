package bill;

import java.io.Serializable;
import java.util.ArrayList;
/**
 * 收款单
 * @author 倪辰皓
 *
 */
public class ReceiveMoneyBill implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4485009681134619444L;
	public static String billtype="ReceiveMoney";
	public String ID;
	public boolean judged;
	public String[] date;
	public double money;
	public String transactor;//收款的快递员
	public String bussinessHallCode;//收款单的营业厅编号
	public ArrayList<String> list=new ArrayList<String>();
	
	/**
	 * 可以得到形如19960218的字符串
	 * @return
	 */
	public String getDate(){
		String result="";
		result+=date[0]+date[1]+date[2];
		return result;	
	}
	
	public ReceiveMoneyBill(String ID,String[] time,double money,String transactor
			,String bussinessHallCode){
		this.ID=ID;
		this.date=time;
		this.money=money;
		this.transactor=transactor;
		this.bussinessHallCode=bussinessHallCode;
	}
	
	public ReceiveMoneyBill(){
		
	}
}
