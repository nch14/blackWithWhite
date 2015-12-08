package database;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import bill.StockBill_Out;

public class Database_StockBill_Out extends Database<StockBill_Out> implements Datainterface<StockBill_Out> {

	@Override
	public StockBill_Out get(String id) {
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
	public boolean add(StockBill_Out t) {
		// TODO Auto-generated method stub
		
		database.put(t.ID, t);
		return true;
	}

	@Override
	public boolean change(StockBill_Out t) {
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
	
	public ArrayList<StockBill_Out> getUnjudged(){
		ArrayList<StockBill_Out> array=new ArrayList<StockBill_Out>();
		Iterator iter=database.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry=(Map.Entry)iter.next();
			StockBill_Out a=(StockBill_Out) entry.getValue();
			if(!a.judged)
				array.add(a);
		}
		return array;
	}

}
