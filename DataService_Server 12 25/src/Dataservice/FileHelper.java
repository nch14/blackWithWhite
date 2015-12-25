package Dataservice;
import java.io.*;

public class FileHelper {
	public static Object read(String dir) throws FileNotFoundException, IOException, ClassNotFoundException{
		
		ObjectInputStream in=new ObjectInputStream(new FileInputStream(dir));
		Object result=in.readObject();
		in.close();
		return result;
	}
	
	public static void write(String dir,Object o) throws FileNotFoundException, IOException{
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(dir));
		out.writeObject(o);
		out.close();
	}
}
