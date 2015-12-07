package bl.report.impl;
import java.util.ArrayList;
import java.util.Calendar;
import bill.PaymentBill;
import bl.money.Impl.PaidController;
import bl.money.Impl.PayController;
import tools.ExcelHelper;
import vo.ProfitSheetVO;
import bill.*;
public class ProfitSheetImpl {
	ProfitSheetVO psVO;
	
	public ProfitSheetVO show() {
		// TODO Auto-generated method stub
		PaidController paidController=new PaidController();
		PayController payController=new PayController();
		
		Calendar cal=Calendar.getInstance();
		String year=""+cal.get(Calendar.YEAR);
		String month=""+cal.get(Calendar.MONTH)+1;
		String day=""+cal.get(Calendar.DATE);
		String[] time={year,month,day};
		
		ArrayList<PaymentBill> pay;
		ArrayList<ReceiveMoneyBill> paid;
		
		try {
			pay=payController.getPaymentBill(time);
			paid=paidController.getPaidmentBill(time);
			psVO=new ProfitSheetVO(pay,paid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("此处是查询成本收益表：无法连接到服务器");
			return null;
		}
		return psVO;
	}
	
	public boolean export() {
		if(psVO==null){
			return false;
		}
		return ExcelHelper.export(psVO);
	}
}
