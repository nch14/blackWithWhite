package bl.blservice;

public class MoneyBLService_Driver {
	public void drive(MoneyBLService moneyBLService){
	ResultMessage result=moneyBLService.getPayid(000000);
	if(result==ResultMessage.Exist)
		System.out.println("get payid list");
	ResultMessage result1=moneyBLService.getExpenseid(000001);
	if(result==ResultMessage.Exist)
		System.out.println("get expenseid list");
	ResultMessage result2=moneyBLService.getSumMoney();
	System.out.println(moneyBLService.getExpenseid(000000)-moneyBLService.getPayid(000001));
	
	ResultMessage result3=moneyBLService.submit();
	ResultMessage result4=moneyBLService.save();
	moneyBLService.endMoneyService();
	}
	public class Client{
		public static void main(String[] args){
			MoneyBLService moneyController=new MoneyController();
			MoneyBLService_Driver driver=new MoneyBLService_Driver(moneyController);
			MoneyBLService moneyBLService;
			driver.drive(moneyBLService);
		}
	}

}
