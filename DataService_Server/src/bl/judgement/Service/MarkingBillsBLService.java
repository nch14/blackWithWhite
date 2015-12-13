package bl.judgement.Service;

import java.util.ArrayList;

/**
 * 这是一个泛型接口
 * @author 倪辰皓
 *
 * @param <T>
 */
public interface MarkingBillsBLService<T> {
	
	/**
	 * 查看单据内容
	 * 
	 * @param type 单据类型的名字（英文！！！）
	 * @return
	 */
	public ArrayList<T> getBills(String type);

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
