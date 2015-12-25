package database;


import bill.StockBill_In;
import bill.StockBill_Out;
import bill.StockBlockInfo;

public class Database_StockBlockInfo extends Database<StockBlockInfo> implements Datainterface<StockBlockInfo>{
	public Database_StockBlockInfo(){
		super();
		database.put("025", new StockBlockInfo());
		database.put("021", new StockBlockInfo());
		database.put("010", new StockBlockInfo());
		database.put("020", new StockBlockInfo());
	}
	
	public StockBlockInfo get(String id) {
		// TODO Auto-generated method stub
		return database.get(id);
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(StockBlockInfo t) {
		// TODO Auto-generated method stub
		database.put(t.ID, t);
		return true;
	}

	@Override
	public boolean change(StockBlockInfo t) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean init(String id) {
		// TODO Auto-generated method stub
		StockBlockInfo t=new StockBlockInfo();
		database.put(id,t);
		return false;
	}

	/*public StockBill_In getPosition(StockBill_In s,String str){
		int length=s.getLength();
		String[] ids=new String[length];
		String[] zone=new String[length];
		String[] row=new String[length];
		String[] col=new String[length];
		String[] pos=new String[length];
		
		String[] temp;
		StockBlockInfo t=database.get(str);
		
		for(int i=0;i<length;++i){
			temp=t.getPosition(s.list.get(i).form, ids[i]);
			zone[i]=temp[0];
			row[i]=temp[1];
			col[i]=temp[2];
			pos[i]=temp[3];
		}
		s.allocate(zone, row, col, pos);
		return s;
	}*/
	/**
	 * 如果返回null表示空间不足
	 * @param s
	 * @param str
	 * @return
	 */
	public StockBill_In getPosition(StockBill_In s,String str){
		StockBlockInfo block=database.get(str);
		return block.getPosition(s);
	}

	@Override
	public boolean init() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean free(StockBill_Out t,String s){
		StockBlockInfo stock=database.get(s);
		return stock.free(t);
	}
	
	public boolean initialCommodity(String ID,int bus,int train,int plane){
		StockBlockInfo stock=database.get(ID);
		return stock.initialCommodity(bus, train, plane);
	}
	
}
