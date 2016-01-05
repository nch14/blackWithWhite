package commoditydata;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Dataservice.FileHelper;
import bill.StockBill_Out;
import data.commodity.Commodity_Out_Manage;
import database.Database_StockBill_Out;

public class Commodity_OutImpl extends UnicastRemoteObject implements Commodity_Out_Manage {
	/**
	 * commodity出库服务的提供者
	 */
	public static Database_StockBill_Out database;//数据存储对象
	public static boolean ready=false;//服务是否已经初始化
	final static String dir="ser/StockBill_Out.ser";//读取数据的目录
	
	protected Commodity_OutImpl() throws FileNotFoundException, IOException, ClassNotFoundException {
		super();
		//如果服务没有初始化，则读取之前存储的对象
		if(!ready){
			ready=true;
			database=(Database_StockBill_Out) FileHelper.read(dir);
		}
		// TODO Auto-generated constructor stub
	}

	public static void save() throws FileNotFoundException, IOException{
		FileHelper.write(dir, database);
	}
	@Override
	//根据中转中心编号和单号存储出库单
	public synchronized boolean insert(StockBill_Out bill,String id) {
		// TODO Auto-generated method stub
		CommodityManageImpl.freePosition(bill, id);
		System.out.println("insert here");
		boolean bool=database.add(bill);
		System.out.println(bool);
		try {
			this.save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bool;
	}

	@Override
	//删除一个出库单
	public synchronized boolean delete(String id) {
		// TODO Auto-generated method stub
		boolean bool=database.delete(id);
		try {
			this.save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bool;
	}

	@Override
	//修改一个出库单
	public synchronized boolean change(StockBill_Out bill) {
		// TODO Auto-generated method stub
		boolean bool=database.change(bill);
		try {
			this.save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bool;
	}

	@Override
	//获得一个出库单
	public StockBill_Out get(String id) {
		// TODO Auto-generated method stub
		return database.get(id);
	}

	@Override
	//清空库区信息
	public boolean init() {
		// TODO Auto-generated method stub
		database=new Database_StockBill_Out();
		return true;
	}

	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	//获得所有未审批单据
	public synchronized ArrayList<StockBill_Out> getUnjudged() throws RemoteException {
		// TODO Auto-generated method stub
		return database.getUnjudged();
	}

}
