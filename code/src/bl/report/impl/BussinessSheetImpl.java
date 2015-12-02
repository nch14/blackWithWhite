package bl.report.Impl;



public class BussinessSheetImpl{
	BussinessSheetVO bsVO;
	
	private boolean checkDate(String start, String end) {
		//先检查输入的是不是两个时间
		char[] temp1=start.toCharArray();
		char[] temp2=end.toCharArray();
		
		if(temp1.length!=8||temp2.length!=8)
			return false;
		
		boolean isNum=true;//
		for(int i=0;i<8;i++){
			if(temp1[i]<'0'||temp1[i]>'9'){
				isNum=false;
				break;
			}
			if(temp2[i]<'0'||temp2[i]>'9'){
				isNum=false;
				break;
			}
		}
		if(!isNum)
			return false;
		
		if(Integer.parseInt(start)>Integer.parseInt(end)){
			return false;
		}
		return true;
	}
	
	


	public boolean export() {
		// TODO Auto-generated method stub
		return false;
	}




	public BussinessSheetVO show(String start,String end) {
		// TODO Auto-generated method stub
		if(!this.checkDate(start,end)){
			return null;
		}else{
			
			
			
			
			
			return bsVO;
		}
			
			
			
	
	}



}

	

