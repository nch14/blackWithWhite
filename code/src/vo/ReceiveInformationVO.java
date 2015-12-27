package vo;

import java.io.Serializable;

public class ReceiveInformationVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3859263359561990825L;
	public String nameOfReceiver;
	public String ID;
	public String[] time;
	
	public ReceiveInformationVO(){
		time=new String[3];
	}
}
