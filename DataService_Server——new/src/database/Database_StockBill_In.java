package database;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import bill.StockBill_In;

public class Database_StockBill_In extends Database<StockBill_In> implements Datainterface<StockBill_In> {

	@Override
	public StockBill_In get(String id) {
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
	public boolean add(StockBill_In t) {
		// TODO Auto-generated method stub
		database.put(t.ID, t);
		return true;
	}

	@Override
	public boolean change(StockBill_In t) {
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
	
	public ArrayList<StockBill_In> getUnjudged(){
		ArrayList<StockBill_In> array=new ArrayList<StockBill_In>();
		Iterator iter=database.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry=(Map.Entry)iter.next();
			StockBill_In a=(StockBill_In) entry.getValue();
			if(!a.judged)
				array.add(a);
		}
		return array;
	}

}
