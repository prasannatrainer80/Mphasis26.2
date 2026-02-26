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
	<c:set var="empno" value="${param.empno}" />
	<jsp:useBean id="beanHelper" class="com.java.hib.ContextHelper" />
	<c:set var="dao" value="${beanHelper.getSession()}" />
	<c:set var="employ" value="${dao.getEmploy(empno)}" />
	<c:set var="result" value="${dao.deleteEmploy(employ)}" />
	<jsp:forward page="EmployShow.jsp" />
</body>
</html>