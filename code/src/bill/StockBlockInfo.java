package bill;

import java.io.Serializable;
import java.util.ArrayList;
import bill.StockBill_Out;
import bill.StockBill_Out.Info;

public class StockBlockInfo implements Serializable{
	//HashMap<Integer,Row> base=new HashMap<Integer,Row>();
	class Position implements Serializable{
		public String id;
		public boolean empty;
	}
	
	class Row implements Serializable{
		public String num;
		Position array[];
		
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
	/**
	 * 仓库属性
	 */
	
	
	public String ID;//仓库所在城市名称
    int total=10000;//仓库总容量
	int totalNumOfRow=25;//总排数
	int sizeOfRow=400;//每一行大小
	int sizeOfCol=20;//每一列大小
	
	int numOfZone_Bus=7;
	int numOfZone_Train=7;
	int numOfZone_Plane=7;
	int numOfZone_Buffer=4;
	
	ArrayList<Row> bus;
	ArrayList<Row> train;
	ArrayList<Row> plane;
	ArrayList<Row> buffer;
	
	public StockBlockInfo(){
		for(int i=0;i<numOfZone_Bus;++i){
			bus.add(new Row(Integer.toString(i)));
		}
		for(int i=numOfZone_Bus;i<numOfZone_Bus+numOfZone_Train;++i){
			train.add(new Row(Integer.toString(i)));
		}
		for(int i=numOfZone_Bus+numOfZone_Train;i<numOfZone_Bus+numOfZone_Train+numOfZone_Plane;++i){
			plane.add(new Row(Integer.toString(i)));
		}
		for(int i=numOfZone_Bus+numOfZone_Train+numOfZone_Plane;i<25;++i){
			buffer.add(new Row(Integer.toString(i)));
		}
	}
	
	/**
	 * 如果超出界限，返回false,n为增加的数值
	 * @param array
	 * @return
	 */
	boolean check(ArrayList<Row> array,int n){
		//boolean result=true;
		int i=0;
		for(Row j:array){
			for(Position p:j.array){
				if(!p.empty)
					++i;
			}
		}
		if(i+n>9000){
			return false;
		}
		else
			return true;
	}
	
	/**
	 * 调整库区，如果所要调整的库区不是空，返回false，否则返回true
	 * @param number
	 * @param zone
	 * @return
	 */
	public boolean adjust(String number,String zone){
		if(Integer.parseInt(number)>24)
			return false;
		
		for(Row j:bus){
			if(j.num.equals(number)){
				if(j.empty())
					bus.remove(j);
				else
					return false;
			}
		}
		for(Row j:train){
			if(j.num.equals(number)){
				if(j.num.equals(number)){
					if(j.empty())
						train.remove(j);
					else
						return false;
				}
			}	
		}
		for(Row j:plane){
			if(j.num.equals(number)){
				if(j.num.equals(number)){
					if(j.empty())
						plane.remove(j);
					else
						return false;
				}
			}
		}
		for(Row j:buffer){
			if(j.num.equals(number)){
				if(j.num.equals(number)){
					if(j.empty())
						buffer.remove(j);
					else
						return false;
				}
			}
		}
		 
		Row row=new Row(number);
		if(zone.equals("bus")){
			bus.add(row);
		}
		else if(zone.equals("train")){
			train.add(row);
		}
		else if(zone.equals("plane")){
			plane.add(row);
		}
		else
			buffer.add(row);
	
	    return true;
	}
	
	String[] getpos(ArrayList<Row> array,String ID){
		String[] result=new String[4];
		for(Row j:array){
			if(!j.full()){
				result[1]=j.num;
				for(int i=0;i<400;++i){
					Position p=j.array[i];
					if(p.empty=true){
						p.empty=false;
						p.id=ID;
					}
					result[2]=Integer.toString(i/20);
					result[3]=Integer.toString(i%20);
				}
			}
		}
		return result;
		
	}
	/**
	 * s表示分区，汽车区，火车区等等 ID表示单号
	 * @param s
	 * @param ID
	 * @return
	 */
	public String[] getPosition(String s,String ID){
		String[] result=new String[4];
		if(s.equals("bus")){
			result=getpos(this.bus,ID);
			result[0]="bus";
		}
		else if(s.equals("train")){
			result=getpos(this.train,ID);
			result[0]="train";
		}
		else if(s.equals("plane")){
			result=getpos(this.plane,ID);
			result[0]="plane";
		}
		return result;
	}
	
	void free(String ID,String form){
		if(form.equals("bus")){
			for(Row j:bus){
				for(Position p:j.array){
					if(p.id.equals(ID)&&!p.empty)
						p.empty=true;
				}
			}
		}
		else if(form.equals("train")){
			for(Row j:train){
				for(Position p:j.array){
					if(p.id.equals(ID)&&!p.empty)
						p.empty=true;
				}
			}
		}
		else if(form.equals("plane")){
			for(Row j:plane){
				for(Position p:j.array){
					if(p.id.equals(ID)&&!p.empty)
						p.empty=true;
				}
			}
		}
	}
	
	public boolean free(StockBill_Out bill){
		ArrayList<Info> array=bill.list;
		for(Info i:array){
			free(i.ID,i.form);
		}
		return true;
	}
	
}
