package bill;
/**
 * 公司银行账户
 * @author 倪辰皓
 *
 */
public class Account {

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
