package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployDao {

	 private static List<Employ> employList =
		        new ArrayList<>(
		            Arrays.asList(
		                new Employ(1, "Mythri", "FEMALE", "Java", "Programmer", 88424.22),
		                new Employ(2, "Vamsi", "MALE", "Dotnet", "Developer", 99999.22),
		                new Employ(3, "Sridhar", "MALE", "Angular", "Tester", 92355.22),
		                new Employ(4, "Rishika", "FEMALE", "Java", "Manager", 91991.22),
		                new Employ(5, "Sashank", "MALE", "React", "TL", 90472.22)
		            )
		        );

	 public String addEmploy(Employ employ) {
			employList.add(employ);
			return "Employ Record Inserted...";
		}
		
		public String deleteEmploy(int empno) {
			Employ employFound = searchEmploy(empno);
			if (employFound !=null) {
				employList.remove(employFound);
				return "Employ Record Deleted...";
			}
			return "Employ Record not Found...";
		}
	 	
		public String updateEmploy(Employ employ) {
			Employ employFound = searchEmploy(employ.getEmpno());
			if (employFound !=null) {
				employFound.setName(employ.getName());
				employFound.setGender(employ.getGender());
				employFound.setDept(employ.getDept());
				employFound.setDesig(employ.getDesig());
				employFound.setBasic(employ.getBasic());
				return "Employ Record Updated...";
			}
			return "Employ Record Not Exists...";
		}
		
		public Employ searchEmploy(int empno) {
			return employList.stream()
			        .filter(e -> e.getEmpno() == empno)
			        .findFirst()
			        .orElse(null);
		}
		
		public List<Employ> showEmploy() {
			return employList;
		}

}
