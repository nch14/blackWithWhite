package bl.receivement.Impl;

import java.util.ArrayList;

import bl.information.Impl.InformationController;
import data.receivement.ReceiveInfo;
import vo.ReceiveInformationVO;

public class TransportFinished {
	
	public boolean billFilled(ArrayList<ReceiveInformationVO> info) {
		// TODO Auto-generated method stub
		ReceiveInfo receiveInfo=new ReceiveInfo();
		boolean result=true;
		try {
			//更新物流动态
			InformationController IC=new InformationController();
			for(int i=0;i<info.size();i++){
				result=result&&IC.refreshMesg(info.get(i).ID, info.get(i).nameOfReceiver+"已签收",
						info.get(i).time[0]+info.get(i).time[1]+info.get(i).time[2]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return result;
	}

}
