package HelperClass;
import java.io.Serializable;
import java.util.ArrayList;

import bill.*;
public class TransInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6604949238126166189L;
	public ArrayList<TransMesgPO> array;
	public String ID;
	
	public TransInfo(TransMesgPO po){
		array=new ArrayList<TransMesgPO>();
		array.add(po);
		this.ID=po.id;
	}
}
