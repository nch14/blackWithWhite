package main;

import java.io.*;

import bill.StaffPO;
import staffdata.MemberInfoImpl;

public class Start {
	public static void main(String[] args) throws Exception{
		//Input.writein();
		ServiceHelper.initialService();
		StaffPO staff =new StaffPO();
		staff.name="admin";
		staff.passwords="66666";
		staff.department="南京市";
		staff.pos="总经理";
		staff.ID="12345";
		staff.birthyear=1996;
		staff.sex=false;
		staff.SalaryModel="best";
		staff.authority="highest";
		
		MemberInfoImpl help=new MemberInfoImpl();
		help.insert(staff);
		System.out.println("input success");
	}
}
