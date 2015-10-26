package bl.blservice;

public class CommodityBLService_Driver {
	public void drive(CommodityBLService commodityBLService){
		ResultMessage result=commodityBLService.deleteMember(000000);
		if(result==ResultMessage.Exist)
			System.out.println("Member exists!");
		ResultMessage result1=commodityBLService.deleteMember(000000);
		if(result1==ResultMessage.Exist)
			System.out.println("Member has been deleted");
		commodityBLService.endCommodity();
	}
	public class Client{
		public static void main(String[] args){
			CommodityBLService commodityController=new CommodityController();
			CommodityBLService _Driver driver=new CommodityBLSerivce_Driver(commodityController);
			driver.drive(commodityController);
		}
	}

}
