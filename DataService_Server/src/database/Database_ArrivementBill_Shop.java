package database;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import bill.ArrivementBill_Shop;

public class Database_ArrivementBill_Shop extends Database<ArrivementBill_Shop> implements Datainterface<ArrivementBill_Shop> {

	@Override
	public ArrivementBill_Shop get(String id) {
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
	public boolean add(ArrivementBill_Shop t) {
		// TODO Auto-generated method stub
		database.put(t.ID, t);
		return true;
	}

	@Override
	public boolean change(ArrivementBill_Shop t) {
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
	
	public ArrayList<ArrivementBill_Shop> getUnjudged(){
		ArrayList<ArrivementBill_Shop> array=new ArrayList<ArrivementBill_Shop>();
		Iterator iter=database.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry=(Map.Entry)iter.next();
			ArrivementBill_Shop a=(ArrivementBill_Shop) entry.getValue();
			if(!a.judged)
				array.add(a);
		}
		return array;
	}

}
