package settings;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;

import data.staff.AgencyInfo;

public class CompanySettingsController {
	static Company ourCompany;
	
	/**
	 * 将服务器的公司设置同步到本地
	 * @return
	 */
	public static boolean pull(){
		AgencyInfo agencyInfo=new AgencyInfo();
		try {
			ourCompany=agencyInfo.pull();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	/**
	 * 将本地的公司设置同步到服务器
	 * @return
	 */
	public static boolean push(){		
		AgencyInfo agencyInfo=new AgencyInfo();
		try {
			return agencyInfo.push(ourCompany);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;	
		}	
	}
	
	public static boolean saveInThisComputer(){
		//以下代码实现序列化
	        try{
	            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("CompanySettings.out"));//输出流保存的文件名为 my.out ；ObjectOutputStream能把Object输出成Byte流
	            oos.writeObject(ourCompany); 
	            oos.flush();  //缓冲流 
	            oos.close(); //关闭流
	            return true;
	        } catch (FileNotFoundException e){        
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
			return false;
	}
	 
	public static boolean loadFromThisComputer(){    
	         ObjectInputStream oin = null;//局部变量必须要初始化
	        try{
	            oin = new ObjectInputStream(new FileInputStream("CompanySettings.out"));
	        } catch (FileNotFoundException e1){        
	            e1.printStackTrace();
	            return false;
	        } catch (IOException e1){
	            e1.printStackTrace();
	            return false;
	        }      
	        try {
	        	ourCompany= (Company) oin.readObject();//由Object对象向下转型为MyTest对象
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	            return false;
	        } catch (IOException e) {
	            e.printStackTrace();
	            return false;
	        } 
	        return true;
	}
	
}
