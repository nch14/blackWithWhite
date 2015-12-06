package tools;

import bl.send.Impl.SendController;

public class MoneyHelper {

	
	
	/**
	 * 返回这些寄件单的总运费
	 * @param ID 寄件单号
	 * @return
	 */
	public static double getFreight(String[] ID){
		SendController SC=new SendController();
		double freight=0;
		for(int i=0;i<ID.length;i++){
			freight+=SC.inquireSendMesg(ID[i]).money;
		}
		return freight;
	}
}
