package com.marshalling.foss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement( name = "FOSSmaniac")
@XmlAccessorType (XmlAccessType.FIELD)
public class Person {

	private Integer id;
	private String home_Address;
	private String city;
	private String phone_No;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getHome_Address() {
		return home_Address;
	}
	public void setHome_Address(String home_Address) {
		this.home_Address = home_Address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone_No() {
		return phone_No;
	}
	public void setPhone_No(String phone_No) {
		this.phone_No = phone_No;
	}
}
