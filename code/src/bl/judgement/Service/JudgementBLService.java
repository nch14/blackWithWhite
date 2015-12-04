package bl.judgement.Service;

import bill.OrderBillPO;

public interface JudgementBLService {
	
/*
 * 查看单据内容
 */
	public boolean getBills();

/*
 * 修改单据内容
 */
	public boolean updateRecord(OrderBillPO[] record);

/**
 * 
 * @param record
 * @return
 */
	public boolean submitRecord(OrderBillPO record);



}
