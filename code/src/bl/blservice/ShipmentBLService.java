package bl.blservice;

public interface ShipmentBLService {

/*
 * 得到装车单编号
 */
	public String getTruckID ();
	
/*
 * 得到中转单编号
 */

	public String getFreightID ();

/*
 * 得到中转到达单编号
 */
	public String getReceiveID ();
	
/*
 * 生成单据po
 */
	public ShipmentBillPO buildShipment();
	
/*
 * 保存单据
 */
	public ShipmentVO save(ShipmentInputInfo info);

}
