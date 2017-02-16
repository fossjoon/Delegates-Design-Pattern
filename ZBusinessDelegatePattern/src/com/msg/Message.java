package com.msg;

public class Message {
	
	private String msgType;
	private Request request;
	private Response response;
	
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public Request getRequest() {
		return request;
	}
	public void setRequest(Request request) {
		this.request = request;
	}
	public Response getResponse() {
		return response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}
	@Override
	public String toString() {
		return "Message [msgType=" + msgType + ", request=" + request
				+ ", response=" + response + "]";
	}
}