package bl.blservice;

public interface MoneyBLService_Stub implements MoneyBLService {
	double payment;
	double expense;
	double sum;
	public MoneyBLService_Stub(double p,double e,double s){
		moneyPayment=p;
		moneyExpense=p;
		moneySum=s;
	}
	public ResultMessage addPayment(int payment){
		return payment;
	}
	public ResultMessage addExpense(int expense){
		return expense;
	}
	public ResultMessage getSum(int payment,int expense){
		return expense-payment;
	}
	public ResultMessage submit(){
		return null;
	}
	public ResultMessage save(){
		return null;
	}
	public void endMoney(){
		System.out.println("End money service!");
	}

}
