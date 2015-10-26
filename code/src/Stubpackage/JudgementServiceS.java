package Stubpackage;

import po.OrderBillPO;
import bl.blservice.JudgementBLService;
import vo.OrderBillVO;

public class JudgementServiceS implements JudgementBLService{
	/*
	 * information of the sender
	 */
	String nameOfSender;
	String addressOfSender;
	String workplaceOfSender;
	String phoneOfSender;
	String mobileOfSender;
	
	/*
	 * information of the receiver
	 */
	
	String nameOfReceiver;
	String addressOfReceiver;
	String workplaceOfReceiver;
	String phoneOfReceiver;
	String mobileOfReceiver;
	
	/*
	 * information of the item
	 */
	int numOfItem;
	double[][][] size;
	double moneyForCover;
	String speedLevel;
	String kindOfSend;
	String time;
	String money;
	boolean judge;
	
	public JudgementServiceS(String nameS,String addS,String workPS,String phS,String mbS,
			String nameR,String addR,String workPR,String phR,String mbR,int num,double[][][] sizeOfItem,
			double money,String speed,String send,boolean ju){
		
		nameOfSender=nameS;
		addressOfSender=addS;
		workplaceOfSender=workPS;
		phoneOfSender=phS;
		mobileOfSender=mbS;
		nameOfReceiver=nameR;
		addressOfReceiver=addR;
		workplaceOfReceiver=workPR;
		phoneOfReceiver=phR;
		mobileOfReceiver=mbR;
		numOfItem=num;
		size=sizeOfItem;
		moneyForCover=money;
		speedLevel=speed;
		kindOfSend=send;
		boolean ju;
	}


/*
 * 得到订单信息
 */
  public OrderBillVO getOrderBillByID(int id){
	  return new OrderBillVO(nameS,addS,workPS,phS,mbS,
				nameR,addR,workPR,phR,mbR,num,sizeOfItem,
				money,speed,send);
  }

 /*
  * 审判单据的步骤
  */
  public ResultMessage checkRecord(OrderBillPO record){
	  if(record==0000000001)
		  return ResultMessage.Exist;
	  else return ResultMessage.NotExist;
  }
  
  public ResultMessage updateRecord(OrderBillPO record){
	  if(record==0000000001){
		  return ResultMessage.Exist;
		  else return ResultMessage.NotExist;
	  }
	  
  public ResultMessage submitRecord(OrderBillPO record){
	  if(record==0000000001){
		  return ResultMessage.Exist;
		  else return ResultMessage.NotExist;
	  }  
	  
  }
  
  
}
  
public class JudgementView{
	JudgementBLService judgementBl = new JudgementServiceS("倪辰皓","南京大学仙林校区","南京大学","18200000000","18200000000",
			"郭子琰","复旦大学校区","复旦大学","18200000001","18200000001",1,10.0 20.0 5.0,
			10.0,"标准快递","易损易碎",1);
	
	
}