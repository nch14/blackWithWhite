package HelperClass;
import java.util.ArrayList;

import bill.*;
public class TransInfo {
	public ArrayList<TransMesgPO> array;
	public String ID;
	
	public TransInfo(TransMesgPO po){
		array=new ArrayList<TransMesgPO>();
		array.add(po);
		this.ID=po.id;
	}
}
