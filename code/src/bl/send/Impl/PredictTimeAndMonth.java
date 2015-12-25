package bl.send.Impl;

import enumHelper.TypeOfExpress;
import settings.Company;
import settings.CompanySettingsController;

public class PredictTimeAndMonth {
	public String[] moneyAndTime(String ID) {
		// TODO Auto-generated method stub
		String[] back={"10","2Ìì"};
		return back;
	}
	
	
	public static int CalculateMoney(double weight,TypeOfExpress type,String city1,String city2) throws Exception{
		CompanySettingsController companyManage=new CompanySettingsController();
		Company company=companyManage.ourCompany;
		int distance=company.getDistance(city1, city2);
		if(distance==0){
			throw new Exception();
		}
		distance+=60;
		int pricePerMile=0;
		if(type.equals(TypeOfExpress.cheap))
			pricePerMile=23;
		if(type.equals(TypeOfExpress.normal))	
			pricePerMile=18;
		if(type.equals(TypeOfExpress.fast))	
			pricePerMile=25;
		int price=(int) (distance*pricePerMile*weight/1000);
		return price;
	}
}
