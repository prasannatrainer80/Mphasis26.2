<%@page import="com.java.jsp.model.Employ"%>
<%@page import="java.util.List"%>
<%@page import="com.java.jsp.dao.EmployDaoImpl"%>
<%@page import="com.java.jsp.dao.EmployDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		EmployDao dao = new EmployDaoImpl();
		List<Employ> employList = dao.showEmploy();
		for(Employ employ : employList) {
			out.println("Employ No  " +employ.getEmpno() + "<br/>");
			out.println("Employ Name  " +employ.getName() + "<br/>");
			out.println("Gender  " +employ.getGender() + "<br/>");
			out.println("Department  " +employ.getDept() + "<br/>");
			out.println("Designation  " +employ.getDesig() + "<Br/>");
			out.println("Basic  " +employ.getBasic() + "<br/><hr/>");
		}
	%>
</body>
</html>