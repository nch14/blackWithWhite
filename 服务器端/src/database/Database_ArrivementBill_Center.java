package database;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import bill.ArrivementBill_Center;

public class Database_ArrivementBill_Center extends Database<ArrivementBill_Center> implements Datainterface<ArrivementBill_Center> {

	@Override
	public ArrivementBill_Center get(String id) {
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
	public boolean add(ArrivementBill_Center t) {
		// TODO Auto-generated method stub
		database.put(t.ID,t);
		return true;
	}

	@Override
	public boolean change(ArrivementBill_Center t) {
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
	
	public ArrayList<ArrivementBill_Center> getUnjuedged(){
		ArrayList<ArrivementBill_Center> array=new ArrayList<ArrivementBill_Center>();
		Iterator iter=database.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry=(Map.Entry)iter.next();
			ArrivementBill_Center a=(ArrivementBill_Center) entry.getValue();
			if(!a.judged){
				array.add(a);
			}
		}
		return array;
	}

}
