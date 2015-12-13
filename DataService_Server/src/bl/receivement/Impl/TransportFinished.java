package bl.receivement.Impl;

import bl.information.Impl.InformationController;
import data.receivement.ReceiveInfo;
import vo.ReceiveInformationVO;

public class TransportFinished {
	
	public boolean billFilled(ReceiveInformationVO[] info) {
		// TODO Auto-generated method stub
		ReceiveInfo receiveInfo=new ReceiveInfo();
		boolean result=true;
		try {
			for(int i=0;i<info.length;i++){
				result=result&&receiveInfo.insert(info[i]);
			}
			//更新物流动态
			InformationController IC=new InformationController();
			for(int i=0;i<info.length;i++){
				result=result&&IC.refreshMesg(info[i].ID, info[i].nameOfReceiver+"已签收",
						info[i].time[0]+info[i].time[1]+info[i].time[2]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return result;
	}

}
