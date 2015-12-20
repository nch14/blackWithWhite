package database;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import bill.AllocateBill;

public class Database_AllocateBill extends Database<AllocateBill> implements Datainterface<AllocateBill> {

	@Override
	public AllocateBill get(String id) {
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
	public boolean add(AllocateBill t) {
		// TODO Auto-generated method stub
		database.put(t.ID, t);
		return true;
	}

	@Override
	public boolean change(AllocateBill t) {
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
	
	public ArrayList<AllocateBill> getUnjudged(){
		ArrayList<AllocateBill> array=new ArrayList<AllocateBill>();
		Iterator iter=database.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry=(Map.Entry)iter.next();
			AllocateBill bill=(AllocateBill) entry.getValue();
			if(!bill.judged)
				array.add(bill);
		}
		return array;
	}

}
