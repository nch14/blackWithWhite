package bl.staff.service;

import java.rmi.Remote;
import po.*;
public interface StaffData extends Remote{
	public StaffPO getStaff(String ID);
}
