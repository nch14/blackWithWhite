package vo;

import java.util.ArrayList;

import po.bills.PaymentBill;
import po.bills.ReceiveMoneyBill;
/**
 * pay 为付款单链表
 * paid为收款单链表
 * @author 倪辰皓
 *
 */
public class BussinessSheetVO {
	public ArrayList<PaymentBill> pay;
	public ArrayList<ReceiveMoneyBill> paid;
	
	public BussinessSheetVO(ArrayList<PaymentBill> pay,ArrayList<ReceiveMoneyBill> paid){
		this.pay=pay;
		this.paid=paid;
	}
/*	public BussinessSheetVO(){
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
	}*/
}

