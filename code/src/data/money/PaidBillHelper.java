package data.money;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.bills.ReceiveMoneyBill;
import remoteInterface.Client_Helper;

public interface PaidBillHelper extends Client_Helper{
	public boolean init() throws RemoteException;
	
	public boolean insert(ReceiveMoneyBill bill) throws RemoteException;
	
	public boolean delete(String id) throws RemoteException;
	
	public ReceiveMoneyBill get(String id) throws RemoteException;
	
	public ArrayList<ReceiveMoneyBill> getall(String[] time) throws RemoteException;
	
	public ArrayList<ReceiveMoneyBill> getall(String[] time1,String[] time2) throws RemoteException;
	
	public ArrayList<ReceiveMoneyBill> getall_Oneday(String[] time)throws RemoteException;
	
	public ArrayList<ReceiveMoneyBill> getall(String[] time,String ID_Of_Shop)throws RemoteException;
	
	public ArrayList<ReceiveMoneyBill> getUnjudged() throws RemoteException;
}
