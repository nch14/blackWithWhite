package bl.report.impl;

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
	
		/*//以下为测试用
		public ProfitSheetVO(double a,double b,double c){
			this.totalGet=a;
			this.totalPay=b;
			this.profit=c;
		}*/
}
