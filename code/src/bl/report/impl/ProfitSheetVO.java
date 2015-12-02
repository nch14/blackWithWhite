package bl.report.Impl;

import java.util.ArrayList;

import bill.PaymentBill;
import bill.ReceiveMoneyBill;

public class ProfitSheetVO {
	double totalGet;
	double totalPay;
	double profit;
	public ProfitSheetVO(ArrayList<PaymentBill> pay,ArrayList<ReceiveMoneyBill> paid){
		for(int i=0;i<pay.size();i++){
			totalPay+=pay.get(i).money;
		}
		for(int i=0;i<paid.size();i++){
			totalGet+=paid.get(i).money;
		}
		profit=totalGet;
	}
}
