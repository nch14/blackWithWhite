package bill;

import java.util.ArrayList;
/**
 * 收款单
 * @author 倪辰皓
 *
 */
public class ReceiveMoneyBill {
	public static String billtype="ReceiveMoney";
	public String ID;
	public String[] date;
	public double money;
	public String transactor;//收款的快递员
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
}
