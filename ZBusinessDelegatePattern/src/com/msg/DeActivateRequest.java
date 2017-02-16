package com.msg;

public class DeActivateRequest implements Request {

	private String mobileNo;
	private String serviceName;
	
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	@Override
	public String toString() {
		return "DeActivateRequest [mobileNo=" + mobileNo + ", serviceName="
				+ serviceName + "]";
	}
	
}
