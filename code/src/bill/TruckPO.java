package bill;
/**
 * 未进行格式检查
 * @author nch
 *
 */
public class TruckPO {
	String vehicleCode;
	String licensePlate;
	String serviceTime;

	

	public TruckPO(String vehicleCode,String licensePlate,String serviceTime){
		this.vehicleCode=vehicleCode;
		this.licensePlate=licensePlate;
		this.serviceTime=serviceTime;
	}
}
