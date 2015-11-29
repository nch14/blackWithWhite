package bl.judgement.Service;



public interface JudgementBLService {
	
/*
 * 查看单据内容
 */
	public ResultMessage checkRecord(OrderBillPO record);

/*
 * 修改单据内容
 */
	public ResultMessage updateRecord(OrderBillPO record);

/*
 * 更新单据
 */
	public ResultMessage submitRecord(OrderBillPO record);



}
