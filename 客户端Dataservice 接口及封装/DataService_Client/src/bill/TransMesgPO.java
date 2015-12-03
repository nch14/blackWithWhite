package bill;
import java.io.Serializable;

public class TransMesgPO implements Serializable{
	String id="";
	String time="";
	String location="";
	
	public TransMesgPO(String identifier){
		id=identifier;
		time="";
		location="";
	}
}
