package database;
import java.io.Serializable;
import java.util.*;

import bill.TransMesgPO;

public class Database<T> implements Serializable{
	protected HashMap<String,T> database=new HashMap<String,T>();

}
