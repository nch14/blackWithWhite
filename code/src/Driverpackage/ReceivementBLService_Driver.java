package bl.blservice;

public class ReceivementBLService_Driver {
	public void drive(ReceivementBLService receivementBLService){
		ResultMessage result1=receivementBLService.addMember(000000);
		if(result1==ResultMessage.Exist)
			System.out.println("Member Exists!");
		ResultMessage result2=receivementBLService.deleteMember(000000);
		if(result2==ResultMessage.Exist)
			System.out.println("Member deletes!");
		receivementBLService.endReceivement();
	}
	public class Client{
		public static void main(String[] args){
			ReceivementBLService receivementController=new ReceivementController();
			ReceivementBLService_Driver driver=new ReceivementBLService_Driver(receivementController);
			ReceivementBLService receivementBLService;
			driver.drive(receivementBLService);
		}
	}

}
