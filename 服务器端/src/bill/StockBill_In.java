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
	
	public ArrayList<Info> list;
	
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
			list.add(new Info(ID[i],date[i],destination[i]));
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
	
	public class Info{
		public  String ID;//寄件单号
		public String form;//运输方式
		private String[] date;//入库日期
		private String destination;//目的地
		private String zoneID;//区号
		private String rowID;//排号
		private String frameID;//架号
		private String positionID;//位号
		
		public Info(String ID,String[]date,String destination){
			this.ID=ID;
			this.destination=destination;
			this.date=date;
		}
		void allocate(String zoneID,String rowID,String frameID,String positionID){
			this.zoneID=zoneID;
			this.rowID=rowID;
			this.frameID=frameID;
			this.positionID=positionID;
		}
	}
	
	

}
