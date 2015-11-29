package bl.report.service;

public interface BussinessSheetService {

	public boolean creatBussinessSheetVO();
	
	public boolean setBussinessSheetVO(String start,String end);
	
	public BussinessSheetVO show();
}
