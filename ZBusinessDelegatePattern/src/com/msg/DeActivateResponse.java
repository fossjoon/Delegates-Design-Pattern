package com.msg;

public class DeActivateResponse implements Response {

	private String result;

	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "De-ActivateResponse [result=" + result + "]";
	}
}
