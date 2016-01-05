package tools;

import bl.staff.Impl.StaffManageController;
import settings.City;
import settings.Company;
import settings.CompanySettingsController;
import settings.Distance;
import settings.TransportCenter;
import vo.StaffVO;

public class SystemHelper {
	
	public static void initSystem(){
		//1.机构初始化城市
		CompanySettingsController companyManage=new CompanySettingsController(new Company());
		
	
		City beijing=new City("北京","010");
		City nanjing=new City("南京","025");
		City guangzhou=new City("广州","020");
		City shanghai=new City("上海","021");
		
		TransportCenter nj=nanjing.transportCenter.get(0);
		TransportCenter sh=shanghai.transportCenter.get(0);
		TransportCenter bj=beijing.transportCenter.get(0);
		TransportCenter gz=guangzhou.transportCenter.get(0);
		
		String[] njnames={"南京市栖霞区营业厅","南京市鼓楼区营业厅","南京市仙林大学城营业厅",
				 "南京市九龙湖营业厅","南京市下关区营业厅","南京市江浦营业厅",
				 "南京市紫金山营业厅","南京市老山森林营业厅","南京市白下区营业厅",
				 "南京市玄武区营业厅"};
		nj.addBussinessHall(njnames);
		String[] bjnames={"01","02","03","04","05","06","07","08","09","10"};
		bj.addBussinessHall(bjnames);
		String[] shnames={"01","02","03","04","05","06","07","08","09","10"};
		bj.addBussinessHall(shnames);
		String[] gznames={"01","02","03","04","05","06","07","08","09","10"};
		bj.addBussinessHall(gznames);
			
		companyManage.ourCompany.citys.add(beijing);
		companyManage.ourCompany.citys.add(nanjing);
		companyManage.ourCompany.citys.add(guangzhou);
		companyManage.ourCompany.citys.add(shanghai);
		

		Distance bn=new Distance(beijing, nanjing,900);
		Distance bs=new Distance(beijing, shanghai,1065);
		Distance bg=new Distance(beijing, guangzhou,1889);
		Distance ns=new Distance(nanjing,shanghai,266);
		Distance ng=new Distance(nanjing,guangzhou,1132);
		Distance sg=new Distance(guangzhou,shanghai,1213);
		
		companyManage.ourCompany.distance.add(bn);
		companyManage.ourCompany.distance.add(bs);
		companyManage.ourCompany.distance.add(bg);
		companyManage.ourCompany.distance.add(ns);
		companyManage.ourCompany.distance.add(ng);
		companyManage.ourCompany.distance.add(sg);
		
		
		

		companyManage.push();

		
	}
	
	public static void main(String[] args){
		initSystem();
	}
}
