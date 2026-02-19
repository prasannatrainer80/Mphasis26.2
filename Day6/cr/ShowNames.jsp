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
<c:set var="names" value="${employDao.showNames()}" />
<c:forEach var="name" items="${names}">
	<c:out value="${name}" /> <br/>
</c:forEach>
</body>
</html>