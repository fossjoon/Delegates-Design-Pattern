package com.delegate;

import java.util.HashMap;
import java.util.Map;

import com.bs.ActivateBusinessService;
import com.bs.BusinessService;
import com.bs.DeActivateBusinessService;
import com.msg.Message;

public class BusinessDelegateImpl implements BusinessDelegate {

	private static Map<String,BusinessService> action = new HashMap<String, BusinessService>();
	
	static{
		action.put("ACTIVATE", new ActivateBusinessService());
		action.put("DE-ACTIVATE", new DeActivateBusinessService());
	}
	public void process(Message message) {
		String msgType = message.getMsgType();
		BusinessService service = (BusinessService)action.get(msgType);
		service.execute(message);
	}
}