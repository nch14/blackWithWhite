package database;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import bill.DriverPO;
public class Database_DriverInfo extends Database<DriverPO> implements Datainterface<DriverPO> {

	@Override
	public DriverPO get(String id) {
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
	public boolean add(DriverPO t) {
		// TODO Auto-generated method stub
		database.put(t.ID,t);
		return true;
	}

	@Override
	public boolean change(DriverPO t) {
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
	
	public ArrayList<DriverPO> getAll(String str){
		ArrayList<DriverPO> array=new ArrayList<DriverPO>();
		Iterator iter=database.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry=(Map.Entry)iter.next();
			DriverPO d=(DriverPO)entry.getValue();
			if(str.equals("")||d.name.contains(str)){
				array.add(d);
			}
		}
		return array;
	}


}
