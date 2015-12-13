package ui;

import java.text.SimpleDateFormat;
import java.util.Date;


public class MyRunnable implements Runnable{ 
	administrator aad = new administrator();
	
	//实现Runnable接口
	public void run() { 
		//线程执行的方法 
		while(true){  
			try{  
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式

				
				//打印当前时间 
				Thread.sleep(1000);
				//休眠1毫秒 
				}
				catch(Throwable t){  
					t.printStackTrace();   
					}  
			} 
		} 
}
	