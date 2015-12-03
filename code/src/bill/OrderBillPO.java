package po;

import java.io.Serializable;

import vo.OrderBillVO;

public class OrderBillPO implements Serializable{
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
	
	public OrderBillPO(){}
	
	public OrderBillPO(OrderBillVO orderbill){
		
		nameOfSender=orderbill.nameOfSender;
		addressOfSender=orderbill.addressOfSender;
		workplaceOfSender=orderbill.workplaceOfSender;
		phoneOfSender=orderbill.phoneOfSender;
		mobileOfSender=orderbill.mobileOfSender;
		nameOfReceiver=orderbill.nameOfReceiver;
		addressOfReceiver=orderbill.addressOfReceiver;
		workplaceOfReceiver=orderbill.workplaceOfReceiver;
		phoneOfReceiver=orderbill.phoneOfReceiver;
		mobileOfReceiver=orderbill.mobileOfReceiver;
		numOfItem=orderbill.numOfItem;
		size=orderbill.size;
		moneyForCover=orderbill.moneyForCover;
		speedLevel=orderbill.speedLevel;
		kindOfSend=orderbill.kindOfSend;
		time=orderbill.time;
		money=orderbill.money;
		
	}

}
