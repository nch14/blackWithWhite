package vo;

import java.util.ArrayList;

import bill.Position;
import bill.Row;
import bill.StockBlockInfo;
import bl.commoditybl.Impl.DepotItem;

/**
 * ¿â´æ¿ìÕÕ£¬VO
 * @author Äß³½ð©
 *
 */
public class StockSnapShotVO {
	public ArrayList<DepotItem> list;
	
	public StockSnapShotVO(StockBlockInfo f){
		list=new ArrayList<DepotItem>();
		int t1,t2;
		
		for(int i=0;i<f.bus.size();++i){
			Row k=f.bus.get(i);
			for(int j=0;j<k.array.length;++j){
				Position m=k.array[j];
				if(!m.empty){
					t1=j/20;
					t2=j%20;
					list.add(new DepotItem(m.id,m.date,m.destination,"ÆûÔË",Integer.toString(i),
							Integer.toString(t1),Integer.toString(t2)));
				}
			}
		}
		
		for(int i=0;i<f.train.size();++i){
			Row k=f.train.get(i);
			for(int j=0;j<k.array.length;++j){
				Position m=k.array[j];
				if(!m.empty){
					t1=j/20;
					t2=j%20;
					list.add(new DepotItem(m.id,m.date,m.destination,"»ð³µ",Integer.toString(i),
							Integer.toString(t1),Integer.toString(t2)));
				}
			}
		}
		
		for(int i=0;i<f.plane.size();++i){
			Row k=f.plane.get(i);
			for(int j=0;j<k.array.length;++j){
				Position m=k.array[j];
				if(!m.empty){
					t1=j/20;
					t2=j%20;
					list.add(new DepotItem(m.id,m.date,m.destination,"¿ÕÔË",Integer.toString(i),
							Integer.toString(t1),Integer.toString(t2)));
				}
			}
		}
	}
}