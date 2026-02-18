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
	<form method="get" action="Name.jsp">
		<center>
			First Name : 
	<input type="text" name="firstName" /> <br/><br/>
			Last Name : 
	<input type="text" name="lastName" /> <br/><br/>
	<input type="submit" value="Show" />
		</center>
	</form>
	<c:if test="${param.firstName !=null && param.lastName !=null}">
		<c:set var="fname" value="${param.firstName}" />
		<c:set var="lname" value="${param.lastName}" />
		First Name : <b> 
			<c:out value="${fname}" />
		</b> <br/>
		Last Name : <b>
			<c:out value="${lname}" />
		</b>
	</c:if>
</body>
</html>