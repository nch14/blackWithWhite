package bill;

import java.io.Serializable;

/**
 * 公司银行账户
 * @author 倪辰皓
 *
 */
public class Account implements Serializable{
	private static final long serialVersionUID = -8937178999054593825L;
	private String ID;
	public String name;
	private double balance;
	
	Account(String id,String name,double balance){
		this.ID="1000";
		this.balance=balance;
		this.name=name;
	}
	
	public String getID(){
		return this.ID;
	}
}
