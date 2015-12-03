package bl.judgement.Impl;

import bl.judgement.Service.JudgementService;
import po.OrderBillPO;

public class JudgementController implements JudgementService {
	Judgement judge;
		
	public JudgementController(String type){
		judge=new Judgement(type);
	}
	
	public Object checkRecord() {
		return judge.checkRecord();
	}

	@Override
	public boolean updateRecord(OrderBillPO record) {

		return null;
	}

	@Override
	public boolean submitRecord(OrderBillPO record) {

		return null;
	}

}
