package bl.commoditybl.Service;
/**
 * 库区初始化
 * @author 倪辰皓
 *
 */
public interface InitDepotAreaBLService {
	
	/**
	 * 初始化库区信息
	 * @param motorTransport 汽运区
	 * @param trainTransport 铁运区
	 * @param airTransport	航运去
	 * @param balnkSpace	机运区
	 * @return
	 */
	public boolean init(int[] motorTransport,int[] trainTransport,int[] airTransport, int[] balnkSpace);
}
