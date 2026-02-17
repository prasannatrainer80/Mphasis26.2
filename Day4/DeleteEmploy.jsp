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
		int empno = Integer.parseInt(request.getParameter("empno"));
		EmployDao dao = new EmployDaoImpl();
		dao.deleteEmploy(empno);
	%>
	<jsp:forward page="EmployTable.jsp" />
</body>
</html>