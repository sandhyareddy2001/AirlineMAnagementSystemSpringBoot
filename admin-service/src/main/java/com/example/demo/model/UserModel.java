package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userTable")
public class UserModel {
	@Id
	int uid;
	String first_name;
	String last_name;
	public UserModel() {}
	public UserModel(int uid, String first_name, String last_name) {
		super();
		this.uid = uid;
		this.first_name = first_name;
		this.last_name = last_name;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
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

}
