package bl.judgement.Service;

import po.OrderBillPO;

public interface JudgementService {
	
/*
 * 查看单据内容
 */
	public boolean checkRecord(OrderBillPO record);

/*
 * 修改单据内容
 */
	public boolean updateRecord(OrderBillPO record);

/*
 * 更新单据
 */
	public boolean submitRecord(OrderBillPO record);



}
