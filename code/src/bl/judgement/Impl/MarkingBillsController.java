package bl.judgement.Impl;

import java.util.ArrayList;
import bl.judgement.Service.MarkingBillsBLService;

public class MarkingBillsController<T> implements MarkingBillsBLService<T> {
	MarkingBills<T> markingBills;
	public MarkingBillsController(){
		markingBills=new MarkingBills<T>();
	}
	@Override
	public ArrayList<T> getBills() {
		// TODO Auto-generated method stub
		
		return markingBills.getBills();
	}

	@Override
	public boolean updateRecord(ArrayList<T> bills) {
		// TODO Auto-generated method stub
		return markingBills.updateRecord(bills);
	}

	@Override
	public boolean submitRecord(ArrayList<T> bills) {
		// TODO Auto-generated method stub
		return markingBills.submitRecord(bills);
	}

}
