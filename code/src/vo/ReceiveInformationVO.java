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

	public ReceiveInformationVO(String thisID, String thisName, String thisDate) {
		// TODO Auto-generated constructor stub
		this.nameOfReceiver=thisName;
		this.ID=thisID;
		this.time=new String[3];
		time[0]=thisDate.substring(0, 4);
		time[1]=thisDate.substring(4, 6);
		time[2]=thisDate.substring(6, 8);

	}
}
