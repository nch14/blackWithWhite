package database;
import bill.*;
import java.util.*;

import HelperClass.TransInfo;
public class Database_imformation extends Database<TransInfo> implements Datainterface<TransInfo>{
	
	@Override
	public TransInfo get(String id) {
		// TODO Auto-generated method stub
		TransInfo info=database.get(id);
		return info;
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

	
	public boolean add(TransMesgPO po) {
		// TODO Auto-generated method stub
		TransInfo info=new TransInfo(po);
		database.put(info.ID, info);
		return true;
	}

	@Override
	public boolean change(TransInfo info) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean init() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(TransInfo t) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean refresh(TransMesgPO po){
		//System.out.println(po.id);
		TransInfo info=database.get(po.id);
		if(info==null){
			this.add(po);
			return true;
		}
		info.array.add(po);
		database.put(info.ID, info);
		return true;
	}
	
	public ArrayList<TransMesgPO> getArray(String id){
		if(this.get(id)==null){
			//System.out.println("null info"+" "+id);
			return null;
		}
//		if(this.get(id).array==null){
//			System.out.println("null array");
//		}
		return this.get(id).array;
	}
}
