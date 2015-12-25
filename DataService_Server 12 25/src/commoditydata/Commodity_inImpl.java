package commoditydata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Dataservice.FileHelper;
import bill.StockBill_In;
import data.commodity.Commodity_In_Manage;
import database.Database_StockBill_In;
import java.io.*;

public class Commodity_inImpl extends UnicastRemoteObject implements Commodity_In_Manage {
	/**
	 * Commodity入库服务的提供者
	 * 封装数据存储对象以及对于数据的操作
	 */
	public static Database_StockBill_In database;//数据存储对象
	public static boolean ready=false;//服务是否已经加载完成
	final static String dir="ser/StockBill_In.ser";//数据读取目录
	
	protected Commodity_inImpl() throws FileNotFoundException, ClassNotFoundException, IOException {
		super();
		//FileHelper.write(dir, new Database_StockBill_In());
		//如果服务没有初始化，则读取之前存储的内容
		if(!ready){
			ready=true;
			database=(Database_StockBill_In) FileHelper.read(dir);
		}
		// TODO Auto-generated constructor stub
	}
	
	public static void save() throws FileNotFoundException, IOException{
		FileHelper.write(dir, database);
	}


	@Override
	//根据ID删除一个对象
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
	//修改一个对象
	public synchronized boolean change(StockBill_In bill) {
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
	//根据ID获得一个对象
	public StockBill_In get(String id) {
		// TODO Auto-generated method stub
		return database.get(id);
	}

	@Override
	//清空数据存储区
	public boolean init() {
		// TODO Auto-generated method stub
		database=new Database_StockBill_In();
		return true;
	}

	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	//插入一个对象
	public synchronized StockBill_In insert(StockBill_In bill, String ID) {
		// TODO Auto-generated method stub
		StockBill_In temp=CommodityManageImpl.addPosition(bill, ID);
		database.add(temp);
		try {
			this.save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	@Override
	//取得所有未审批的对象
	public synchronized ArrayList<StockBill_In> getUnjudged() throws RemoteException {
		// TODO Auto-generated method stub
		return database.getUnjudged();
	}
}
