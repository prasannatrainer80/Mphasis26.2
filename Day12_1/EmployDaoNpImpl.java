package com.java.spr;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class EmployDaoNpImpl {
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}

	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	 public String addEmploy(Employ emp) {

	        String sql = "insert into Employ(empno,name,gender,"
	        		+ "dept,desig,basic) values(:empno,:name,:gender,"
	        		+ ":dept,:desig,:basic)";

	        Map<String, Object> paramMap = new HashMap<>();
	        paramMap.put("empno", emp.getEmpno());
	        paramMap.put("name", emp.getName());
	        paramMap.put("gender", emp.getGender().toString());
	        paramMap.put("dept", emp.getDept());
	        paramMap.put("desig", emp.getDesig());
	        paramMap.put("basic", emp.getBasic());

	        namedParameterJdbcTemplate.update(sql, paramMap);
	        return "Employ Record Inserted...";
	    }

}
