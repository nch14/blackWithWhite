package bl.report.impl;

import java.util.Calendar;

public class test {
	public static void main(String[] args){
		System.out.println(getTime());
	
	}
	
	public static String getTime(){
		Calendar c=Calendar.getInstance();
		String s=""+c.get(Calendar.YEAR)+(c.get(Calendar.MONTH)+1)+
				adjustTime(""+c.get(Calendar.DATE),2)+
				adjustTime(""+c.get(Calendar.HOUR),2)+
				adjustTime(""+c.get(Calendar.MINUTE),2)+
				adjustTime(""+c.get(Calendar.SECOND),2);
		
		return s;
	}
	
	public static String adjustTime(String s,int n){
		System.out.println(s);
		char c[]=s.toCharArray();
		System.out.println(c.length);
		while(c.length<n){
			s="0"+s;
			break;
		}
		System.out.println(s);
		return s;
	}
}
