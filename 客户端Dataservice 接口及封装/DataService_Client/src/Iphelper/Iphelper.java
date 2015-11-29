package Iphelper;
import java.io.*;

public class Iphelper {
	public static String getIP() throws FileNotFoundException, IOException, ClassNotFoundException{
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("ip.txt")));	
		String s=br.readLine();
		return s;
	}
}
