package bl.blservice;

public interface ReceivementBLService_Stub implements ReceivementBLService {
	int ID;
	int area;
	int frame;
	int line;
	
	public ReceivementBLService_Stub (int id,int a,int f,int l){
		int receivementID = id;
		int receivementArea = a;
		int receivementFrame = f;
		int receivementLine = l;
	}
	public ReceivementVO getCommodityByID(int id){
		return new ReceivementVO(id,area,frame,line);
	}
	public ResultMessage addreceivement(int id){
		if(id==000000){
			return ResultMessage.Exist;
			}
		else{
				return ResultMessage.NotExist;
		}
	}
	public ResultMessage deleteReceivement(int id){
		if(id==ResultMessage.Exist)
			return ResultMessage.Exist;
		else
			return ResultMessage.NotExist;
	}
	public void endReceivement(){
	    System.out.println("End receivement service!");
	}

}
