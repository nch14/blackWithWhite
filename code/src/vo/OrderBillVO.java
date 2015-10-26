package vo;

public class OrderBillVO {
	/*
	 * information of the sender
	 */
	public String nameOfSender;
	public String addressOfSender;
	public String workplaceOfSender;
	public String phoneOfSender;
	public String mobileOfSender;
	
	/*
	 * information of the receiver
	 */
	
	public String nameOfReceiver;
	public String addressOfReceiver;
	public String workplaceOfReceiver;
	public String phoneOfReceiver;
	public String mobileOfReceiver;
	
	/*
	 * information of the item
	 */
	public int numOfItem;
	public double[][][] size;
	public double moneyForCover;
	public String speedLevel;
	public String kindOfSend;
	public String time;
	public String money;
	
	public OrderBillVO(){}
	
	public OrderBillVO(String nameS,String addS,String workPS,String phS,String mbS,
			String nameR,String addR,String workPR,String phR,String mbR,int num,double[][][] sizeOfItem,
			double money,String speed,String send){
		
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
		
	}

}
