package HelperClass;

public class CompareDate {
	public static boolean larger(String[] time1,String[] time2){
		boolean result=false;
		int d1=Integer.parseInt(time1[0]);
		int d2=Integer.parseInt(time1[1]);
		int d3=Integer.parseInt(time1[2]);
		
		int e1=Integer.parseInt(time2[0]);
		int e2=Integer.parseInt(time2[1]);
		int e3=Integer.parseInt(time2[2]);
		
		if((d1>e1)||((d1==e1&&d2>e2))||(d1==e1&&d2==e2&&d3>e3)){
			return false;
		}
		else
			return true;
	}
}
