package com.client;

import com.delegate.BusinessDelegate;
import com.delegate.BusinessDelegateImpl;
import com.msg.DeActivateRequest;
import com.msg.Message;

public class ClientCode {
	
	public static void main(String[] args) {
		
		BusinessDelegate delegate = new BusinessDelegateImpl();
		Message msg = new Message();
		//ActivateRequest req = new ActivateRequest();
		DeActivateRequest req = new DeActivateRequest();
		req.setMobileNo("+919650274628");
		req.setServiceName("Ringtone");
		msg.setRequest(req);
		msg.setMsgType("DE-ACTIVATE");
		
		System.out.println("Before Calling process :>>> " + msg + "end");
		delegate.process(msg);
		System.out.println("After  Calling process :>>> " + msg);
	}
}