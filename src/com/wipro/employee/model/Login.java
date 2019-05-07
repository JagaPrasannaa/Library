package com.wipro.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Login {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "uset")
	@SequenceGenerator(name = "user", sequenceName = "user_id_seq")
	private int userId;

	@Column(columnDefinition = "VARCHAR(25)")
	public String uname;
	@Column(columnDefinition = "VARCHAR(25)")
	public String password;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}
