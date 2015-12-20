package database;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import HelperClass.CompareDate;
import bill.ReceiveMoneyBill;

public class Database_ReceiveMoneyBill extends Database<ReceiveMoneyBill> implements Datainterface<ReceiveMoneyBill> {

	@Override
	public ReceiveMoneyBill get(String id) {
		// TODO Auto-generated method stub
		return database.get(id);
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		if(database.remove(id)!=null){
			return true;
		}
		else
			return false;
	}

	@Override
	public boolean add(ReceiveMoneyBill t) {
		// TODO Auto-generated method stub
		database.put(t.ID, t);
		return true;
	}

	@Override
	public boolean change(ReceiveMoneyBill t) {
		// TODO Auto-generated method stub
		if(database.put(t.ID,t)!=null){
			return true;
		}
		else
			return false;
	}

	@Override
	public boolean init() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public ArrayList<ReceiveMoneyBill> getAll(String[] time){
		ArrayList<ReceiveMoneyBill> array=new ArrayList<ReceiveMoneyBill>();
		Iterator iter=database.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry=(Map.Entry)iter.next();
			ReceiveMoneyBill a=(ReceiveMoneyBill) entry.getValue();
			if(CompareDate.larger(a.date, time)){
				array.add(a);
			}
		}
		return array;
	}
	
	public ArrayList<ReceiveMoneyBill> getAll(String[] time1,String[] time2){
		ArrayList<ReceiveMoneyBill> array=new ArrayList<ReceiveMoneyBill>();
		Iterator iter=database.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry=(Map.Entry)iter.next();
			ReceiveMoneyBill a=(ReceiveMoneyBill) entry.getValue();
			if(CompareDate.larger(a.date, time2)&&(CompareDate.larger(time1, a.date))){
				array.add(a);
			}
		}
		return array;
	}
	
	public ArrayList<ReceiveMoneyBill> get_OneDay(String[] date){
		ArrayList<ReceiveMoneyBill> array=new ArrayList<ReceiveMoneyBill>();
		Iterator iter=database.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry=(Map.Entry)iter.next();
			ReceiveMoneyBill a=(ReceiveMoneyBill) entry.getValue();
			if(a.date.equals(date)){
				array.add(a);
			}
		}
		return array;
	}
	
	public ArrayList<ReceiveMoneyBill> getAll(String[] time, String ID_Of_Shop){
		ArrayList<ReceiveMoneyBill> array=new ArrayList<ReceiveMoneyBill>();
		Iterator iter=database.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry=(Map.Entry)iter.next();
			ReceiveMoneyBill a=(ReceiveMoneyBill) entry.getValue();
			if(a.date.equals(time)&&a.bussinessHallCode.equals(ID_Of_Shop)){
				array.add(a);
			}
		}
		return array;
	}
	
	public ArrayList<ReceiveMoneyBill> getUnjudged(){
		ArrayList<ReceiveMoneyBill> array=new ArrayList<ReceiveMoneyBill>();
		Iterator iter=database.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry=(Map.Entry)iter.next();
			ReceiveMoneyBill a=(ReceiveMoneyBill) entry.getValue();
			if(!a.judged){
				array.add(a);
			}
		}
		return array;
	}

}
