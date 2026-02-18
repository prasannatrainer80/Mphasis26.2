<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method='get' action="DeleteEmploy.jsp">
		<center>
			Employ No : 
		<input type="number" name="empno" /> <br/><br/>
		<input type="submit" value="Search" />
		</center>
	</form>
	<c:if test="${param.empno !=null}">
		<c:set var="empno" value="${param.empno}" />
		<sql:setDataSource var="conn" driver="com.mysql.cj.jdbc.Driver" 
		url="jdbc:mysql://localhost:3306/Mphasis26"
		user="root" 
		password="root"
	/>
	
	<sql:update var="conn" dataSource="${conn}">
		Delete from Employ where empno = ?
		<sql:param value="${param.empno}" />
	</sql:update>
	<c:out value="Employ Record Deleted..." />
	</c:if>
</body>
</html>