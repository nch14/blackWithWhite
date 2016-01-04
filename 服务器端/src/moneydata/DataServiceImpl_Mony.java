package moneydata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import data.money.*;

public class DataServiceImpl_Mony {
	public static void initialService() throws FileNotFoundException, ClassNotFoundException, IOException{
		try {
			AccountManageHelper accMan=new AccountManageImpl();
			BalanceHelper banHel=new BalanceImpl();
			PaidBillHelper paidBill=new PaidBillImpl();
			PayBillHelper payBill=new PaybillImpl();
			
			Registry Re_accMan=LocateRegistry.createRegistry(34000);
			Registry Re_banHel=LocateRegistry.createRegistry(34001);
			Registry Re_paidBill=LocateRegistry.createRegistry(34002);
			Registry Re_payBill=LocateRegistry.createRegistry(34003);
			
			Re_accMan.rebind("accountmanagehelper", accMan);
			Re_banHel.rebind("balancehelper", banHel);
			Re_paidBill.rebind("paidbillhelper", paidBill);
			Re_payBill.rebind("paybillhelper", payBill);
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
