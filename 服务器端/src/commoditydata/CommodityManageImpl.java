package commoditydata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

import Dataservice.FileHelper;
import bill.StockBill_In;
import bill.StockBill_Out;
import bill.StockBlockInfo;
import bill.StockFillmentInfo;
import data.commodity.CommodityManage;
import database.Database_StockBlockInfo;
import database.Database_StockFillment;

public class CommodityManageImpl extends UnicastRemoteObject implements CommodityManage{
	public static Database_StockBlockInfo database_StockBlockInfo;//库存信息
	public static Database_StockFillment database_StockFillment;
	//public static Database_StockOverview database_StockOverview;
	
	public static boolean ready1=false;
	public static boolean ready2=false;
	//public static boolean ready3=false;
	
	final static String dir1="ser/StockBlockInfo.ser";
	final static String dir2="ser/StockFillment.ser";
	//final static String dir3="ser/StockOverview.ser";
	
	protected CommodityManageImpl() throws FileNotFoundException, ClassNotFoundException, IOException{
		//若服务没有初始化，那么读取之前存储的内容
		super();
		if(!ready1){
			database_StockBlockInfo=(Database_StockBlockInfo) FileHelper.read(dir1);
			ready1=true;
		}
		if(!ready2){
			database_StockFillment=(Database_StockFillment) FileHelper.read(dir2);
			ready2=true;
		}
//		if(!ready3){
//			database_StockOverview=(Database_StockOverview) FileHelper.read(dir3);
//			ready3=true;
//		}
	}
	
	public static void save() throws FileNotFoundException, IOException{
		FileHelper.write(dir1, database_StockBlockInfo);
		FileHelper.write(dir2, database_StockFillment);
		//FileHelper.write(dir3, database_StockOverview);
	}


	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	//调整库存
	//输入仓库ID，调整的排号，以及调整后属于哪个区
	public synchronized boolean adjustCommodity(String ID,String num, String block) throws RemoteException {
		// TODO Auto-generated method stub
		boolean bool=database_StockBlockInfo.get(ID).adjust(num, block);
		try {
			this.save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bool;
	}

	@Override
	public boolean init(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	//查询库存情况
	public StockBlockInfo checkCommodity(String id) throws RemoteException {
		// TODO Auto-generated method stub
		StockBlockInfo block=database_StockBlockInfo.get(id);
		return block;
	}

	//为入库的货物增加一个在仓库中的位置，输入为订单以及仓库编号
	public synchronized static StockBill_In addPosition(StockBill_In t,String s){
		StockBill_In bool=database_StockBlockInfo.getPosition(t, s);
		try {
			save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bool;
	}
	//货物出库的时候释放其在库存中的位置
	public static boolean freePosition(StockBill_Out t,String s){
		boolean bool=database_StockBlockInfo.free(t, s);
		try {
			save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bool;
	}

	@Override
	//库区信息初始化。输入仓库ＩＤ，以及每个分区的大小
	public synchronized boolean initialCommodity(String ID, int[] bus, int[] train, int[] plane,int[] blank) throws RemoteException {
		// TODO Auto-generated method stub
		boolean bool=database_StockBlockInfo.initialCommodity(ID, bus, train, plane,blank);
		try {
			save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bool;
	}
	
	
}
