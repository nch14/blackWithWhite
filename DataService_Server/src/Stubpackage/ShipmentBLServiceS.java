package Stubpackage;

import po.String;
import vo.ShipmentBillVO;



public class ShipmentBLServiceS {
	
	/*
	 * 装车单信息
	 */
		int[][][] date;
		String numOfHall;
		String numOfTrain;
		String numOfDestination;
		String numOfBus;
		String nameOfInspection;
		String nameOfEscort;
		String[] numOfOrder;
		
	/*
	 * 中转单信息
	 */
		
		
		String numOfTransitBill;
		String numOfFlight;
		String starting;
		String destination;
		String nameOfContainer;
		double money;
		
	/*
	 * 中转中心到达单信息
	 */
		String numOfTransit;
		int[][][] dateOfArrival;
		String stationOfArrival;
		
		public ShipmentBLServiceS(int[][][] date,String numOfHall,String numOfTrain,String numOfDestination,
		String numOfBus,String nameOfInspection,String nameOfEscort,String[] numOfOrder,String numOfTransitBill,
		String numOfFlight,String starting,String destination,String nameOfContainer,double moneyString numOfTransit;
		int[][][] dateOfArrival,String stationOfArrival){
			
			kindOfBill=shipmentbill.kindOfBill;
			date=shipmentbill.date;
			numOfHall=shipmentbill.numOfHall;
			numOfTrain=shipmentbill.numOfTrain;
			numOfDestination=shipmentbill.numOfDestination;
			numOfBus=shipmentbill.numOfBus;
			nameOfInspection=shipmentbill.nameOfInspection;
			nameOfEscort=shipmentbill.nameOfEscort;
			numOfOrder=shipmentbill.numOfOrder;
			numOfTransitBill=shipmentbill.numOfTransitBill;
			numOfFlight=shipmentbill.numOfFlight;
			starting=shipmentbill.starting;
			destination=shipmentbill.destination;
			nameOfContaine=shipmentbill.nameOfContainer;
			money=shipmentbill.money;
			numOfTransit=shipmentbill.numOfTransit;
			dateOfArrival=shipmentbill.dateOfArrival;
			stationOfArrival=shipmentbill.stationOfArrival;
				
			
		}
		
		public String getTruckID (){
			if(id!=null) 
				return ResultMessage.Exist;
			else return ResultMessage.NotExist;
			
		}
	    
		public String getFreightID (){
			if(id!=null) 
				return ResultMessage.Exist;
			else return ResultMessage.NotExist;
		}
		
		public String getReceiveID (){
			if(id!=null) 
				return ResultMessage.Exist;
			else return ResultMessage.NotExist;
		}
		
		public ShipmentBillPO buildShipment(){
			if(id!=null) 
				return ResultMessage.Exist;
			else return ResultMessage.NotExist;
		}
		
		public ShipmentVO save(ShipmentInputInfo info){
			System.out.println("End the shipment");
		}

}

    public class ShipmentView{
    	ShipmentBLService shipmentBl = new ShipmentBLServiceS(2015 10 24,,"0251001","02510012015102400001",
				"001","Inspection","Escort',0000000001,"0251001201510240000001",
				"2015102401","starting","destination","Container","100.0","025002";
				2015 10 26,"完整");
    	}
