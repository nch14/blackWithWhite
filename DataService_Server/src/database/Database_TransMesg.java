package database;
import bill.TransMesgPO;
public class Database_TransMesg extends Database<TransMesgPO> implements Datainterface<TransMesgPO> {

	@Override
	public TransMesgPO get(String id) {
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
	public boolean add(TransMesgPO t) {
		// TODO Auto-generated method stub
		database.put(t.id, t);
		return true;
	}

	@Override
	public boolean change(TransMesgPO t) {
		// TODO Auto-generated method stub
		if(database.put(t.id,t)!=null){
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

}
