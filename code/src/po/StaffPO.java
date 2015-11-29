package po;
import enumHelp.Postion;
public class StaffPO {
	public String name;
	public String passwords;
	public String department;
	public Postion pos;
	public String ID;
	public String birthday;
	public String sex;
 
	public StaffPO(String name,String passwords,String department,String ID,String birthday,String sex,Postion pos){
		this.name=name;
		this.passwords=passwords;
		this.department=department;
		this.pos=pos;
		this.ID=ID;
		this.birthday=birthday;
		this.sex=sex;
	}
}
