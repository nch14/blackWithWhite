package bill;

import java.io.Serializable;

/**
 * 未进行格式检查
 * @author nch
 *
 */
public class TruckPO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4652056148887406177L;
	public String vehicleCode;
	public String licensePlate;
	public String serviceTime;	

	public TruckPO(String vehicleCode,String licensePlate,String serviceTime){
		this.vehicleCode=vehicleCode;
		this.licensePlate=licensePlate;
		this.serviceTime=serviceTime;
	}
	
	public void ChangeTruckInfo(String licensePlate, String inTime){
		this.licensePlate=licensePlate;
		this.serviceTime=inTime;
	}
}
