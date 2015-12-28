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
}
