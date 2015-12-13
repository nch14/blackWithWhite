package bill;

import java.io.Serializable;

/**
 * 不检查数据格式是否正确
 * @author nch
 *
 */
public class DriverPO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6130985348395924086L;
	public String ID;
	public String name;
	public String IDNumber;
	public String birthday;
	public boolean isBoy;
	public String tel;
	public String validData;
	

	public DriverPO(String ID,String name,String IDNumber,String birthday,
			boolean isBoy,String tel,String validData){
		this.ID=ID;
		this.name=name;
		this.IDNumber=IDNumber;
		this.birthday=birthday;
		this.isBoy=isBoy;
		this.tel=tel;
		this.validData=validData;
	}
	
	public void ChangeDriverInfo(String name, String IDCardNumber, String birthday,
			boolean isBoy, String TelNumber, String validate) {
		this.name=name;
		this.IDNumber=IDNumber;
		this.birthday=birthday;
		this.isBoy=isBoy;
		this.tel=TelNumber;
		this.validData=validate;
		
	}
	
}
