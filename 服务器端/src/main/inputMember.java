package main;

import java.io.IOException;

import bill.StaffPO;
import staffdata.MemberInfoImpl;

public class inputMember {
	public static void inputMember(){
		StaffPO s=new StaffPO();
		s.ID="10086";
		s.sex=true;
		s.passwords="10086";
		s.pos="×Ü¾­Àí";
		try {
			MemberInfoImpl m=new MemberInfoImpl();
			m.insert(s);
			System.out.println("input Success.");
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
