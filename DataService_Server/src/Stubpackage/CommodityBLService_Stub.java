package bl.blservice;

public interface CommodityBLService_Stub implements CommodityBLService {
	int ID;
	int area;
	int frame;
	int line;
	
	public CommodityBLService_Stub(int id,int a,int f,int l){
		int commodityID = id;
		int commodityArea = a;
		int commodityFrame = f;
		int commodityLine = l;
	}
	//得到货物信息
	public CommodityVO getcommodityByID(int id){
		return new CommodityVO(id,area,frame,line);
	}
	public ResultMessage addCommodity(int id){
		if(id==000000){
			return ResultMessage.Exist;
			}
		else{
				return ResultMessage.NotExist;
		}
	}
	public ResultMessage deleteCommodity(int id){
		if(id==ResultMessage.Exist)
			return ResultMessage.Exist;
		else
			return ResultMessage.NotExist;
	}
	public void endCommodity(){
		System.out.println("End commodity service!");
	}
	public class CommodityView{
		CommodityBLService commodityBl=new CommodityBLService_Stub(000000,1,1,1);
	}

}
