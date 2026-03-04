package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="Customer")
public class Customer {

	@Id
	@Column(name="CUS_ID")
	private int cusId;
	@Column(name="CUS_NAME")
	private String cusName;
	@Column(name="CUS_PHNNO")
	private String cusPhnno;
	@Column(name="CUS_USERNAME")
	private String cusUserName;
	@Column(name="CUS_PASSWORD")
	private String cusPassword;
	@Column(name="CUS_EMAIL")
	private String cusEmail;
	@Column(name="CUS_DOB")
	private Date cusDob;
	@Column(name="CUS_ADDRESS")
	private String cusAddress;
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusPhnno() {
		return cusPhnno;
	}
	public void setCusPhnno(String cusPhnno) {
		this.cusPhnno = cusPhnno;
	}
	public String getCusUserName() {
		return cusUserName;
	}
	public void setCusUserName(String cusUserName) {
		this.cusUserName = cusUserName;
	}
	public String getCusPassword() {
		return cusPassword;
	}
	public void setCusPassword(String cusPassword) {
		this.cusPassword = cusPassword;
	}
	public String getCusEmail() {
		return cusEmail;
	}
	public void setCusEmail(String cusEmail) {
		this.cusEmail = cusEmail;
	}
	public Date getCusDob() {
		return cusDob;
	}
	public void setCusDob(Date cusDob) {
		this.cusDob = cusDob;
	}
	public String getCusAddress() {
		return cusAddress;
	}
	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}

	
}
