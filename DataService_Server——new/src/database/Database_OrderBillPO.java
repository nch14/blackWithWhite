package database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import bill.OrderBillPO;

public class Database_OrderBillPO extends Database<OrderBillPO> implements Datainterface<OrderBillPO> {
	
	//private HashMap<String,OrderBillPO> database=new HashMap<String,OrderBillPO>();
	
	@Override
	public OrderBillPO get(String id) {
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
	public boolean add(OrderBillPO t) {
		// TODO Auto-generated method stub
		database.put(t.ID,t);
		return true;
	}

	@Override
	public boolean change(OrderBillPO t) {
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
	
	public ArrayList<OrderBillPO> getUnjuedged(){
		ArrayList<OrderBillPO> array=new ArrayList<OrderBillPO>();
		Iterator iter=database.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry=(Map.Entry)iter.next();
			OrderBillPO a=(OrderBillPO) entry.getValue();
			if(!a.judged)
				array.add(a);
		}
		return array;
	}

}
