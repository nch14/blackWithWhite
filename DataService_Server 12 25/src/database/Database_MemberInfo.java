package database;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import bill.StaffPO;
public class Database_MemberInfo extends Database<StaffPO> implements Datainterface<StaffPO> {

	
	@Override
	public StaffPO get(String id) {
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
	public boolean add(StaffPO t) {
		// TODO Auto-generated method stub
		database.put(t.ID, t);
		return true;
	}

	@Override
	public boolean change(StaffPO t) {
		// TODO Auto-generated method stub
		if(database.put(t.ID,t)!=null){
			return true;
		}
		else
			return false;
	}
	
	public ArrayList<StaffPO> getAll(String str){
		ArrayList<StaffPO> array=new ArrayList<StaffPO>();
		Iterator iter=database.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry=(Map.Entry)iter.next();
			StaffPO staff=(StaffPO) entry.getValue();
			if(str.equals(null)||staff.name.contains(str)){
				array.add(staff);
			}
		}
		return array;
	}

	@Override
	public boolean init() {
		// TODO Auto-generated method stub
		return false;
	}

}
