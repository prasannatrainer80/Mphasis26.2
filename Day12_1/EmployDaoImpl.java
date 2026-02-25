package com.java.spr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployDaoImpl implements EmployDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Value("#{'select * from Employ'}")
	private String sqlQuery1;
	
	@Value("#{'select * from Employ where empno = ?'}")
	private String sqlQuery2;
	
	@Value("#{'Insert into Employ values(?,?,?,?,?,?)'}")
	private String insertQuery;
	
	@Value("#{'Delete from Employ where empno = ?'}")
	private String deleteQuery;
	
	@Value("#{'Update Employ Set Name = ?, Gender = ?, Dept = ?, "
			+ " Desig = ?, Basic = ? Where empno = ?'}")
	private String updateQuery;
	
	@Override
	public List<Employ> showEmploy() {
		List<Employ> employList = jdbcTemplate.query(sqlQuery1, 
				(rs,rownum) -> {
			Employ employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(Gender.valueOf(rs.getString("gender")));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
			return employ;
		});
		return employList;
	}

	@Override
	public Employ searchEmploy(int empno) {
		Employ employRes = jdbcTemplate.queryForObject(sqlQuery2, 
				new Object[] {empno},
				(rs,rownum) -> {
			Employ employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(Gender.valueOf(rs.getString("gender")));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
			return employ;
		});
		return employRes;
	}

	@Override
	public String addEmploy(Employ employ) {
		jdbcTemplate.update(insertQuery, 
			new Object[] {
			   employ.getEmpno(), employ.getName(),
			   employ.getGender().toString(), 
			   employ.getDept(), 
			   employ.getDesig(),
			   employ.getBasic()
			});
		return "Employ Record Inserted...";
	}

	@Override
	public String deleteEmploy(int empno) {
		jdbcTemplate.update(deleteQuery, new Object[] {empno});
		return "Employ Record Deleted...";
	}

	@Override
	public String updateEmploy(Employ employ) {
		jdbcTemplate.update(updateQuery, 
				new Object[] {
				  employ.getName(),
				   employ.getGender().toString(), 
				   employ.getDept(), 
				   employ.getDesig(),
				   employ.getBasic(),
				   employ.getEmpno(),
				});
			return "Employ Record Updated...";
	}

}
