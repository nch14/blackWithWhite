package database;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

import bill.TransMesgPO;

//the shared interface for different databases
public interface Datainterface<T> extends Serializable{

	//get one object according to id
	public T get(String id);
	
	//delete one
	public boolean delete(String id);
	
	//add one
	public boolean add(T t);
	
	//change one
	public boolean change(T t);
	
	public boolean init();
}
