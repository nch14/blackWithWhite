package tools;

import java.util.ArrayList;

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
	
	/**
	 * 返回这些寄件单的总运费
	 * @param ID 寄件单号
	 * @return
	 */
	public static double getFreight(ArrayList<String> ID){
		SendController SC=new SendController();
		double freight=0;
		for(int i=0;i<ID.size();i++){
			freight+=SC.inquireSendMesg(ID.get(i)).money;
		}
		return freight;
	}
}
