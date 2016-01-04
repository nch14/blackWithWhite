package database;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import bill.BusShipmentBill_Center;

public class Database_BusShipmentBill_Center extends Database<BusShipmentBill_Center> implements Datainterface<BusShipmentBill_Center> {

	@Override
	public BusShipmentBill_Center get(String id) {
		// TODO Auto-generated method stub
		return database.get(id);
	}

	@Override
	public boolean add(BusShipmentBill_Center t) {
		// TODO Auto-generated method stub
		database.put(t.busshipID, t);
		return true;
	}

	@Override
	public boolean change(BusShipmentBill_Center t) {
		// TODO Auto-generated method stub
		if(database.put(t.busshipID,t)!=null){
			return true;
		}
		else
			return false;
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
	public boolean init() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public ArrayList<BusShipmentBill_Center> getUnjuedged(){
		ArrayList<BusShipmentBill_Center> array=new ArrayList<BusShipmentBill_Center>();
		Iterator iter=database.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry=(Map.Entry)iter.next();
			BusShipmentBill_Center a=(BusShipmentBill_Center) entry.getValue();
			if(!a.judged){
				array.add(a);
			}
		}
		return array;
	}

}
