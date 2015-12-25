package database;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import bill.TransportBill;

public class Database_TransportBill extends Database<TransportBill> implements Datainterface<TransportBill> {

	@Override
	public TransportBill get(String id) {
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
	public boolean add(TransportBill t) {
		// TODO Auto-generated method stub
		database.put(t.transBillID, t);
		return true;
	}

	@Override
	public boolean change(TransportBill t) {
		// TODO Auto-generated method stub
		if(database.put(t.transBillID,t)!=null){
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
	
	public ArrayList<TransportBill> getUnjudged(){
		ArrayList<TransportBill> array=new ArrayList<TransportBill>();
		Iterator iter=database.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry=(Map.Entry)iter.next();
			TransportBill a=(TransportBill) entry.getValue();
			if(!a.judged)
				array.add(a);
		}
		return array;
	}

}
