package com.bs;

import com.msg.DeActivateResponse;
import com.msg.Message;

public class DeActivateBusinessService implements BusinessService {

	
	public void execute(Message message) {
		DeActivateResponse res = new DeActivateResponse();
		res.setResult("Airtel Services: Your DTH Services has been De-activated???");
		message.setResponse(res);	
	}
}