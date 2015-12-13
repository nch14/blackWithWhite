package Driverpackage;

import bl.blservice.ShipmentBLService;

public class ShipmentBLServiceD  {
	//shipmentbl的供接口
		public void drive(ShipmentBLService shipmentBLService){
			ResultMessage result1 = shipmentBLService.getTruckID();
			if(result1==ResultMessage.Exist)System.out.println("TruckID exists\n");
			ResultMessage result2 = shipmentBLService.getFreightID(0000000001);
			if(result2==ResultMessage.Exist)System.out.println("FreightID exists\n");
			ResultMessage result3 = shipmentBLService.getReceiveID(0000000001);
			if(result3==ResultMessage.Exist)System.out.println("ReceiveID exists\n");
			ResultMessage result4 = shipmentBLService.buildShipment();
			if(result4==ResultMessage.Exist)System.out.println("buildShipmentBill exists\n");
			ResultMessage result5 = shipmentBLService.save((ShipmentInputInfo info));
			if(result5==ResultMessage.Exist)System.out.println("ShipmentBill exists\n");
		}

	}

	public class Client{
		public static void main(String[] args){
			ShipmentBLService shipmentController = new ShipmentController();
			ShipmentBLServiceD driver = new ShipmentBLServiceD(shipmentController);
			driver.drive(shipmentController);
		}
	}
