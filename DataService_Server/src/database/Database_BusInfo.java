package database;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import bill.TruckPO;

public class Database_BusInfo extends Database<TruckPO> implements Datainterface<TruckPO> {

	@Override
	public TruckPO get(String id) {
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
	public boolean add(TruckPO t) {
		// TODO Auto-generated method stub
		database.put(t.vehicleCode, t);
		return true;
	}

	@Override
	public boolean change(TruckPO t) {
		// TODO Auto-generated method stub
		if(database.put(t.vehicleCode,t)!=null){
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
	
	public ArrayList<TruckPO> getAll(){
		ArrayList<TruckPO> array=new ArrayList<TruckPO>();
		Iterator iter=database.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry=(Map.Entry)iter.next();
			TruckPO bus=(TruckPO)entry.getValue();
			array.add(bus);
		}
		return array;
	}
	

}
