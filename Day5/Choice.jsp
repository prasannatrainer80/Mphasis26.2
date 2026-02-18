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
	<form method="get" action="Choice.jsp">
		<center>
			Enter a Number : 
		<input type="number" name="no" /> <br/><br/>
		<input type="submit" value="Show" />
		</center>
	</form>
	<c:if test="${param.no !=null}">
		<c:set var="no" value="${param.no}" />
		<c:choose>
			<c:when test="${no==1}">
				<c:out value="Kabil Ranjan" />
			</c:when>
			<c:when test="${no==2}">
				<c:out value="Aravindan" />
			</c:when>
			<c:when test="${no==3}">
				<c:out value="Harish" />
			</c:when>
			<c:when test="${no==4}">
				<c:out value="Kavi" />
			</c:when>
			<c:otherwise>
				<c:out value="Invalid Choice" />
			</c:otherwise>
		</c:choose>
	</c:if>
</body>
</html>