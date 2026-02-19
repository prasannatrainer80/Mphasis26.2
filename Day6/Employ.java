package com.java.hib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employ")
public class Employ {

	@Id
	@Column(name="empno")
	private int empno;
	@Column(name="name")
	private String name;
	@Column(name="gender")
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@Column(name="dept")
	private String dept;
	@Column(name="desig")
	private String desig;
	@Column(name="basic")
	private double basic;
	
	
}
