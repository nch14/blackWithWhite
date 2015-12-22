package bl.receivement.Impl;

import java.util.ArrayList;

import bl.receivement.Service.TransportFinishedBLService;
import vo.ReceiveInformationVO;

public class TransportFinishedController implements TransportFinishedBLService {
	TransportFinished transportFinished;
	
	public TransportFinishedController(){
		transportFinished=new TransportFinished();
	}
	@Override
	public boolean billFilled(ArrayList<ReceiveInformationVO> info) {
		// TODO Auto-generated method stub
		return transportFinished.billFilled(info);
	}

}
