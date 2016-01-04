package database;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import bill.BusShipmentBill_Shop;

public class Database_BusShipmentBill_Shop extends Database<BusShipmentBill_Shop> implements
		Datainterface<BusShipmentBill_Shop> {
	@Override
	public BusShipmentBill_Shop get(String id) {
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
	public boolean add(BusShipmentBill_Shop t) {
		// TODO Auto-generated method stub
		database.put(t.busshipID, t);
		return true;
	}

	@Override
	public boolean change(BusShipmentBill_Shop t) {
		// TODO Auto-generated method stub
		if(database.put(t.busshipID,t)!=null){
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
	
	public ArrayList<BusShipmentBill_Shop> getUnjudged(){
		ArrayList<BusShipmentBill_Shop> array=new ArrayList<BusShipmentBill_Shop>();
		Iterator iter=database.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry=(Map.Entry)iter.next();
			BusShipmentBill_Shop a=(BusShipmentBill_Shop) entry.getValue();
			if(!a.judged)
				array.add(a);
		}
		return array;
	}

}
