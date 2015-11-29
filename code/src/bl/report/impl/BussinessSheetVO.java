package bl.report.Impl;

import java.util.ArrayList;

public class BussinessSheetVO {
	public ArrayList<Item> profitsheet;
	public ArrayList<Item> paymentsheet;
	
	public BussinessSheetVO(){
		profitsheet=new ArrayList<Item>();
		paymentsheet=new ArrayList<Item>();
	}
	
	public void add(Item item){
		if(item.type.equals("profit")){
			this.profitsheet.add(item);
		}else{
			this.paymentsheet.add(item);
		}	
	}
	

	class Item{
		String ID;
		String type;
		String date;
		String money;
	}
}
