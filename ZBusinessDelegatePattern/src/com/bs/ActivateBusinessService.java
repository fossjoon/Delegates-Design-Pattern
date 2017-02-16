package com.bs;

import com.msg.ActivateResponse;
import com.msg.Message;

public class ActivateBusinessService implements BusinessService {

	public void execute(Message message) {
		ActivateResponse res = new ActivateResponse();
		res.setResult("Airtel Services: Your DTH Services has been activated???");
		message.setResponse(res);
	}
}