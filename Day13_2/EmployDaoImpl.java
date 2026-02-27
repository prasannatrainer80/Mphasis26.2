package com.java.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.java.mvc.model.Employ;


public class EmployDaoImpl implements EmployDao {

	private JdbcTemplate jdbcTemplate;
	
	public EmployDaoImpl(DataSource dataSource) {
		this.jdbcTemplate  = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employ> showEmploy() {
		String cmd = "select * from Employ";
		List<Employ> employList = jdbcTemplate.query(cmd, new RowMapper<Employ>() {

			@Override
			public Employ mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employ employ = new Employ();
				employ.setEmpno(rs.getInt("empno"));
				employ.setName(rs.getString("name"));
				employ.setGender(rs.getString("gender"));
				employ.setDept(rs.getString("dept"));
				employ.setDesig(rs.getString("desig"));
				employ.setBasic(rs.getDouble("basic"));
				return employ;
			}
		});
		
		return employList;

	}

	@Override
	public Employ searchEmploy(int empno) {
		String cmd = "select * from Employ where empno = ?";
		List<Employ> employList = jdbcTemplate.query(cmd, new Object[] {empno}, new RowMapper<Employ>() {

			@Override
			public Employ mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employ employ = new Employ();
				employ.setEmpno(rs.getInt("empno"));
				employ.setName(rs.getString("name"));
				employ.setGender(rs.getString("gender"));
				employ.setDept(rs.getString("dept"));
				employ.setDesig(rs.getString("desig"));
				employ.setBasic(rs.getDouble("basic"));
				return employ;
			}
		});
		return employList.get(0);
	}

	@Override
	public String updateEmploy(Employ employUpdated) {
		String cmd = "Update Employ set Name = ?, Gender = ?, Dept = ?, Desig = ?, "
				+ " Basic = ? Where empno = ?";
		jdbcTemplate.update(cmd, new Object[] {employUpdated.getName(), 
						employUpdated.getGender(), employUpdated.getDept(),
						employUpdated.getDesig(), employUpdated.getBasic(), 
							employUpdated.getEmpno()
				});
		return "Employ Record Updated...";
	}

	@Override
	public String deleteEmploy(int empno) {
		String cmd = "delete from Employ where empno = ?";
		jdbcTemplate.update(cmd, new Object[] {empno});
		return "Employ Record Deleted...";
	}

	@Override
	public String addEmploy(Employ employ) {
		String cmd ="Insert into Employ values(?,?,?,?,?,?)";
		jdbcTemplate.update(cmd, new Object[] {employ.getEmpno(),
				employ.getName(), 
				employ.getGender(), employ.getDept(),
				employ.getDesig(), employ.getBasic(), 
					
		});
return "Employ Record Updated...";
	}

	@Override
	public int login(String user, String pwd) {
		String cmd = "select count(*) cnt from Login "
				+ " Where UserName = ? And PassCode = ?";
		Integer count = jdbcTemplate.queryForObject(
	            cmd,
	            new Object[]{user, pwd},
	            Integer.class
	    );

	    return count;
	}


}
