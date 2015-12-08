package vo;

import java.util.ArrayList;

/**
 * 库存快照，VO
 * @author 倪辰皓
 *
 */
public class StockSnapShotVO {
	//数组第一位为名字，第二位为已用空间，第三位为空余空间，第四位为使用百分比
	String[] truck; 
	String[] air;
	String[] train;
	String[] blank;//机动区
	
	public StockSnapShotVO(	String[] truck,String[] air,String[] train,String[] blank){
		this.truck=truck;
		this.air=air;
		this.train=train;
		this.blank=blank;
	}
	
}