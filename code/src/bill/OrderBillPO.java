package bill;

import java.io.Serializable;

public class OrderBillPO implements Serializable{
	public String ID;
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
	double weight;
	double[] size;
	String nameOfOrder;
	String volume ;
	double moneyForCover;
	String speedLevel;
	String kindOfSend;
	String time;
	public double money;
	
	public OrderBillPO(String nameOfSender1,String addressOfSender1,String workplaceOfSender1,String phoneOfSender1,
	String mobileOfSender1,String nameOfReceiver1,String addressOfReceiver1,String workplaceOfReceiver1,
	String phoneOfReceiver1,String mobileOfReceiver1,String numOfItem1,String weight1,String length,String width,String height,
	String nameOfOrder1,String volume1,String moneyForCover1,String speedLevel1,String kindOfSend1,String time1,double money1){
		
		this.nameOfSender=nameOfSender1;
		this.addressOfSender=addressOfSender1;
		this.workplaceOfSender=workplaceOfSender1;
		this.phoneOfSender=phoneOfSender1;
		this.mobileOfSender=mobileOfSender1;
		
		this.nameOfReceiver=nameOfReceiver1;
		this.addressOfReceiver=addressOfReceiver1;
		this.workplaceOfReceiver=workplaceOfReceiver1;
		this.phoneOfReceiver=phoneOfReceiver1;
		this.mobileOfReceiver=mobileOfReceiver1;
		
		this.numOfItem=Integer.parseInt(numOfItem1);
		this.weight=Double.parseDouble(weight1);
		this.size[0]=Double.parseDouble(length);
		this.size[1]=Double.parseDouble(width);
		this.size[2]=Double.parseDouble(height);
		this.nameOfOrder=nameOfOrder;
		this.volume=volume1 ;
		this.moneyForCover=Double.parseDouble(moneyForCover1);
		this.speedLevel=speedLevel1;
		this.kindOfSend=kindOfSend1;
		this.time=time1;
		this.money=money1;
		
		
	}
	
	/*public OrderBillPO(OrderBillVO orderbill){
		
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
		
	}*/

}
