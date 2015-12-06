package bl.receivement.Impl;

import bl.receivement.Service.TransportFinishedBLService;
import vo.ReceiveInformationVO;

public class TransportFinishedController implements TransportFinishedBLService {
	TransportFinished transportFinished;
	
	public TransportFinishedController(){
		transportFinished=new TransportFinished();
	}
	@Override
	public boolean billFilled(ReceiveInformationVO[] info) {
		// TODO Auto-generated method stub
		return transportFinished.billFilled(info);
	}

}
