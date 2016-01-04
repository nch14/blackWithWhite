package bill;

import java.io.Serializable;

public class Row implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2975987894979370914L;
	public String num;
	public Position array[];
	
	public Row(String s){
		array=new Position[400];
		num=s;
	}
	public boolean empty(){
		boolean result=true;
		for(int i=0;i<400;++i){
			if(array[i].empty!=true)
				result=false;
		}
		return result;
	}
	
	public boolean full(){
		boolean result=true;
		for(int i=0;i<400;++i){
			if(array[i].empty=true)
				result=false;
		}
		return result;
	}
}