package main;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import bill.Account;
import database.Database_AllocateBill;
import database.Database_ArrivementBill_Center;
import database.Database_ArrivementBill_Shop;
import database.Database_BusInfo;
import database.Database_BusShipmentBill_Center;
import database.Database_BusShipmentBill_Shop;
import database.Database_DriverInfo;
import database.Database_MemberInfo;
import database.Database_OrderBillPO;
import database.Database_Payment;
import database.Database_ReceiveMoneyBill;
import database.Database_StockBill_In;
import database.Database_StockBill_Out;
import database.Database_StockBlockInfo;
import database.Database_StockFillment;
import database.Database_TransMesg;
import database.Database_TransportBill;
import database.Database_imformation;
import settings.Company;

public class Input {
	public Database_AllocateBill database_AllocateBill;
	public Database_ArrivementBill_Center database_ArrivementBill_Center;
	public Database_ArrivementBill_Shop database_ArrivementBill_Shop;
	public Database_BusShipmentBill_Center database_BusShipmentBill_Center;
	public Database_BusShipmentBill_Shop database_BusShipmentBill_Shop;
	public Database_imformation database_imformation;
	public Database_OrderBillPO database_OrderBillPO;
	public Database_Payment database_Payment;
	public Database_ReceiveMoneyBill database_ReceiveMoneyBill;
	public Database_StockBill_In database_StockBill_In;
	public Database_StockBill_Out database_StockBill_Out;
	public Database_StockBlockInfo database_StockBlockInfo;
	public Database_StockFillment database_StockFillment;
	//public Database_StockOverview database_StockOverview;
	public Database_TransMesg database_TransMesg;
	public Database_TransportBill database_TransportBill_Bus;
	public Database_TransportBill database_TransportBill_Train;
	public Database_TransportBill database_TransportBill_Plane;
	public Database_BusInfo database_BusInfo;
	
	
	static String[] filename={"ser/AllocateBill.ser","ser/ArrivementBill_Center.ser","ser/ArrivementBill_Shop.ser"
			,"ser/BusShipmentBill_Center.ser","ser/BusShipmentBill_Shop.ser","ser/imformation.ser","ser/OrderBill.ser"
			,"ser/Payment.ser","ser/ReceiveMoneyBill.ser","ser/StockBill_In.ser","ser/StockBill_Out.ser","ser/StockBlockInfo.ser",
			"ser/StockFillment.ser","ser/StockOverview.ser","ser/TransMesg.ser","ser/TransportBill_Bus.ser",
			"ser/TransportBill_Train.ser","ser/TransportBill_Plane.ser"};
	
	int size=filename.length;
	
	
	public static void writein() throws FileNotFoundException, IOException{
		System.out.println("Writing in,please wait.......");
		int index=0;
		ObjectOutputStream out;
		
//		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
//		System.out.print(index);
//		out.writeObject(new Database_AllocateBill());
//		out.close();
//		
//		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
//		System.out.print(index);
//		out.writeObject(new Database_ArrivementBill_Center());
//		out.close();
//		
//		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
//		System.out.print(index);
//		out.writeObject(new Database_ArrivementBill_Shop());
//		out.close();
//		
//		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
//		System.out.print(index);
//		out.writeObject(new Database_BusShipmentBill_Center());
//		out.close();
//		
//		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
//		System.out.print(index);
//		out.writeObject(new Database_BusShipmentBill_Shop());
//		out.close();
//		
//		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
//		System.out.print(index);
//		out.writeObject(new Database_imformation());
//		out.close();
//		
//		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
//		System.out.print(index);
//		out.writeObject(new Database_OrderBillPO());
//		out.close();
//		
//		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
//		System.out.print(index);
//		out.writeObject(new Database_Payment());
//		out.close();
//		
//		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
//		System.out.print(index);
//		out.writeObject(new Database_ReceiveMoneyBill());
//		out.close();
//		
//		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
//		System.out.print(index);
//		out.writeObject(new Database_StockBill_In());
//		out.close();
//		
//		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
//		System.out.print(index);
//		out.writeObject(new Database_StockBill_Out());
//		out.close();
//		
//		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
//		System.out.print(index);
//		out.writeObject(new Database_StockBlockInfo());
//		out.close();
//		
//		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
//		System.out.print(index);
//		out.writeObject(new Database_StockFillment());
//		out.close();
//		
//		index++;
//		
//		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
//		System.out.print(index);
//		out.writeObject(new Database_TransMesg());
//		out.close();
//		
//		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
//		System.out.print(index);
//		out.writeObject(new Database_TransportBill());
//		out.close();
//		
//		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
//		System.out.print(index);
//		out.writeObject(new Database_TransportBill());
//		out.close();
//		
//		out=new ObjectOutputStream(new FileOutputStream(filename[index++]));
//		System.out.print(index);
//		out.writeObject(new Database_TransportBill());
//		out.close();
//		
//		out=new ObjectOutputStream(new FileOutputStream("ser/BusInfo.ser"));
//		out.writeObject(new Database_BusInfo());
//		out.close();
//		
//		out=new ObjectOutputStream(new FileOutputStream("ser/DriverInfo.ser"));
//		out.writeObject(new Database_DriverInfo());
//		out.close();
//		
//		out=new ObjectOutputStream(new FileOutputStream("ser/MemberInfo.ser"));
//		out.writeObject(new Database_MemberInfo());
//		out.close();
//		
//		out=new ObjectOutputStream(new FileOutputStream("ser/Account.ser"));
//		out.writeObject(new ArrayList<Account>());
//		out.close();
//		
//		out=new ObjectOutputStream(new FileOutputStream("ser/Agency.ser"));
//		out.writeObject(new ArrayList<Company>());
//		out.close();
		
		out=new ObjectOutputStream(new FileOutputStream("ser/StockBlockInfo.ser"));
		out.writeObject(new Database_StockBlockInfo());
		out.close();
		
		
		
		System.out.println("Write in successfully!");
	}
}
