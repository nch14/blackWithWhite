package bill;

import java.util.ArrayList;
/**
 * 存储在系统中的货物概念，货物持有标记它位置的状态信息、订单号
 * @author 倪辰皓
 *
 */
public class PackageVO {
	private String ID;//寄件单号
	private ArrayList<TransMesgPO> state;
	
	public PackageVO(String ID){
		this.ID=ID;
	}
	
	public String getID(){
		return ID;
	}
	public boolean refreshState(ArrayList<TransMesgPO> transMesgPO){
		state=transMesgPO;
		return true;
	}
	
	public ArrayList<TransMesgPO> getState(){
		return state;
	}
}
