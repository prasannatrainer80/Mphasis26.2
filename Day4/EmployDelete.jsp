<%@page import="com.java.jsp.model.Employ"%>
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
<form method="get" action="EmployDelete.jsp">
		<center>
			Employ No : 
	<input type="number" name="empno" /> <br/><br/>
	<input type="submit" value="Delete" />
		</center>
	</form>
	<%
		if (request.getParameter("empno") !=null) {
			int empno = Integer.parseInt(request.getParameter("empno"));
			EmployDao dao = new EmployDaoImpl();
			out.println(dao.deleteEmploy(empno));
		}
	%>
</body>
</html>