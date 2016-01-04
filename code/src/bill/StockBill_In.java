package bill;

import java.io.Serializable;
import java.util.ArrayList;

import bill.StockBill_In.Info;
public class StockBill_In implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 345001898270272103L;
	public static String billtype="StockBill_In";
	public String ID;
	public boolean judged;
	
<<<<<<< HEAD
	public ArrayList<Info> list = new ArrayList<Info>();
=======
	public ArrayList<PositionInfo> list;
>>>>>>> 224ec90dced0934d4e8961902beed4c6a7037ea7
	
	public StockBill_In() {
		// TODO Auto-generated constructor stub
	}

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
<<<<<<< HEAD
	
	
	public void addlist(String billID,String ID,String date,String destination){
		    this.ID=billID;
			list.add(new Info(ID,date,destination));
		
=======
	public StockBill_In(String[] ID,String[][]date,String[] destination){
		for(int i=0;i<ID.length;i++){
			list.add(new PositionInfo(ID[i],date[i],destination[i]));
		}
>>>>>>> 224ec90dced0934d4e8961902beed4c6a7037ea7
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
	
<<<<<<< HEAD
	public class Info{
		public  String ID;//寄件单号
		public String form;//运输方式
		public String date;//入库日期
		public String destination;//目的地
		public String zoneID;//区号
		public String rowID;//排号
		public String frameID;//架号
		public String positionID;//位号
		
		public Info(String ID,String date,String destination){
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
=======
>>>>>>> 224ec90dced0934d4e8961902beed4c6a7037ea7
	
	}
	
