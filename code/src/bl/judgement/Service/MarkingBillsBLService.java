package bl.judgement.Service;

import java.util.ArrayList;


public interface MarkingBillsBLService<T> {
	
/*
 * 查看单据内容
 */
	public ArrayList<T> getBills();

/*
 * 修改单据内容
 */
	public boolean updateRecord(ArrayList<T> bills);

/**
 * 
 * @param record
 * @return
 */
	public boolean submitRecord(ArrayList<T> bills);



}
