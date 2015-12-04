package bl.report.impl;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Calendar;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import bill.PaymentBill;
import bill.ReceiveMoneyBill;

public class ExcelHelper {
	String type;
	public boolean export(BussinessSheetVO bs){
		
		// 第一步，创建一个webbook，对应一个Excel文件  
		HSSFWorkbook wb = new HSSFWorkbook();  
		// 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet  
		HSSFSheet sheet = wb.createSheet("经营情况表");  
		// 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short  
		HSSFRow row = sheet.createRow((int) 0);  
		// 第四步，创建单元格，并设置值表头 设置表头居中  
		HSSFCellStyle style = wb.createCellStyle();  
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式  

		HSSFCell cell = row.createCell((short) 0);  
		cell.setCellValue("类型");  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 1);  
		cell.setCellValue("付款日期");  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 2);  
		cell.setCellValue("付款金额");  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 3);  
		cell.setCellValue("付款人");  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 4);  
		cell.setCellValue("条目");  
		cell.setCellStyle(style); 
		cell = row.createCell((short) 5);  
		cell.setCellValue("备注");  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 6);  
		cell.setCellValue(" ");  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 7);  
		cell.setCellValue("类型");  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 8);  
		cell.setCellValue("收款日期");  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 9);  
		cell.setCellValue("收款金额");  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 10);  
		cell.setCellValue("收款快递员");  
		cell.setCellStyle(style);  
		// 第五步，写入实体数据 实际应用中这些数据从数据库得到，  
		ArrayList<PaymentBill> pay=bs.pay;
		ArrayList<ReceiveMoneyBill> paid=bs.paid;
		for(int i=0;i<Math.max(pay.size(),paid.size());i++){  
			
			row = sheet.createRow((int) i + 1);  
			
			if (i<pay.size()) {
				PaymentBill aPayment=pay.get(i);
				cell = row.createCell((short) 0);
				cell.setCellValue("付款单");
				cell.setCellStyle(style);
				cell = row.createCell((short) 1);
				cell.setCellValue(aPayment.getDate());
				cell.setCellStyle(style);
				cell = row.createCell((short) 2);
				cell.setCellValue(aPayment.money);
				cell.setCellStyle(style);
				cell = row.createCell((short) 3);
				cell.setCellValue(aPayment.payer);
				cell.setCellStyle(style);
				cell = row.createCell((short) 4);
				cell.setCellValue(aPayment.type);
				cell.setCellStyle(style);
				cell = row.createCell((short) 5);
				cell.setCellValue(aPayment.remarks);
				cell.setCellStyle(style);
				cell = row.createCell((short) 6);
				cell.setCellValue(" ");
				cell.setCellStyle(style);
			}
			if (i<paid.size()) {
				ReceiveMoneyBill aReceiveMoneyBill=paid.get(i);
				cell = row.createCell((short) 7);
				cell.setCellValue("收款单");
				cell.setCellStyle(style);
				cell = row.createCell((short) 8);
				cell.setCellValue(aReceiveMoneyBill.getDate());
				cell.setCellStyle(style);
				cell = row.createCell((short) 9);
				cell.setCellValue(aReceiveMoneyBill.money);
				cell.setCellStyle(style);
				cell = row.createCell((short) 10);
				cell.setCellValue(aReceiveMoneyBill.transactor);
				cell.setCellStyle(style);
			}  
		}
		// 第六步，将文件存到指定位置  
		String time=getTime();
		row = sheet.createRow((short)(Math.max(pay.size(),paid.size())+1));
		cell=row.createCell((short)0);
		cell.setCellValue("日期");
		cell.setCellStyle(style);  
		cell=row.createCell((short)1);
		cell.setCellValue(time);
		cell.setCellStyle(style);  
		
		// 第六步，将文件存到指定位置  
		try{  
			FileOutputStream fout = new FileOutputStream("E:/经营情况表/"+time+"经营情况表.xls");  
			wb.write(fout);  
			fout.close();  
		}catch (Exception e){  
			e.printStackTrace(); 
			return false;
		}  
		return true;
	}
	
	public static boolean export(ProfitSheetVO ps){
		// 第一步，创建一个webbook，对应一个Excel文件  
		HSSFWorkbook wb = new HSSFWorkbook();  
		// 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet  
		HSSFSheet sheet = wb.createSheet("成本收益表");  
		// 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short  
		HSSFRow row = sheet.createRow((int) 0);  
		// 第四步，创建单元格，并设置值表头 设置表头居中  
		HSSFCellStyle style = wb.createCellStyle();  
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式  

		HSSFCell cell = row.createCell((short) 0);  
		cell.setCellValue("成本");  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 1);  
		cell.setCellValue("营收");  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 2);  
		cell.setCellValue("利润");  
		cell.setCellStyle(style);  
		
		row = sheet.createRow((int) 1);
		cell=row.createCell((short)0);
		cell.setCellValue(ps.totalPay);
		cell.setCellStyle(style);  
		cell = row.createCell((short) 1);  
		cell.setCellValue(ps.totalGet);  
		cell.setCellStyle(style);  
		cell = row.createCell((short) 2);  
		cell.setCellValue(ps.profit);  
		cell.setCellStyle(style); 
		
		String time=getTime();
		row = sheet.createRow((int) 2);
		cell=row.createCell((short)0);
		cell.setCellValue("日期");
		cell.setCellStyle(style);  
		cell=row.createCell((short)1);
		cell.setCellValue(time);
		cell.setCellStyle(style);  
		
		// 第六步，将文件存到指定位置  
		try{  
			FileOutputStream fout = new FileOutputStream("E:/成本收益表/"+time+"成本收益表.xls");  
			wb.write(fout);  
			fout.close();  
		}catch (Exception e){  
			e.printStackTrace(); 
			return false;
		}  
		return true;
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
	
	//Test
/*	public static void main(String[] args){
		ProfitSheetVO ps=new ProfitSheetVO(500,600,100);
		ExcelHelper.export(ps);
	}*/
}
