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
	<jsp:useBean id="employDao" class="com.java.hib.dao.EmployDaoImpl" />
	<c:set var="employList" value="${employDao.showByBasicDesc()}" />
	<c:forEach var="employ" items="${employList}">
		Employ No :
		<c:out value="${employ.empno}" /> <br/>
		Employ Name :
		<c:out value="${employ.name}" /> <br/>
		Gender :
		<c:out value="${employ.gender}" /> <br/>
		Department :
		<c:out value="${employ.dept}" /> <br/>
		Designation :
		<c:out value="${employ.desig}" /> <br/>
		Basic :
		<c:out value="${employ.basic}" /> <br/><hr/>
		
	</c:forEach>
</body>
</html>