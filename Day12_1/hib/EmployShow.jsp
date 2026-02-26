<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="beanHelper" class="com.java.hib.ContextHelper" />
	<c:set var="dao" value="${beanHelper.getSession()}" />
	<c:set var="employList" value="${dao.getAllEmploys()}" />
	<table border="3" align="center">
		<tr>
			<th>Employ No</th>
			<th>Employ Name</th>
			<th>Gender</th>
			<th>Department</th>
			<th>Designation</th>
			<th>Salary</th>
		</tr>
	
	<c:forEach var="employ" items="${employList}">
		<tr>
			<td>${employ.empno}</td>
			<td>${employ.name}</td>
			<td>${employ.gender}</td>
			<td>${employ.dept}</td>
			<td>${employ.desig}</td>
			<td>${employ.basic}</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>