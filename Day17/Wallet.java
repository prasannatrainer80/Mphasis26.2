package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Wallet")
public class Wallet {

	@Id
	@Column(name="Wal_Id")
	private int walId;
	@Column(name="Cus_Id")
	private int cusId;
	@Column(name="Wal_Amount")
	private double walAmount;
	@Column(name="Wal_Source")
	private String walSource;
	public int getWalId() {
		return walId;
	}
	public void setWalId(int walId) {
		this.walId = walId;
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public double getWalAmount() {
		return walAmount;
	}
	public void setWalAmount(double walAmount) {
		this.walAmount = walAmount;
	}
	public String getWalSource() {
		return walSource;
	}
	public void setWalSource(String walSource) {
		this.walSource = walSource;
	}
	
	
}
