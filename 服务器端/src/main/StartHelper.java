package main;
import database.*;

import java.io.*;
public class StartHelper {
	public static Database_AllocateBill database_AllocateBill;
	public static Database_ArrivementBill_Center database_ArrivementBill_Center;
	public static Database_ArrivementBill_Shop database_ArrivementBill_Shop;
	public static Database_BusShipmentBill_Center database_BusShipmentBill_Center;
	public static Database_BusShipmentBill_Shop database_BusShipmentBill_Shop;
	public static Database_imformation database_imformation;
	public static Database_OrderBillPO database_OrderBillPO;
	public static Database_Payment database_Payment;
	public static Database_ReceiveMoneyBill database_ReceiveMoneyBill;
	public static Database_StockBill_In database_StockBill_In;
	public static Database_StockBill_Out database_StockBill_Out;
	public static Database_StockBlockInfo database_StockBlockInfo;
	public static Database_StockFillment database_StockFillment;
	//public static Database_StockOverview database_StockOverview;
	public static Database_TransMesg database_TransMesg;
	public static Database_TransportBill database_TransportBill_Bus;
	public static Database_TransportBill database_TransportBill_Train;
	public static Database_TransportBill database_TransportBill_Plane;
	
	static String[] filename={"ser/AllocateBill.ser","ser/ArrivementBill_Center.ser","ser/ArrivementBill_Shop.ser"
			,"ser/BusShipmentBill_Center.ser","ser/BusShipmentBill_Shop.ser","ser/imformation.ser","ser/OrderBill.ser"
			,"ser/Payment.ser","ser/ReceiveMoneyBill.ser","ser/StockBill_In.ser","ser/StockBill_Out.ser","ser/StockBlockInfo.ser",
			"ser/StockFillment.ser","ser/StockOverview.ser","ser/TransMesg.ser","ser/TransportBill_Bus.ser",
			"ser/TransportBill_Train.ser","ser/TransportBill_Plane.ser"};
	
	int size=filename.length;
	
	
	public void init() throws ClassNotFoundException, IOException{
		/*
		 * String[] filename={"ser/AllocateBill.ser","ser/ArrivementBill_Center.ser","ser/ArrivementBill_Shop.ser"
		 
				,"ser/BusShipmentBill_Center.ser","ser/BusShipmentBill_Shop.ser","ser/imformation.ser","ser/OrderBill.ser"
				,"ser/Payment.ser","ser/ReceiveMoneyBill.ser","ser/StockBill_In.ser","ser/StockBill_Out.ser","ser/StockBlockInfo.ser",
				"ser/StockFillment.ser","ser/StockOverview.ser","ser/TransMesg.ser","ser/TransportBill_Bus.ser",
				"ser/TransportBill_Train.ser","ser/TransportBill_Plane.ser"};
		int size=filename.length;
		*/
		
		int index=0;
		ObjectInputStream in;
		System.out.println("getting ready for database..");
		
		in=new ObjectInputStream(new FileInputStream(filename[index++]));
		database_AllocateBill=(Database_AllocateBill)in.readObject();
		in.close();
		
		in=new ObjectInputStream(new FileInputStream(filename[index++]));
		database_ArrivementBill_Center=(Database_ArrivementBill_Center)in.readObject();
		in.close();
		
		in=new ObjectInputStream(new FileInputStream(filename[index++]));
		database_ArrivementBill_Shop=(Database_ArrivementBill_Shop)in.readObject();
		in.close();
		
		in=new ObjectInputStream(new FileInputStream(filename[index++]));
		database_BusShipmentBill_Center=(Database_BusShipmentBill_Center)in.readObject();
		in.close();
		
		in=new ObjectInputStream(new FileInputStream(filename[index++]));
		database_BusShipmentBill_Shop=(Database_BusShipmentBill_Shop)in.readObject();
		in.close();
		
		in=new ObjectInputStream(new FileInputStream(filename[index++]));
		database_imformation=(Database_imformation)in.readObject();
		in.close();
		
		in=new ObjectInputStream(new FileInputStream(filename[index++]));
		database_OrderBillPO=(Database_OrderBillPO)in.readObject();
		in.close();
		
		in=new ObjectInputStream(new FileInputStream(filename[index++]));
		database_Payment=(Database_Payment)in.readObject();
		in.close();
		
		in=new ObjectInputStream(new FileInputStream(filename[index++]));
		database_ReceiveMoneyBill=(Database_ReceiveMoneyBill)in.readObject();
		in.close();
		
		in=new ObjectInputStream(new FileInputStream(filename[index++]));
		database_StockBill_In=(Database_StockBill_In)in.readObject();
		in.close();
		
		in=new ObjectInputStream(new FileInputStream(filename[index++]));
		database_StockBill_Out=(Database_StockBill_Out)in.readObject();
		in.close();
		
		in=new ObjectInputStream(new FileInputStream(filename[index++]));
		database_StockBlockInfo=(Database_StockBlockInfo)in.readObject();
		in.close();
		
		in=new ObjectInputStream(new FileInputStream(filename[index++]));
		database_StockFillment=(Database_StockFillment)in.readObject();
		in.close();
		
//		in=new ObjectInputStream(new FileInputStream(filename[index++]));
//		database_StockOverview=(Database_StockOverview)in.readObject();
//		in.close();
		
		in=new ObjectInputStream(new FileInputStream(filename[index++]));
		database_TransMesg=(Database_TransMesg)in.readObject();
		in.close();
		
		in=new ObjectInputStream(new FileInputStream(filename[index++]));
		database_TransportBill_Bus=(Database_TransportBill)in.readObject();
		in.close();
		
		in=new ObjectInputStream(new FileInputStream(filename[index++]));
		database_TransportBill_Train=(Database_TransportBill)in.readObject();
		in.close();
		
		in=new ObjectInputStream(new FileInputStream(filename[index++]));
		database_TransportBill_Plane=(Database_TransportBill)in.readObject();
		in.close();
		
		System.out.println("database is ready");
	}
	
	public void shutdown() throws FileNotFoundException, IOException{
		System.out.println("Saving changes,please wait.......");
		int index=0;
		ObjectOutputStream out;
		
		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
		out.writeObject(database_AllocateBill);
		out.close();
		
		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
		out.writeObject(database_ArrivementBill_Center);
		out.close();
		
		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
		out.writeObject(database_ArrivementBill_Shop);
		out.close();
		
		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
		out.writeObject(database_BusShipmentBill_Center);
		out.close();
		
		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
		out.writeObject(database_BusShipmentBill_Shop);
		out.close();
		
		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
		out.writeObject(database_imformation);
		out.close();
		
		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
		out.writeObject(database_OrderBillPO);
		out.close();
		
		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
		out.writeObject(database_Payment);
		out.close();
		
		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
		out.writeObject(database_ReceiveMoneyBill);
		out.close();
		
		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
		out.writeObject(database_StockBill_In);
		out.close();
		
		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
		out.writeObject(database_StockBill_Out);
		out.close();
		
		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
		out.writeObject(database_StockBlockInfo);
		out.close();
		
		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
		out.writeObject(database_StockFillment);
		out.close();
		
//		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
//		out.writeObject(database_StockOverview);
//		out.close();
		
		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
		out.writeObject(database_TransMesg);
		out.close();
		
		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
		out.writeObject(database_TransportBill_Bus);
		out.close();
		
		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
		out.writeObject(database_TransportBill_Train);
		out.close();
		
		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
		out.writeObject(database_TransportBill_Plane);
		out.close();
		
		System.out.println("Save complete!");
	}
	
	
}
