package bl.judgement.Impl;

import java.util.ArrayList;

import bl.money.Impl.PaidController;
import bl.money.Impl.PayController;
import bl.send.Impl.SendController;

public class MarkingBills<T> {
	
	public ArrayList<T> getBills(String type) {
		// TODO Auto-generated method stub
		ArrayList<T> list;
		switch(type){
		case "OrderBill":
			SendController sendController=new SendController();
			list=(ArrayList<T>) sendController.getUnmarkingBills();
			break;
		case "PaymentBill":
			PayController payController=new PayController();
			list=(ArrayList<T>) payController.getUnmarkingBills();
			break;
		case "ReceiveMoneyBill":
			PaidController paidController=new PaidController();
			list=(ArrayList<T>) paidController.getUnmarkingBills();
			break;
		case "StockBill_In":
			
			break;
		case "StockBill_out":
			break;
		case "Buss":
			
			break;
		case "":
			
			break;
		case "":
			
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
