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
	
	public Account(String id,String name,double balance){
		this.ID=id;
		this.balance=balance;
		this.name=name;
	}
	
	public String getID(){
		return this.ID;
	}
	
	public double getMoney(){
		return this.balance;
	}
}
