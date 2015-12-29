package tools;

import java.util.Calendar;

/**
 * 用来提供一些关于时间的方法
 * @author 倪辰皓
 *
 */
public class TimeHelper {

	public static String[] String2Array(String date){
		String[] dateArray=new String[3];
		try {
			dateArray[0]=date.substring(0, 4);
			dateArray[1]=date.substring(4, 6);
			dateArray[2]=date.substring(6, 8);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return dateArray;	
	}
	
	public static boolean isValidTime(String date){
		int year;
		int month;
		int day;
		try {
			year=Integer.parseInt(date.substring(0, 4));
			month=Integer.parseInt(date.substring(4, 6));
			day=Integer.parseInt(date.substring(6, 8));	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		if(year<1900||year>2200)
			return false;
		if(month<0||month>12)
			return false;		
		if(day<0||day>31)
			return false;
		
		return true;	
	}
	/**
	 * 完成年月日数组格式的检查
	 * @param date
	 * @return
	 */
	public static boolean isValidTime(String[] date){
		int year;
		int month;
		int day;
		try {
			year=Integer.parseInt(date[0]);
			month=Integer.parseInt(date[1]);
			day=Integer.parseInt(date[2]);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		if(year<1900||year>2200)
			return false;
		if(month<0||month>12)
			return false;		
		if(day<0||day>31)
			return false;
		
		return true;	
	}
	
	public static String Array2String(String[] date){
		int year;
		int month;
		int day;
		try {
			year=Integer.parseInt(date[0]);
			month=Integer.parseInt(date[1]);
			day=Integer.parseInt(date[2]);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return ""+year+"/"+month+"/"+day;	
	}
	/**
	 * 获得系统当前时间
	 * @return 年月日时分秒的字符串
	 */
	public static String getTime(){
		Calendar c=Calendar.getInstance();
		String s=""+c.get(Calendar.YEAR)+(c.get(Calendar.MONTH)+1)+
				adjustTime(""+c.get(Calendar.DATE),2)+
				adjustTime(""+c.get(Calendar.HOUR),2)+
				adjustTime(""+c.get(Calendar.MINUTE),2)+
				adjustTime(""+c.get(Calendar.SECOND),2);	
		return s;
	}
	
	/**
	 * 获得系统当前时间
	 * @return 年月日时分秒的字符串,用于直接print的时间
	 */
	public static String getShowTime(){
		Calendar c=Calendar.getInstance();
		String s=""+c.get(Calendar.YEAR)+"/"+(c.get(Calendar.MONTH)+1)+"/"+
				adjustTime(""+c.get(Calendar.DATE),2)+"    "+
				adjustTime(""+c.get(Calendar.HOUR),2)+":"+
				adjustTime(""+c.get(Calendar.MINUTE),2)+":"+
				adjustTime(""+c.get(Calendar.SECOND),2);	
		return s;
	}
	/**
	 * getTime方法的私有辅助方法，能够实现把“3”转换为“03”
	 * @param s 待转换的字符串
	 * @param n 需要的位数
	 * @return
	 */
	public static String adjustTime(String s,int n){
		char c[]=s.toCharArray();
		if(c.length<n)
			s="0"+s;
		return s;
	}
}
