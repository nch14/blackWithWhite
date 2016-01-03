package tools;

public class VaildHelper {

	/**
	 * this method can check whether an id is valid
	 * @param id the ID need to be input
	 * @param n the legal numbers of characters
	 */
	public static boolean checkIsValidID(String id,int n){
		char[] ids=id.toCharArray();
		if(ids.length!=n)
			return false;
		for(int i=0;i<n;i++){
			if(ids[i]<'0'||ids[i]>'9')
				return false;
		}
		return true;
	}
	
	
	public static boolean checkMoneyValid(String money){
		char[] moneys=money.toCharArray();
		for(int i=0;i<money.length();i++){
			if((moneys[i]<'0'||moneys[i]>'9')&&moneys[i]!='.')
				return false;
		}
		return true;
		
	}
	
	/**
	 * 
	 * @param date 年月日字符串
	 * @return
	 */
	public static boolean checkIfValidDate(String date){
		
		
		return true;
	}
	
	/**
	 * 
	 * @param date 年月日数组
	 * @return
	 */
	public static boolean checkIfValidDate(String[] date){
		
		
		return true;
	}
	
	public static boolean checkIsValidID(String id){
		char[] ids=id.toCharArray();
		for(int i=0;i<id.length();i++){
			if(ids[i]<'0'||ids[i]>'9')
				return false;
		}
		return true;
	}
}
