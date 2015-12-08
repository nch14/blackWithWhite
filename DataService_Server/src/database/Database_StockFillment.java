package database;

import java.util.ArrayList;

import bill.StockFillmentInfo;

public class Database_StockFillment extends Database<StockFillmentInfo> implements Datainterface<StockFillmentInfo>{
	
	private ArrayList<StockFillmentInfo> array;
	
	public StockFillmentInfo get() {
		// TODO Auto-generated method stub
		return array.get(0);
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(StockFillmentInfo t) {
		// TODO Auto-generated method stub
		array.add(t);
		return true;
	}

	@Override
	public boolean change(StockFillmentInfo t) {
		// TODO Auto-generated method stub
		array.clear();
		array.add(t);
		return true;
	}

	@Override
	public StockFillmentInfo get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean init() {
		// TODO Auto-generated method stub
		return false;
	}

}
