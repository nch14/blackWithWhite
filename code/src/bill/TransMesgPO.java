package bill;
import java.io.Serializable;

public class TransMesgPO implements Serializable{
	public String id;
	public String time;
	public String location;
	
	public TransMesgPO(String identifier){
		id=identifier;
		time="";
		location="";
	}
	
	public TransMesgPO(String id,String time,String location){
		this.id=id;
		this.time=time;
		this.location=location;
	}
}
