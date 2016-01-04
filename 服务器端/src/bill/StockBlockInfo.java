package bill;

import java.io.Serializable;
import java.util.ArrayList;
import bill.StockBill_Out;
import bill.StockBill_Out.Info;

public class StockBlockInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4983807107972385969L;
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
	
	public ArrayList<Row> bus=new ArrayList<Row>();
	public ArrayList<Row> train=new ArrayList<Row>();
	public ArrayList<Row> plane=new ArrayList<Row>();
	public ArrayList<Row> buffer=new ArrayList<Row>();
	
	public StockBlockInfo(){
		
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
	
	boolean check(StockBill_In s){
		int busNum=0,trainNum=0,planeNum=0;
		for(PositionInfo i:s.list1){
			if(i.form.equals("bus"))
				busNum++;
			else if(i.form.equals("train"))
				trainNum++;
			else if(i.form.equals("plane"))
				planeNum++;
		}
		return check(bus,busNum)&&check(train,trainNum)&&check(plane,planeNum);
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
	
	public StockBill_In getPosition(StockBill_In s){
		
		if(!check(s))
			return null;
		int length=s.getLength();
		String[] ids=new String[length];
		String[] zone=new String[length];
		String[] row=new String[length];
		String[] col=new String[length];
		String[] pos=new String[length];
		
		String[] temp;
		for(int i=0;i<length;++i){
			temp=this.getPosition(s.list1.get(i).form, ids[i]);
			zone[i]=temp[0];
			row[i]=temp[1];
			col[i]=temp[2];
			pos[i]=temp[3];
		}
		s.allocate(zone, row, col, pos);
		return s;
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
	
	public boolean initialCommodity(int[] bus,int[] train,int[] plane,int[] blank){
//		if(bus+train+plane>25){
//			return false;
//		}
//		for(int i=0;i<bus;++i){
//			this.bus.add(new Row(Integer.toString(i)));
//		}
//		for(int i=bus;i<bus+train;++i){
//			this.train.add(new Row(Integer.toString(i)));
//		}
//		for(int i=bus+train;i<bus+train+plane;++i){
//			this.plane.add(new Row(Integer.toString(i)));
//		}
//		for(int i=bus+train+plane;i<25;++i){
//			this.buffer.add(new Row(Integer.toString(i)));
//		}
//		return true;
		for(int i=0;i<bus.length;++i){
			this.bus.add(new Row(Integer.toString(bus[i])));
		}
		for(int i=0;i<train.length;++i){
			this.train.add(new Row(Integer.toString(train[i])));
		}
		for(int i=0;i<plane.length;++i){
			this.plane.add(new Row(Integer.toString(plane[i])));
		}
		for(int i=0;i<blank.length;++i){
			this.buffer.add(new Row(Integer.toString(blank[i])));
		}
		
		return true;
	}
	
}
