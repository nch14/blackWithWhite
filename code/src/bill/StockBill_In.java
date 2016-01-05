package bill;

import java.io.Serializable;
import java.util.ArrayList;
public class StockBill_In implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 345001898270272103L;
	public static String billtype="StockBill_In";
	public String ID;
	public boolean judged;
	
	public ArrayList<PositionInfo> list;
	
	public int getLength(){
		return list.size();
	}
	
	public String[] getID(){
		String[] s=new String[list.size()];
		for(int i=0;i<list.size();++i){
			s[i]=list.get(i).ID;
		}
		return s;
	}
	/**
	 * UI层创建入库单
	 * @param ID
	 * @param date
	 * @param destination
	 */
	public StockBill_In(String[] ID,String[][]date,String[] destination){
		for(int i=0;i<ID.length;i++){
			list.add(new PositionInfo(ID[i],date[i],destination[i]));
		}
	}
	
	/**
	 * 业务逻辑层分配位置
	 * @param zoneID
	 * @param rowID
	 * @param frameID
	 * @param positionID
	 */
	public void allocate(String[] zoneID,String[] rowID,String[] frameID,String[] positionID){
		for(int i=0;i<zoneID.length;i++){
			list.get(i).allocate(zoneID[i], rowID[i], frameID[i], positionID[i]);
		}
	}
	
	
	}
	

