package com.java.spr;

import java.util.List;

public interface EmployDao {
	List<Employ> showEmploy();
	Employ searchEmploy(int empno);
	String addEmploy(Employ employ);
	String deleteEmploy(int empno);
	String updateEmploy(Employ employ);
}
