package com.example.demo.model;

public class PassengerModelDto {
	int pid;
	String user_name;
	String pswd;
	String first_name;
	String last_name;
	String address;
	String mobile_number;
	String email_id;
	
	public PassengerModelDto() {}
	public PassengerModelDto(int pid, String user_name, String pswd, String first_name, String last_name,
			String address, String mobile_number, String email_id) {
		super();
		this.pid = pid;
		this.user_name = user_name;
		this.pswd = pswd;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.mobile_number = mobile_number;
		this.email_id = email_id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

}
