package bl.commoditybl.Service;
/**
 * 库区调整
 * @author 倪辰皓
 *
 */
public interface AreaAdjustBLService {

	/**
	 * 
	 * @param rows 排号
	 * @param type 仅可选填：汽运区，航运去，铁运区，机动区
	 * @return
	 */
	public boolean areaAdjust(int row,String type);
}
