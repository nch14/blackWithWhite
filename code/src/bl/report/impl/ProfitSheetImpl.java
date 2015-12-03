package bl.report.impl;
import java.util.ArrayList;
import java.util.Calendar;

import bill.PaymentBill;
import moneydata.*;
import bill.*;
public class ProfitSheetImpl {
	ProfitSheetVO psVO;
	
	public ProfitSheetVO show() {
		// TODO Auto-generated method stub
		PayBill paybill=new PayBill();
		PaidBill paidbill=new PaidBill();
		
		Calendar cal=Calendar.getInstance();
		String year=""+cal.get(Calendar.YEAR);
		String month=""+cal.get(Calendar.MONTH);
		String day=""+cal.get(Calendar.DATE);
		String[] time={year,month,day};
		
		ArrayList<PaymentBill> pay;
		ArrayList<ReceiveMoneyBill> paid;
		
		try {
			pay=paybill.getall(time);
			paid=paidbill.getall(time);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("此处是查询成本收益表：无法连接到服务器");
			return null;
		}
		
		psVO=new ProfitSheetVO(pay,paid);
		
		return psVO;
	}
	
	public boolean export() {
		// TODO Auto-generated method stub
		return false;
	}



}
