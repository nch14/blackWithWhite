package bl.judgement.Impl;

import java.util.ArrayList;

import bl.send.Impl.SendController;

public class MarkingBills<T> {
	
	public ArrayList<T> getBills(String type) {
		// TODO Auto-generated method stub
		switch(type){
		case "OrderBill":
			SendController send=new SendController();
		/*	return (OrderBill)send.inquireSendMesg(type);*/
			break;
		case "PaymentBill":
			
			break;
		case "ReceiveMoneyBill":
			
			break;
		case "StockBill_In":
			
			break;
		case "StockBill_out":
			break;
			
			
			
		default:
			return null;
		}
		return null;
	}

	
	public boolean updateRecord(ArrayList<T> bills) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean submitRecord(ArrayList<T> bills) {
		// TODO Auto-generated method stub
		return false;
	}

}
